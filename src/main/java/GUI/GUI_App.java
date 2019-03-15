package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

import Login.Login_r;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class GUI_App {

	private static JFrame frame;
	private String username;
	private static int points;

	/**
	 * Launch the application.
	 */
	public static void application(String username) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_App window = new GUI_App(username);
					GUI_App.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	private GUI_App(String username) {
		this.setUsername(username);
		initialize(username);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private static void initialize(String username) {
		// Create the frame
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(240, 240, 240));
		frame.setBounds(200, 200, 1920, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setFocusable(true);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.getContentPane().setLayout(null);

		// Labels
		JLabel lblWelcome = new JLabel("Welcome " + username);
		lblWelcome.setFont(new Font("Times New Roman", Font.PLAIN, 29));
		lblWelcome.setBounds(10, 10, 1520, 59);
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblWelcome);
		
		points = 0;
		JLabel lblPoints = new JLabel("Your points are " + points);
		lblPoints.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPoints.setBounds(10, 42, 1520, 50);
		lblPoints.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblPoints);

		// Buttons
		
		// Vegetarian meal
		JButton btnReset = new JButton("Vegetarian meal");
		btnReset.setBounds(45, 170, 156, 30);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				points += 100;
				lblPoints.setText("Your points are " + points);
			}
		});
		frame.getContentPane().add(btnReset);
		
		JButton button = new JButton("Non-Vegetarian meal");
		button.setBounds(202, 170, 156, 30);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				points += -100;
				lblPoints.setText("Your points are " + points);
			}
		});
		frame.getContentPane().add(button);

		//Labels
		JLabel lblWhatKindOf = new JLabel("What kind of meal did you have today?");
		lblWhatKindOf.setBounds(45, 140, 313, 30);
		lblWhatKindOf.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblWhatKindOf);

		// Creates the menu-bar
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		// Creates the "My Profile" in menu-bar
		JMenuItem mntmMyProfile = new JMenuItem("My Profile");
		menuBar.add(mntmMyProfile);

		// Creates the "My Friends" in menu-bar
		JMenuItem mntmMyFriends = new JMenuItem("My Friends");
		menuBar.add(mntmMyFriends);

		// Creates the "Log out" in menu-bar
		JMenuItem mntmLogOut = new JMenuItem("Log out");
		mntmLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Log out",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					Login_S.main(null);
					frame.setVisible(false);
				}
			}
		});
		menuBar.add(mntmLogOut);
	}

	
	//Getters and Setters username
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
