package GUI_mainscreen;

import GUI.GUI_App;
import entity.User;
import service.UserServiceImpl;
import javax.swing.*;
import java.awt.*;

import static GUI.GUI_App.getUsername;

/**
 * The type My profile.
 */
public class MyProfile2 {

    private static JFrame frame2;

    private MyProfile2(User userIn, UserServiceImpl clientIn) {
        initialize(userIn, clientIn);
    }

    /**
     * Application.
     *
     * @param userIn   the user in
     * @param clientIn the client in
     */
    public static void application(User userIn, UserServiceImpl clientIn, String username) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MyProfile2 window = new MyProfile2(userIn, clientIn);
                    MyProfile2.frame2.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Initialize.
     *
     * @param userIn   the user in
     * @param clientIn the client in
     */
    public static void initialize(User userIn, UserServiceImpl clientIn) {

        frame2 = new JFrame();
        frame2.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
        frame2.setBounds(300, 500, 300, 286);
        frame2.getContentPane().setLayout(null);
        frame2.setFocusable(true);

            JLabel lblWelcome = new JLabel("Profile of " + userIn.getUser_name());
            lblWelcome.setFont(new Font("Arial Black", Font.PLAIN, 15));
            lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
            lblWelcome.setBounds(10, 10, 266, 28);
            frame2.getContentPane().add(lblWelcome);

            JLabel lblVegetarian = new JLabel("Vegetarian Score:" + userIn.getVegetarian());
            lblVegetarian.setHorizontalAlignment(SwingConstants.LEFT);
            lblVegetarian.setBounds(10, 50, 266, 20);
            frame2.getContentPane().add(lblVegetarian);

            JLabel lblProduce = new JLabel("Produce Score: " + userIn.getProduce());
            lblProduce.setHorizontalAlignment(SwingConstants.LEFT);
            lblProduce.setBounds(10, 70, 266, 20);
            frame2.getContentPane().add(lblProduce);

            JLabel lblCar = new JLabel("Car Score: " + userIn.getCar());
            lblCar.setHorizontalAlignment(SwingConstants.LEFT);
            lblCar.setBounds(10, 90, 266, 20);
            frame2.getContentPane().add(lblCar);

            JLabel lblPublic_transportation = new JLabel("Public Transportation Score: " + userIn.getPublic_transportation());
            lblPublic_transportation.setHorizontalAlignment(SwingConstants.LEFT);
            lblPublic_transportation.setBounds(10, 110, 266, 20);
            frame2.getContentPane().add(lblPublic_transportation);

            JLabel lblBike = new JLabel("Bike Score: " + userIn.getBike());
            lblBike.setHorizontalAlignment(SwingConstants.LEFT);
            lblBike.setBounds(10, 130, 266, 20);
            frame2.getContentPane().add(lblBike);

            JLabel lblTemperature = new JLabel("Temperature Score: " + userIn.getTemperature());
            lblTemperature.setHorizontalAlignment(SwingConstants.LEFT);
            lblTemperature.setBounds(10, 150, 266, 20);
            frame2.getContentPane().add(lblTemperature);

            JLabel lblSolar = new JLabel("Solar Score: " + userIn.getSolar());
            lblSolar.setHorizontalAlignment(SwingConstants.LEFT);
            lblSolar.setBounds(10, 170, 266, 20);
            frame2.getContentPane().add(lblSolar);

            JLabel lblSaved = new JLabel("Overall CO2 Saved: " + userIn.getTotal_saved());
            lblSaved.setHorizontalAlignment(SwingConstants.LEFT);
            lblSaved.setBounds(10, 190, 266, 20);
            frame2.getContentPane().add(lblSaved);

            JLabel lblOverall = new JLabel("Overall Score: " + userIn.getTotal());
            lblOverall.setHorizontalAlignment(SwingConstants.LEFT);
            lblOverall.setBounds(10, 210, 266, 20);
            frame2.getContentPane().add(lblOverall);
            }
    }
