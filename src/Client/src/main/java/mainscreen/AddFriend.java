package mainscreen;


import entity.User;
import service.UserServiceImpl;
import javax.swing.*;
import java.awt.*;

/**
 * The type Add friend.
 */
public class AddFriend {

    private static JFrame frame3;

    private AddFriend(User userIn, UserServiceImpl clientIn) {
        initialize(userIn, clientIn);
    }

    /**
     * Application.
     *
     * @param userIn   the user in
     * @param clientIn the client in
     */
    public static void application(User userIn, UserServiceImpl clientIn) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AddFriend window = new AddFriend(userIn, clientIn);
                    AddFriend.frame3.setVisible(true);
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

        frame3 = new JFrame();
        frame3.setBounds(300, 500, 300, 500);
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.getContentPane().setLayout(null);
        frame3.setFocusable(true);

        // Labels
        JLabel lblWelcome = new JLabel("My Profile");
        lblWelcome.setBounds(120, 20, 150, 20);
        frame3.getContentPane().add(lblWelcome);

        JLabel lblUsername = new JLabel("Your Username " + userIn.getUser_name());
        lblUsername.setBounds(120, 10, 10, 20);
        frame3.getContentPane().add(lblUsername);


    }
}