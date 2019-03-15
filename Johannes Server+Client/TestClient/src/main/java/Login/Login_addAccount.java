package Login;

import GUI.Login_S;
import entity.User;
import service.UserServiceImpl;
import javax.swing.*;

import GUI.GUI_App;

import GUI.Login_S;
import entity.User;
import service.UserServiceImpl;
import javax.swing.*;

public class Login_addAccount extends Login_S {

	/**
	 * Creates a new account
	 * Pre    - Username is not used yet
	 * - Username and Password are not empty
	 * Result - Username and Password are stored in "loginDetails.txt"
	 * Return - Created account boolean
	 */

	@SuppressWarnings("resource")
	public static boolean addAccount(String username, String password, User userIn, UserServiceImpl clientIn, JTextField txtUsername, JTextField txtPassword) {

		userIn.setPassword(password);
		userIn.setUser_name(username);
		clientIn.createUser(userIn);

		// Check if password and username textfields are not empty
		if (password.isEmpty() || username.isEmpty()) {
			JOptionPane.showMessageDialog(null, "To create an account, please enter an username and password",
					"Create account", JOptionPane.ERROR_MESSAGE);
			txtUsername.setText(null);
			txtPassword.setText(null);
			return false;
		}

		// If both textfields contain characters, execute the following
		else {
			try {
				userIn.setPassword(password);
				userIn.setUser_name(username);
				clientIn.createUser(userIn);

				return true;
				// Checking if username already exists


				// Check every line to see if username already exists

				// If username already exists, show message and cancel account creation


			} catch (Exception e) {
				e.printStackTrace();
			}

			// Writing entered credentials to loginDetails.txt

		} return false;
	}

}

