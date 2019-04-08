package helper;

import entity.User;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class UpdateAchievements {

    public static Image updateAchievements(String label, User userIn) {

        if (label.equals("imgAchievementOne") || label.equals("Vegetarian") || label.equals("Carnivore"))
        {
            try {
                BufferedImage myPicture = ImageIO.read(new File("src/main/java/resources/level0.JPG"));

                if (userIn.getVegetarian() < 500) {
                    Image gray = GrayFilter.createDisabledImage(myPicture);
                    return gray;
                } else {
                    return myPicture;
                }

            } catch (Exception e)
            {

            }
        } else if (label.equals("imgAchievementTwo") || label.equals("Local Produce") ||  label.equals("Global Produce"))
        {
            try {
                BufferedImage myPicture = ImageIO.read(new File("src/main/java/resources/level0.JPG"));

                if (userIn.getProduce() < 500) {
                    Image gray = GrayFilter.createDisabledImage(myPicture);
                    return gray;
                } else {
                    return myPicture;
                }

            } catch (Exception e)
            {

            }
        } else if (label.equals("imgAchievementThree") ||  label.equals("Bike") || label.equals("Car"))
        {
            try {
                BufferedImage myPicture = ImageIO.read(new File("src/main/java/resources/level0.JPG"));

                if (userIn.getBike() < 500) {
                    Image gray = GrayFilter.createDisabledImage(myPicture);
                    return gray;
                } else {
                    return myPicture;
                }

            } catch (Exception e)
            {

            }
        } else if (label.equals("imgAchievementFour") ||  label.equals("Public Transportation"))
        {
            try {
                BufferedImage myPicture = ImageIO.read(new File("src/main/java/resources/level0.JPG"));

                if (userIn.getPublic_transportation() < 500) {
                    Image gray = GrayFilter.createDisabledImage(myPicture);
                    return gray;
                } else {
                    return myPicture;
                }

            } catch (Exception e)
            {

            }
        } else if (label.equals("imgAchievementFive") ||  label.equals("Temperature"))
        {
            try {
                BufferedImage myPicture = ImageIO.read(new File("src/main/java/resources/level0.JPG"));

                if (userIn.getTemperature() < 500) {
                    Image gray = GrayFilter.createDisabledImage(myPicture);
                    return gray;
                } else {
                    return myPicture;
                }

            } catch (Exception e)
            {

            }
        } else if (label.equals("imgAchievementSix") ||  label.equals("Solar"))
        {
            try {
                BufferedImage myPicture = ImageIO.read(new File("src/main/java/resources/level0.JPG"));

                if (userIn.getSolar() < 500) {
                    Image gray = GrayFilter.createDisabledImage(myPicture);
                    return gray;
                } else {
                    return myPicture;
                }

            } catch (Exception e)
            {

            }
        } else if (label.equals("imgAchievementSeven"))
        {
            try {
                BufferedImage myPicture = ImageIO.read(new File("src/main/java/resources/level0.JPG"));

                if (userIn.getTotal_saved() < 1000) {
                    Image gray = GrayFilter.createDisabledImage(myPicture);
                    return gray;
                } else {
                    return myPicture;
                }

            } catch (Exception e)
            {

            }
        } else if (label.equals("imgAchievementEight"))
        {
            try {
                BufferedImage myPicture = ImageIO.read(new File("src/main/java/resources/level0.JPG"));

                if (userIn.getFriendlist().size() < 5) {
                    Image gray = GrayFilter.createDisabledImage(myPicture);
                    return gray;
                } else {
                    return myPicture;
                }

            } catch (Exception e)
            {

            }
        }
        return null;
    } public static String createText(String label, User userIn) {

        if (label.equals("imgAchievementOne") || label.equals("Vegetarian") || label.equals("Carnivore")) {
            if (userIn.getVegetarian() < 500) {
                int tempMath = 500 - userIn.getVegetarian();
                String temp = "You only need " + tempMath + " more points for vegetarian meals to unlock this achievement!";
                return temp;
            } else {
                String temp = "You have already unlocked this achievement";
                return temp;
            }
        } else if (label.equals("imgAchievementTwo") || label.equals("Local Produce") || label.equals("Global Produce")) {
            if (userIn.getProduce() < 500) {
                int tempMath = 500 - userIn.getProduce();
                String temp = "You only need " + tempMath + " more points for local products to unlock this achievement!";
                return temp;
            } else {
                String temp = "You have already unlocked this achievement";
                return temp;
            }
        } else if (label.equals("imgAchievementThree") || label.equals("Bike") || label.equals("Car")) {
            if (userIn.getBike() < 500) {
                int tempMath = 500 - userIn.getBike();
                String temp = "You only need " + tempMath + " more points for traveling by bike to unlock this achievement!";
                return temp;
            } else {
                String temp = "You have already unlocked this achievement";
                return temp;
            }
        } else if (label.equals("imgAchievementFour") || label.equals("Public Transportation")) {
            if (userIn.getPublic_transportation() < 500) {
                int tempMath = 500 - userIn.getPublic_transportation();
                String temp = "You only need " + tempMath + " more points for traveling with public transportation to unlock this achievement!";
                return temp;
            } else {
                String temp = "You have already unlocked this achievement";
                return temp;
            }
        } else if (label.equals("imgAchievementFive") ||  label.equals("Temperature")) {
            if (userIn.getTemperature() < 500) {
                int tempMath = 500 - userIn.getTemperature();
                String temp = "You only need " + tempMath + " more points for decreasing the temperature to unlock this achievement!";
                return temp;
            } else {
                String temp = "You have already unlocked this achievement";
                return temp;
            }
        } else if (label.equals("imgAchievementSix") ||  label.equals("Solar")) {
            if (userIn.getSolar() < 500) {
                int tempMath = 500 - userIn.getSolar();
                String temp = "You only need " + tempMath + " more points for owning solar panels to unlock this achievement!";
                return temp;
            } else {
                String temp = "You have already unlocked this achievement";
                return temp;
            }
        } else if (label.equals("imgAchievementSeven")) {
            if (userIn.getTotal_saved() < 1000) {
                int tempMath = 1000 - userIn.getTotal_saved();
                String temp = "You only need " + tempMath + " more points for saving CO2 to unlock this achievement!";
                return temp;
            } else {
                String temp = "You have already unlocked this achievement";
                return temp;
            }
        } else if (label.equals("imgAchievementEight")) {
            if (userIn.getFriendlist().size() < 5) {
                int tempMath = 5 - userIn.getFriendlist().size();
                String temp = "You only need to add " + tempMath + " more friends to your friend list to unlock this achievement!";
                return temp;
            } else {
                String temp = "You have already unlocked this achievement";
                return temp;
            }
        }
        return null;
    }
}
