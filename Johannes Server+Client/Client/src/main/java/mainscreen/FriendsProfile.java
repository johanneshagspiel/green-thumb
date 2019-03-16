package mainscreen;


import entity.User;
import service.UserServiceImpl;
import javax.swing.*;
import java.awt.*;

public class FriendsProfile {

    private static JFrame frame2;

    private FriendsProfile(User userIn, UserServiceImpl clientIn) {
        initialize(userIn, clientIn);
    }

    public static void application(User userIn, UserServiceImpl clientIn) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    FriendsProfile window = new FriendsProfile(userIn, clientIn);
                    FriendsProfile.frame2.setVisible(true);
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
        JLabel lblWelcome = new JLabel("My Friends");
        lblWelcome.setBounds(120, 20, 150, 20);
        frame2.getContentPane().add(lblWelcome);



    }
}