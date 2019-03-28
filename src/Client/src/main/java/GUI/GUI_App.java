package GUI;

import entity.LeaderBoardEntry;
import entity.User;
import service.UserServiceImpl;

import javax.swing.*;
import javax.swing.border.Border;

import GUI_mainscreen.AddFriend;
import GUI_mainscreen.FriendsProfile;
import GUI_mainscreen.MyProfile;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * The type Gui app.
 */
public class GUI_App extends Login_S {

	private static JFrame frame;
	private String username;
	private static int points;
	private static int level;

    /**
     * Launch the application.
     *
     * @param username the username
     * @param userIn   the user in
     * @param clientIn the client in
     */
    public static void application(String username, User userIn, UserServiceImpl clientIn) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_App window = new GUI_App(username, userIn, clientIn);
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
	private GUI_App(String username, User userIn, UserServiceImpl clientIn) {
		this.setUsername(username);
		initialize(username, userIn, clientIn);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private static void initialize(String username, User userIn, UserServiceImpl clientIn) {
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

		points = userIn.getProduce() + userIn.getSolar() + userIn.getTemperature() + userIn.getTransportation() + userIn.getVegetarian();

		//Information about CO2 saved
		JLabel lblPoints = new JLabel("The amount of CO2 you have saved so far is " + points);
		lblPoints.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPoints.setBounds(10, 42, 1520, 50);
		lblPoints.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblPoints);

		// Information about level
		level = points / 1000;
		JLabel lblLevel = new JLabel("Your Level is " + level);
		lblLevel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLevel.setBounds(10, 74, 1520, 50);
		lblLevel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblLevel);

