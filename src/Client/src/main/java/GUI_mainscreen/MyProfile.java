package GUI_mainscreen;

import entity.User;
import service.UserServiceImpl;
import javax.swing.*;
import java.awt.*;

/**
 * The type My profile.
 */
public class MyProfile {

	private static JFrame frame2;

	private MyProfile(User userIn, UserServiceImpl clientIn, String username) {
		initialize(userIn, clientIn, username);
	}

	/**
	 * Application.
	 *
	 * @param userIn   the user in
	 * @param clientIn the client in
	 */
	public static void application(User userIn, UserServiceImpl clientIn, String username) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyProfile window = new MyProfile(userIn, clientIn, username);
					MyProfile.frame2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Initialize.
	 *
	 * @param userIn   the user in
	 * @param clientIn the client in
	 */
	public static void initialize(User userIn, UserServiceImpl clientIn, String username) {

		frame2 = new JFrame();
		frame2.setBounds(300, 500, 300, 500);
		frame2.getContentPane().setLayout(null);
		frame2.setFocusable(true);

		// Labels
		JLabel lblWelcome = new JLabel("My Profile");
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcome.setBounds(10, 10, 266, 20);
		frame2.getContentPane().add(lblWelcome);

		JLabel lblUsername = new JLabel("Your username " + userIn.getUser_name());
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername.setBounds(10, 29, 266, 20);
		frame2.getContentPane().add(lblUsername);
		
		// Creating a friend list
		int length = 124;
		int with = 28;
		int friends_x = 16;
		int friends_y = 2;
		
		for (int j = 0; j < friends_x; j++) {
			for (int i = 0; i < friends_y; i++) {

				//JOHANNES put here something that retrieves the information and than moves on to the next one
				//TODO

				//Making every label
				JLabel Friend = new JLabel("HERE JOHANNES!");
				Friend.setBounds((10+i*142), (59+j*37), length, with);
				frame2.getContentPane().add(Friend);
			}
		}
	}
}