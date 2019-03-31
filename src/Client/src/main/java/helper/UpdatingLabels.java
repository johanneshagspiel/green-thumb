package helper;

import GUI.GUI_App;
import entity.LeaderBoardEntry;
import entity.User;
import service.UserServiceImpl;

import javax.swing.*;

import static GUI.GUI_App.*;

public class UpdatingLabels {

    public static void updateEverything(User userIn, UserServiceImpl clientIn, JLabel lblPoints, JLabel lblLeaderboardContent, JLabel lblMotivation, JLabel lblLevel, String method) {
        //Update points
        setPoints(getPoints() + 100);
        setLevel(getPoints() / 1000);

        //Update Labels
        lblPoints.setText("The amount of CO2 you have saved so far is " + getPoints());
        lblLeaderboardContent.setText(LeaderBoardEntry.createLeaderboard(getPoints(), getUsername(), userIn));
        setPointsmissing(PointsMissing.determiningPoints(getPoints()));
        String motivation = "You only need " + getPointsmissing() + " points to the next level!";
        lblMotivation.setText(motivation);
        lblLevel.setText("Your Level is " + getLevel());

        //
        if (method.equals("Vegetarian")) {
            int temp = userIn.getVegetarian();
            userIn.setVegetarian(temp + 100);
            clientIn.updateUser(userIn);
        } else if (method.equals("Carnivore")) {
            int temp = userIn.getVegetarian();
            userIn.setVegetarian(temp - 100);
            clientIn.updateUser(userIn);
        } else if (method.equals("LocalProduce")) {
            int temp = userIn.getProduce();
            userIn.setProduce(temp + 100);
            clientIn.updateUser(userIn);
        } else if (method.equals("GlobalProduce")) {
            int temp = userIn.getProduce();
            userIn.setProduce(temp - 100);
            clientIn.updateUser(userIn);
        } else if (method.equals("Bike")) {
            int temp = userIn.getBike();
            userIn.setBike(temp + 100);
            clientIn.updateUser(userIn);
        } else if (method.equals("Car")) {
            int temp = userIn.getCar();
            userIn.setCar(temp - 100);
            clientIn.updateUser(userIn);
        } else if (method.equals("LowerTemp")) {
            int temp = userIn.getTemperature();
            userIn.setTemperature(temp + 100);
            clientIn.updateUser(userIn);
        } else if (method.equals("HigherTemp")) {
            int temp = userIn.getTemperature();
            userIn.setTemperature(temp - 100);
            clientIn.updateUser(userIn);
        } else if (method.equals("SolarYes")) {
            int temp = userIn.getSolar();
            userIn.setSolar(temp + 100);
            clientIn.updateUser(userIn);
        } else if (method.equals("SolarNo")) {
            int temp = userIn.getSolar();
            userIn.setSolar(temp - 100);
            clientIn.updateUser(userIn);
        }
    }
}
