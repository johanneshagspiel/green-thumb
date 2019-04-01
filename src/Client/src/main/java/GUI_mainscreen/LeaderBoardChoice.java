package GUI_mainscreen;


import entity.LeaderBoardEntry;
import entity.User;
import service.UserServiceImpl;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import static GUI.GUI_App.setLabel;

/**
 * The type My profile.
 */
public class LeaderBoardChoice {
/** Initialising the frame. */
    private static JFrame frame2;

    /**
     * The Leaderboard.
     * @param lblLeaderboardContent the content
     * @param lblLeaderboard the leaderboard
     * @param userIn the user
     */
    private LeaderBoardChoice(final JLabel lblLeaderboardContent,
                              final JLabel lblLeaderboard, final User userIn) {
        initialize(lblLeaderboardContent, lblLeaderboard, userIn);
    }

    /**
     * The application.
     * @param lblLeaderboardContent the content
     * @param lblLeaderboard the leaderboard
     * @param userIn the user
     */
    public static void application(final JLabel lblLeaderboardContent,
                                   final JLabel lblLeaderboard,
                                   final User userIn) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LeaderBoardChoice window
                            = new LeaderBoardChoice(lblLeaderboardContent,
                            lblLeaderboard, userIn);
                    LeaderBoardChoice.frame2.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Initialising.
     * @param lblLeaderboardContent the content
     * @param lblLeaderboard the leaderboard
     * @param userIn the user
     */
    public static void initialize(final JLabel lblLeaderboardContent,
                                  final JLabel lblLeaderboard, final User userIn) {
        final int threezerozero = 300;
        final int fivezerozero = 500;
        final int onezero = 10;
        final int twosixsix = 266;
        final int twozero = 20;
        final int fivezero = 50;
        final int sevenfive = 75;
        final int onezerozero = 100;
        final int onetwofive = 125;
        final int onefivezero = 150;
        final int onesevenfive = 175;
        final int twozerozero = 200;
        final int twotwofive = 225;
        final int twofivezero = 250;

        frame2 = new JFrame();
        frame2.setBounds(threezerozero, fivezerozero,
                threezerozero, fivezerozero);
        frame2.getContentPane().setLayout(null);
        frame2.setFocusable(true);

        JLabel lblWelcome
                = new JLabel("What do you want to depict?");
        lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
        lblWelcome.setBounds(onezero, onezero,
                twosixsix, twozero);
        frame2.getContentPane().add(lblWelcome);

        JButton lblVegetarian
                = new JButton("Vegetarian Score");
        lblVegetarian.setHorizontalAlignment(SwingConstants.CENTER);
        lblVegetarian.setBounds(onezero,
                fivezero, twosixsix, twozero);
        lblVegetarian.addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent arg0) {
                String label
                        = lblVegetarian.getText();
                setLabel(label);
                lblLeaderboardContent.
                        setText(LeaderBoardEntry.
                                createLeaderboard(userIn, label));
                lblLeaderboard.setText("Leaderboard Top 10 Vegetarian Score");
                frame2.setVisible(false);
            }
        });
        frame2.getContentPane().add(lblVegetarian);

        JButton lblProduce = new JButton("Produce Score");
        lblProduce.setHorizontalAlignment(SwingConstants.CENTER);
        lblProduce.setBounds(onezero, sevenfive,
                twosixsix, twozero);
        lblProduce.addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent arg0) {
                String label = lblProduce.getText();
                setLabel(label);
                lblLeaderboardContent.setText(LeaderBoardEntry.
                        createLeaderboard(userIn, label));
                lblLeaderboard.setText("Leaderboard Top 10 Produce Score");
                frame2.setVisible(false);
            }
        });
        frame2.getContentPane().add(lblProduce);

        JButton lblCar = new JButton("Car Score");
        lblCar.setHorizontalAlignment(SwingConstants.CENTER);
        lblCar.setBounds(onezero, onezerozero, twosixsix, twozero);
        lblCar.addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent arg0) {
                String label = lblCar.getText();
                setLabel(label);
                lblLeaderboardContent.setText(LeaderBoardEntry.
                        createLeaderboard(userIn, label));
                lblLeaderboard.setText("Leaderboard Top 10 Car Score");
                frame2.setVisible(false);
            }
        });
        frame2.getContentPane().add(lblCar);

        JButton lblPublic_transportation
                = new JButton("Public Transportation Score");
        lblPublic_transportation.
                setHorizontalAlignment(SwingConstants.CENTER);
        lblPublic_transportation.
                setBounds(onezero, onetwofive, twosixsix, twozero);
        lblPublic_transportation.
                addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent arg0) {
                String label = lblPublic_transportation.getText();
                setLabel(label);
                lblLeaderboardContent.setText(LeaderBoardEntry.
                        createLeaderboard(userIn, label));
                lblLeaderboard.setText("Top 10 Public Transportation Score");
                frame2.setVisible(false);
            }
        });
        frame2.getContentPane().add(lblPublic_transportation);

        JButton lblBike = new JButton("Bike Score");
        lblBike.setHorizontalAlignment(SwingConstants.CENTER);
        lblBike.setBounds(onezero, onefivezero, twosixsix, twozero);
        lblBike.addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent arg0) {
                String label = lblBike.getText();
                setLabel(label);
                lblLeaderboardContent.setText(LeaderBoardEntry.
                        createLeaderboard(userIn, label));
                lblLeaderboard.setText("Leaderboard Top 10 Bike Score");
                frame2.setVisible(false);
            }
        });
        frame2.getContentPane().add(lblBike);

        JButton lblTemperature = new JButton("Temperature Score");
        lblTemperature.setHorizontalAlignment(SwingConstants.CENTER);
        lblTemperature.setBounds(onezero, onesevenfive,
                twosixsix, twozero);
        lblTemperature.addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent arg0) {
                String label = lblTemperature.getText();
                setLabel(label);
                lblLeaderboardContent.setText(LeaderBoardEntry.
                        createLeaderboard(userIn, label));
                lblLeaderboard.setText("Leaderboard Top 10 Temperature Score");
                frame2.setVisible(false);
            }
        });
        frame2.getContentPane().add(lblTemperature);

        JButton lblSolar = new JButton("Solar Score");
        lblSolar.setHorizontalAlignment(SwingConstants.CENTER);
        lblSolar.setBounds(onezero, twozerozero,
                twosixsix, twozero);
        lblSolar.addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent arg0) {
                String label = lblSolar.getText();
                setLabel(label);
                lblLeaderboardContent.setText(LeaderBoardEntry.
                        createLeaderboard(userIn, label));
                lblLeaderboard.setText("Leaderboard Top 10 Solar Score");
                frame2.setVisible(false);
            }
        });
        frame2.getContentPane().add(lblSolar);

        JButton lblSaved = new JButton("Overall CO2 Saved");
        lblSaved.setHorizontalAlignment(SwingConstants.CENTER);
        lblSaved.setBounds(onezero, twotwofive,
                twosixsix, twozero);
        lblSaved.addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent arg0) {
                String label = lblSaved.getText();
                setLabel(label);
                lblLeaderboardContent.setText(LeaderBoardEntry.
                        createLeaderboard(userIn, label));
                lblLeaderboard.setText("Leaderboard Top 10 CO2 Saved Score");
                frame2.setVisible(false);
            }
        });
        frame2.getContentPane().add(lblSaved);

        JButton lblOverall = new JButton("Overall Score");
        lblOverall.setHorizontalAlignment(SwingConstants.CENTER);
        lblOverall.setBounds(onezero, twofivezero,
                twosixsix, twozero);
        lblOverall.addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent arg0) {
                String label = lblOverall.getText();
                setLabel(label);
                lblLeaderboardContent.setText(LeaderBoardEntry.
                        createLeaderboard(userIn, label));
                lblLeaderboard.setText("Leaderboard Top 10 CO2 Used");
                frame2.setVisible(false);
            }
        });
        frame2.getContentPane().add(lblOverall);
    }
}
