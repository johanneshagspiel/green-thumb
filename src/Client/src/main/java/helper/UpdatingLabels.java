package helper;

import GUI.GUI_App;
import entity.LeaderBoardEntry;
import entity.User;
import service.UserServiceImpl;

import javax.swing.*;

import static GUI.GUI_App.*;

public class UpdatingLabels {

    public static void updateEverythingDuo(User userIn, UserServiceImpl clientIn, JLabel lblTotalCO2, JLabel lblCO2Saved, JLabel lblLeaderboardContent, JLabel lblMotivation, JLabel lblLevel, String method) {

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

        }

    public static void updateEverythingTextField(User userIn, UserServiceImpl clientIn, int entry, JLabel lblTotalCO2, JLabel lblCO2Saved, JLabel lblLeaderboardContent, JLabel lblMotivation, JLabel lblLevel, String method) {

        int points = getPoints();
        int pointsSaved = getPointsSaved();

        //Depending on what is used
        if (method.equals("Car")) {
            int additionalPoints = entry * 10;
            userIn.setTotal_saved(pointsSaved + 0);
            userIn.setTotal(points + additionalPoints);
            int pointsTemp = getPoints();
            setLevel(pointsTemp / 1000);

            int temp = userIn.getCar();
            userIn.setCar(additionalPoints);
            clientIn.updateUser(userIn);

        } else if (method.equals("Public Transportation")) {
            int additionalPoints = entry * 10;
            userIn.setTotal_saved(pointsSaved + 0);
            userIn.setTotal(points + additionalPoints);
            int pointsTemp = getPoints();
            setLevel(pointsTemp / 1000);

            int temp = userIn.getPublic_transportation();
            userIn.setPublic_transportation(additionalPoints);
            clientIn.updateUser(userIn);

        } else if (method.equals("Bike")) {
            int additionalPoints = entry * 10;
            userIn.setTotal_saved(pointsSaved + 0);
            userIn.setTotal(points + additionalPoints);
            int pointsTemp = getPoints();
            setLevel(pointsTemp / 1000);

            int temp = userIn.getBike();
            userIn.setBike(additionalPoints);
            clientIn.updateUser(userIn);

        } else if (method.equals("Temperature")) {
            int additionalPoints = entry * 10;
            userIn.setTotal_saved(pointsSaved + 0);
            userIn.setTotal(points + additionalPoints);
            int pointsTemp = getPoints();
            setLevel(pointsTemp / 1000);

            int temp = userIn.getTemperature();
            userIn.setTemperature(additionalPoints);
            clientIn.updateUser(userIn);

        } else if (method.equals("Solar")) {
            int additionalPoints = entry * 10;
            userIn.setTotal_saved(pointsSaved + 0);
            userIn.setTotal(points + additionalPoints);
            int pointsTemp = getPoints();
            setLevel(pointsTemp / 1000);

            int temp = userIn.getSolar();
            userIn.setSolar(additionalPoints);
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

    }
}