		// Leaderboard
		JLabel lblLeaderboard = new JLabel("Leaderboard Top 10");
		lblLeaderboard.setBounds(1200, 140, 300, 30);
		lblLeaderboard.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblLeaderboard);

		// Create the content for the leaderboard
		String LeaderBoardContent = LeaderBoardEntry.createLeaderboard(points, username);

		JLabel lblLeaderboardContent = new JLabel(LeaderBoardContent);
		lblLeaderboardContent.setBounds(1250, 170, 200, 150);
		lblLeaderboardContent.setHorizontalAlignment(SwingConstants.CENTER);
		Border border = BorderFactory.createLineBorder(Color.GRAY, 2);
		lblLeaderboardContent.setBorder(border);
		frame.getContentPane().add(lblLeaderboardContent);

		// Add friend button
		JButton btnAddFriend = new JButton("Add a friend");
		btnAddFriend.setBounds(1250, 330, 200, 30);
		btnAddFriend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AddFriend.application(user, client);
			}
		});
		frame.getContentPane().add(btnAddFriend);

		// Motivation
		int pointsmissing  = 0;
		if (points > 0) {
			pointsmissing = 1000 % points;
		}
		String motivation = "You only need " + pointsmissing + " points to the next level!";
		JLabel lblMotivation = new JLabel(motivation);
		lblMotivation.setBounds(45, 300, 300, 30);
		lblMotivation.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblMotivation);


		// Vegetarian
		//Labels
		JLabel lblWhatKindOf = new JLabel("What kind of meal did you have today?");
		lblWhatKindOf.setBounds(45, 140, 300, 30);
		lblWhatKindOf.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblWhatKindOf);

		// Vegetarian meal
		JButton btnVeg = new JButton("Vegetarian meal");
		btnVeg.setBounds(45, 170, 150, 30);
		btnVeg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				points += 100;
				lblPoints.setText("The amount of CO2 you have saved so far is  " + points);
				lblLeaderboardContent.setText(LeaderBoardEntry.createLeaderboard(points, username));
				int pointsmissing = 1000 % points;
				String motivation = "You only need " + pointsmissing + " points to the next level!";
				lblMotivation.setText(motivation);
				level = points / 1000;
				lblLevel.setText("Your Level is " + level);
				int temp = userIn.getVegetarian();
				userIn.setVegetarian(temp + 100);
				clientIn.updateUser(userIn);
			}
		});
		frame.getContentPane().add(btnVeg);

		JButton btnNonVeg = new JButton("Carnivore meal");
		btnNonVeg.setBounds(202, 170, 150, 30);
		btnNonVeg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				points += -100;
				lblPoints.setText("The amount of CO2 you have saved so far is  " + points);
				lblLeaderboardContent.setText(LeaderBoardEntry.createLeaderboard(points, username));
				int pointsmissing = 1000 % points;
				String motivation = "You only need " + pointsmissing + " points to the next level!";
				lblMotivation.setText(motivation);
				level = points / 1000;
				lblLevel.setText("Your Level is " + level);
				int temp = userIn.getVegetarian();
				userIn.setVegetarian(temp - 100);
				clientIn.updateUser(userIn);
			}
		});
		frame.getContentPane().add(btnNonVeg);


		// Produce

		//Labels
		JLabel lblProduce = new JLabel("What type of produce did you buy today?");
		lblProduce.setBounds(45, 200, 300, 30);
		lblProduce.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblProduce);

		JButton btnLocalProduce = new JButton("Local Produce");
		btnLocalProduce.setBounds(45, 230, 150, 30);
		btnLocalProduce.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				points += 100;
				lblPoints.setText("The amount of CO2 you have saved so far is  " + points);
				lblLeaderboardContent.setText(LeaderBoardEntry.createLeaderboard(points, username));
				int pointsmissing = 1000 % points;
				String motivation = "You only need " + pointsmissing + " points to the next level!";
				lblMotivation.setText(motivation);
				level = points / 1000;
				lblLevel.setText("Your Level is " + level);
				int temp = userIn.getProduce();
				userIn.setProduce(temp + 100);
				clientIn.updateUser(userIn);
			}
		});
		frame.getContentPane().add(btnLocalProduce);

		JButton btnGlobalProduce = new JButton("Global Produce");
		btnGlobalProduce.setBounds(202, 230, 150, 30);
		btnGlobalProduce.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				points += -100;
				lblPoints.setText("The amount of CO2 you have saved so far is  " + points);
				lblLeaderboardContent.setText(LeaderBoardEntry.createLeaderboard(points, username));
				int pointsmissing = 1000 % points;
				String motivation = "You only need " + pointsmissing + " points to the next level!";
				lblMotivation.setText(motivation);
				level = points / 1000;
				lblLevel.setText("Your Level is " + level);
				int temp = userIn.getProduce();
				userIn.setProduce(temp - 100);
				clientIn.updateUser(userIn);
			}
		});
		frame.getContentPane().add(btnGlobalProduce);


		// Transportation

		//Labels
		JLabel lblTransportation = new JLabel("What type of transportation did you use today?");
		lblTransportation.setBounds(445, 140, 300, 30);
		lblTransportation.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblTransportation);

		JButton btnBike = new JButton("Bike");
		btnBike.setBounds(445, 170, 150, 30);
		btnBike.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				points += 100;
				lblPoints.setText("The amount of CO2 you have saved so far is  " + points);
				lblLeaderboardContent.setText(LeaderBoardEntry.createLeaderboard(points, username));
				int pointsmissing = 1000 % points;
				String motivation = "You only need " + pointsmissing + " points to the next level!";
				lblMotivation.setText(motivation);
				level = points / 1000;
				lblLevel.setText("Your Level is " + level);
				int temp = userIn.getTransportation();
				userIn.setTransportation(temp + 100);
				clientIn.updateUser(userIn);
			}
		});
		frame.getContentPane().add(btnBike);

		JButton btnCar = new JButton("Car");
		btnCar.setBounds(602, 170, 150, 30);
		btnCar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				points += -100;
				lblPoints.setText("The amount of CO2 you have saved so far is  " + points);
				lblLeaderboardContent.setText(LeaderBoardEntry.createLeaderboard(points, username));
				int pointsmissing = 1000 % points;
				String motivation = "You only need " + pointsmissing + " points to the next level!";
				lblMotivation.setText(motivation);
				level = points / 1000;
				lblLevel.setText("Your Level is " + level);
				int temp = userIn.getTransportation();
				userIn.setTransportation(temp - 100);
				clientIn.updateUser(userIn);
			}
		});
		frame.getContentPane().add(btnCar);

		// Temperature

		//Labels
		JLabel lblTemperature = new JLabel("Have you lowered your room temperature today?");
		lblTemperature.setBounds(445, 200, 300, 30);
		lblTemperature.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblTemperature);

		JButton btnLowered = new JButton("Yes");
		btnLowered.setBounds(445, 230, 150, 30);
		btnLowered.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				points += 100;
				lblPoints.setText("The amount of CO2 you have saved so far is  " + points);
				lblLeaderboardContent.setText(LeaderBoardEntry.createLeaderboard(points, username));
				int pointsmissing = 1000 % points;
				String motivation = "You only need " + pointsmissing + " points to the next level!";
				lblMotivation.setText(motivation);
				level = points / 1000;
				lblLevel.setText("Your Level is " + level);
				int temp = userIn.getTemperature();
				userIn.setTemperature(temp + 100);
				clientIn.updateUser(userIn);
			}
		});
		frame.getContentPane().add(btnLowered);

		JButton btnUnchanged = new JButton("No");
		btnUnchanged.setBounds(602, 230, 150, 30);
		btnUnchanged.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				points += -100;
				lblPoints.setText("The amount of CO2 you have saved so far is  " + points);
				lblLeaderboardContent.setText(LeaderBoardEntry.createLeaderboard(points, username));
				int pointsmissing = 1000 % points;
				String motivation = "You only need " + pointsmissing + " points to the next level!";
				lblMotivation.setText(motivation);
				level = points / 1000;
				lblLevel.setText("Your Level is " + level);
				int temp = userIn.getTemperature();
				userIn.setTemperature(temp - 100);
				clientIn.updateUser(userIn);
			}
		});
		frame.getContentPane().add(btnUnchanged);

		// Solar

		//Labels
		JLabel lblSolar = new JLabel("Have you installed solar panels today?");
		lblSolar.setBounds(845, 140, 300, 30);
		lblSolar.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblSolar);

		JButton btnSolar = new JButton("Yes");
		btnSolar.setBounds(845, 170, 150, 30);
		btnSolar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				points += 100;
				lblPoints.setText("The amount of CO2 you have saved so far is  " + points);
				lblLeaderboardContent.setText(LeaderBoardEntry.createLeaderboard(points, username));
				int pointsmissing = 1000 % points;
				String motivation = "You only need " + pointsmissing + " points to the next level!";
				lblMotivation.setText(motivation);
				level = points / 1000;
				lblLevel.setText("Your Level is " + level);
				int temp = userIn.getSolar();
				userIn.setSolar(temp + 100);
				clientIn.updateUser(userIn);
			}
		});
		frame.getContentPane().add(btnSolar);

		JButton btnNoSolar = new JButton("No");
		btnNoSolar.setBounds(1002, 170, 150, 30);
		btnNoSolar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				points += -100;
				lblPoints.setText("The amount of CO2 you have saved so far is  " + points);
				lblLeaderboardContent.setText(LeaderBoardEntry.createLeaderboard(points, username));
				int pointsmissing = 1000 % points;
				String motivation = "You only need " + pointsmissing + " points to the next level!";
				lblMotivation.setText(motivation);
				level = points / 1000;
				lblLevel.setText("Your Level is " + level);
				int temp = userIn.getSolar();
				userIn.setSolar(temp - 100);
				clientIn.updateUser(userIn);
			}
		});
		frame.getContentPane().add(btnNoSolar);


		// Creates the menu-bar
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);


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

		// Creates the "My Profile" in menu-bar
		JMenuItem mntmMyProfile = new JMenuItem("My Profile");
		mntmMyProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MyProfile.application(userIn, clientIn, username);
			}
		});
		menuBar.add(mntmMyProfile);

		// Creates the "My Friends" in menu-bar
		JMenuItem mntmMyFriends = new JMenuItem("My Friends");
		mntmMyFriends.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FriendsProfile.application(userIn, clientIn);
			}
		});
		menuBar.add(mntmMyFriends);


	}


    /**
     * Gets username.
     *
     * @return the username
     */
//Getters and Setters username
	public String getUsername() {
		return username;
	}

    /**
     * Sets username.
     *
     * @param username the username
     */
    public void setUsername(String username) {
		this.username = username;
	}

}
