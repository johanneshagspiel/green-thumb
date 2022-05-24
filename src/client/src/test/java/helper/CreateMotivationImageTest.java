package helper;

import org.junit.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static helper.CreateMotivationImage.createIcon;
import static junit.framework.TestCase.assertTrue;

public class CreateMotivationImageTest {
    @Test
    public void testCreateIconNegative(){
        BufferedImage picture = null;
        try {
            picture = ImageIO.read(new File("src/main/java/resources/level0.JPG"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        assertTrue(compareImages(picture, createIcon(-1)));
    }

    @Test
    public void testCreateIconZero(){
        BufferedImage picture = null;
        try {
            picture = ImageIO.read(new File("src/main/java/resources/level0.JPG"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        assertTrue(compareImages(picture, createIcon(0)));
    }

    @Test
    public void testCreateIconOne(){

        BufferedImage picture = null;
        try {
            picture = ImageIO.read(new File("src/main/java/resources/level1.JPG"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertTrue(compareImages(picture, createIcon(1)));
    }

    @Test
    public void testCreateIconTwo(){

        BufferedImage picture = null;
        try {
            picture = ImageIO.read(new File("src/main/java/resources/level2.JPG"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertTrue(compareImages(picture, createIcon(2)));
    }

    @Test
    public void testCreateIconThree(){

        BufferedImage picture = null;
        try {
            picture = ImageIO.read(new File("src/main/java/resources/level4.JPG"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertTrue(compareImages(picture, createIcon(3)));
    }

    @Test
    public void testCreateIconFour(){

        BufferedImage picture = null;
        try {
            picture = ImageIO.read(new File("src/main/java/resources/level5.JPG"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertTrue(compareImages(picture, createIcon(4)));
    }

    @Test
    public void testCreateIconTen(){

        BufferedImage picture = null;
        try {
            picture = ImageIO.read(new File("src/main/java/resources/level5.JPG"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertTrue(compareImages(picture, createIcon(10)));
    }


    public static boolean compareImages(BufferedImage imgA, BufferedImage imgB) {
       if(imgA.getWidth() != imgB.getWidth() || imgA.getHeight() != imgB.getHeight()){
           return false;
       }
       int width = imgA.getWidth();
       int height = imgB.getHeight();

       for(int i = 0; i < height; i++){
           for(int j = 0; j < width; j++){
               if(imgA.getRGB(j, i) != imgB.getRGB(j, i)){
                   return false;
               }
           }
       }
       return true;
    }

}
