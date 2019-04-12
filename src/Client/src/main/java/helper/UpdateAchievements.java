package helper;

import entity.User;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
/** The update achievements. */
public class UpdateAchievements {
    /** The value for the achievement. */
    public static final int ACHIEVEMENTVALUE = 500;
    /** The value for the friend achievement. */
    public static final int FRIENDSLISTVALUE = 5;
    /** The value for the total saved achievement. */
    public static final int TOTALSAVEDVALUE = 1000;
    /**
     * The image.
     * @param label the label
     * @param userIn the user in
     * @return the image
     */
    public static Image updateAchievements(
            final String label,
            final User userIn) {

        if (label.equals("imgAchievementOne")
                || label.equals("Vegetarian") || label.equals("Carnivore")) {
            try {
                BufferedImage myPicture = ImageIO.read(new File(
                        "src/main/java/resources/achievement_vegetarian.jpg"));
                if (userIn.getVegetarian() < ACHIEVEMENTVALUE) {
                    Image gray = GrayFilter.createDisabledImage(myPicture);
                    return gray;
                } else {
                    return myPicture;
                }
            } catch (Exception e) {
            }
        } else if (label.equals("imgAchievementTwo")
                || label.equals("Local Produce")
                ||  label.equals("Global Produce")) {
            try {
                BufferedImage myPicture = ImageIO.read(new File(
                        "src/main/java/resources/"
                                + "achievement_localproduce.jpg"));
                if (userIn.getProduce() < ACHIEVEMENTVALUE) {
                    Image gray = GrayFilter.createDisabledImage(myPicture);
                    return gray;
                } else {
                    return myPicture;
                }
            } catch (Exception e) {
            }
        } else if (label.equals("imgAchievementThree")
                || label.equals("Bike") || label.equals("Car")) {
            try {
                BufferedImage myPicture = ImageIO.read(new File(
                        "src/main/java/resources/achievement_bike.jpg"));
                if (userIn.getBike() < ACHIEVEMENTVALUE) {
                    Image gray = GrayFilter.createDisabledImage(myPicture);
                    return gray;
                } else {
                    return myPicture;
                }
            } catch (Exception e) {
            }
        } else if (label.equals("imgAchievementFour")
                || label.equals("Public Transportation")) {
            try {
                BufferedImage myPicture = ImageIO.read(new File(
                        "src/main/java/resources/"
                                + "achievement_publictransport.jpg"));
                if (userIn.getPublic_transportation() < ACHIEVEMENTVALUE) {
                    Image gray = GrayFilter.createDisabledImage(myPicture);
                    return gray;
                } else {
                    return myPicture;
                }
            } catch (Exception e) {
            }
        } else if (label.equals("imgAchievementFive")
                || label.equals("Temperature")) {
            try {
                BufferedImage myPicture = ImageIO.read(new File(
                        "src/main/java/resources/"
                                + "achievement_temperature.jpg"));

                if (userIn.getTemperature() < ACHIEVEMENTVALUE) {
                    Image gray = GrayFilter.createDisabledImage(myPicture);
                    return gray;
                } else {
                    return myPicture;
                }

            } catch (Exception e) {
            }
        } else if (label.equals("imgAchievementSix")
                || label.equals("Solar")) {
            try {
                BufferedImage myPicture = ImageIO.read(new File(
                        "src/main/java/resources/achievement_solarpanels.jpg"));
                if (userIn.getSolar() < ACHIEVEMENTVALUE) {
                    Image gray = GrayFilter.createDisabledImage(myPicture);
                    return gray;
                } else {
                    return myPicture;
                }
            } catch (Exception e) {
            }
        } else if (label.equals("imgAchievementSeven")) {
            try {
                BufferedImage myPicture = ImageIO.read(new File(
                        "src/main/java/resources/achievement_co2.jpg"));
                if (userIn.getTotal_saved() < TOTALSAVEDVALUE) {
                    Image gray = GrayFilter.createDisabledImage(myPicture);
                    return gray;
                } else {
                    return myPicture;
                }
            } catch (Exception e) {
            }
        } else if (label.equals("imgAchievementEight")) {
            try {
                BufferedImage myPicture = ImageIO.read(new File(
                        "src/main/java/resources/achievement_friends.jpg"));
                if (userIn.getFriendlist().size() < FRIENDSLISTVALUE) {
                    Image gray = GrayFilter.createDisabledImage(myPicture);
                    return gray;
                } else {
                    return myPicture;
                }
            } catch (Exception e) {
            }
        }
        return null;
    }

