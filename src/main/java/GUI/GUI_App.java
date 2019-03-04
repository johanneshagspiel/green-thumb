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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_App window = new GUI_App();
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
	public GUI_App() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	static void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1920, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		JMenuItem mntmMyProfile = new JMenuItem("My Profile");
		menuBar.add(mntmMyProfile);

		JMenuItem mntmMyFriends = new JMenuItem("My Friends");
		menuBar.add(mntmMyFriends);

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

		JLabel lblWelcome = new JLabel("Welcome");
		lblWelcome.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		lblWelcome.setBackground(new Color(50, 205, 50));
		lblWelcome.transferFocusBackward();
		lblWelcome.setBounds(100, 100, 1920, 100);
		lblWelcome.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frame.getContentPane().add(lblWelcome, BorderLayout.NORTH);
	}

}
