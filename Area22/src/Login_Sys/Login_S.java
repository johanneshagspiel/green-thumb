package Login_Sys;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login_S {

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
		textField_1.setBounds(187, 94, 104, 28);
		frame.getContentPane().add(textField_1);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(187, 142, 104, 28);
		frame.getContentPane().add(txtPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				@SuppressWarnings("deprecation")
				String password = txtPassword.getText();
				String username = textField_1.getText();
				if(username.contains("Bob") && password.contains("Cookie")) {
					textField_1.setText(null);
					txtPassword.setText(null);
				}else{
					JOptionPane.showMessageDialog(null,  "Invalid Login Details", "Login Error",  JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnLogin.setBounds(206, 202, 85, 21);
		frame.getContentPane().add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField_1.setText(null);
				txtPassword.setText(null);
			}
		});
		btnReset.setBounds(111, 202, 85, 21);
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
}
