package login;

import gui.GUI_App;

import gui.Application;
import entity.User;
import service.UserServiceImpl;
import javax.swing.*;

/**
 * The type Login r.
 */
public class Login_r extends Application {
    /**The login. */

    public Login_r() {
    }
    /**
     * Handles the login request.
     * Pre    - Username is not empty and in database
     * - Username and Password are in our database
     * Result - Access to new frame
     * Return - Access boolean
     *
     * @param username    the username
     * @param password    the password
     * @param userIn      the user in
     * @param clientIn    the client in
     * @param textField_1 the text field 1
     * @param txtPassword the txt password
     * @param frame       the frame
     * @return the boolean
     */
    @SuppressWarnings("resource")
    public static boolean Login_request(
            final String username,
            final String password,
            User userIn,
            final UserServiceImpl clientIn,
            final JTextField textField_1,
            final JTextField txtPassword,
            final JFrame frame) {
        //Check the data base for account

        try {
            userIn = clientIn.login(username, password);

            if (userIn != null) {

                //Makes the Login_s frame empty,

                // starts the GUI_App

                // frame and returns true (for testing purpose)

                textField_1.setText(null);
                txtPassword.setText(null);
                GUI_App.application(username, userIn, clientIn);
                frame.setVisible(false);
                System.out.println(userIn.getId());
                return true;
            } else {
                //Username password is not in the file
                JOptionPane.showMessageDialog(
                        null,
                        "Invalid Login Details",
                        "Login Error",
                        JOptionPane.ERROR_MESSAGE);
                txtPassword.setText(null);
                return false;
            }
        } catch (Exception e) {
            JOptionPane.
                    showMessageDialog(
                            null,
                            "There was an error when trying to"
                                    + " read the login "
                                    + "details database file",
                            "Read file error",
                            JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        return false;
    }
}
