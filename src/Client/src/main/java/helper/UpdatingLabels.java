package helper;

import GUI.GUI_App;
import entity.CO2_Supplier;
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
            //Initializing the values we are going to use.
            int mealSaved = (int) (CO2_Supplier.mealDifference(true, false) * 100);
            int mealCost = (int) (CO2_Supplier.meal(true, false) * 100);

            //updating the totals.
            userIn.setTotal_saved(getPointsSaved() + mealSaved);
            userIn.setTotal(getPoints() + mealCost);
            int pointsTemp = getPoints();
            setLevel(pointsTemp / 1000);

            //updating the feature's total saved.
            int temp = userIn.getVegetarian();
            userIn.setVegetarian(temp + mealSaved);
            clientIn.updateUser(userIn);

        } else if (method.equals("Carnivore")) {
            //Initializing the values we are going to use.
            int mealSaved = (int) (CO2_Supplier.mealDifference(false, false) * 100);
            int mealCost = (int) (CO2_Supplier.meal(false, false) * 100);

            //updating the totals.
            userIn.setTotal_saved(getPointsSaved() + mealSaved);
            userIn.setTotal(getPoints() + mealCost);
            int pointsTemp = getPoints();
            setLevel(pointsTemp / 1000);

            //updating the feature's total saved.
            int temp = userIn.getVegetarian();
            userIn.setVegetarian(mealSaved);
            clientIn.updateUser(userIn);

        } else if (method.equals("Local Produce")) {
            //Initializing the values we are going to use.
            int mealSaved = (int) (CO2_Supplier.mealDifference(false, true) * 100);
            int mealCost = (int) (CO2_Supplier.meal(false, true) * 100);

            //updating the totals.
            userIn.setTotal_saved(getPointsSaved() + mealSaved);
            userIn.setTotal(getPoints() + mealCost);
            int pointsTemp = getPoints();
            setLevel(pointsTemp / 1000);

            //updating the feature's total saved.
            int temp = userIn.getProduce();
            userIn.setProduce(temp + mealSaved);
            clientIn.updateUser(userIn);

        } else if (method.equals("Global Produce")) {
            //Initializing the values we are going to use.
            int mealSaved = (int) (CO2_Supplier.mealDifference(false, false) * 100);
            int mealCost = (int) (CO2_Supplier.meal(false, false) * 100);

            //updating the totals.
            userIn.setTotal_saved(getPointsSaved() + mealSaved);
            userIn.setTotal(getPoints() + mealCost);
            int pointsTemp = getPoints();
            setLevel(pointsTemp / 1000);

            //updating the feature's total saved.
            int temp = userIn.getProduce();
            userIn.setProduce(temp + mealSaved);
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
            // Initializing the values we are going to use.
            int producedCO2 = ((int) CO2_Supplier.car((int) entry) * 100);

            //Updating the totals.
            userIn.setTotal_saved(getPointsSaved());
            userIn.setTotal(getPoints() + producedCO2);
            int pointsTemp = getPoints();
            setLevel(pointsTemp / 1000);

            //Updating the feature's total saved.
            int temp = userIn.getCar();
            //All the other features store their SAVED co2 here, except for "car", which stores the total
            //consumed co2.
            userIn.setCar(temp + (int) CO2_Supplier.car((int) entry));
            clientIn.updateUser(userIn);

        } else if (method.equals("Public Transportation")) {
            // Initializing the values we are going to use.
            int producedCO2 = ((int) CO2_Supplier.publicTransport((int) entry) * 100);
            int savedCO2 = ((int) CO2_Supplier.publicTransportVsCar((int) entry) * 100);

            //Updating the totals.
            userIn.setTotal_saved(getPointsSaved() + savedCO2);
            userIn.setTotal(getPoints() + producedCO2);
            int pointsTemp = getPoints();
            setLevel(pointsTemp / 1000);

            //Updating the feature's total saved.
            int temp = userIn.getPublic_transportation();
            userIn.setPublic_transportation(temp + savedCO2);
            clientIn.updateUser(userIn);

        } else if (method.equals("Bike")) {
            // Initializing the values we are going to use.
            int producedCO2 = ((int) CO2_Supplier.bike((int) entry) * 100);
            int savedCO2 = ((int) CO2_Supplier.bikeVsCar((int) entry) * 100);

            //Updating the totals.
            userIn.setTotal_saved(getPointsSaved() + savedCO2);
            userIn.setTotal(getPoints() + producedCO2);
            int pointsTemp = getPoints();
            setLevel(pointsTemp / 1000);

            //Updating the feature's total saved.
            int temp = userIn.getBike();
            userIn.setBike(temp + savedCO2);
            clientIn.updateUser(userIn);

        } else if (method.equals("Temperature")) {
            // Initializing the values we are going to use.
            int producedCO2 = ((int) CO2_Supplier.usedTemperature(1, (int) entry) * 100);
            int savedCO2 = ((int) CO2_Supplier.temperature(1, (int) entry) * 100);

            //Updating the totals.
            userIn.setTotal_saved(getPointsSaved() + savedCO2);
            userIn.setTotal(getPoints() + producedCO2);
            int pointsTemp = getPoints();
            setLevel(pointsTemp / 1000);

            //Updating the feature's total saved.
            int temp = userIn.getTemperature();
            userIn.setTemperature(temp + savedCO2);
            clientIn.updateUser(userIn);

        } else if (method.equals("Solar")) {
            // Initializing the values we are going to use. (assuming one person for simplicity)
            int producedCO2 = ((int) CO2_Supplier.solarPanelUsed((int) entry, 1) * 100);
            int savedCO2 = ((int) CO2_Supplier.solarPanel((int) entry) * 100);

            //Updating the totals.
            userIn.setTotal_saved(getPointsSaved() + savedCO2);
            userIn.setTotal(getPoints() + producedCO2);
            int pointsTemp = getPoints();
            setLevel(pointsTemp / 1000);

            //Updating the feature's total saved.
            int temp = userIn.getSolar();
            userIn.setSolar(temp + savedCO2);
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

