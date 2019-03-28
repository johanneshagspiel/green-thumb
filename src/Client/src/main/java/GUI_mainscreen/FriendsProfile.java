package GUI_mainscreen;


import entity.User;
import service.UserServiceImpl;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The type Friends profile.
 */
public class FriendsProfile {

    private static JFrame frame2;

    private FriendsProfile(User userIn, UserServiceImpl clientIn) {
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
                    FriendsProfile window = new FriendsProfile(userIn, clientIn);
                    FriendsProfile.frame2.setVisible(true);
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

        frame2 = new JFrame();
        frame2.setBounds(300, 500, 300, 500);
        frame2.getContentPane().setLayout(null);
        frame2.setFocusable(true);

		// Labels
		JLabel lblWelcome = new JLabel("My Friends");
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
		int count = 0;

		for (int j = 0; j < friends_x && count < userIn.getFriendlist().size(); j++) {
			for (int i = 0; i < friends_y && count < userIn.getFriendlist().size(); i++) {
				
				//JOHANNES put here something that retrieves the information and than moves on to the next one
				//TODO
				String test = userIn.getFriendlist().get(count).getFriend_name();
				User friendUser = clientIn.getUser2(userIn.getFriendlist().get(count).getFriend_name());
				//Making every label
				JButton Friend = new JButton(test);
                Friend.setBounds((10+i*142), (59+j*37), length, with);
				frame2.getContentPane().add(Friend);
				count++;
                Friend.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent arg0) {
                        MyProfile.application(friendUser, clientIn, test);
                    }
                });
			}
		}

    }
}