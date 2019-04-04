package GUI_mainscreen;

import GUI.GUI_App;
import entity.User;
import service.FriendServiceImpl;
import service.UserServiceImpl;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static GUI.GUI_App.getUsername;

/**
 * The type My profile.
 */
public class MyProfile {

	private static JFrame frame2;

	private MyProfile(User userIn, UserServiceImpl clientIn, FriendServiceImpl clientFriend, JFrame frameIn) {
		initialize(userIn, clientIn, clientFriend, frameIn);
	}

	/**
	 * Application.
	 *
	 * @param userIn   the user in
	 * @param clientIn the client in
	 */
	public static void application(User userIn, UserServiceImpl clientIn, String username, FriendServiceImpl clientFriend, JFrame frameIn) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyProfile window = new MyProfile(userIn, clientIn, clientFriend, frameIn);
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
	public static void initialize(User userIn, UserServiceImpl clientIn, FriendServiceImpl clientFriend, JFrame frameIn) {

		frame2 = new JFrame();
		frame2.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		frame2.setBounds(300, 500, 300, 337);
		frame2.getContentPane().setLayout(null);
		frame2.setFocusable(true);


		// Labels
		JLabel lblWelcome = new JLabel("Welcome back " + userIn.getUser_name());
		lblWelcome.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcome.setBounds(10, 10, 266, 27);
		frame2.getContentPane().add(lblWelcome);

		JButton changeUserName = new JButton("Change Username");
		changeUserName.setBackground(new Color(0, 255, 127));
		changeUserName.setForeground(Color.WHITE);
		changeUserName.setFont(new Font("Arial Black", Font.PLAIN, 13));
		changeUserName.setHorizontalAlignment(SwingConstants.CENTER);
		changeUserName.setBounds(10, 43, 266, 27);
		frame2.getContentPane().add(changeUserName);
		changeUserName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Update.application(userIn, clientIn, userIn.getUser_name(), clientFriend, frameIn);
			}
		});

		JButton changePassword = new JButton("Change Password");
		changePassword.setFont(new Font("Arial Black", Font.PLAIN, 13));
		changePassword.setForeground(Color.WHITE);
		changePassword.setBackground(new Color(0, 255, 127));
		changePassword.setHorizontalAlignment(SwingConstants.CENTER);
		changePassword.setBounds(10, 75, 266, 27);
		frame2.getContentPane().add(changePassword);
		changePassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Update.application(userIn, clientIn, userIn.getPassword(), clientFriend, frameIn);
			}
		});

		JLabel lblVegetarian = new JLabel("Vegetarian Score:" + userIn.getVegetarian());
		lblVegetarian.setHorizontalAlignment(SwingConstants.LEFT);
		lblVegetarian.setBounds(10, 100, 266, 20);
		frame2.getContentPane().add(lblVegetarian);

		JLabel lblProduce = new JLabel("Produce Score: " + userIn.getProduce());
		lblProduce.setHorizontalAlignment(SwingConstants.LEFT);
		lblProduce.setBounds(10, 120, 266, 20);
		frame2.getContentPane().add(lblProduce);

		JLabel lblCar = new JLabel("Car Score: " + userIn.getCar());
		lblCar.setHorizontalAlignment(SwingConstants.LEFT);
		lblCar.setBounds(10, 140, 266, 20);
		frame2.getContentPane().add(lblCar);

		JLabel lblPublic_transportation = new JLabel("Public Transportation Score: " + userIn.getPublic_transportation());
		lblPublic_transportation.setHorizontalAlignment(SwingConstants.LEFT);
		lblPublic_transportation.setBounds(10, 160, 266, 20);
		frame2.getContentPane().add(lblPublic_transportation);

		JLabel lblBike = new JLabel("Bike Score: " + userIn.getBike());
		lblBike.setHorizontalAlignment(SwingConstants.LEFT);
		lblBike.setBounds(10, 180, 266, 20);
		frame2.getContentPane().add(lblBike);

		JLabel lblTemperature = new JLabel("Temperature Score: " + userIn.getTemperature());
		lblTemperature.setHorizontalAlignment(SwingConstants.LEFT);
		lblTemperature.setBounds(10, 200, 266, 20);
		frame2.getContentPane().add(lblTemperature);

		JLabel lblSolar = new JLabel("Solar Score: " + userIn.getSolar());
		lblSolar.setHorizontalAlignment(SwingConstants.LEFT);
		lblSolar.setBounds(10, 220, 266, 20);
		frame2.getContentPane().add(lblSolar);

		JLabel lblSaved = new JLabel("Overall CO2 Saved: " + userIn.getTotal_saved());
		lblSaved.setHorizontalAlignment(SwingConstants.LEFT);
		lblSaved.setBounds(10, 240, 266, 20);
		frame2.getContentPane().add(lblSaved);

		JLabel lblOverall = new JLabel("Overall Score: " + userIn.getTotal());
		lblOverall.setHorizontalAlignment(SwingConstants.LEFT);
		lblOverall.setBounds(10, 260, 266, 20);
		frame2.getContentPane().add(lblOverall);
	}
}