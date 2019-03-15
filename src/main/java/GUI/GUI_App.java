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

public class GUI_App {

	private static JFrame frame;
	private String username;

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
		this.username = username;
		initialize(username);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private static void initialize(String username) {
		// Create the frame
		frame = new JFrame();
		frame.setBounds(200, 200, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setFocusable(true);

		// Labels
		JLabel lblLogin = new JLabel("Welcome " + username);
		lblLogin.setBounds(187, 28, 104, 30);
		frame.getContentPane().add(lblLogin);

		// Buttons
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnLogin.setBounds(206, 202, 85, 21);
		frame.getContentPane().add(btnLogin);

		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnReset.setBounds(111, 202, 85, 21);
		frame.getContentPane().add(btnReset);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame frame = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Login Systems",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setBounds(301, 202, 85, 21);
		frame.getContentPane().add(btnExit);
	}

}
