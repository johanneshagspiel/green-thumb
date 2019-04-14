package helper;

import GUI.GUI_App;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;

import static GUI.GUI_App.getLevel;
/** Motivation image. */
public class CreateMotivationImage {
    /** the first level. */
    public static final int FIRSTLEVEL = 1;
    /** the second level. */
    public static final int SECONDLEVEL = 2;
    /** the third level. */
    public static final int THIRDLEVEL = 3;
    /** the fourth level. */
    public static final int FOURTHLEVEL = 4;

    /**
     * The image.
     * @return the image
     */
    public static BufferedImage createIcon(int level) {


        try {
            BufferedImage myPicture = null;
            if (level == 0 || level < 0) {
                 myPicture = ImageIO.read(
                        new File("src/main/java/resources/level0.JPG"));
                 return myPicture;
            } else if (level == FIRSTLEVEL) {
                 myPicture = ImageIO.read(
                        new File("src/main/java/resources/level1.JPG"));
                 return myPicture;
            } else if (level == SECONDLEVEL) {
                myPicture = ImageIO.read(
                        new File("src/main/java/resources/level2.JPG"));
                return myPicture;
            } else if (level == THIRDLEVEL) {
                 myPicture = ImageIO.read(
                        new File("src/main/java/resources/level4.JPG"));
                 return myPicture;
            } else if (level >= FOURTHLEVEL) {
                myPicture = ImageIO.read(
                        new File("src/main/java/resources/level5.JPG"));
                return myPicture;
            }

        } catch (Exception e) {

        }
        return null;
    }
}
