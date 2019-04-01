package GUI_mainscreen;

import GUI.GUI_App;
import Login.Login_r;
import entity.Friend;
import entity.LeaderBoardEntry;
import entity.User;
import service.FriendServiceImpl;
import service.UserServiceImpl;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;

import static GUI.GUI_App.getUsername;
import static GUI.GUI_App.setUsername;
import static GUI.Login_S.friendClient;
import static GUI.Login_S.user;

/**
 * The type My profile.
 */
public class Update {

    private static JFrame frame;
    private static JTextField txtentry1;
    private static JTextField txtentry2;
    private static String label;

    private Update(User userIn, UserServiceImpl clientIn, String stringIn, FriendServiceImpl clientFriend, JFrame frameIn) {
        initialize(userIn, clientIn, stringIn, clientFriend, frameIn);
    }

    /**
     * Application.
     *
     * @param userIn   the user in
     * @param clientIn the client in
     */
    public static void application(User userIn, UserServiceImpl clientIn, String stringIn, FriendServiceImpl clientFriend, JFrame frameIn) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Update window = new Update(userIn, clientIn, stringIn, clientFriend, frameIn);
                    Update.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Initialize.
     * @param userIn   the user in
     * @param clientIn the client in
     * @param clientFriend
     * @param frameIn
     */
    public static void initialize(User userIn, UserServiceImpl clientIn, String stringIn, FriendServiceImpl clientFriend, JFrame frameIn) {

        frame = new JFrame();
        frame.setBounds(300, 500, 300, 500);
        frame.getContentPane().setLayout(null);
        frame.setFocusable(true);

        if (stringIn == userIn.getUser_name())
        {
            label = "user name";
        } else if (stringIn == userIn.getPassword())
        {
            label = "password";
        }

        // Labels
        JLabel lblWelcome = new JLabel("Change your " + label);
        lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
        lblWelcome.setBounds(10, 10, 266, 20);
        frame.getContentPane().add(lblWelcome);

        JLabel changeUserName = new JLabel("New " + label);
        changeUserName.setHorizontalAlignment(SwingConstants.CENTER);
        changeUserName.setBounds(10, 50, 266, 20);
        frame.getContentPane().add(changeUserName);

        JLabel changePassword = new JLabel("Please repeat your new " + label);
        changePassword.setHorizontalAlignment(SwingConstants.CENTER);
        changePassword.setBounds(10, 100, 266, 20);
        frame.getContentPane().add(changePassword);

        txtentry1 = new JTextField();
        txtentry1.setBounds(10, 75, 266, 20);
        frame.getContentPane().add(txtentry1);

        txtentry2 = new JTextField();
        txtentry2.setBounds(10, 125, 266, 20);
        frame.getContentPane().add(txtentry2);

        JButton updateYourAccount = new JButton("Update your account");
        updateYourAccount.setHorizontalAlignment(SwingConstants.CENTER);
        updateYourAccount.setBounds(10, 150, 266, 20);
        frame.getContentPane().add(updateYourAccount);
        updateYourAccount.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String entry1 = txtentry1.getText();
                String entry2 = txtentry2.getText();

                if (label == "user name") {

                    System.out.println(entry1 + entry2);

                    try {
                            if (entry1.equals(entry2)) {

                                User userTest = clientIn.getUser2(entry1);

                                if (userTest == null) {
                                //Makes the Login_s frame empty, starts the GUI_App frame and returns true (for testing purpose)

                                txtentry1.setText(null);
                                txtentry2.setText(null);
                                frame.setVisible(false);

                                String oldUserName = userIn.getUser_name();


                                    // update the user
                                    userIn.setUser_name(entry1);
                                    clientIn.updateUser(userIn);
                                    System.out.println(userIn.getId());


                                    // update friends
                                    System.out.println(oldUserName);
                                    FriendServiceImpl test = new FriendServiceImpl();
                                    List<Friend> friends = test.getFriends(oldUserName);

                                    for(int i =0; i < friends.size(); i++)
                                    {
                                        Friend temp = friends.get(i);
                                        test.deleteUser(temp.getId());
                                        temp.setUser_name_entry(entry1);
                                        test.createFriend(temp);
                                    }

                                    // load new screen
                                    frameIn.setVisible(false);
                                    GUI_App.application(entry1, userIn, clientIn);

                                } else {
                                    //Username password is not in the file
                                    JOptionPane.showMessageDialog(null, "Username already taken", "Update Account Error", JOptionPane.ERROR_MESSAGE);
                                    txtentry1.setText(null);
                                    txtentry2.setText(null);

                            }
                        } else {
                                //Username password is not in the file
                                JOptionPane.showMessageDialog(null, "Both username entries have to be equal", "Update Account Error", JOptionPane.ERROR_MESSAGE);
                                txtentry1.setText(null);
                                txtentry2.setText(null);
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "There was an error when trying to read the logindetails database file", "Read file error", JOptionPane.ERROR_MESSAGE);
                        e.printStackTrace();
                    }
                } else if (label == "password") {
                    try {
                        if (entry1.equals(entry2)) {

                            if (userIn.getPassword().equals(entry1)) {
                                //Password is equal to the old one
                                JOptionPane.showMessageDialog(null, "Your new password can not be equal to the old one", "Update Account Error", JOptionPane.ERROR_MESSAGE);
                                txtentry1.setText(null);
                                txtentry2.setText(null);
                            } else {
                                // tests if the new password is not equal to the old one
                                userIn.setPassword(entry1);
                                txtentry1.setText(null);
                                txtentry2.setText(null);
                                frame.setVisible(false);
                                clientIn.updateUser(userIn);
                                System.out.println(userIn.getId());

                            }
                        } else {
                            //Username password is not in the file
                            JOptionPane.showMessageDialog(null, "Both password entries have to be equal", "Update Account Error", JOptionPane.ERROR_MESSAGE);
                            txtentry1.setText(null);
                            txtentry2.setText(null);
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "There was an error when trying to read the logindetails database file", "Read file error", JOptionPane.ERROR_MESSAGE);
                        e.printStackTrace();
                    }
                }
                else
                {
                    System.out.println(label);
                }
            }
        });
    }
}