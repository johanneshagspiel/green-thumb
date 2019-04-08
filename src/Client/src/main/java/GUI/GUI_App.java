package GUI;

import GUI_mainscreen.LeaderBoardChoice;
import Login.Login_addAccount;
import entity.LeaderBoardEntry;
import entity.User;

import helper.*;
import service.UserServiceImpl;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.text.JTextComponent;

import GUI_mainscreen.AddFriend;
import GUI_mainscreen.FriendsProfile;
import GUI_mainscreen.MyProfile;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Timer;



/**
 * The type Gui app.
 */
public class  GUI_App extends Login_S {
	/** Initialises the app */
	private static JFrame frame;
	/** Initialises the frame. */
	private static String username;
	/** Initialises the username .*/
	private static int points;
	/** Initialises the points. */
	private static int pointsSaved;
	/** Initialises the pointsSaved. */
	private static int level;
	/** Initialises the level. */
	private static int pointsmissing;
	/** Initialises the pointsmissing. */
	private static String label;
	/** Initialises the label. */


	/**
	 * Launch the application.
	 *
	 * @param username the username
	 * @param userIn   the user in
	 * @param clientIn the client in
	 */
	public static void application(
			final String username,
			final User userIn,
			final UserServiceImpl clientIn) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_App window = new GUI_App(username,
							userIn, clientIn);
					GUI_App.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @param username the username
	 * @param userIn   the user in
	 * @param clientIn the client in
	 */
	private GUI_App(final String username,
					final User userIn,
					final UserServiceImpl clientIn) {
		this.setUsername(username);
		initialize(username, userIn, clientIn);
	}

	/**
	 * Get PointsSaved.
	 * @return pointsSaved
	 */
	public static int getPointsSaved() {
		return pointsSaved;
	}

	/**
	 * Set PointsSaved.
	 * @param pointsSaved the pointsSaved
	 */
	public static void setPointsSaved(final int pointsSaved) {
		GUI_App.pointsSaved = pointsSaved;
	}

	/**
	 * Get Label.
	 * @return label
	 */
	public static String getLabel() {
		return label;
	}

	/**
	 * Set Label.
	 * @param label the label
	 */
	public static void setLabel(final String label) {
		GUI_App.label = label;
	}

	/**
	 * Initialize the contents of the frame.
	 *@param username the username
	 *@param userIn   the user in
	 *@param clientIn the client in
	 */
	private static void initialize(
			final String username,
			final User userIn,
			final UserServiceImpl clientIn) {
		final int twofivefive = 255;
		final int onetwoseven = 127;
		final int twozerozero = 200;
		final int oneninetwozero = 1920;
		final int onezeroeightzero = 1080;
		final int twonine = 29;
		final int onezero = 10;
		final int onefivetwozero = 1520;
		final int fivenine = 59;
		final int fourfourfive = 445;
		final int onethreeseven = 137;
		final int threesixnine = 369;
		final int onezerozero = 100;
		final int fiveeightzero = 580;
		final int eightfourfive = 845;
		final int fourtwozero = 420;
		final int twoeightzero = 280;
		final int onezerozerozerozero = 10000;
		final int twozerofive = 205;
		final int twofourzero = 240;
		final int threefivezero = 350;
		final int fivezerozero = 500;
		final int nineeightzero = 980;
		final int oneeightfive = 185;
		final int twozero = 20;
		final int onethreezero = 130;
		final int fourtwo = 42;
		final int fivezero = 50;
		final int fourfivezero = 450;
		final int onezerozerozero = 1000;
		final int sevenfour = 74;
		final int onethree = 13;
		final int onetwotwozero = 1220;
		final int onefourzero = 140;
		final int threezerozero = 300;
		final int threezero = 30;
		final int onetwofivezero = 1250;
		final int onesevenzero = 170;
		final int twosixzero = 260;
		final int two = 2;
		final int threeeighteight = 388;
		final int fourzero = 40;
		final int onezerotwo = 102;
		final int twozerofour = 204;
		final int onefivethree = 153;
		final int fourfourzero = 440;
		final int oneninethree = 193;
		final int fourseventwo = 472;
		final int foursixtwo = 462;
		final int onefour = 14;
		final int fivetwo = 52;
		final int threethreethree = 333;
		final int twotwofive = 225;
		final int twoninezero = 290;
		final int threeonenine = 319;
		final int threeseventwo = 372;


		// Create the frame
		frame = new JFrame();
		frame.setBackground(
				new Color(
						0, twofivefive, onetwoseven));
		frame.getContentPane().
				setBackground(SystemColor.
						inactiveCaptionBorder);
		frame.setBounds(
				twozerozero,
				twozerozero,
				oneninetwozero,
				onezeroeightzero);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setFocusable(true);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.getContentPane().setLayout(null);

		// Labels
		JLabel lblWelcome =
				new JLabel("Welcome " + username);
		lblWelcome.setFont(new Font(
				"Times New Roman", Font.PLAIN, twonine));
		lblWelcome.setBounds(
				onezero, onezero, onefivetwozero, fivenine);
		lblWelcome.setHorizontalAlignment(
				SwingConstants.CENTER);
		frame.getContentPane().add(lblWelcome);

		//Setting up points
		pointsSaved = userIn.getTotal_saved();
		points = userIn.getTotal();

		//To avoid null pointer exception
		if (points > 0) {
			pointsmissing = PointsMissing.determiningPoints(points);
		}


		//Information about CO2 saved
		JLabel lblCO2Saved
				= new JLabel(
				"The amount of CO2 you have saved"
						+ " so far is " + pointsSaved);
		lblCO2Saved.setFont(new Font(
				"Tahoma", Font.PLAIN, twozero));
		lblCO2Saved.setBounds(onethreezero, fourtwo,
				onefivetwozero, fivezero);
		lblCO2Saved.setHorizontalAlignment(SwingConstants.LEFT);
		frame.getContentPane().add(lblCO2Saved);

		//Information about CO2 saved
		JLabel lblTotalCO2
				= new JLabel(
				"The total amount of CO2 you have used up"
						+ " so far is " + points);
		lblTotalCO2.setFont(new Font(
				"Tahoma", Font.PLAIN, twozero));
		lblTotalCO2.setBounds(
				fourfivezero, fourtwo,
				onefivetwozero, fivezero);
		lblTotalCO2.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblTotalCO2);

