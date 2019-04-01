package helper;

import GUI.GUI_App;
import entity.LeaderBoardEntry;
import entity.User;
import service.UserServiceImpl;

import javax.swing.*;

import static GUI.GUI_App.*;

public class UpdatingLabels {

    public static void updateEverythingDuo(User userIn, UserServiceImpl clientIn, JLabel lblTotalCO2, JLabel lblCO2Saved, JLabel lblLeaderboardContent, JLabel lblMotivation, JLabel lblLevel, JLabel imgMotivation, String method) {

        int points = getPoints();
        int pointsSaved = getPointsSaved();

        //Depending on what is used
        if (method.equals("Vegetarian")) {
            userIn.setTotal_saved(pointsSaved + 0);
            userIn.setTotal(points + 100);
            int pointsTemp = getPoints();
            setLevel(pointsTemp / 1000);

            int temp = userIn.getVegetarian();
            userIn.setVegetarian(temp + 100);
            clientIn.updateUser(userIn);

        } else if (method.equals("Carnivore")) {
            userIn.setTotal_saved(pointsSaved + 0);
            userIn.setTotal(points - 100);
            int pointsTemp = getPoints();
            setLevel(pointsTemp / 1000);

            int temp = userIn.getVegetarian();
            userIn.setVegetarian(temp - 100);
            clientIn.updateUser(userIn);

        } else if (method.equals("Local Produce")) {
            userIn.setTotal_saved(pointsSaved + 0);
            userIn.setTotal(points + 100);
            int pointsTemp = getPoints();
            setLevel(pointsTemp / 1000);

            int temp = userIn.getProduce();
            userIn.setProduce(temp + 100);
            clientIn.updateUser(userIn);

        } else if (method.equals("Global Produce")) {
            userIn.setTotal_saved(pointsSaved + 0);
            userIn.setTotal(points - 100);
            int pointsTemp = getPoints();
            setLevel(pointsTemp / 1000);

            int temp = userIn.getProduce();
            userIn.setProduce(temp - 100);
            clientIn.updateUser(userIn);
        }

        //Update Labels
        setPoints(userIn.getTotal());
        setPointsSaved(userIn.getTotal_saved());

        lblTotalCO2.setText("The total amount of CO2 you have used up so far is " + getPoints());
        lblCO2Saved.setText("The amount of CO2 you have saved so far is " + getPointsSaved());
        lblLeaderboardContent.setText(LeaderBoardEntry.createLeaderboard(userIn, getLabel()));
        setPointsmissing(PointsMissing.determiningPoints(getPoints()));
        String motivation = "You only need " + getPointsmissing() + " points to the next level!";
        lblMotivation.setText(motivation);
        lblLevel.setText("Your Level is " + getLevel());
        imgMotivation.setIcon(new ImageIcon(CreateMotivationImage.createIcon()));

        }

    public static void updateEverythingTextField(User userIn, UserServiceImpl clientIn, double entry, JLabel lblTotalCO2, JLabel lblCO2Saved, JLabel lblLeaderboardContent, JLabel lblMotivation, JLabel lblLevel,JLabel imgMotivation, String method) {

        int points = getPoints();
        int pointsSaved = getPointsSaved();

        //Depending on what is used
        if (method.equals("Car")) {
            double additionalPoints = entry * 10;
            userIn.setTotal_saved(pointsSaved + 0);
            userIn.setTotal(points + (int) additionalPoints);
            int pointsTemp = getPoints();
            setLevel(pointsTemp / 1000);

            int temp = userIn.getCar();
            userIn.setCar((int) additionalPoints);
            clientIn.updateUser(userIn);

        } else if (method.equals("Public Transportation")) {
            double additionalPoints = entry * 10;
            userIn.setTotal_saved(pointsSaved + 0);
            userIn.setTotal(points + (int) additionalPoints);
            int pointsTemp = getPoints();
            setLevel(pointsTemp / 1000);

            int temp = userIn.getPublic_transportation();
            userIn.setPublic_transportation((int) additionalPoints);
            clientIn.updateUser(userIn);

        } else if (method.equals("Bike")) {
            double additionalPoints = entry * 10;
            userIn.setTotal_saved(pointsSaved + 0);
            userIn.setTotal(points + (int) additionalPoints);
            int pointsTemp = getPoints();
            setLevel(pointsTemp / 1000);

            int temp = userIn.getBike();
            userIn.setBike((int) additionalPoints);
            clientIn.updateUser(userIn);

        } else if (method.equals("Temperature")) {
            double additionalPoints = entry * 10;
            userIn.setTotal_saved(pointsSaved + 0);
            userIn.setTotal(points + (int) additionalPoints);
            int pointsTemp = getPoints();
            setLevel(pointsTemp / 1000);

            int temp = userIn.getTemperature();
            userIn.setTemperature((int) additionalPoints);
            clientIn.updateUser(userIn);

        } else if (method.equals("Solar")) {
            double additionalPoints = entry * 10;
            userIn.setTotal_saved(pointsSaved + 0);
            userIn.setTotal(points + (int) additionalPoints);
            int pointsTemp = getPoints();
            setLevel(pointsTemp / 1000);

            int temp = userIn.getSolar();
            userIn.setSolar((int) additionalPoints);
            clientIn.updateUser(userIn);
        }

        //Update Labels
        setPoints(userIn.getTotal());
        setPointsSaved(userIn.getTotal_saved());

        lblTotalCO2.setText("The total amount of CO2 you have used up so far is " + getPoints());
        lblCO2Saved.setText("The amount of CO2 you have saved so far is " + getPointsSaved());
        lblLeaderboardContent.setText(LeaderBoardEntry.createLeaderboard(userIn, getLabel()));
        setPointsmissing(PointsMissing.determiningPoints(getPoints()));
        String motivation = "You only need " + getPointsmissing() + " points to the next level!";
        lblMotivation.setText(motivation);
        lblLevel.setText("Your Level is " + getLevel());
        imgMotivation.setIcon(new ImageIcon(CreateMotivationImage.createIcon()));
    }
}

