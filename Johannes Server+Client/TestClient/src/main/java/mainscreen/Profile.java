package mainscreen;


import entity.User;
import service.UserServiceImpl;
import javax.swing.*;
import java.awt.*;

public class Profile {

    private static JFrame frame2;

    private Profile(User userIn, UserServiceImpl clientIn) {
         initialize(userIn, clientIn);
    }

    public static void application(User userIn, UserServiceImpl clientIn) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Profile window = new Profile(userIn, clientIn);
                    Profile.frame2.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public static void initialize(User userIn, UserServiceImpl clientIn) {

        frame2 = new JFrame();
        frame2.setBounds(300, 500, 300, 500);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.getContentPane().setLayout(null);
        frame2.setFocusable(true);

        // Labels
        JLabel lblWelcome = new JLabel("My Profile");
        lblWelcome.setBounds(120, 20, 150, 20);
        frame2.getContentPane().add(lblWelcome);

        JLabel lblUsername = new JLabel("Your Username " + userIn.getUser_name());
        lblUsername.setBounds(120, 10, 10, 20);
        frame2.getContentPane().add(lblUsername);


    }
}