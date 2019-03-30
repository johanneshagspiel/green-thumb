package GUI_mainscreen;

import GUI.GUI_App;

import GUI.Login_S;
import entity.User;
import service.UserServiceImpl;
import javax.swing.*;

/**
 * The type Login r.
 */
public class Update_r {

    @SuppressWarnings("resource")
    public static void update(String entry1, String entry2, User userIn, UserServiceImpl clientIn, JTextField txtentry1, JTextField txtentry2, JFrame frame, String labelIn) {

        if (labelIn == userIn.getUser_name()) {
            try {
                userIn = clientIn.getUser2(labelIn);

                if (userIn == null) {

                    if (entry1 == entry2) {
                        //Makes the Login_s frame empty, starts the GUI_App frame and returns true (for testing purpose)
                        userIn.setUser_name(entry1);
                        txtentry1.setText(null);
                        txtentry2.setText(null);
                        frame.setVisible(false);
                        clientIn.updateUser(userIn);
                        System.out.println(userIn.getId());
                    } else {
                        //Username password is not in the file
                        JOptionPane.showMessageDialog(null, "Both username entries have to be equal", "Update Account Error", JOptionPane.ERROR_MESSAGE);
                        txtentry1.setText(null);
                        txtentry2.setText(null);
                            }
                } else {
                    //Username password is not in the file
                    JOptionPane.showMessageDialog(null, "Username already taken", "Update Account Error", JOptionPane.ERROR_MESSAGE);
                    txtentry1.setText(null);
                    txtentry2.setText(null);
                      }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "There was an error when trying to read the logindetails database file", "Read file error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        } else if (labelIn == userIn.getPassword()) {
            try {
                if (entry1 == entry2) {

                    if (userIn.getPassword() != entry1) {
                        // tests if the new password is not equal to the old one
                        userIn.setPassword(entry1);
                        txtentry1.setText(null);
                        txtentry2.setText(null);
                        frame.setVisible(false);
                        clientIn.updateUser(userIn);
                        System.out.println(userIn.getId());
                    } else {
                        //Password is equal to the old one
                        JOptionPane.showMessageDialog(null, "Your new password can not be equal to the old one", "Update Account Error", JOptionPane.ERROR_MESSAGE);
                        txtentry1.setText(null);
                        txtentry2.setText(null);
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
    }
}
