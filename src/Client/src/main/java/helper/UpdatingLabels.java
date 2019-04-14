package helper;

import entity.CO2_Supplier;
import entity.LeaderBoardEntry;
import entity.User;
import service.UserServiceImpl;

import javax.swing.*;

import static GUI.GUI_App.*;
/** Update the label. */
public class UpdatingLabels {
    /** the level value. */
    public static final int LEVELVALUE = 2500;
    /** the cost value. */
    public static final int COSTVALUE = 100;
    /** the maximum level. */
    public static final int LEVELMAX = 4;
    /** The additional multiplier.*/
    public static final int ADDITIONALVALUE = 10;
    /**
     * Update everything.
     * @param userIn the user in
     * @param clientIn the client in
     * @param lblTotalCO2 the total co2
     * @param lblCO2Saved the total co2 saved
     * @param lblLeaderboardContent the leaderboard
     * @param lblMotivation the motivation
     * @param lblLevel the level
     * @param imgMotivation the img
     * @param imgAchievement the img
     * @param imgAchievementSaved the img
     * @param method the method
     */
    public static void updateEverythingDuo(
            final User userIn,
            final UserServiceImpl clientIn,
            final JLabel lblTotalCO2,
            final JLabel lblCO2Saved,
            final JLabel lblLeaderboardContent,
            final JLabel lblMotivation,
            final JLabel lblLevel,
            final JLabel imgMotivation,
            final JLabel imgAchievement,
            final JLabel imgAchievementSaved,
            final String method) {

        int points = getPoints();
        int pointsSaved = getPointsSaved();

            //Depending on what is used
            if (method.equals("Vegetarian")) {
                //Initializing the values we are going to use.
                int mealSaved = (int) (CO2_Supplier.mealDifference(
                        true, false) * COSTVALUE);
                int mealCost = (int) (CO2_Supplier.meal(
                        true, false) * COSTVALUE);

                //updating the totals.
                userIn.setTotal_saved(getPointsSaved() + mealSaved);
                userIn.setTotal(getPoints() + mealCost);
                int pointsTemp = getPoints();
                setLevel(pointsTemp / LEVELVALUE);
                if (getLevel() > LEVELMAX) {
                    setLevel(LEVELMAX);
                }

                //updating the feature's total saved.
                int temp = userIn.getVegetarian();
                userIn.setVegetarian(temp + mealSaved);
                clientIn.updateUser(userIn);

            } else if (method.equals("Carnivore")) {
                //Initializing the values we are going to use.
                int mealSaved = (int) (CO2_Supplier.mealDifference(
                        false, false) * COSTVALUE);
                int mealCost = (int) (CO2_Supplier.meal(
                        false, false) * COSTVALUE);

                //updating the totals.
                userIn.setTotal_saved(getPointsSaved() + mealSaved);
                userIn.setTotal(getPoints() + mealCost);
                int pointsTemp = getPoints();
                setLevel(pointsTemp / LEVELVALUE);
                if (getLevel() > LEVELMAX) {
                    setLevel(LEVELMAX);
                }

                //updating the feature's total saved.
                userIn.getVegetarian();
                userIn.setVegetarian(mealSaved);
                clientIn.updateUser(userIn);

            } else if (method.equals("Local Produce")) {
                //Initializing the values we are going to use.
                int mealSaved = (int) (CO2_Supplier.mealDifference(
                        false, true) * COSTVALUE);
                int mealCost = (int) (CO2_Supplier.meal(
                        false, true) * COSTVALUE);

                //updating the totals.
                userIn.setTotal_saved(getPointsSaved() + mealSaved);
                userIn.setTotal(getPoints() + mealCost);
                int pointsTemp = getPoints();
                setLevel(pointsTemp / LEVELVALUE);
                if (getLevel() > LEVELMAX) {
                    setLevel(LEVELMAX);
                }

                //updating the feature's total saved.
                int temp = userIn.getProduce();
                userIn.setProduce(temp + mealSaved);
                clientIn.updateUser(userIn);

            } else if (method.equals("Global Produce")) {
                //Initializing the values we are going to use.
                int mealSaved = (int) (CO2_Supplier.mealDifference(
                        false, false) * COSTVALUE);
                int mealCost = (int) (CO2_Supplier.meal(
                        false, false) * COSTVALUE);

                //updating the totals.
                userIn.setTotal_saved(getPointsSaved() + mealSaved);
                userIn.setTotal(getPoints() + mealCost);
                int pointsTemp = getPoints();
                setLevel(pointsTemp / LEVELVALUE);
                if (getLevel() > LEVELMAX) {
                    setLevel(LEVELMAX);
                }

                //updating the feature's total saved.
                int temp = userIn.getProduce();
                userIn.setProduce(temp + mealSaved);
                clientIn.updateUser(userIn);
            }

            //Update Labels
            setPoints(userIn.getTotal());
            setPointsSaved(userIn.getTotal_saved());

            lblTotalCO2.setText("The total amount of CO2 "
                    + "you have used up so far is " + getPoints() + " decagrams");
            lblCO2Saved.setText("The amount of CO2 you have saved so far is "
                    + getPointsSaved() + " decagrams");
            lblLeaderboardContent.setText(
                    LeaderBoardEntry.createLeaderboard(userIn, getLabel()));
            setPointsmissing(PointsMissing.determiningPoints(getPoints()));

            String motivation = "";
            if (getLevel() < LEVELMAX) {
                motivation = "You only need "
                        + getPointsmissing() + " points to the next level!";
            } else {
                motivation =
                        "Congratulation! You have reached the highest level!";
            }
            lblMotivation.setText(motivation);
            lblLevel.setText("Your Level is " + getLevel());
            imgMotivation.setIcon(
                    new ImageIcon(CreateMotivationImage.createIcon(getLevel())));
            imgAchievement.setIcon(
                    new ImageIcon(UpdateAchievements.
                            updateAchievements(method, userIn)));
            imgAchievement.setToolTipText(
                    UpdateAchievements.createText(method, userIn));
            imgAchievementSaved.setIcon(
                    new ImageIcon(UpdateAchievements.
                            updateAchievements(
                                    "imgAchievementSeven", userIn)));
            imgAchievementSaved.setToolTipText(
                    UpdateAchievements.createText(
                            "imgAchievementSeven", userIn));
        }