    /**
     * The create text.
     * @param label the label
     * @param userIn the user in
     * @return the string
     */
    public static String createText(final String label, final User userIn) {

        if (label.equals("imgAchievementOne")
                || label.equals("Vegetarian") || label.equals("Carnivore")) {
            if (userIn.getVegetarian() < ACHIEVEMENTVALUE) {
                int tempMath = ACHIEVEMENTVALUE - userIn.getVegetarian();
                String temp = "You only need " + tempMath
                        + " more points for vegetarian meals"
                        + " to unlock this achievement!";
                return temp;
            } else {
                String temp = "You have already unlocked this achievement";
                return temp;
            }
        } else if (label.equals("imgAchievementTwo")
                || label.equals("Local Produce")
                || label.equals("Global Produce")) {
            if (userIn.getProduce() < ACHIEVEMENTVALUE) {
                int tempMath = ACHIEVEMENTVALUE - userIn.getProduce();
                String temp = "You only need "
                        + tempMath
                        + " more points for local products"
                        + " to unlock this achievement!";
                return temp;
            } else {
                String temp = "You have already unlocked this achievement";
                return temp;
            }
        } else if (label.equals("imgAchievementThree")
                || label.equals("Bike") || label.equals("Car")) {
            if (userIn.getBike() < ACHIEVEMENTVALUE) {
                int tempMath = ACHIEVEMENTVALUE - userIn.getBike();
                String temp = "You only need "
                        + tempMath
                        + " more points for traveling by"
                        + " bike to unlock this achievement!";
                return temp;
            } else {
                String temp = "You have already unlocked this achievement";
                return temp;
            }
        } else if (label.equals("imgAchievementFour")
                || label.equals("Public Transportation")) {
            if (userIn.getPublic_transportation() < ACHIEVEMENTVALUE) {
                int tempMath = ACHIEVEMENTVALUE
                        - userIn.getPublic_transportation();
                String temp = "You only need "
                        + tempMath
                        + " more points for traveling with public"
                        + " transportation to unlock this achievement!";
                return temp;
            } else {
                String temp = "You have already unlocked this achievement";
                return temp;
            }
        } else if (label.equals("imgAchievementFive")
                || label.equals("Temperature")) {
            if (userIn.getTemperature() < ACHIEVEMENTVALUE) {
                int tempMath = ACHIEVEMENTVALUE - userIn.getTemperature();
                String temp = "You only need "
                        + tempMath
                        + " more points for decreasing the temperature"
                        + " to unlock this achievement!";
                return temp;
            } else {
                String temp = "You have already unlocked this achievement";
                return temp;
            }
        } else if (label.equals("imgAchievementSix")
                || label.equals("Solar")) {
            if (userIn.getSolar() < ACHIEVEMENTVALUE) {
                int tempMath = ACHIEVEMENTVALUE - userIn.getSolar();
                String temp = "You only need "
                        + tempMath
                        + " more points for owning solar"
                        + " panels to unlock this achievement!";
                return temp;
            } else {
                String temp = "You have already unlocked this achievement";
                return temp;
            }
        } else if (label.equals("imgAchievementSeven")) {
            if (userIn.getTotal_saved() < TOTALSAVEDVALUE) {
                int tempMath = TOTALSAVEDVALUE - userIn.getTotal_saved();
                String temp = "You only need "
                        + tempMath
                        + " more points for saving CO2"
                        + " to unlock this achievement!";
                return temp;
            } else {
                String temp = "You have already unlocked this achievement";
                return temp;
            }
        } else if (label.equals("imgAchievementEight")) {
            if (userIn.getFriendlist().size() < FRIENDSLISTVALUE) {
                int tempMath = FRIENDSLISTVALUE - userIn.getFriendlist().size();
                String temp = "You only need to add "
                        + tempMath
                        + " more friends to your friend"
                        + " list to unlock this achievement!";
                return temp;
            } else {
                String temp = "You have already unlocked this achievement";
                return temp;
            }
        }
        return null;
    }
}
