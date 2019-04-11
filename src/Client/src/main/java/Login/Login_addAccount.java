package Login;

import GUI.Login_S;
import entity.User;
import service.UserServiceImpl;
import javax.swing.*;
/**
 * The type Login add account.
 */
public class Login_addAccount extends Login_S {
	/** the add account. */
	public Login_addAccount() {
	}
	/**
	 * Creates a new account Pre.
	 *  - Username is not used yet - Username and Password
	 * are not empty Result - Username
	 * and Password are stored in "loginDetails.txt"
	 * Return - Created account boolean
	 * @param username    the username
	 * @param password    the password
	 * @param userIn      the user in
	 * @param clientIn    the client in
	 * @param txtUsername the txt username
	 * @param txtPassword the txt password
	 * @param frame		  the frame
	 * @param txtRPassword  the Rpassword
	 * @return the boolean
	 */
	@SuppressWarnings("resource")
	public static boolean addAccount(
			final String username,
			final String password,
			final User userIn,
			final UserServiceImpl clientIn,
			final JTextField txtUsername,
			final JTextField txtPassword,
			final JTextField txtRPassword,
			final JFrame frame) {
		// Check if password and username textfields are not empty

		if (password.isEmpty() || username.isEmpty()) {
			JOptionPane.showMessageDialog(
					null,
					"To create an account,"
							+ " please enter an username and password",
					"Create account",
					JOptionPane.ERROR_MESSAGE);
			txtUsername.setText(null);
			txtPassword.setText(null);
			return false;
		}
		// Check if the username is available
		if (clientIn.getUser2(username) != null) {
			JOptionPane.showMessageDialog(null,
					"This username is not available",
					"Create account",
					JOptionPane.ERROR_MESSAGE);
			txtRPassword.setText(null);
			txtPassword.setText(null);
			return false;
		} else {
				userIn.setPassword(password);
				userIn.setUser_name(username);
				clientIn.createUser(userIn);
				frame.setVisible(false);
				Login_S.main(null);
				return true;
		}
	}

}
