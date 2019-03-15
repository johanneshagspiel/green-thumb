package Login;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login_addAccount {
	
	/**
	 * Creates a new account
	 * Pre    - Username is not used yet
	 *        - Username and Password are not empty
	 * Result - Username and Password are stored in "loginDetails.txt"
	 * Return - Created account boolean
	 */

	public static boolean addAccount(JTextField txtUsername, JPasswordField txtPassword) {
		
		// Getting user input from username and password textfields
		@SuppressWarnings("deprecation")
		String password = txtPassword.getText();
		String username = txtUsername.getText();

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
				// Checking if username already exists
				@SuppressWarnings("resource")
				Scanner filescanner = new Scanner(new File("loginDetails.txt"));
				boolean alreadyExists = false;

				// Check every line to see if username already exists
				while (filescanner.hasNextLine()) {
					Scanner linescanner = new Scanner(filescanner.nextLine());
					linescanner.useDelimiter("; ");
					if ((linescanner.next()).equals(username)) {
						alreadyExists = true;
						txtUsername.setText(null);
						txtPassword.setText(null);
						break; // Don't check the rest of the database after the same username has been found
					}
					linescanner.close();
				}
				filescanner.close();

				// If username already exists, show message and cancel account creation
				if (alreadyExists == true) {
					JOptionPane.showMessageDialog(null, "Your username already exists. Please choose a different one",
							"Username already exists", JOptionPane.ERROR_MESSAGE);
					return false;
				}

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}

			// Writing entered credentials to loginDetails.txt
			try {
				PrintWriter fileWriter = new PrintWriter(new FileWriter("loginDetails.txt", true));
				fileWriter.write("\n" + username + "; " + password);
				fileWriter.close();
				JOptionPane.showMessageDialog(null, "Your account has been created successfully!", "Account created",
						JOptionPane.INFORMATION_MESSAGE);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return true;
	}
}
