package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

public class GUI_App {

	private static JFrame frame;
	private static String username;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					GUI_App window = new GUI_App(username);
//					GUI_App.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
	}
	
	public static void hello(String username) {
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
	public GUI_App(String username) {
		this.username = username;
		initialize(username);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public static void initialize(String username) {
		// Create the frame
		frame = new JFrame();
		frame.setBounds(100, 100, 1920, 1080);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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

		// Test with labels
		JLabel lblWelcome = new JLabel("Welkom " + username);
		lblWelcome.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		lblWelcome.setBackground(new Color(50, 205, 50));
		lblWelcome.transferFocusBackward();
		lblWelcome.setBounds(100, 100, 1920, 100);
		lblWelcome.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frame.getContentPane().add(lblWelcome, BorderLayout.NORTH);
	}

}
