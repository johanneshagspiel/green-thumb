package helper;

import entity.Co2Supplier;
import entity.LeaderBoardEntry;
import entity.User;
import service.UserServiceImpl;

import javax.swing.*;

import static GUI.GUI_App.*;
/** Update the label. */
public class UpdatingLabels {
    /** the level value. */
    public static final int LEVELVALUE = 1000;
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
     * @param lblleaderBoardContent the leaderboard
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
            final JLabel lblleaderBoardContent,
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
                int mealSaved = (int) (Co2Supplier.mealDifference(
                        true, false) * COSTVALUE);
                int mealCost = (int) (Co2Supplier.meal(
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
                int mealSaved = (int) (Co2Supplier.mealDifference(
                        false, false) * COSTVALUE);
                int mealCost = (int) (Co2Supplier.meal(
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
                int mealSaved = (int) (Co2Supplier.mealDifference(
                        false, true) * COSTVALUE);
                int mealCost = (int) (Co2Supplier.meal(
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
                int mealSaved = (int) (Co2Supplier.mealDifference(
                        false, false) * COSTVALUE);
                int mealCost = (int) (Co2Supplier.meal(
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
                    + "you have used up so far is " + getPoints());
            lblCO2Saved.setText("The amount of CO2 you have saved so far is "
                    + getPointsSaved());
            lblleaderBoardContent.setText(
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
                    new ImageIcon(CreateMotivationImage.createIcon()));
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
     * @param lblleaderBoardContent the leaderboard
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
                final JLabel lblleaderBoardContent,
                final JLabel lblMotivation,
                final JLabel lblLevel,
                final JLabel imgMotivation,
                final JLabel imgAchievement,
                final JLabel imgAchievementSaved,
                final String method) {

            int points = getPoints();
            int pointsSaved = getPointsSaved();

            //Depending on what is used
            if (method.equals("Car")) {

                double additionalPointsDouble = entry * ADDITIONALVALUE;
                int additionalPoints = (int) additionalPointsDouble;
                userIn.setTotal_saved(pointsSaved + 0);
                userIn.setTotal(points + additionalPoints);
                int pointsTemp = userIn.getTotal();

                    setLevel(pointsTemp / LEVELVALUE);
                    if (getLevel() > LEVELMAX) {
                        setLevel(LEVELMAX);
                    }

                    //Updating the feature's total saved.
                    int temp = userIn.getCar();

                    userIn.setCar(temp + additionalPoints);
                    clientIn.updateUser(userIn);

                } else if (method.equals("Public Transportation")) {
                    double additionalPoints = entry * ADDITIONALVALUE;
                    userIn.setTotal_saved(pointsSaved + 0);
                    userIn.setTotal(points + (int) additionalPoints);
                    int pointsTemp = userIn.getTotal();

                    setLevel(pointsTemp / LEVELVALUE);
                    if (getLevel() > LEVELMAX) {
                        setLevel(LEVELMAX);
                    }

                    //Updating the feature's total saved.
                    int temp = userIn.getPublic_transportation();

                    userIn.setPublic_transportation(temp
                            + (int) additionalPoints);
                    clientIn.updateUser(userIn);

                } else if (method.equals("Bike")) {
                    double additionalPoints = entry * ADDITIONALVALUE;
                    userIn.setTotal_saved(pointsSaved + 0);
                    userIn.setTotal(points + (int) additionalPoints);
                    int pointsTemp = userIn.getTotal();

                    setLevel(pointsTemp / LEVELVALUE);
                    if (getLevel() > LEVELMAX) {
                        setLevel(LEVELMAX);
                    }
                    //Updating the feature's total saved.
                    int temp = userIn.getBike();

                    userIn.setBike(temp + (int) additionalPoints);
                    clientIn.updateUser(userIn);

                } else if (method.equals("Temperature")) {
                    double additionalPoints = entry * ADDITIONALVALUE;
                    userIn.setTotal_saved(pointsSaved + 0);
                    userIn.setTotal(points + (int) additionalPoints);
                    int pointsTemp = userIn.getTotal();

                    setLevel(pointsTemp / LEVELVALUE);
                    if (getLevel() > LEVELMAX) {
                        setLevel(LEVELMAX);
                    }

                    //Updating the feature's total saved.
                    int temp = userIn.getTemperature();

                    userIn.setTemperature(temp + (int) additionalPoints);
                    clientIn.updateUser(userIn);

                } else if (method.equals("Solar")) {
                    double additionalPoints = entry * ADDITIONALVALUE;
                    userIn.setTotal_saved(pointsSaved + 0);
                    userIn.setTotal(points + (int) additionalPoints);
                    int pointsTemp = userIn.getTotal();

                    setLevel(pointsTemp / LEVELVALUE);
                    if (getLevel() > LEVELMAX) {
                        setLevel(LEVELMAX);
                    }

                    //Updating the feature's total saved.
                    int temp = userIn.getSolar();

                    userIn.setSolar(temp + (int) additionalPoints);

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
                                + pointsFinal);
                lblCO2Saved.setText(
                        "The amount of CO2 you have saved so far is "
                                + pointsSavedFinal);
                lblleaderBoardContent.setText(
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
                        new ImageIcon(CreateMotivationImage.createIcon()));
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
