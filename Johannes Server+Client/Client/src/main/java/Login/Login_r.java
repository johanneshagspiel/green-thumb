package Login;

import GUI.GUI_App;

import GUI.Login_S;
import entity.User;
import service.UserServiceImpl;
import javax.swing.*;

public class Login_r extends Login_S {

	/**
	 * Handles the login request.
	 * Pre    - Username is not empty and in database
	 * - Username and Password are in our database
	 * Result - Access to new frame
	 * Return - Access boolean
	 */
	@SuppressWarnings("resource")
	public static boolean Login_request(String username, String password, User userIn, UserServiceImpl clientIn, JTextField textField_1, JTextField txtPassword, JFrame frame) {

		//Check the data base for account
		try {
			userIn = clientIn.login(username, password);

			if (userIn != null) {

				//Makes the Login_s frame empty, starts the GUI_App frame and returns true (for testing purpose)
				textField_1.setText(null);
				txtPassword.setText(null);
				GUI_App.application(username, userIn, clientIn);
				frame.setVisible(false);
				System.out.println(userIn.getId());
				return true;
			} else {
				//Username password is not in the file
				JOptionPane.showMessageDialog(null, "Invalid Login Details", "Login Error", JOptionPane.ERROR_MESSAGE);
				txtPassword.setText(null);
				return false;
			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "There was an error when trying to read the logindetails database file", "Read file error", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
		return false;
	}
}
