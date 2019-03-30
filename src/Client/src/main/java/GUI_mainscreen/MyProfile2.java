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
        frame2.setBounds(300, 500, 300, 500);
        frame2.getContentPane().setLayout(null);
        frame2.setFocusable(true);

            JLabel lblWelcome = new JLabel("Profile of " + userIn.getUser_name());
            lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
            lblWelcome.setBounds(10, 10, 266, 20);
            frame2.getContentPane().add(lblWelcome);

            JLabel lblVegetarian = new JLabel("Vegetarian Score:" + userIn.getVegetarian());
            lblVegetarian.setHorizontalAlignment(SwingConstants.LEFT);
            lblVegetarian.setBounds(10, 50, 266, 20);
            frame2.getContentPane().add(lblVegetarian);

            JLabel lblProduce = new JLabel("Produce Score: " + userIn.getProduce());
            lblProduce.setHorizontalAlignment(SwingConstants.LEFT);
            lblProduce.setBounds(10, 70, 266, 20);
            frame2.getContentPane().add(lblProduce);

            JLabel lblTemperature = new JLabel("Temperature Score: " + userIn.getTemperature());
            lblTemperature.setHorizontalAlignment(SwingConstants.LEFT);
            lblTemperature.setBounds(10, 90, 266, 20);
            frame2.getContentPane().add(lblTemperature);

            JLabel lblSolar = new JLabel("Solar Score: " + userIn.getSolar());
            lblSolar.setHorizontalAlignment(SwingConstants.LEFT);
            lblSolar.setBounds(10, 110, 266, 20);
            frame2.getContentPane().add(lblSolar);

            JLabel lblTransportation = new JLabel("Transportation Score: " + userIn.getTransportation());
            lblTransportation.setHorizontalAlignment(SwingConstants.LEFT);
            lblTransportation.setBounds(10, 130, 266, 20);
            frame2.getContentPane().add(lblTransportation);

            JLabel lblTransportation2 = new JLabel("Transportation2 Score: " + userIn.getTransportation());
            lblTransportation2.setHorizontalAlignment(SwingConstants.LEFT);
            lblTransportation2.setBounds(10, 150, 266, 20);
            frame2.getContentPane().add(lblTransportation2);

            Integer points = userIn.getProduce() + userIn.getSolar() + userIn.getTemperature() + userIn.getTransportation() + userIn.getVegetarian();
            JLabel lblOverall = new JLabel("Overall Score: " + points);
            lblOverall.setHorizontalAlignment(SwingConstants.LEFT);
            lblOverall.setBounds(10, 170, 266, 20);
            frame2.getContentPane().add(lblOverall);
        }
    }
