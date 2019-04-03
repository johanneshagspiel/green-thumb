package GUI;

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
		client = new UserServiceImpl();
		user = new User();
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
		//frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Login_S.class.getResource("/GUI/Images/Go Green Logo 50x50.jpg")));
		frame.setResizable(false);
		frame.setBackground(new Color(0, 255, 127));
		frame.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
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
		JLabel lblLogin = new JLabel("Go Green");
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setForeground(new Color(0, 102, 0));
		lblLogin.setBackground(new Color(128, 128, 128));
		lblLogin.setFont(new Font("Arial Black", Font.BOLD, 40));
		lblLogin.setBounds(33, 13, 416, 50);
		frame.getContentPane().add(lblLogin);

		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblUsername.setBounds(89, 92, 86, 30);
		frame.getContentPane().add(lblUsername);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblPassword.setBounds(87, 141, 88, 28);
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
		btnLogin.setForeground(new Color(245, 245, 245));
		btnLogin.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnLogin.setBackground(new Color(50, 205, 50));
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
		btnLogin.setBounds(307, 202, 142, 21);
		frame.getContentPane().add(btnLogin);

		JButton btnReset = new JButton("Add Account");
		btnReset.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnReset.setForeground(new Color(255, 255, 255));
		btnReset.setBackground(new Color(50, 205, 50));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					frame.setVisible(false);
					Login_A.Login_Add(client, user, frame);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnReset.setBounds(145, 202, 150, 21);
		frame.getContentPane().add(btnReset);

		JButton btnExit = new JButton("Exit");
		btnExit.setForeground(new Color(245, 245, 245));
		btnExit.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnExit.setBackground(new Color(0, 102, 0));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frame, "confirm if you want to exit", "Login Systems",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setBounds(33, 202, 75, 21);
		frame.getContentPane().add(btnExit);

		// Separators
		JSeparator separator = new JSeparator();
		separator.setBounds(33, 188, 416, 4);
		frame.getContentPane().add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(33, 68, 416, 4);
		frame.getContentPane().add(separator_1);

		JLabel Title_background = new JLabel("");
		//Title_background.setIcon(new ImageIcon(Login_S.class.getResource("/GUI/Images/Shape 416x50.png")));
		Title_background.setBounds(33, 13, 416, 50);
		frame.getContentPane().add(Title_background);
	}

}