		// Information about level
		level = points / onezerozerozero;
		JLabel lblLevel =
				new JLabel(
						"Your Level is " + level);
		lblLevel.setFont(new Font(
				"Tahoma", Font.PLAIN, twozero));
		lblLevel.setBounds(
				onezero, sevenfour,
				onefivetwozero, fivezero);
		lblLevel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblLevel);

		// Leaderboard
		label = "Leaderboard Top 10 CO2 Used";
		JLabel lblLeaderboard = new JLabel(label);
		lblLeaderboard.setFont(new Font(
				"Arial Black",
				Font.PLAIN, onethree));
		lblLeaderboard.setBounds(
				onetwotwozero,
				onefourzero,
				threezerozero,
				threezero);
		lblLeaderboard.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblLeaderboard);

		// Create the content for the leaderboard
		String LeaderBoardContent
				= LeaderBoardEntry.createLeaderboard(userIn, label);


		JLabel lblLeaderboardContent =
				new JLabel(LeaderBoardContent);
		lblLeaderboardContent.setBackground(Color.WHITE);
		lblLeaderboardContent.setBounds(
				onetwofivezero, onesevenzero,
				twosixzero, twozerozero);
		lblLeaderboardContent.
				setHorizontalAlignment(SwingConstants.CENTER);
		Border border =
				BorderFactory.createLineBorder(
						Color.GRAY, two);
		lblLeaderboardContent.setBorder(border);
		frame.getContentPane().add(lblLeaderboardContent);

		// Switch the leaderboard
		JButton btnSwitchLeaderBoard =
				new JButton("Switch Leaderboard");
		btnSwitchLeaderBoard.setForeground(Color.WHITE);
		btnSwitchLeaderBoard.setBackground(new Color(0,
				twofivefive, onetwoseven));
		btnSwitchLeaderBoard.setFont(new Font(
				"Arial Black",
				Font.PLAIN, onethree));
		btnSwitchLeaderBoard.setBounds(
				onetwofivezero, threeeighteight,
				twosixzero, fourzero);
		btnSwitchLeaderBoard.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				LeaderBoardChoice.application(
						lblLeaderboardContent,
						lblLeaderboard, userIn);
			}
		});
		frame.getContentPane().add(btnSwitchLeaderBoard);


		// Motivation
		String motivation = "You only need " + pointsmissing + " points to the next level!";
		JLabel lblMotivation = new JLabel(motivation);
		lblMotivation.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblMotivation.setBounds(193, 472, 462, 30);
		lblMotivation.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblMotivation);


		// Motivation image
		JLabel imgMotivation = new JLabel(new ImageIcon(CreateMotivationImage.createIcon()));
		imgMotivation.setBounds(300, 500, 250, 300);
		imgMotivation.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(imgMotivation);

		// Achievemnt label
		JLabel achievmentLabel = new JLabel("Achievement Bar");
		achievmentLabel.setFont(new Font("Arial Black", Font.PLAIN, 13));
		achievmentLabel.setBounds(660, 472, 462, 30);
		achievmentLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(achievmentLabel);

		// Achievement one
		JLabel imgAchievementOne = new JLabel(new ImageIcon(UpdateAchievements.updateAchievements("imgAchievementOne", userIn)));
		imgAchievementOne.setBounds(700, 500, 75, 75);
		imgAchievementOne.setHorizontalAlignment(SwingConstants.CENTER);
		imgAchievementOne.setToolTipText(UpdateAchievements.createText("imgAchievementOne", userIn));
		frame.getContentPane().add(imgAchievementOne);

		// Achievement two
		JLabel imgAchievementTwo = new JLabel(new ImageIcon(UpdateAchievements.updateAchievements("imgAchievementTwo", userIn)));
		imgAchievementTwo.setBounds(700, 600, 75, 75);
		imgAchievementTwo.setHorizontalAlignment(SwingConstants.CENTER);
		imgAchievementTwo.setToolTipText(UpdateAchievements.createText("imgAchievementTwo", userIn));
		frame.getContentPane().add(imgAchievementTwo);

		// Achievement three
		JLabel imgAchievementThree = new JLabel(new ImageIcon(UpdateAchievements.updateAchievements("imgAchievementThree", userIn)));
		imgAchievementThree.setBounds(800, 500, 75, 75);
		imgAchievementThree.setHorizontalAlignment(SwingConstants.CENTER);
		imgAchievementThree.setToolTipText(UpdateAchievements.createText("imgAchievementThree", userIn));
		frame.getContentPane().add(imgAchievementThree);

		// Achievement four
		JLabel imgAchievementFour = new JLabel(new ImageIcon(UpdateAchievements.updateAchievements("imgAchievementFour", userIn)));
		imgAchievementFour.setBounds(800, 600, 75, 75);
		imgAchievementFour.setHorizontalAlignment(SwingConstants.CENTER);
		imgAchievementFour.setToolTipText(UpdateAchievements.createText("imgAchievementFour", userIn));
		frame.getContentPane().add(imgAchievementFour);

		// Achievement five
		JLabel imgAchievementFive = new JLabel(new ImageIcon(UpdateAchievements.updateAchievements("imgAchievementFive", userIn)));
		imgAchievementFive.setBounds(900, 500, 75, 75);
		imgAchievementFive.setHorizontalAlignment(SwingConstants.CENTER);
		imgAchievementFive.setToolTipText(UpdateAchievements.createText("imgAchievementFive", userIn));
		frame.getContentPane().add(imgAchievementFive);

		// Achievement six
		JLabel imgAchievementSix = new JLabel(new ImageIcon(UpdateAchievements.updateAchievements("imgAchievementSix", userIn)));
		imgAchievementSix.setBounds(900, 600, 75, 75);
		imgAchievementSix.setHorizontalAlignment(SwingConstants.CENTER);
		imgAchievementSix.setToolTipText(UpdateAchievements.createText("imgAchievementSix", userIn));
		frame.getContentPane().add(imgAchievementSix);

		// Achievement seven
		JLabel imgAchievementSeven = new JLabel(new ImageIcon(UpdateAchievements.updateAchievements("imgAchievementSeven", userIn)));
		imgAchievementSeven.setBounds(1000, 500, 75, 75);
		imgAchievementSeven.setHorizontalAlignment(SwingConstants.CENTER);
		imgAchievementSeven.setToolTipText(UpdateAchievements.createText("imgAchievementSeven", userIn));
		frame.getContentPane().add(imgAchievementSeven);

		// Achievement eight
		JLabel imgAchievementEight = new JLabel(new ImageIcon(UpdateAchievements.updateAchievements("imgAchievementOne", userIn)));
		imgAchievementEight.setBounds(1000, 600, 75, 75);
		imgAchievementEight.setHorizontalAlignment(SwingConstants.CENTER);
		imgAchievementEight.setToolTipText(UpdateAchievements.createText("imgAchievementEight", userIn));
		frame.getContentPane().add(imgAchievementEight);

		// Add friend button
		JButton btnAddFriend = new JButton(
				"Add a friend");
		btnAddFriend.setForeground(Color.WHITE);
		btnAddFriend.setBackground(new Color(
				onezerotwo,
				twozerofour,
				onefivethree));
		btnAddFriend.setFont(new Font(
				"Arial Black", Font.PLAIN, onethree));
		btnAddFriend.setBounds(
				onetwofivezero, fourfourzero,
				twosixzero, fourzero);
		btnAddFriend.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				AddFriend.application(userIn, clientIn, frame, imgAchievementEight);

				}
			});
		frame.getContentPane().add(btnAddFriend);


			// Chat
			label = "Global Chat";
			JLabel lblChat = new JLabel(label);
		lblChat.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblChat.setBounds(1220, 500, 300, 30);
		lblChat.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblChat);



			// Create the content for the leaderboard
			String chatContent = ChatContent.createChat(clientIn);

					JLabel lblChatContent = new JLabel(chatContent);
		lblChatContent.setBackground(Color.WHITE);
		lblChatContent.setBounds(1250, 530, 260, 200);
		lblChatContent.setHorizontalAlignment(SwingConstants.LEFT);
		lblChatContent.setVerticalAlignment(SwingConstants.TOP);
			Border borderChat = BorderFactory.createLineBorder(Color.GRAY, 2);
		lblChatContent.setBorder(borderChat);
		frame.getContentPane().add(lblChatContent);


			// Update the chat every second
			TimerTask task = new TimerTask() {
				@Override
				public void run() {
					lblChatContent.setText(ChatContent.createChat(clientIn));
				}
			};

			Timer timer = new Timer();
		timer.scheduleAtFixedRate(task, 100, 1000);

			// Comment Textfield
			JTextField chatText = new JTextField();
		chatText.setBounds(1251, 690, 190, 40);
		frame.getContentPane().add(chatText);

			// Post comment
			JButton btnPostChat = new JButton("Post");
		btnPostChat.setForeground(Color.WHITE);
		btnPostChat.setBackground(new Color(0, 255, 127));
		btnPostChat.setFont(new Font("Arial Black", Font.PLAIN, 13));
		btnPostChat.setBounds(1440, 690, 70, 40);
		btnPostChat.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String lengthUserInput = userIn.getUser_name() + ": " + chatText.getText();
					if (lengthUserInput.length() >= 40)
					{
						JOptionPane.showMessageDialog(null,"Your chat message is too long, we are sorry!", "User Entry Error", JOptionPane.ERROR_MESSAGE);
						chatText.setText(null);
					}
					else {
						ChatContent.postComment(chatText, clientIn, userIn, lblChatContent);
					}
				}
			});
		frame.getContentPane().add(btnPostChat);


			//Labels
			JLabel lblWhatKindOf = new JLabel("What kind of meal did you have today?");
		lblWhatKindOf.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblWhatKindOf.setBounds(52, 140, 333, 30);
			// Labels


		lblWhatKindOf.setHorizontalAlignment(SwingConstants.LEFT);
		frame.getContentPane().add(lblWhatKindOf);

			// Vegetarian meal
			JButton btnVeg = new JButton(
					"Vegetarian meal");
		btnVeg.setForeground(Color.WHITE);
		btnVeg.setFont(new Font(
				"Arial Black", Font.PLAIN, onethree));
		btnVeg.setBackground(
				new Color(0, twofivefive, onetwoseven));
		btnVeg.setBounds(
			fivetwo, onesevenzero,
			twosixzero, fourzero);
		btnVeg.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent arg0) {
					UpdatingLabels.updateEverythingDuo(userIn, clientIn, lblTotalCO2, lblCO2Saved, lblLeaderboardContent, lblMotivation, lblLevel,imgMotivation, imgAchievementOne, imgAchievementSeven,"Vegetarian");

					}
				});
				frame.getContentPane().add(btnVeg);

				JButton btnNonVeg = new JButton(
						"Non-vegetarian meal");
				btnNonVeg.setBackground(
						new Color(onezerotwo,
								twozerofour, onefivethree));
				btnNonVeg.setForeground(Color.WHITE);
				btnNonVeg.setFont(new Font(
						"Arial Black", Font.PLAIN, onethree));
				btnNonVeg.setBounds(
						fivetwo, twotwofive,
						twosixzero, fourzero);
				btnNonVeg.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent arg0) {
						UpdatingLabels.updateEverythingDuo(userIn, clientIn, lblTotalCO2, lblCO2Saved, lblLeaderboardContent, lblMotivation, lblLevel,imgMotivation,imgAchievementOne, imgAchievementSeven,"Carnivore");

						}
					});
		frame.getContentPane().add(btnNonVeg);


					// Produce

					//Labels
					JLabel lblProduce
							= new JLabel(
							"What type of produce did you buy today?");
		lblProduce.setFont(new Font(
				"Arial Black", Font.PLAIN, onethree));
		lblProduce.setBounds(
					fivetwo, twoninezero,
					threethreethree, threezero);
		lblProduce.setHorizontalAlignment(SwingConstants.LEFT);
		frame.getContentPane().add(lblProduce);

					JButton btnLocalProduce = new JButton(
							"Local Produce");
		btnLocalProduce.setForeground(Color.WHITE);
		btnLocalProduce.setBackground(
				new Color(0, twofivefive, onetwoseven));
		btnLocalProduce.setFont(new Font(
				"Arial Black", Font.PLAIN, onethree));
		btnLocalProduce.setBounds(
					fivetwo, threeonenine,
					twosixzero, fourzero);
		btnLocalProduce.addActionListener(new ActionListener() {

						public void actionPerformed(ActionEvent arg0) {
							UpdatingLabels.updateEverythingDuo(userIn, clientIn, lblTotalCO2, lblCO2Saved, lblLeaderboardContent, lblMotivation, lblLevel, imgMotivation, imgAchievementTwo,imgAchievementSeven,"Local Produce");

							}
						});
						frame.getContentPane().add(btnLocalProduce);

						JButton btnGlobalProduce = new JButton(
								"Global Produce");
						btnGlobalProduce.setForeground(Color.WHITE);
						btnGlobalProduce.setFont(new Font(
								"Arial Black",
								Font.PLAIN, onethree));
						btnGlobalProduce.setBackground(
								new Color(onezerotwo,
										twozerofour, onefivethree));
						btnGlobalProduce.setBounds(
								fivetwo, threeseventwo,
								twosixzero, fourzero);
						btnGlobalProduce.addActionListener(new ActionListener() {

															   public void actionPerformed(ActionEvent arg0) {
																   UpdatingLabels.updateEverythingDuo(userIn, clientIn, lblTotalCO2, lblCO2Saved, lblLeaderboardContent, lblMotivation, lblLevel,imgMotivation, imgAchievementTwo, imgAchievementSeven, "Global Produce");

																   }
															   });
		frame.getContentPane().add(btnGlobalProduce);


															   // Transportation

															   //Labels
															   JLabel lblTransportation
																	   = new JLabel("How far did you travel today ?");
		lblTransportation.setFont(new Font(
				"Arial Black",
				Font.PLAIN, onethree));
		lblTransportation.setBounds(
															   fourfourfive, onethreeseven,
															   threesixnine, threezero);
		lblTransportation.setHorizontalAlignment(
															   SwingConstants.LEFT);
		frame.getContentPane().add(lblTransportation);

															   JTextField distanceTravelled = new JTextField();
		distanceTravelled.setBounds(
															   fourfourfive, onesevenzero,
															   onethreezero, onezerozero);
		frame.getContentPane().add(distanceTravelled);

															   JLabel lblKM = new JLabel("km");
		lblKM.setFont(new Font(
				"Arial Black", Font.PLAIN, onethree));
		lblKM.setBounds(
															   fiveeightzero, twozerozero,
															   twosixzero, fourzero);
		lblKM.setHorizontalAlignment(SwingConstants.LEFT);
		frame.getContentPane().add(lblKM);

															   // Method of transportation
															   JLabel lblDidYouUse
																	   = new JLabel(
																	   "What was the method of transportation?");
		lblDidYouUse.setHorizontalAlignment(SwingConstants.LEFT);
		lblDidYouUse.setFont(new Font(
				"Arial Black", Font.PLAIN, onethree));
		lblDidYouUse.setBounds(
															   eightfourfive, onefourzero,
															   fourtwozero, threezero);
		frame.getContentPane().add(lblDidYouUse);

															   JButton btnCar = new JButton("Car");
		btnCar.setForeground(Color.WHITE);
		btnCar.setFont(new Font(
				"Arial Black", Font.PLAIN, onethree));
		btnCar.setBackground(
				new Color(0, twofivefive, onetwoseven));
		btnCar.setBounds(
															   eightfourfive, onesevenzero,
															   twoeightzero, threezero);
		btnCar.addActionListener(new ActionListener() {
																   public void actionPerformed( final ActionEvent arg0) {
																	   try {

																		   double entry = Double.parseDouble(distanceTravelled.getText());
																		   if(entry > 1000 || entry <=0 )
																		   {
																			   JOptionPane.showMessageDialog(null, "Please enter a valid number between 0 and 1000", "User Entry Error", JOptionPane.ERROR_MESSAGE);
																			   distanceTravelled.setText(null);
																		   } else {
																			   UpdatingLabels.updateEverythingTextField(userIn, clientIn, entry, lblTotalCO2, lblCO2Saved, lblLeaderboardContent, lblMotivation, lblLevel, imgMotivation,imgAchievementThree, imgAchievementSeven,"Car");
																			   distanceTravelled.setText(null);
																		   }
																	   } catch (NumberFormatException e) {
																		   JOptionPane.showMessageDialog(null, "Please enter a valid number between 0 and 1000", "User Entry Error", JOptionPane.ERROR_MESSAGE);

																		   distanceTravelled.setText(null);
																	   } catch (Exception e) {
																		   JOptionPane.showMessageDialog(
																				   null,
																				   "An unexpected error occured, we are sorry",
																				   "User Entry Error",
																				   JOptionPane.ERROR_MESSAGE);
																		   distanceTravelled.setText(null);
																	   }
																   }
															   });
		frame.getContentPane().add(btnCar);

															   JButton btnPublicTransport = new JButton(
																	   "Public Transportation");
		btnPublicTransport.setForeground(Color.WHITE);
		btnPublicTransport.setFont(new Font("Arial Black",
											Font.PLAIN, onethree));
		btnPublicTransport.setBackground(
				new Color(onezerotwo,
						  twozerofour, onefivethree));
		btnPublicTransport.setBounds(
															   eightfourfive, twozerofive,
															   twoeightzero, threezero);
		btnPublicTransport.addActionListener(new ActionListener() {
																   public void actionPerformed(final ActionEvent arg0) {
																	   try {

																		   double entry = Double.parseDouble(distanceTravelled.getText());
																		   if(entry > 1000 || entry <=0 )
																		   {
																			   JOptionPane.showMessageDialog(null, "Please enter a valid number between 0 and 1000", "User Entry Error", JOptionPane.ERROR_MESSAGE);
																			   distanceTravelled.setText(null);
																		   } else {
																			   UpdatingLabels.updateEverythingTextField(userIn, clientIn, entry, lblTotalCO2, lblCO2Saved, lblLeaderboardContent, lblMotivation, lblLevel,imgMotivation,imgAchievementFour, imgAchievementSeven,"Public Transportation");
																			   distanceTravelled.setText(null);
																		   }
																	   } catch (NumberFormatException e) {
																		   JOptionPane.showMessageDialog(null, "Please enter a valid number between 0 and 1000", "User Entry Error", JOptionPane.ERROR_MESSAGE);

																		   distanceTravelled.setText(null);
																	   } catch (Exception e) {
																		   JOptionPane.showMessageDialog(
																				   null,
																				   "An unexpected error occured,"
																						   + " we are sorry",
																				   "User Entry Error",
																				   JOptionPane.ERROR_MESSAGE);
																		   distanceTravelled.setText(null);
																	   }
																   }
															   });
		frame.getContentPane().add(btnPublicTransport);

															   JButton btnBike = new JButton("Bike");
		btnBike.setForeground(Color.WHITE);
		btnBike.setFont(new Font(
				"Arial Black", Font.PLAIN, onethree));
		btnBike.setBackground(new Color(
				0, twofivefive, twozerofour));
		btnBike.setBounds(
															   eightfourfive, twofourzero,
															   twoeightzero, threezero);
		btnBike.addActionListener(new ActionListener() {
																   public void actionPerformed(final ActionEvent arg0) {
																	   try {

																		   double entry = Double.parseDouble(distanceTravelled.getText());
																		   if(entry > 1000 || entry <=0 )
																		   {
																			   JOptionPane.showMessageDialog(null, "Please enter a valid number between 0 and 1000", "User Entry Error", JOptionPane.ERROR_MESSAGE);
																			   distanceTravelled.setText(null);
																		   } else {
																			   UpdatingLabels.updateEverythingTextField(userIn, clientIn, entry, lblTotalCO2, lblCO2Saved, lblLeaderboardContent, lblMotivation, lblLevel, imgMotivation,imgAchievementThree, imgAchievementSeven,"Bike");
																			   distanceTravelled.setText(null);
																		   }
																	   } catch (NumberFormatException e) {
																		   JOptionPane.showMessageDialog(null, "Please enter a valid number between 0 and 1000", "User Entry Error", JOptionPane.ERROR_MESSAGE);

																		   distanceTravelled.setText(null);
																	   } catch (Exception e) {
																		   JOptionPane.showMessageDialog(
																				   null,
																				   "An unexpected error occured,"
																						   + " we are sorry",
																				   "User Entry Error",
																				   JOptionPane.ERROR_MESSAGE);
																		   distanceTravelled.setText(null);
																	   }
																   }
															   });
		frame.getContentPane().add(btnBike);

															   // Temperature

															   //Labels
															   JLabel lblTemperature
																	   = new JLabel(
																	   "By how much is your temperature lowered now?");
		lblTemperature.setFont(new Font(
				"Arial Black",
				Font.PLAIN, onethree));
		lblTemperature.setBounds(
															   fourfourfive, twoninezero,
															   threeeighteight, threezero);
		lblTemperature.setHorizontalAlignment(SwingConstants.LEFT);
		frame.getContentPane().add(lblTemperature);

															   JTextField temperatureToday = new JTextField();
		temperatureToday.setBounds(
															   fourfourfive, threeonenine,
															   onethreezero, onezerozero);
		frame.getContentPane().add(temperatureToday);

															   JButton btDegreeCelsius = new JButton("Degree Celsius");
		btDegreeCelsius.setForeground(Color.WHITE);
		btDegreeCelsius.setFont(new Font("Arial Black",
										 Font.PLAIN, onethree));
		btDegreeCelsius.setBackground(
				new Color(onezerotwo,
						  twozerofour, onefivethree));
		btDegreeCelsius.setBounds(
															   fiveeightzero, threefivezero,
															   twozerozero, fourzero);
		btDegreeCelsius.setHorizontalAlignment(SwingConstants.CENTER);
		btDegreeCelsius.addActionListener(new ActionListener() {
																   public void actionPerformed(final ActionEvent arg0) {
																	   try {

																		   double entry = Double.parseDouble(temperatureToday.getText());
																		   if(entry > 1000 || entry <=0 )
																		   {
																			   JOptionPane.showMessageDialog(null, "Please enter a valid number between 0 and 1000", "User Entry Error", JOptionPane.ERROR_MESSAGE);
																			   temperatureToday.setText(null);
																		   } else {
																			   UpdatingLabels.updateEverythingTextField(userIn, clientIn, entry, lblTotalCO2, lblCO2Saved, lblLeaderboardContent, lblMotivation, lblLevel, imgMotivation, imgAchievementFive, imgAchievementSeven,"Temperature");
																			   temperatureToday.setText(null);
																		   }
																	   } catch (NumberFormatException e) {
																		   JOptionPane.showMessageDialog(null, "Please enter a valid number between 0 and 1000", "User Entry Error", JOptionPane.ERROR_MESSAGE);

																		   temperatureToday.setText(null);
																	   } catch (Exception e) {
																		   JOptionPane.showMessageDialog(null,
																				   "An unexpected error occured,"
																						   + " we are sorry",
																				   "User Entry Error",
																				   JOptionPane.ERROR_MESSAGE);
																		   temperatureToday.setText(null);
																	   }
																   }
															   });
		frame.getContentPane().add(btDegreeCelsius);

															   // Solar

															   //Labels
															   JLabel lblSolar
																	   = new JLabel("How many installed"
																	   + " solar panels do you own?");
		lblSolar.setFont(new Font("Arial Black",
								  Font.PLAIN, onethree));
		lblSolar.setBounds(
															   eightfourfive, twoninezero,
															   fivezerozero, threezero);
		lblSolar.setHorizontalAlignment(SwingConstants.LEFT);
		frame.getContentPane().add(lblSolar);

															   JTextField numberSolarPanels = new JTextField();
		numberSolarPanels.setBounds(
															   eightfourfive, threeonenine,
															   onethreezero, onezerozero);
		frame.getContentPane().add(numberSolarPanels);

															   JButton btnNoSolar = new JButton("Solar Panels");
		btnNoSolar.setForeground(Color.WHITE);
		btnNoSolar.setFont(new Font(
				"Arial Black", Font.PLAIN, onethree));
		btnNoSolar.setBackground(new Color(onezerotwo,
										   twozerofour, onefivethree));
		btnNoSolar.setBounds(
															   nineeightzero,
															   threefivezero, oneeightfive, fourzero);
		btnNoSolar.addActionListener(new ActionListener() {
																   public void actionPerformed(final ActionEvent arg0) {
																	   try {

																		   double entry = Double.parseDouble(numberSolarPanels.getText());
																		   if(entry > 1000 || entry <=0 )
																		   {
																			   JOptionPane.showMessageDialog(null, "Please enter a valid number between 0 and 1000", "User Entry Error", JOptionPane.ERROR_MESSAGE);
																			   numberSolarPanels.setText(null);
																		   } else {
																			   UpdatingLabels.updateEverythingTextField(userIn, clientIn, entry, lblTotalCO2, lblCO2Saved, lblLeaderboardContent, lblMotivation, lblLevel,imgMotivation, imgAchievementSix, imgAchievementSeven,"Solar");
																			   numberSolarPanels.setText(null);
																		   }
																	   } catch (NumberFormatException e) {
																		   JOptionPane.showMessageDialog(null, "Please enter a valid number between 0 and 1000", "User Entry Error", JOptionPane.ERROR_MESSAGE);

																		   numberSolarPanels.setText(null);
																	   } catch (Exception e) {
																		   JOptionPane.showMessageDialog(
																				   null,
																				   "An unexpected error occured, we are sorry",
																				   "User Entry Error",
																				   JOptionPane.ERROR_MESSAGE);
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
		mntmLogOut.setFont(new Font(
				"Arial Black", Font.PLAIN, onethree));
		mntmLogOut.setBackground(
				new Color(twozerofour, twofivefive,
						  twofivefive));
		mntmLogOut.addActionListener(new ActionListener() {
																   public void actionPerformed(final ActionEvent arg0) {
																	   if (JOptionPane.showConfirmDialog(
																			   frame,
																			   "Confirm if you want to exit",
																			   "Log out",
																			   JOptionPane.YES_NO_OPTION)
																			   == JOptionPane.YES_NO_OPTION) {
																		   Login_S.main(null);
																		   frame.setVisible(false);
																	   }
																   }
															   });

															   // Creates the "My Profile" in menu-bar
															   JMenuItem mntmMyProfile = new JMenuItem("My Profile");
		mntmMyProfile.setForeground(Color.DARK_GRAY);
		mntmMyProfile.setBackground(
				new Color(0, twozerofour, twozerofour));
		mntmMyProfile.setFont(new Font(
				"Arial Black", Font.PLAIN, onethree));
		mntmMyProfile.addActionListener(new ActionListener() {
																   public void actionPerformed(final ActionEvent arg0) {
																	   MyProfile.application(
																			   userIn, clientIn, username,
																			   friendClient, frame);
																	   setUsername(userIn.getUser_name());
																	   lblWelcome.setText("Welcome "
																			   + userIn.getUser_name());
																	   System.out.println(userIn.getUser_name());
																   }
															   });
		menuBar.add(mntmMyProfile);

															   // Creates the "My Friends" in menu-bar
															   JMenuItem mntmMyFriends = new JMenuItem("My Friends");
		mntmMyFriends.setForeground(Color.DARK_GRAY);
		mntmMyFriends.setBackground(new Color
																	   (0, twofivefive, twozerofour));
		mntmMyFriends.setFont(new Font(
				"Arial Black", Font.PLAIN, onethree));
		mntmMyFriends.addActionListener(new ActionListener() {
																   public void actionPerformed(final ActionEvent arg0) {

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
						public static void setUsername(final String usernameIn) {
							username = usernameIn;
						}

						/**
						 * Get Points.
						 * @return points
						 */
						public static int getPoints() {
							return points;
						}

						/**
						 * Set Points.
						 * @param points the points
						 */
						public static void setPoints(final int points) {
							GUI_App.points = points;
						}

						/**
						 * Get Level.
						 * @return the level
						 */
						public static int getLevel() {
							return level;
						}

						/**
						 * Set Level.
						 * @param level the level
						 */
						public static void setLevel(final int level) {
							GUI_App.level = level;
						}

						/**
						 * Get Pointsmissing.
						 * @return points
						 */
						public static int getPointsmissing() {
							return pointsmissing;
						}

						/**
						 * Set Pointsmissing.
						 * @param pointsmissing the pointsmissing
						 */
						public static void setPointsmissing(final int pointsmissing) {
							GUI_App.pointsmissing = pointsmissing;
						}
					}
