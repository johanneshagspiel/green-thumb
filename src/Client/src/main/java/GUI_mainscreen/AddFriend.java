package GUI_mainscreen;


import entity.User;
import service.UserServiceImpl;
import javax.swing.*;
import java.awt.*;

/**
 * The type Add friend.
 */
public class AddFriend {

    private static JFrame frame3;
    private static JTextField txtUsername;

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
        frame3.setBounds(300, 300, 300, 300);
        frame3.getContentPane().setLayout(null);
        
        JLabel lblAddFriend = new JLabel("Add Friend");
        lblAddFriend.setHorizontalAlignment(SwingConstants.CENTER);
        lblAddFriend.setFont(new Font("Arial Black", Font.PLAIN, 16));
        lblAddFriend.setBounds(10, 20, 266, 31);
        frame3.getContentPane().add(lblAddFriend);
        
        JSeparator separator = new JSeparator();
        separator.setBounds(20, 49, 256, 2);
        frame3.getContentPane().add(separator);
        
        txtUsername = new JTextField();
        txtUsername.setBounds(122, 71, 118, 19);
        frame3.getContentPane().add(txtUsername);
        txtUsername.setColumns(10);
        
        JLabel lblUsername = new JLabel("Username");
        lblUsername.setFont(new Font("Arial Black", Font.PLAIN, 12));
        lblUsername.setBounds(30, 74, 82, 13);
        frame3.getContentPane().add(lblUsername);
        
        JButton btnSearch = new JButton("Search");
        btnSearch.setBounds(155, 100, 85, 21);
        frame3.getContentPane().add(btnSearch);
        
        JLabel lblResults = new JLabel("Results");
        lblResults.setFont(new Font("Arial Black", Font.PLAIN, 13));
        lblResults.setBounds(30, 144, 85, 19);
        frame3.getContentPane().add(lblResults);
        
        JSeparator separator_1 = new JSeparator();
        separator_1.setBounds(20, 131, 256, 2);
        frame3.getContentPane().add(separator_1);

        for(int i = 0; i<3; i++) {
        	JButton btnAdd = new JButton("Add");
            btnAdd.setBounds(191, 175+i*25, 85, 21);
            frame3.getContentPane().add(btnAdd);
            
            JLabel labelAdd = new JLabel("<name>");
            labelAdd.setFont(new Font("Arial Black", Font.PLAIN, 12));
            labelAdd.setBounds(30, 175+i*25, 130, 19);
            frame3.getContentPane().add(labelAdd);
        }
        
        frame3.setFocusable(true);

    }
}