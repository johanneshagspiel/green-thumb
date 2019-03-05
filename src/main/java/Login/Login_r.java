package Login;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import GUI.GUI_App;

public class Login_r {

		//fields
		public static boolean access;

		/**
		 * Handles the login request.
		 */
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
						access = true;
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
			
			//If access is true give access to next frame
			//else denied access
			if(access) {
				textField_1.setText(null);
				txtPassword.setText(null);
				GUI_App.main(null);
				frame.setVisible(false);
				return true;
			}else{
				JOptionPane.showMessageDialog(null,  "Invalid Login Details", "Login Error",  JOptionPane.ERROR_MESSAGE);
				return false;
			}
		}
}
