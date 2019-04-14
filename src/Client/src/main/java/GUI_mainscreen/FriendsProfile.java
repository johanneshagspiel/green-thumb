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
    /** Initialises the frame. */

    private static JFrame frame2;

    /**
     * Gets FriendsProfile.
     * @param userIn the user in
     * @param clientIn the client in
     */
    private FriendsProfile(final User userIn, final UserServiceImpl clientIn) {
        initialize(userIn, clientIn);
    }

    /**
     * Application.
     *
     * @param userIn   the user in
     * @param clientIn the client in
     */
    public static void application(final User userIn,
                                   final UserServiceImpl clientIn) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    FriendsProfile window
                            = new FriendsProfile(userIn, clientIn);
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
    public static void initialize(final User userIn,
                                  final UserServiceImpl clientIn) {
        final int twosixsix = 266;
        final int fivenine = 59;
        final int threeseven = 37;
        final int fivezerozero = 500;
        final int twoeight = 28;
        final int threezerozero = 300;
        final int onezero = 10;
        final int twozero = 20;
        final int two = 2;
        final int onefourtwo = 142;
        final int oneeight = 18;
        final int onetwofour = 124;
        final int onesix = 16;

        frame2 = new JFrame();
        frame2.getContentPane().setBackground(
                SystemColor.inactiveCaptionBorder);
        frame2.setBounds(threezerozero, fivezerozero,
                threezerozero, fivezerozero);
        frame2.getContentPane().setLayout(null);
        frame2.setFocusable(true);
		// Labels
		JLabel lblWelcome = new JLabel("Profiles of friends");
		lblWelcome.setFont(new Font("Arial Black",
                Font.PLAIN, oneeight));
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcome.setBounds(onezero,
                onezero, twosixsix, twozero);
		frame2.getContentPane().add(lblWelcome);
		// Creating a friend list
		final int length = onetwofour;
		final int with = twoeight;
		final int friends_x = onesix;
		final int friends_y = two;
		int count = 0;

		for (int j = 0; j < friends_x && count
                < userIn.getFriendlist().size(); j++) {
			for (int i = 0; i < friends_y && count
                    < userIn.getFriendlist().size(); i++) {
				//JOHANNES put here something that retrieves
                // the information and than moves on to the next one
				//TODO
				String test = userIn.getFriendlist()
                        .get(count).getFriend_name();
				User friendUser
                        = clientIn.
                        getUser2(userIn.getFriendlist().
                        get(count).getFriend_name());
				//Making every label
				JButton Friend = new JButton(test);
                Friend.setBounds((onezero + i * onefourtwo),
                        (fivenine + j * threeseven), length, with);
				frame2.getContentPane().add(Friend);
				count++;
                Friend.addActionListener(new ActionListener() {
                    public void actionPerformed(final ActionEvent arg0) {
                        MyProfile2.application(friendUser, clientIn, test);
                    }
                });
			}
		}

    }
}
