package GUI_mainscreen;

import entity.User;
import entity.Friend;
import entity.LeaderBoardEntry;
import service.FriendServiceImpl;
import service.UserServiceImpl;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

/**
 * The type Add friend.
 */
public class AddFriend {

	private static JFrame frame3;
	private static JTextField txtUsername;
	private static JLabel labelAdd3;
	private static JLabel labelAdd2;
	private static JLabel labelAdd1;
	private static JButton btnAdd3;
	private static JButton btnAdd2;
	private static JButton btnAdd1;

	private AddFriend(User userIn, UserServiceImpl clientIn) {
		initialize(userIn, clientIn);
	}

	/**
	 * Application.
	 *
	 * @param userIn   the user in
	 * @param clientIn the client in
	 */
	public static void application(User userIn, UserServiceImpl clientIn) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddFriend window = new AddFriend(userIn, clientIn);
					AddFriend.frame3.setVisible(true);
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
	public static void initialize(User userIn, UserServiceImpl clientIn) {

		frame3 = new JFrame();
		frame3.setBounds(300, 300, 300, 300);
		frame3.getContentPane().setLayout(null);

		JLabel lblAddFriend = new JLabel("Add Friend");
		lblAddFriend.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddFriend.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblAddFriend.setBounds(10, 20, 266, 31);
		frame3.getContentPane().add(lblAddFriend);

		JSeparator separator = new JSeparator();
		separator.setBounds(20, 49, 256, 2);
		frame3.getContentPane().add(separator);

		txtUsername = new JTextField();
		txtUsername.setBounds(122, 71, 118, 19);
		frame3.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);

		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblUsername.setBounds(30, 74, 82, 13);
		frame3.getContentPane().add(lblUsername);

		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(155, 100, 85, 21);
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Get the filled in username
				String lookup = txtUsername.getText();

				// All the names
				List<User> test = new ArrayList<>();
				test.addAll(clientIn.getAllUsers());
				List<User> result = new ArrayList<>();
				int count = 0;
				
				
				// Look up the name				
				for(int i = 0; i<test.size(); i++) {
					if (test.get(i).getUser_name().contains(lookup)) {
						result.add(test.get(i));
						count++;
						System.out.print(count);
					}
				}
				
				if (count >= 3) {
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
				}
				else if (count == 2) {
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
				}
				else if (count == 1) {
					// Update the labels
					labelAdd1.setText(result.get(0).getUser_name());
					
					// Set the buttons visible
					labelAdd1.setVisible(true);
					btnAdd1.setVisible(true);
					
					labelAdd2.setVisible(false);
					labelAdd3.setVisible(false);				
					btnAdd2.setVisible(false);
					btnAdd3.setVisible(false);
				}
				else {
					labelAdd1.setText("No users found");
					labelAdd1.setVisible(true);
					labelAdd2.setVisible(false);
					labelAdd3.setVisible(false);
					btnAdd1.setVisible(false);
					btnAdd2.setVisible(false);
					btnAdd3.setVisible(false);
					
				}
				
			}
		});
		frame3.getContentPane().add(btnSearch);

		JLabel lblResults = new JLabel("Results");
		lblResults.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblResults.setBounds(30, 144, 85, 19);
		frame3.getContentPane().add(lblResults);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(20, 131, 256, 2);
		frame3.getContentPane().add(separator_1);

		frame3.setFocusable(true);

		btnAdd1 = new JButton("Add");
		btnAdd1.setBounds(191, 175, 85, 21);
		btnAdd1.setVisible(false);
		frame3.getContentPane().add(btnAdd1);

		labelAdd1 = new JLabel("<name>");
		labelAdd1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		labelAdd1.setBounds(30, 175, 130, 19);
		labelAdd1.setVisible(false);
		frame3.getContentPane().add(labelAdd1);

		btnAdd2 = new JButton("Add");
		btnAdd2.setBounds(191, 200, 85, 21);
		btnAdd2.setVisible(false);
		frame3.getContentPane().add(btnAdd2);

		labelAdd2 = new JLabel("<name>");
		labelAdd2.setFont(new Font("Arial Black", Font.PLAIN, 12));
		labelAdd2.setBounds(30, 200, 130, 19);
		labelAdd2.setVisible(false);
		frame3.getContentPane().add(labelAdd2);

		btnAdd3 = new JButton("Add");
		btnAdd3.setBounds(191, 225, 85, 21);
		btnAdd3.setVisible(false);
		frame3.getContentPane().add(btnAdd3);

		labelAdd3 = new JLabel("<name>");
		labelAdd3.setFont(new Font("Arial Black", Font.PLAIN, 12));
		labelAdd3.setBounds(30, 225, 130, 19);
		labelAdd3.setVisible(false);
		frame3.getContentPane().add(labelAdd3);

	}

}