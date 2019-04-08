package helper;

import entity.CO2_Supplier;
import entity.LeaderBoardEntry;
import entity.User;
import service.UserServiceImpl;

import javax.swing.*;

import static GUI.GUI_App.*;
/** Update the label. */
public class UpdatingLabels {

    public static void updateEverythingDuo(User userIn, UserServiceImpl clientIn, JLabel lblTotalCO2, JLabel lblCO2Saved, JLabel lblLeaderboardContent, JLabel lblMotivation, JLabel lblLevel, JLabel imgMotivation, JLabel imgAchievement, JLabel imgAchievementSaved, String method) {

        int points = getPoints();
        int pointsSaved = getPointsSaved();

            //Depending on what is used
            if (method.equals("Vegetarian")) {
                //Initializing the values we are going to use.
                int mealSaved = (int) (CO2_Supplier.mealDifference(
                        true, false) * 100);
                int mealCost = (int) (CO2_Supplier.meal(
                        true, false) * 100);

                //updating the totals.
                userIn.setTotal_saved(getPointsSaved() + mealSaved);
                userIn.setTotal(getPoints() + mealCost);
                int pointsTemp = getPoints();
                setLevel(pointsTemp / 1000);
                if(getLevel() > 4)
                {
                    setLevel(4);
                }

                //updating the feature's total saved.
                int temp = userIn.getVegetarian();
                userIn.setVegetarian(temp + mealSaved);
                clientIn.updateUser(userIn);

            } else if (method.equals("Carnivore")) {
                //Initializing the values we are going to use.
                int mealSaved = (int) (CO2_Supplier.mealDifference(
                        false, false) * 100);
                int mealCost = (int) (CO2_Supplier.meal(
                        false, false) * 100);

                //updating the totals.
                userIn.setTotal_saved(getPointsSaved() + mealSaved);
                userIn.setTotal(getPoints() + mealCost);
                int pointsTemp = getPoints();
                setLevel(pointsTemp / 1000);
                if(getLevel() > 4)
                {
                    setLevel(4);
                }

                //updating the feature's total saved.
                userIn.getVegetarian();
                userIn.setVegetarian(mealSaved);
                clientIn.updateUser(userIn);

            } else if (method.equals("Local Produce")) {
                //Initializing the values we are going to use.
                int mealSaved = (int) (CO2_Supplier.mealDifference(
                        false, true) * 100);
                int mealCost = (int) (CO2_Supplier.meal(
                        false, true) * 100);

                //updating the totals.
                userIn.setTotal_saved(getPointsSaved() + mealSaved);
                userIn.setTotal(getPoints() + mealCost);
                int pointsTemp = getPoints();
                setLevel(pointsTemp / 1000);
                if(getLevel() > 4)
                {
                    setLevel(4);
                }

                //updating the feature's total saved.
                int temp = userIn.getProduce();
                userIn.setProduce(temp + mealSaved);
                clientIn.updateUser(userIn);

            } else if (method.equals("Global Produce")) {
                //Initializing the values we are going to use.
                int mealSaved = (int) (CO2_Supplier.mealDifference(
                        false, false) * 100);
                int mealCost = (int) (CO2_Supplier.meal(
                        false, false) * 100);

                //updating the totals.
                userIn.setTotal_saved(getPointsSaved() + mealSaved);
                userIn.setTotal(getPoints() + mealCost);
                int pointsTemp = getPoints();
                setLevel(pointsTemp / 1000);
                if(getLevel() > 4)
                {
                    setLevel(4);
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
            lblLeaderboardContent.setText(
                    LeaderBoardEntry.createLeaderboard(userIn, getLabel()));
            setPointsmissing(PointsMissing.determiningPoints(getPoints()));

            String motivation = "";
            if (getLevel() < 4) {
                motivation = "You only need " + getPointsmissing() + " points to the next level!";
            } else {
                motivation = "Congratulation! You have reached the highest level!";
            }
            lblMotivation.setText(motivation);
            lblLevel.setText("Your Level is " + getLevel());
            imgMotivation.setIcon(new ImageIcon(CreateMotivationImage.createIcon()));
            imgAchievement.setIcon(new ImageIcon(UpdateAchievements.updateAchievements(method, userIn)));
            imgAchievement.setToolTipText(UpdateAchievements.createText(method, userIn));
            imgAchievementSaved.setIcon(new ImageIcon(UpdateAchievements.updateAchievements("imgAchievementSeven", userIn)));
            imgAchievementSaved.setToolTipText(UpdateAchievements.createText("imgAchievementSeven", userIn));
        }

        public static void updateEverythingTextField(User userIn, UserServiceImpl clientIn, double entry, JLabel lblTotalCO2, JLabel lblCO2Saved, JLabel lblLeaderboardContent, JLabel lblMotivation, JLabel lblLevel,JLabel imgMotivation,JLabel imgAchievement, JLabel imgAchievementSaved, String method) {

            int points = getPoints();
            int pointsSaved = getPointsSaved();

            //Depending on what is used
            if (method.equals("Car")) {

                double additionalPointsDouble = entry * 10;
                int additionalPoints = (int)additionalPointsDouble;
                userIn.setTotal_saved(pointsSaved + 0);
                userIn.setTotal(points + additionalPoints);
                int pointsTemp = userIn.getTotal();

                    setLevel(pointsTemp / 1000);
                    if(getLevel() > 4)
                    {
                        setLevel(4);
                    }

                    //Updating the feature's total saved.
                    int temp = userIn.getCar();

                    userIn.setCar(temp + additionalPoints);
                    clientIn.updateUser(userIn);

                } else if (method.equals("Public Transportation")) {
                    double additionalPoints = entry * 10;
                    userIn.setTotal_saved(pointsSaved + 0);
                    userIn.setTotal(points + (int) additionalPoints);
                    int pointsTemp = userIn.getTotal();

                    setLevel(pointsTemp / 1000);
                    if(getLevel() > 4)
                    {
                        setLevel(4);
                    }

                    //Updating the feature's total saved.
                    int temp = userIn.getPublic_transportation();

                    userIn.setPublic_transportation(temp + (int) additionalPoints);
                    clientIn.updateUser(userIn);

                } else if (method.equals("Bike")) {
                    double additionalPoints = entry * 10;
                    userIn.setTotal_saved(pointsSaved + 0);
                    userIn.setTotal(points + (int) additionalPoints);
                    int pointsTemp = userIn.getTotal();

                    setLevel(pointsTemp / 1000);
                    if(getLevel() > 4)
                    {
                        setLevel(4);
                    }

                    //Updating the feature's total saved.
                    int temp = userIn.getBike();

                    userIn.setBike(temp + (int) additionalPoints);
                    clientIn.updateUser(userIn);

                } else if (method.equals("Temperature")) {
                    double additionalPoints = entry * 10;
                    userIn.setTotal_saved(pointsSaved + 0);
                    userIn.setTotal(points + (int) additionalPoints);
                    int pointsTemp = userIn.getTotal();

                    setLevel(pointsTemp / 1000);
                    if(getLevel() > 4)
                    {
                        setLevel(4);
                    }

                    //Updating the feature's total saved.
                    int temp = userIn.getTemperature();

                    userIn.setTemperature(temp + (int) additionalPoints);
                    clientIn.updateUser(userIn);

                } else if (method.equals("Solar")) {
                    double additionalPoints = entry * 10;
                    userIn.setTotal_saved(pointsSaved + 0);
                    userIn.setTotal(points + (int) additionalPoints);
                    int pointsTemp = userIn.getTotal();

                    setLevel(pointsTemp / 1000);
                    if(getLevel() > 4)
                    {
                        setLevel(4);
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


                lblTotalCO2.setText("The total amount of CO2 you have used up so far is " + pointsFinal);
                lblCO2Saved.setText("The amount of CO2 you have saved so far is " + pointsSavedFinal);
                lblLeaderboardContent.setText(LeaderBoardEntry.createLeaderboard(userIn, getLabel()));
                setPointsmissing(PointsMissing.determiningPoints(pointsFinal));
                String motivation = "";
                if (level < 4) {
                    motivation = "You only need " + getPointsmissing() + " points to the next level!";
                } else {
                    motivation = "Congratulation! You have reached the highest level!";
                }
                lblMotivation.setText(motivation);
                lblLevel.setText("Your Level is " + level);
                imgMotivation.setIcon(new ImageIcon(CreateMotivationImage.createIcon()));
                imgAchievement.setIcon(new ImageIcon(UpdateAchievements.updateAchievements(method, userIn)));
                imgAchievement.setToolTipText(UpdateAchievements.createText(method, userIn));
                imgAchievementSaved.setIcon(new ImageIcon(UpdateAchievements.updateAchievements("imgAchievementSeven", userIn)));
                imgAchievementSaved.setToolTipText(UpdateAchievements.createText("imgAchievementSeven", userIn));


            }
        }
