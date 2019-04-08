package helper;

import GUI.GUI_App;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;

import static GUI.GUI_App.getLevel;

public class CreateMotivationImage {

    public static BufferedImage createIcon () {

        int level = getLevel();

        try {
            BufferedImage myPicture = null;
            if (level == 0 || level < 0) {
                return myPicture = ImageIO.read(new File("C:\\Users\\Johannes\\template\\src\\Client\\src\\main\\java\\resources\\level0.JPG"));
            } else if (level == 1) {
                return myPicture = ImageIO.read(new File("C:\\Users\\Johannes\\template\\src\\Client\\src\\main\\java\\resources\\level1.JPG"));
            } else if (level == 2) {
                return myPicture = ImageIO.read(new File("C:\\Users\\Johannes\\template\\src\\Client\\src\\main\\java\\resources\\level2.JPG"));
            } else if (level == 3) {
                return myPicture = ImageIO.read(new File("C:\\Users\\Johannes\\template\\src\\Client\\src\\main\\java\\resources\\level4.JPG"));
            } else if (level >= 4) {
                return myPicture = ImageIO.read(new File("C:\\Users\\Johannes\\template\\src\\Client\\src\\main\\java\\resources\\level5.JPG"));
            }

        } catch (Exception e) {

        }
        return null;
    }
}
