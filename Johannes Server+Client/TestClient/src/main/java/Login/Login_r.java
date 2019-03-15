package Login;

import GUI.GUI_App;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Login_r {

		/**
		 * Handles the login request.
		 * Pre    - Username is not empty and in database
	     *        - Username and Password are in our database
	     * Result - Access to new frame
	     * Return - Access boolean 
		 */
		@SuppressWarnings("resource")
		public static boolean Login_request(String username, String password, JTextField textField_1, JTextField txtPassword, JFrame frame) {

			//Check the data base for account
			try {
				Scanner filescanner = new Scanner(new File("loginDetails.txt"));
			
				//Checks all the accounts if matches with given details
				while(filescanner.hasNextLine()) {
					Scanner linescanner = new Scanner(filescanner.nextLine());
					linescanner.useDelimiter("; ");

					String tryname = linescanner.next();
					String trypassword = linescanner.next();
					
					//Look if the given password equals password in document 
					//Look if the given username equals username in document
					if(tryname.equals(username) && trypassword.equals(password)) {
						
						//Makes the Login_s frame empty, starts the GUI_App frame and returns true (for testing purpose)
						textField_1.setText(null);
						txtPassword.setText(null);
						GUI_App.application(username);
						frame.setVisible(false);
						return true;
					}
					
					//Closes the line scanner after done
					linescanner.close();
				}
				
				//Closes the file scanner after done
				filescanner.close();
				
			} catch (FileNotFoundException e) {
				JOptionPane.showMessageDialog(null, "There was an error when trying to read the logindetails database file", "Read file error" ,  JOptionPane.ERROR_MESSAGE);
				e.printStackTrace();
			}
			
			//Username password is not in the file
			JOptionPane.showMessageDialog(null,  "Invalid Login Details", "Login Error",  JOptionPane.ERROR_MESSAGE);
			txtPassword.setText(null);
			return false;

		}
}
