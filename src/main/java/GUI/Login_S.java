package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Login.Login_addAccount;
import Login.Login_r;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class Login_S {

	// Fields
	private JFrame frame;
	private JTextField textField_1;
	private JPasswordField txtPassword;

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
		// Create the frame
		frame = new JFrame();
		frame.setBounds(200, 200, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setFocusable(true);

		// Add a key listener to the Enter
		KeyListener formSubmitKeyListener = new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent event) {
				if (event.getKeyCode() == KeyEvent.VK_ENTER) {

					// Get the filled in username and password
					@SuppressWarnings("deprecation")
					String password = txtPassword.getText();
					String username = textField_1.getText();

					Login_r.Login_request(username, password, textField_1, txtPassword, frame);
				}
			}
		};
		frame.addKeyListener(formSubmitKeyListener);

		// Labels
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(187, 28, 104, 30);
		frame.getContentPane().add(lblLogin);

		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(89, 92, 61, 30);
		frame.getContentPane().add(lblUsername);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(87, 141, 63, 28);
		frame.getContentPane().add(lblPassword);

		// Text fields
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(187, 94, 181, 28);
		frame.getContentPane().add(textField_1);
		textField_1.addKeyListener(formSubmitKeyListener);

		txtPassword = new JPasswordField();
		txtPassword.setBounds(187, 142, 181, 28);
		frame.getContentPane().add(txtPassword);
		txtPassword.addKeyListener(formSubmitKeyListener);

		//Buttons
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Get the filled in username and password
				@SuppressWarnings("deprecation")
				String password = txtPassword.getText();
				String username = textField_1.getText();
				
				Login_r.Login_request(username, password, textField_1, txtPassword, frame);
			}
		});
		btnLogin.setBounds(206, 202, 85, 21);
		frame.getContentPane().add(btnLogin);

		JButton btnReset = new JButton("Add Account");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login_addAccount.addAccount(textField_1, txtPassword);
			}
		});
		btnReset.setBounds(62, 202, 134, 21);
		frame.getContentPane().add(btnReset);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frame, "confirm if you want to exit", "Login Systems",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setBounds(301, 202, 85, 21);
		frame.getContentPane().add(btnExit);
		
		// Separators
		JSeparator separator = new JSeparator();
		separator.setBounds(33, 188, 416, 4);
		frame.getContentPane().add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(33, 68, 416, 4);
		frame.getContentPane().add(separator_1);
	}

}