    /**
     * Update all textfield.
     * @param userIn the user in
     * @param clientIn the client in
     * @param entry the entry
     * @param lblTotalCO2 the total co2
     * @param lblCO2Saved the total co2 saved
     * @param lblLeaderboardContent the leaderboard
     * @param lblMotivation the motivation
     * @param lblLevel the level
     * @param imgMotivation the img
     * @param imgAchievement the img
     * @param imgAchievementSaved the img
     * @param method the method
     */
        public static void updateEverythingTextField(
                final User userIn,
                final UserServiceImpl clientIn,
                final double entry,
                final JLabel lblTotalCO2,
                final JLabel lblCO2Saved,
                final JLabel lblLeaderboardContent,
                final JLabel lblMotivation,
                final JLabel lblLevel,
                final JLabel imgMotivation,
                final JLabel imgAchievement,
                final JLabel imgAchievementSaved,
                final String method) {

            //Depending on what is used
            if (method.equals("Car")) {

                // Initializing the values we are going to use.
                int producedCO2 = ((int) (CO2_Supplier.
                                            car((int) entry) * COSTVALUE));

                // Updating the totals.
                userIn.setTotal_saved(getPointsSaved());
                userIn.setTotal(getPoints() + producedCO2);
                int pointsTemp = getPoints();

                //Updating the feature's total saved.
                int temp = userIn.getCar();

                //All the other features store their SAVED co2 here, except for "car", which stores the total
                //consumed co2.
                userIn.setCar(temp + (int) CO2_Supplier.car((int) entry));
                setLevel(pointsTemp / LEVELVALUE);
                clientIn.updateUser(userIn);


            } else if (method.equals("Public Transportation")) {
                // Initializing the values we are going to use.
                int producedCO2 = ((int) (CO2_Supplier.
                                            publicTransport((int) entry) * COSTVALUE));
                int savedCO2 = ((int) (CO2_Supplier.
                                        publicTransportVsCar((int) entry) * COSTVALUE));

                //Updating the totals.
                userIn.setTotal_saved(getPointsSaved() + savedCO2);
                userIn.setTotal(getPoints() + producedCO2);
                int pointsTemp = getPoints();

                //Updating the feature's total saved.
                int temp = userIn.getPublic_transportation();
                userIn.setPublic_transportation(temp + savedCO2);
                setLevel(pointsTemp / LEVELVALUE);
                clientIn.updateUser(userIn);


                } else if (method.equals("Bike")) {
                    // Initializing the values we are going to use.
                    int producedCO2 = ((int) (CO2_Supplier.
                                                bike((int) entry) * COSTVALUE));
                    int savedCO2 = ((int) (CO2_Supplier.
                                            bikeVsCar((int) entry) * COSTVALUE));

                    // Updating the totals.
                    userIn.setTotal_saved(getPointsSaved() + savedCO2);
                    userIn.setTotal(getPoints() + producedCO2);
                    int pointsTemp = getPoints();

                    // Updating the feature's total saved.
                    int temp = userIn.getBike();
                    userIn.setBike(temp + savedCO2);
                    setLevel(pointsTemp / LEVELVALUE);
                    clientIn.updateUser(userIn);

                } else if (method.equals("Temperature")) {
                    // Initializing the values we are going to use.
                    int producedCO2 = ((int) (CO2_Supplier.
                                                usedTemperature(1, (int) entry) * COSTVALUE));
                    int savedCO2 = ((int) (CO2_Supplier.
                                            temperature(1, (int) entry) * COSTVALUE));

                    // Updating the totals.
                    userIn.setTotal_saved(getPointsSaved() + savedCO2);
                    userIn.setTotal(getPoints() + producedCO2);
                    int pointsTemp = getPoints();

                    // Updating the feature's total saved.
                    int temp = userIn.getTemperature();
                    userIn.setTemperature(temp + savedCO2);
                    setLevel(pointsTemp / LEVELVALUE);
                    clientIn.updateUser(userIn);

                } else if (method.equals("Solar")) {
                    //Initializing the values we are going to use.
                    //(assuming one person for simplicity)
                    int producedCO2 = ((int) (CO2_Supplier.
                                                solarPanelUsed((int) entry, 1) * COSTVALUE));
                    int savedCO2 = ((int) (CO2_Supplier.
                                            solarPanel((int) entry) * COSTVALUE));

                    //Updating the totals.
                    userIn.setTotal_saved(getPointsSaved() + savedCO2);
                    userIn.setTotal(getPoints() + producedCO2);
                    int pointsTemp = getPoints();

                    // Updating the feature's total saved.
                    int temp = userIn.getSolar();
                    userIn.setSolar(temp + savedCO2);
                    setLevel(pointsTemp / LEVELVALUE);
                    clientIn.updateUser(userIn);
                }

                //Update Labels
                setPoints(userIn.getTotal());
                setPointsSaved(userIn.getTotal_saved());

                int pointsFinal = getPoints();
                int pointsSavedFinal = getPointsSaved();
                int level = getLevel();


                lblTotalCO2.setText(
                        "The total amount of CO2 you have used up so far is "
                                + pointsFinal + " decagrams");
                lblCO2Saved.setText(
                        "The amount of CO2 you have saved so far is "
                                + pointsSavedFinal + " decagrams");
                lblLeaderboardContent.setText(
                        LeaderBoardEntry.createLeaderboard(userIn,
                                getLabel()));
                setPointsmissing(
                        PointsMissing.determiningPoints(pointsFinal));
                String motivation = "";
                if (level < LEVELMAX) {
                    motivation = "You only need "
                            + getPointsmissing()
                            + " points to the next level!";
                } else {
                    motivation = "Congratulation!"
                            + " You have reached the highest level!";
                }
                lblMotivation.setText(motivation);
                lblLevel.setText("Your Level is " + level);
                imgMotivation.setIcon(
                        new ImageIcon(CreateMotivationImage.createIcon(getLevel())));
                imgAchievement.setIcon(
                        new ImageIcon(UpdateAchievements.
                                updateAchievements(method, userIn)));
                imgAchievement.setToolTipText(
                        UpdateAchievements.createText(method, userIn));
                imgAchievementSaved.setIcon(
                        new ImageIcon(UpdateAchievements.
                                updateAchievements("imgAchievementSeven",
                                        userIn)));
                imgAchievementSaved.setToolTipText(
                        UpdateAchievements.createText(
                                "imgAchievementSeven", userIn));
            }
        }
