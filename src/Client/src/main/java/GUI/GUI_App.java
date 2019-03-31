package GUI;

import GUI_mainscreen.LeaderBoardChoice;
import entity.LeaderBoardEntry;
import entity.User;
import helper.PointsMissing;
import helper.UpdatingLabels;
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
	private static String username;
	private static int points;
	private static int pointsSaved;
	private static int level;
	private static int pointsmissing;
	private static String label;


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

	public static int getPointsSaved() {
		return pointsSaved;
	}

	public static void setPointsSaved(int pointsSaved) {
		GUI_App.pointsSaved = pointsSaved;
	}

	public static String getLabel() {
		return label;
	}

	public static void setLabel(String label) {
		GUI_App.label = label;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private static void initialize(String username, User userIn, UserServiceImpl clientIn) {
		// Create the frame
		frame = new JFrame();
		frame.setBackground(new Color(0, 255, 127));
		frame.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
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

		//Setting up points
		pointsSaved = userIn.getTotal_saved();
		points = userIn.getTotal();

		//To avoid null pointer exception
		if (points > 0) {
			pointsmissing = PointsMissing.determiningPoints(points);
		}


		//Information about CO2 saved
		JLabel lblCO2Saved = new JLabel("The amount of CO2 you have saved so far is " + pointsSaved);
		lblCO2Saved.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCO2Saved.setBounds(130, 42, 1520, 50);
		lblCO2Saved.setHorizontalAlignment(SwingConstants.LEFT);
		frame.getContentPane().add(lblCO2Saved);

		//Information about CO2 saved
		JLabel lblTotalCO2 = new JLabel("The total amount of CO2 you have used up so far is " + points);
		lblTotalCO2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTotalCO2.setBounds(450, 42, 1520, 50);
		lblTotalCO2.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblTotalCO2);

		// Information about level
		level = points / 1000;
		JLabel lblLevel = new JLabel("Your Level is " + level);
		lblLevel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLevel.setBounds(10, 74, 1520, 50);
		lblLevel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblLevel);

		// Leaderboard
		label = "Leaderboard Top 10 CO2 Used";
		JLabel lblLeaderboard = new JLabel(label);
		lblLeaderboard.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblLeaderboard.setBounds(1220, 140, 300, 30);
		lblLeaderboard.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblLeaderboard);

		// Create the content for the leaderboard
		String LeaderBoardContent = LeaderBoardEntry.createLeaderboard(userIn, label);

		JLabel lblLeaderboardContent = new JLabel(LeaderBoardContent);
		lblLeaderboardContent.setBackground(Color.WHITE);
		lblLeaderboardContent.setBounds(1250, 170, 260, 200);
		lblLeaderboardContent.setHorizontalAlignment(SwingConstants.CENTER);
		Border border = BorderFactory.createLineBorder(Color.GRAY, 2);
		lblLeaderboardContent.setBorder(border);
		frame.getContentPane().add(lblLeaderboardContent);

		// Switch the leaderboard
		JButton btnSwitchLeaderBoard = new JButton("Switch Leaderboard");
		btnSwitchLeaderBoard.setForeground(Color.WHITE);
		btnSwitchLeaderBoard.setBackground(new Color(0, 255, 127));
		btnSwitchLeaderBoard.setFont(new Font("Arial Black", Font.PLAIN, 13));
		btnSwitchLeaderBoard.setBounds(1250, 388, 260, 40);
		btnSwitchLeaderBoard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LeaderBoardChoice.application(lblLeaderboardContent,lblLeaderboard, userIn);
			}
		});
		frame.getContentPane().add(btnSwitchLeaderBoard);

		// Add friend button
		JButton btnAddFriend = new JButton("Add a friend");
		btnAddFriend.setForeground(Color.WHITE);
		btnAddFriend.setBackground(new Color(102, 204, 153));
		btnAddFriend.setFont(new Font("Arial Black", Font.PLAIN, 13));
		btnAddFriend.setBounds(1250, 440, 260, 40);
		btnAddFriend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AddFriend.application(userIn, clientIn, frame);
			}
		});
		frame.getContentPane().add(btnAddFriend);

		// Motivation
		String motivation = "You only need " + pointsmissing + " points to the next level!";
		JLabel lblMotivation = new JLabel(motivation);
		lblMotivation.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblMotivation.setBounds(193, 472, 462, 30);
		lblMotivation.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblMotivation);


		// Vegetarian
		//Labels
		JLabel lblWhatKindOf = new JLabel("What kind of meal did you have today?");
		lblWhatKindOf.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblWhatKindOf.setBounds(52, 140, 333, 30);
		lblWhatKindOf.setHorizontalAlignment(SwingConstants.LEFT);
		frame.getContentPane().add(lblWhatKindOf);

		// Vegetarian meal
		JButton btnVeg = new JButton("Vegetarian meal");
		btnVeg.setForeground(Color.WHITE);
		btnVeg.setFont(new Font("Arial Black", Font.PLAIN, 13));
		btnVeg.setBackground(new Color(0, 255, 127));
		btnVeg.setBounds(52, 170, 260, 40);
		btnVeg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UpdatingLabels.updateEverythingDuo(userIn, clientIn, lblTotalCO2, lblCO2Saved, lblLeaderboardContent, lblMotivation, lblLevel, "Vegetarian");
			}
		});
		frame.getContentPane().add(btnVeg);

		JButton btnNonVeg = new JButton("Carnivore meal");
		btnNonVeg.setBackground(new Color(102, 204, 153));
		btnNonVeg.setForeground(Color.WHITE);
		btnNonVeg.setFont(new Font("Arial Black", Font.PLAIN, 13));
		btnNonVeg.setBounds(52, 225, 260, 40);
		btnNonVeg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UpdatingLabels.updateEverythingDuo(userIn, clientIn, lblTotalCO2, lblCO2Saved, lblLeaderboardContent, lblMotivation, lblLevel, "Carnivore");
			}
		});
		frame.getContentPane().add(btnNonVeg);


		// Produce

		//Labels
		JLabel lblProduce = new JLabel("What type of produce did you buy today?");
		lblProduce.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblProduce.setBounds(52, 290, 333, 30);
		lblProduce.setHorizontalAlignment(SwingConstants.LEFT);
		frame.getContentPane().add(lblProduce);

		JButton btnLocalProduce = new JButton("Local Produce");
		btnLocalProduce.setForeground(Color.WHITE);
		btnLocalProduce.setBackground(new Color(0, 255, 127));
		btnLocalProduce.setFont(new Font("Arial Black", Font.PLAIN, 13));
		btnLocalProduce.setBounds(52, 319, 260, 40);
		btnLocalProduce.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UpdatingLabels.updateEverythingDuo(userIn, clientIn, lblTotalCO2, lblCO2Saved, lblLeaderboardContent, lblMotivation, lblLevel, "Local Produce");
			}
		});
		frame.getContentPane().add(btnLocalProduce);

		JButton btnGlobalProduce = new JButton("Global Produce");
		btnGlobalProduce.setForeground(Color.WHITE);
		btnGlobalProduce.setFont(new Font("Arial Black", Font.PLAIN, 13));
		btnGlobalProduce.setBackground(new Color(102, 204, 153));
		btnGlobalProduce.setBounds(52, 372, 260, 40);
		btnGlobalProduce.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UpdatingLabels.updateEverythingDuo(userIn, clientIn, lblTotalCO2, lblCO2Saved, lblLeaderboardContent, lblMotivation, lblLevel, "Global Produce");
			}
		});
		frame.getContentPane().add(btnGlobalProduce);


		// Transportation

		//Labels
		JLabel lblTransportation = new JLabel("How far did you travel today ?");
		lblTransportation.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblTransportation.setBounds(445, 137, 369, 30);
		lblTransportation.setHorizontalAlignment(SwingConstants.LEFT);
		frame.getContentPane().add(lblTransportation);

		JTextField distanceTravelled = new JTextField();
		distanceTravelled.setBounds(445, 170, 130, 100);
		frame.getContentPane().add(distanceTravelled);

		JLabel lblKM = new JLabel("km");
		lblKM.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblKM.setBounds(580, 200, 260, 40);
		lblKM.setHorizontalAlignment(SwingConstants.LEFT);
		frame.getContentPane().add(lblKM);

		// Method of transportation
		JLabel lblDidYouUse = new JLabel("What was the method of transportation?");
		lblDidYouUse.setHorizontalAlignment(SwingConstants.LEFT);
		lblDidYouUse.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblDidYouUse.setBounds(845, 140, 420, 30);
		frame.getContentPane().add(lblDidYouUse);

		JButton btnCar = new JButton("Car");
		btnCar.setForeground(Color.WHITE);
		btnCar.setFont(new Font("Arial Black", Font.PLAIN, 13));
		btnCar.setBackground(new Color(0, 255, 127));
		btnCar.setBounds(845, 170, 280, 30);
		btnCar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					double entry = Double.parseDouble(distanceTravelled.getText());
					if(entry > 10000 || entry <=0 )
					{
						JOptionPane.showMessageDialog(null, "Please enter a valid number between 0 and 10,000", "User Entry Error", JOptionPane.ERROR_MESSAGE);
						distanceTravelled.setText(null);
					} else {
						UpdatingLabels.updateEverythingTextField(userIn, clientIn, entry, lblTotalCO2, lblCO2Saved, lblLeaderboardContent, lblMotivation, lblLevel, "Car");
					}
				} catch (java.lang.NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Please enter a valid number between 0 and 10,000", "User Entry Error", JOptionPane.ERROR_MESSAGE);
					distanceTravelled.setText(null);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "An unexpected error occured, we are sorry", "User Entry Error", JOptionPane.ERROR_MESSAGE);
					distanceTravelled.setText(null);
				}
			}
		});
		frame.getContentPane().add(btnCar);

		JButton btnPublicTransport = new JButton("Public Transportation");
		btnPublicTransport.setForeground(Color.WHITE);
		btnPublicTransport.setFont(new Font("Arial Black", Font.PLAIN, 13));
		btnPublicTransport.setBackground(new Color(102, 204, 153));
		btnPublicTransport.setBounds(845, 205, 280, 30);
		btnPublicTransport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					double entry = Double.parseDouble(distanceTravelled.getText());
					if(entry > 10000 || entry <=0 )
					{
						JOptionPane.showMessageDialog(null, "Please enter a valid number between 0 and 10,000", "User Entry Error", JOptionPane.ERROR_MESSAGE);
						distanceTravelled.setText(null);
					} else {
						UpdatingLabels.updateEverythingTextField(userIn, clientIn, entry, lblTotalCO2, lblCO2Saved, lblLeaderboardContent, lblMotivation, lblLevel, "Public Transportation");
					}
				} catch (java.lang.NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Please enter a valid number between 0 and 10,000", "User Entry Error", JOptionPane.ERROR_MESSAGE);
					distanceTravelled.setText(null);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "An unexpected error occured, we are sorry", "User Entry Error", JOptionPane.ERROR_MESSAGE);
					distanceTravelled.setText(null);
				}
			}
		});
		frame.getContentPane().add(btnPublicTransport);

		JButton btnBike = new JButton("Bike");
		btnBike.setForeground(Color.WHITE);
		btnBike.setFont(new Font("Arial Black", Font.PLAIN, 13));
		btnBike.setBackground(new Color(0, 255, 204));
		btnBike.setBounds(845, 240, 280, 30);
		btnBike.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					double entry = Double.parseDouble(distanceTravelled.getText());
					if(entry > 10000 || entry <=0 )
					{
						JOptionPane.showMessageDialog(null, "Please enter a valid number between 0 and 10,000", "User Entry Error", JOptionPane.ERROR_MESSAGE);
						distanceTravelled.setText(null);
					} else {
						UpdatingLabels.updateEverythingTextField(userIn, clientIn, entry, lblTotalCO2, lblCO2Saved, lblLeaderboardContent, lblMotivation, lblLevel, "Bike");
					}
				} catch (java.lang.NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Please enter a valid number between 0 and 10,000", "User Entry Error", JOptionPane.ERROR_MESSAGE);
					distanceTravelled.setText(null);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "An unexpected error occured, we are sorry", "User Entry Error", JOptionPane.ERROR_MESSAGE);
					distanceTravelled.setText(null);
				}
			}
		});
		frame.getContentPane().add(btnBike);

		// Temperature

		//Labels
		JLabel lblTemperature = new JLabel("What was the temperature in your room today?");
		lblTemperature.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblTemperature.setBounds(445, 290, 388, 30);
		lblTemperature.setHorizontalAlignment(SwingConstants.LEFT);
		frame.getContentPane().add(lblTemperature);

		JTextField temperatureToday = new JTextField();
		temperatureToday.setBounds(445, 319, 130, 100);
		frame.getContentPane().add(temperatureToday);

		JButton btDegreeCelsius = new JButton("Degree Celsius");
		btDegreeCelsius.setForeground(Color.WHITE);
		btDegreeCelsius.setFont(new Font("Arial Black", Font.PLAIN, 13));
		btDegreeCelsius.setBackground(new Color(102, 204, 153));
		btDegreeCelsius.setBounds(580, 350, 200, 40);
		btDegreeCelsius.setHorizontalAlignment(SwingConstants.CENTER);
		btDegreeCelsius.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					double entry = Double.parseDouble(temperatureToday.getText());
					if(entry > 10000 || entry <=0 )
					{
						JOptionPane.showMessageDialog(null, "Please enter a valid number between 0 and 10,000", "User Entry Error", JOptionPane.ERROR_MESSAGE);
						temperatureToday.setText(null);
					} else {
						UpdatingLabels.updateEverythingTextField(userIn, clientIn, entry, lblTotalCO2, lblCO2Saved, lblLeaderboardContent, lblMotivation, lblLevel, "Temperature");
					}
				} catch (java.lang.NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Please enter a valid number between 0 and 10,000", "User Entry Error", JOptionPane.ERROR_MESSAGE);
					temperatureToday.setText(null);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "An unexpected error occured, we are sorry", "User Entry Error", JOptionPane.ERROR_MESSAGE);
					temperatureToday.setText(null);
				}
			}
		});
		frame.getContentPane().add(btDegreeCelsius);

		// Solar

		//Labels
		JLabel lblSolar = new JLabel("How many installed solar panels do you own?");
		lblSolar.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblSolar.setBounds(845, 290, 500, 30);
		lblSolar.setHorizontalAlignment(SwingConstants.LEFT);
		frame.getContentPane().add(lblSolar);

		JTextField numberSolarPanels = new JTextField();
		numberSolarPanels.setBounds(845, 319, 130, 100);
		frame.getContentPane().add(numberSolarPanels);

		JButton btnNoSolar = new JButton("Solar Panels");
		btnNoSolar.setForeground(Color.WHITE);
		btnNoSolar.setFont(new Font("Arial Black", Font.PLAIN, 13));
		btnNoSolar.setBackground(new Color(102, 204, 153));
		btnNoSolar.setBounds(980, 350, 185, 40);
		btnNoSolar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					double entry = Double.parseDouble(numberSolarPanels.getText());
					if(entry > 10000 || entry <=0 )
					{
						JOptionPane.showMessageDialog(null, "Please enter a valid number between 0 and 10,000", "User Entry Error", JOptionPane.ERROR_MESSAGE);
						numberSolarPanels.setText(null);
					} else {
						UpdatingLabels.updateEverythingTextField(userIn, clientIn, entry, lblTotalCO2, lblCO2Saved, lblLeaderboardContent, lblMotivation, lblLevel, "Solar");
					}
				} catch (java.lang.NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Please enter a valid number between 0 and 10,000", "User Entry Error", JOptionPane.ERROR_MESSAGE);
					numberSolarPanels.setText(null);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "An unexpected error occured, we are sorry", "User Entry Error", JOptionPane.ERROR_MESSAGE);
					numberSolarPanels.setText(null);
				}
			}
		});
		frame.getContentPane().add(btnNoSolar);


		// Creates the menu-bar
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);


		// Creates the "Log out" in menu-bar
		JMenuItem mntmLogOut = new JMenuItem("Log out");
		mntmLogOut.setForeground(Color.DARK_GRAY);
		mntmLogOut.setFont(new Font("Arial Black", Font.PLAIN, 13));
		mntmLogOut.setBackground(new Color(204, 255, 255));
		mntmLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Log out",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					Login_S.main(null);
					frame.setVisible(false);
				}
			}
		});

		// Creates the "My Profile" in menu-bar
		JMenuItem mntmMyProfile = new JMenuItem("My Profile");
		mntmMyProfile.setForeground(Color.DARK_GRAY);
		mntmMyProfile.setBackground(new Color(0, 204, 204));
		mntmMyProfile.setFont(new Font("Arial Black", Font.PLAIN, 13));
		mntmMyProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MyProfile.application(userIn, clientIn, username, friendClient, frame);
				setUsername(userIn.getUser_name());
				lblWelcome.setText("Welcome " + userIn.getUser_name());
				System.out.println(userIn.getUser_name());
			}
		});
		menuBar.add(mntmMyProfile);

		// Creates the "My Friends" in menu-bar
		JMenuItem mntmMyFriends = new JMenuItem("My Friends");
		mntmMyFriends.setForeground(Color.DARK_GRAY);
		mntmMyFriends.setBackground(new Color(0, 255, 204));
		mntmMyFriends.setFont(new Font("Arial Black", Font.PLAIN, 13));
		mntmMyFriends.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FriendsProfile.application(userIn, clientIn);
			}
		});
		menuBar.add(mntmMyFriends);
		menuBar.add(mntmLogOut);


	}


	/**
	 * Gets username.
	 *
	 * @return the username
	 */
//Getters and Setters username
	public static String getUsername() {
		return username;
	}

	/**
	 * Sets username.
	 *
	 * @param usernameIn the username
	 */
	public static void setUsername(String usernameIn) {
		username = usernameIn;
	}

	public static int getPoints() {
		return points;
	}

	public static void setPoints(int points) {
		GUI_App.points = points;
	}

	public static int getLevel() {
		return level;
	}

	public static void setLevel(int level) {
		GUI_App.level = level;
	}

	public static int getPointsmissing() {
		return pointsmissing;
	}

	public static void setPointsmissing(int pointsmissing) {
		GUI_App.pointsmissing = pointsmissing;
	}
}
