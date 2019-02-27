package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class Login_S {

	private JFrame frame;
	private JTextField textField_1;
	private JPasswordField txtPassword;
	//public static boolean access =  false; //variable that can be used for access control

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_S window = new Login_S();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login_S() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 200, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(187, 28, 104, 30);
		frame.getContentPane().add(lblLogin);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(89, 92, 61, 30);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(87, 141, 63, 28);
		frame.getContentPane().add(lblPassword);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(187, 94, 181, 28);
		frame.getContentPane().add(textField_1);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(187, 142, 181, 28);
		frame.getContentPane().add(txtPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Getting user input from username and password textfields
				@SuppressWarnings("deprecation")
				String password = txtPassword.getText();
				String username = textField_1.getText();
				
				//Using the user input to check for valid credentials and granting access if valid
				checkLogin(textField_1, txtPassword, username, password);
			}
		});
		btnLogin.setBounds(206, 202, 85, 21);
		frame.getContentPane().add(btnLogin);
		
		JButton btnReset = new JButton("Add Account");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {		
				addAccount(textField_1, txtPassword);
			}
		});
		btnReset.setBounds(62, 202, 134, 21);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame, "confirm if you want to exit", "Login Systems",
						JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setBounds(301, 202, 85, 21);
		frame.getContentPane().add(btnExit);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(33, 188, 416, 4);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(33, 68, 416, 4);
		frame.getContentPane().add(separator_1);
	}
	
	//Method that is used to determine if the user entered (in)valid login details 
	public static boolean checkLogin(JTextField textField_1, JPasswordField txtPassword, String username, String password) {
		boolean access = false; //Control variable
		
		try {
			//Reading the databases file line by line to check for corresponding credentials and giving access accordingly
			Scanner filescanner = new Scanner(new File("loginDetails.txt"));
			while(filescanner.hasNextLine()) {
				Scanner linescanner = new Scanner(filescanner.nextLine());
				linescanner.useDelimiter("; ");
				
				String tryname = linescanner.next();
				String trypassword = linescanner.next();
				
				if(tryname.equals(username) && trypassword.equals(password)) {
					access = true;
				}
				
				linescanner.close();
			}
			
			filescanner.close();
			
		} catch (FileNotFoundException e) { //This will execute when there is an error reading the database file
			JOptionPane.showMessageDialog(null, "There was an error when trying to read the logindetails database file", "Read file error" ,  JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
		
		//If credentials are okay and access is granted, this will be executed
		if(access == true) {
			JOptionPane.showMessageDialog(null, "Login is succesful!", "Valid Login" ,  JOptionPane.INFORMATION_MESSAGE);
			return true;
		}
		
		//If credentials don't correspond and access is not granted, this will be executed
		if(access == false){
			JOptionPane.showMessageDialog(null,  "Invalid Login Details", "Login Error",  JOptionPane.ERROR_MESSAGE);
			return false;
		}
		return false; //Is never really executed
	}
	
	public static void addAccount(JTextField textField_1, JPasswordField txtPassword) {
		//Getting user input from username and password textfields
		@SuppressWarnings("deprecation")
		String password = txtPassword.getText();
		String username = textField_1.getText();
		
		if(password != "" && username != "") {
			try { //Writing entered credentials to L=loginDetails.txt
				PrintWriter fileWriter = new PrintWriter(new FileWriter("loginDetails.txt",true));
				fileWriter.write("\n" + username + "; " + password);
				fileWriter.close();
				JOptionPane.showMessageDialog(null, "Your account has been created successfully!", "Account created" ,  JOptionPane.INFORMATION_MESSAGE);
			} catch (IOException e) {
			e.printStackTrace();
			}
		
		}
		else {
			JOptionPane.showMessageDialog(null, "To create an account, please enter an username and password", "Create account" ,  JOptionPane.INFORMATION_MESSAGE);
		}
				
		textField_1.setText(null);
		txtPassword.setText(null);
	}
	

}

