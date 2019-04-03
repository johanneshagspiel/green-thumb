package GUI_mainscreen;

import GUI.GUI_App;
import entity.User;
import helper.SortLength;
import helper.SortUsername;
import entity.Friend;
import service.FriendServiceImpl;
import service.UserServiceImpl;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * The type Add friend.
 */
public class AddFriend {
/** Initialise the frame. */
	private static JFrame frame3;
	/** Initialise the txtUsername. */
	private static JTextField txtUsername;
	/** Initialise the labelAdd3. */
	private static JLabel labelAdd3;
	/** Initialise the labelAdd2. */
	private static JLabel labelAdd2;
	/** Initialise the labelAdd1. */
	private static JLabel labelAdd1;
	/** Initialise the btnAdd3. */
	private static JButton btnAdd3;
	/** Initialise the btnAdd2. */
	private static JButton btnAdd2;
	/** Initialise the btnAdd1. */
	private static JButton btnAdd1;

	/**
	 * Add friend.
	 * @param userIn the user
	 * @param clientIn the client
	 * @param frameIn the frame
	 */
	private AddFriend(final User userIn,
					  final UserServiceImpl clientIn,
					  final JFrame frameIn) {
		initialize(userIn, clientIn, frameIn);
	}

	/**
	 * Application.
	 * @param frameIn  the frame in
	 * @param userIn   the user in
	 * @param clientIn the client in
	 */
	public static void application(final User userIn,
								   final UserServiceImpl clientIn,
								   final JFrame frameIn) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddFriend window = new AddFriend(userIn,
							clientIn, frameIn);
					AddFriend.frame3.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Initialize.
	 * @param frameIn  the frame in
	 * @param userIn   the user in
	 * @param clientIn the client in
	 */
	public static void initialize(final User userIn,
								  final UserServiceImpl clientIn,
								  final JFrame frameIn) {
		final int threezerozero = 300;
		final int onezero = 10;
		final int onesix = 16;
		final int twozero = 20;
		final int twosixsix = 266;
		final int threeone = 31;
		final int fournine = 49;
		final int twofivesix = 256;
		final int two = 2;
		final int onetwotwo = 122;
		final int sevenone = 71;
		final int oneoneeight = 118;
		final int onenine = 19;
		final int onetwo = 12;
		final int threezero = 30;
		final int sevenfour = 74;
		final int eighttwo = 82;
		final int onethree = 13;
		final int onefivefive = 155;
		final int eightfive = 85;
		final int twoone = 21;
		final int onezerozero = 100;
		final int three = 3;
		final int one = 1;
		final int onethreezero = 130;
		final int twozerozero = 200;
		final int onefourfour = 144;
		final int onethreeone = 131;
		final int onenineone = 191;
		final int onesevenfive = 175;
		final int twotwofive = 225;
		frame3 = new JFrame();
		frame3.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		frame3.setBounds(300, 300, 300, 300);
		frame3.getContentPane().setLayout(null);

		JLabel lblAddFriend = new JLabel("Add Friend");
		lblAddFriend.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddFriend.setFont(new Font("Arial Black", Font.PLAIN, 18));
		lblAddFriend.setBounds(20, 13, 250, 31);
		frame3.getContentPane().add(lblAddFriend);

		JSeparator separator = new JSeparator();
		separator.setBounds(twozero, fournine, twofivesix, two);
		frame3.getContentPane().add(separator);

		txtUsername = new JTextField();
		txtUsername.setBounds(122, 64, 154, 26);
		frame3.getContentPane().add(txtUsername);
		txtUsername.setColumns(onezero);

		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Arial Black",
				Font.PLAIN, onetwo));
		lblUsername.setBounds(threezero, sevenfour, eighttwo, onethree);
		frame3.getContentPane().add(lblUsername);

		JButton btnSearch = new JButton("Search");
		btnSearch.setForeground(Color.WHITE);
		btnSearch.setFont(new Font("Arial Black", Font.PLAIN, 13));
		btnSearch.setBackground(new Color(102, 204, 153));
		btnSearch.setBounds(161, 98, 115, 26);
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Get the filled in username
				String lookup = txtUsername.getText();

				if (lookup.equals(userIn.getUser_name())) {
					JOptionPane.showMessageDialog(null,
							"You can not add yourself as a friend",
							"Adding Friend Error",
							JOptionPane.ERROR_MESSAGE);
					txtUsername.setText(null);
				} else {

					// All the names
					List<User> test = new ArrayList<>();
					test.addAll(clientIn.getAllUsers());
					List<User> result = new ArrayList<>();
					int count = 0;

					List<Friend> friendList = userIn.getFriendlist();
					String noFriend = "";

					// Look up the name among existing friends
					for (int j = 0; j < userIn.
							getFriendlist().size(); j++) {
						if (lookup.equals(friendList.get(j).
								getFriend_name())) {
							noFriend = friendList.get(j).
									getFriend_name();
							System.out.println(noFriend);
						}
					}

					// Look up the name
					for (int i = 0; i < test.size(); i++) {
						if (test.get(i).getUser_name().contains(lookup)
								& (!test.get(i).getUser_name().
								equals(userIn.getUser_name()))
								& !test.get(i).getUser_name().
								equals(noFriend)) {
							result.add(test.get(i));
							count++;
							System.out.print(count);
						}
					}
					
					Collections.sort(result, new SortUsername());
					Collections.sort(result, new SortLength());

					System.out.println(userIn.getUser_name());

					if (count >= three) {
						// Update the labels
						labelAdd3.setText(result.get(2).getUser_name());
						labelAdd2.setText(result.get(1).getUser_name());
						labelAdd1.setText(result.get(0).getUser_name());

						// Set the buttons visible
						labelAdd3.setVisible(true);
						btnAdd3.setVisible(true);
						labelAdd2.setVisible(true);
						btnAdd2.setVisible(true);
						labelAdd1.setVisible(true);
						btnAdd1.setVisible(true);
					} else if (count == two) {
						// Update the labels
						labelAdd2.setText(result.get(1).getUser_name());
						labelAdd1.setText(result.get(0).getUser_name());

						// Set the buttons visible
						labelAdd2.setVisible(true);
						btnAdd2.setVisible(true);
						labelAdd1.setVisible(true);
						btnAdd1.setVisible(true);

						labelAdd3.setVisible(false);
						btnAdd3.setVisible(false);
					} else if (count == one) {
						// Update the labels
						labelAdd1.setText(result.get(0).getUser_name());

						// Set the buttons visible
						labelAdd1.setVisible(true);
						btnAdd1.setVisible(true);

						labelAdd2.setVisible(false);
						labelAdd3.setVisible(false);
						btnAdd2.setVisible(false);
						btnAdd3.setVisible(false);
					} else {
						labelAdd1.setText("No users found");
						labelAdd1.setVisible(true);
						labelAdd2.setVisible(false);
						labelAdd3.setVisible(false);
						btnAdd1.setVisible(false);
						btnAdd2.setVisible(false);
						btnAdd3.setVisible(false);

					}
				}

			}
		});
		frame3.getContentPane().add(btnSearch);

		JLabel lblResults = new JLabel("Results");
		lblResults.setFont(new Font("Arial Black",
				Font.PLAIN, onethree));
		lblResults.setBounds(threezero, onefourfour, eightfive, onenine);
		frame3.getContentPane().add(lblResults);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(twozero, onethreeone,
				twofivesix, two);
		frame3.getContentPane().add(separator_1);

		frame3.setFocusable(true);

		btnAdd1 = new JButton("Add");
		btnAdd1.setBackground(new Color(0, 255, 127));
		btnAdd1.setForeground(Color.WHITE);
		btnAdd1.setFont(new Font("Arial Black", Font.PLAIN, 13));
		btnAdd1.setBounds(191, 175, 85, 21);
		btnAdd1.setVisible(false);
		btnAdd1.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				// Create a new friend
				Friend temp = new Friend();
				temp.setUser_name_entry(userIn.getUser_name());
				temp.setFriend_name(labelAdd1.getText());
				FriendServiceImpl client
						= new FriendServiceImpl();
				client.createFriend(temp);

				// Update the screen
				frameIn.setVisible(false);
				GUI_App.application(userIn.getUser_name(),
						userIn, clientIn);
				frame3.setVisible(false);
			}
		});
		frame3.getContentPane().add(btnAdd1);

		labelAdd1 = new JLabel("<name>");
		labelAdd1.setFont(new Font("Arial Black",
				Font.PLAIN, onetwo));
		labelAdd1.setBounds(threezero, onesevenfive,
				onethreezero, onenine);
		labelAdd1.setVisible(false);
		frame3.getContentPane().add(labelAdd1);

		btnAdd2 = new JButton("Add");
		btnAdd2.setForeground(Color.WHITE);
		btnAdd2.setFont(new Font("Arial Black", Font.PLAIN, 13));
		btnAdd2.setBackground(new Color(0, 255, 127));
		btnAdd2.setBounds(191, 200, 85, 21);
		btnAdd2.setVisible(false);
		btnAdd2.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				// Create a new friend
				Friend temp = new Friend();
				temp.setUser_name_entry(userIn.
						getUser_name());
				temp.setFriend_name(labelAdd2.
						getText());
				FriendServiceImpl client
						= new FriendServiceImpl();
				client.createFriend(temp);

				// Update the screen
				frameIn.setVisible(false);
				GUI_App.application(userIn.getUser_name(),
						userIn, clientIn);
				frame3.setVisible(false);
			}
		});
		frame3.getContentPane().add(btnAdd2);

		labelAdd2 = new JLabel("<name>");
		labelAdd2.setFont(new Font("Arial Black",
				Font.PLAIN, onetwo));
		labelAdd2.setBounds(threezero, twozerozero,
				onethreezero, onenine);
		labelAdd2.setVisible(false);
		frame3.getContentPane().add(labelAdd2);

		btnAdd3 = new JButton("Add");
		btnAdd3.setForeground(Color.WHITE);
		btnAdd3.setFont(new Font("Arial Black", Font.PLAIN, 13));
		btnAdd3.setBackground(new Color(0, 255, 127));
		btnAdd3.setBounds(191, 225, 85, 21);
		btnAdd3.setVisible(false);
		btnAdd3.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				// Create a new friend
				Friend temp = new Friend();
				temp.setUser_name_entry(userIn.getUser_name());
				temp.setFriend_name(labelAdd3.getText());
				FriendServiceImpl client = new FriendServiceImpl();
				client.createFriend(temp);

				// Update the screen
				frameIn.setVisible(false);
				GUI_App.application(userIn.getUser_name(),
						userIn, clientIn);
				frame3.setVisible(false);
			}
		});
		frame3.getContentPane().add(btnAdd3);

		labelAdd3 = new JLabel("<name>");
		labelAdd3.setFont(new Font("Arial Black",
				Font.PLAIN, onetwo));
		labelAdd3.setBounds(threezero, twotwofive,
				onethreezero, onenine);
		labelAdd3.setVisible(false);
		frame3.getContentPane().add(labelAdd3);

	}

}