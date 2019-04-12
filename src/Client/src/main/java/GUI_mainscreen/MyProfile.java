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
/**The type My profile. */
public class MyProfile {
    /** Initialising the frame. */
    private static JFrame frame2;
    /**
     * Initialising my profile.
     * @param userIn the userIn
     * @param clientIn the clientIn
     * @param clientFriend the clientFriend
     * @param frameIn the frameIn
     */
    private MyProfile(final User userIn,
                      final UserServiceImpl clientIn,
                      final FriendServiceImpl clientFriend,
                      final JFrame frameIn) {
        initialize(userIn, clientIn, clientFriend, frameIn);
    }

    /**
     * The Application.
     * @param userIn the userIn
     * @param clientIn the clientIn
     * @param username the username
     * @param clientFriend the clientFriend
     * @param frameIn the frameIn
     */
    public static void application(
            final User userIn,
            final UserServiceImpl clientIn,
            final String username,
            final FriendServiceImpl clientFriend,
            final JFrame frameIn) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MyProfile window = new MyProfile(userIn,
                            clientIn, clientFriend,
                            frameIn);
                    MyProfile.frame2.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Initialise.
     * @param userIn the User in
     * @param clientIn the clientIn
     * @param clientFriend the clientFriend
     * @param frameIn the frame
     */
    public static void initialize(
            final User userIn,
            final UserServiceImpl clientIn,
            final FriendServiceImpl clientFriend,
            final JFrame frameIn) {

        final int onezerozero = 100;
        final int twosixsix = 266;
        final int sevenfive = 75;
        final int fivezerozero = 500;
        final int twofivefive = 255;
        final int onetwoseven = 127;
        final int threezerozero = 300;
        final int onezero = 10;
        final int twozero = 20;
        final int onethree = 13;
        final int twozerozero = 200;
        final int onefive = 15;
        final int twosixzero = 260;
        final int onesixzero = 160;
        final int threethreeseven = 337;
        final int fourthree = 43;
        final int twoseven = 27;
        final int twotwozero = 220;
        final int twofourzero = 240;
        final int onetwozero = 120;
        final int onefourzero = 140;
        final int oneeightzero = 180;

        frame2 = new JFrame();
        frame2.getContentPane().setBackground(SystemColor.
                inactiveCaptionBorder);
        frame2.setBounds(threezerozero, fivezerozero, threezerozero,
                threethreeseven);
        frame2.getContentPane().setLayout(null);
        frame2.setFocusable(true);

        // Labels
        JLabel lblWelcome = new JLabel("Welcome back "
                + userIn.getUser_name());
        lblWelcome.setFont(new Font("Arial Black",
                Font.PLAIN, onefive));
        lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
        lblWelcome.setBounds(onezero, onezero, twosixsix, twoseven);
        frame2.getContentPane().add(lblWelcome);

        JButton changeUserName = new JButton("Change Username");
        changeUserName.setBackground(new Color(0,
                twofivefive, onetwoseven));
        changeUserName.setForeground(Color.WHITE);
        changeUserName.setFont(new Font("Arial Black",
                Font.PLAIN, onethree));
        changeUserName.setHorizontalAlignment(SwingConstants.CENTER);
        changeUserName.setBounds(onezero, fourthree, twosixsix, twoseven);
        frame2.getContentPane().add(changeUserName);
        changeUserName.addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent arg0) {
                Update.application(userIn,
                        clientIn,
                        userIn.getUser_name(),
                        clientFriend,
                        frameIn);
            }
        });

        JButton changePassword = new JButton("Change Password");
        changePassword.setFont(new Font("Arial Black",
                Font.PLAIN, onethree));
        changePassword.setForeground(Color.WHITE);
        changePassword.setBackground(new Color(0, twofivefive, onetwoseven));
        changePassword.setHorizontalAlignment(SwingConstants.CENTER);
        changePassword.setBounds(onezero, sevenfive, twosixsix, twoseven);
        frame2.getContentPane().add(changePassword);
        changePassword.addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent arg0) {
                Update.application(userIn, clientIn,
                        userIn.getPassword(),
                        clientFriend, frameIn);
            }
        });

        JLabel lblVegetarian = new JLabel("Vegetarian Score:"
                + userIn.getVegetarian());
        lblVegetarian.setHorizontalAlignment(SwingConstants.LEFT);
        lblVegetarian.setBounds(onezero, onezerozero, twosixsix, twozero);
        frame2.getContentPane().add(lblVegetarian);

        JLabel lblProduce = new JLabel("Produce Score: "
                + userIn.getProduce());
        lblProduce.setHorizontalAlignment(SwingConstants.LEFT);
        lblProduce.setBounds(onezero, onetwozero, twosixsix, twozero);
        frame2.getContentPane().add(lblProduce);

        JLabel lblCar = new JLabel("Car Score: "
                + userIn.getCar());
        lblCar.setHorizontalAlignment(SwingConstants.LEFT);
        lblCar.setBounds(onezero, onefourzero, twosixsix, twozero);
        frame2.getContentPane().add(lblCar);

        JLabel lblPublic_transportation
                = new JLabel("Public Transportation Score: "
                + userIn.getPublic_transportation());
        lblPublic_transportation.
                setHorizontalAlignment(SwingConstants.LEFT);
        lblPublic_transportation.
                setBounds(onezero, onesixzero, twosixsix, twozero);
        frame2.getContentPane().add(lblPublic_transportation);

        JLabel lblBike = new JLabel("Bike Score: "
                + userIn.getBike());
        lblBike.setHorizontalAlignment(SwingConstants.LEFT);
        lblBike.setBounds(onezero, oneeightzero, twosixsix, twozero);
        frame2.getContentPane().add(lblBike);

        JLabel lblTemperature = new JLabel("Temperature Score: "
                + userIn.getTemperature());
        lblTemperature.setHorizontalAlignment(SwingConstants.LEFT);
        lblTemperature.setBounds(onezero, twozerozero, twosixsix, twozero);
        frame2.getContentPane().add(lblTemperature);

        JLabel lblSolar = new JLabel("Solar Score: "
                + userIn.getSolar());
        lblSolar.setHorizontalAlignment(SwingConstants.LEFT);
        lblSolar.setBounds(onezero, twotwozero, twosixsix, twozero);
        frame2.getContentPane().add(lblSolar);

        JLabel lblSaved = new JLabel("Overall CO2 Saved: "
                + userIn.getTotal_saved());
        lblSaved.setHorizontalAlignment(SwingConstants.LEFT);
        lblSaved.setBounds(onezero, twofourzero, twosixsix, twozero);
        frame2.getContentPane().add(lblSaved);

        JLabel lblOverall = new JLabel("Overall Score: "
                + userIn.getTotal());
        lblOverall.setHorizontalAlignment(SwingConstants.LEFT);
        lblOverall.setBounds(onezero, twosixzero, twosixsix, twozero);
        frame2.getContentPane().add(lblOverall);
    }
}
