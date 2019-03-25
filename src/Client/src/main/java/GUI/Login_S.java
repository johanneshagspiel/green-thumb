package GUI;

import Login.Login_addAccount;
import Login.Login_r;
import entity.User;
import service.FriendServiceImpl;
import service.UserServiceImpl;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * The type Login s.
 */
public class Login_S {

	// Fields
	private JFrame frame;
	private JTextField textField_1;
	private JPasswordField txtPassword;
    /**
     * The constant user.
     */
    public static User user;
    /**
     * The constant client.
     */
    public static UserServiceImpl client;
    /**
     * The constant friendClient.
     */
    public static FriendServiceImpl friendClient;


    /**
     * Launch the application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
		UserServiceImpl client = new UserServiceImpl();
		User user = new User();
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


		UserServiceImpl client = new UserServiceImpl();
		User user = new User();

		// Add a key listener to the Enter
		KeyListener formSubmitKeyListener = new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent event) {
				if (event.getKeyCode() == KeyEvent.VK_ENTER) {

					// Get the filled in username and password
					@SuppressWarnings("deprecation")
					String password = txtPassword.getText();
					String username = textField_1.getText();

					Login_r.Login_request(username, password, user, client, textField_1, txtPassword, frame);
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

				try {

					Login_r.Login_request(username, password, user, client, textField_1, txtPassword, frame);
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		});
		btnLogin.setBounds(206, 202, 85, 21);
		frame.getContentPane().add(btnLogin);

		JButton btnReset = new JButton("Add Account");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					frame.setVisible(false);
					Login_A.Login_A(client, user, frame);
				} catch (Exception e) {
					e.printStackTrace();
				}
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
