package Login;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login_addAccount {

	public static void addAccount(JTextField textField_1, JPasswordField txtPassword) {
		// Getting user input from username and password textfields
		@SuppressWarnings("deprecation")
		String password = txtPassword.getText();
		String username = textField_1.getText();

		if (password != "" && username != "") {
			try { // Writing entered credentials to L=loginDetails.txt
				PrintWriter fileWriter = new PrintWriter(new FileWriter("loginDetails.txt", true));
				fileWriter.write("\n" + username + "; " + password);
				fileWriter.close();
				JOptionPane.showMessageDialog(null, "Your account has been created successfully!", "Account created",
						JOptionPane.INFORMATION_MESSAGE);
			} catch (IOException e) {
				e.printStackTrace();
			}

		} else {
			JOptionPane.showMessageDialog(null, "To create an account, please enter an username and password",
					"Create account", JOptionPane.INFORMATION_MESSAGE);
		}

		textField_1.setText(null);
		txtPassword.setText(null);
	}
}
