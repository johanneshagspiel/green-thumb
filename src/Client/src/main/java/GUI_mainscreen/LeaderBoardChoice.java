package GUI_mainscreen;


import entity.LeaderBoardEntry;
import entity.User;

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
     * @param lblleaderBoardContent the content
     * @param lblLeaderboard the leaderboard
     * @param userIn the user
     */
    private LeaderBoardChoice(final JLabel lblleaderBoardContent,
                              final JLabel lblLeaderboard, final User userIn) {
        initialize(lblleaderBoardContent, lblLeaderboard, userIn);
    }

    /**
     * The application.
     * @param lblleaderBoardContent the content
     * @param lblLeaderboard the leaderboard
     * @param userIn the user
     */
    public static void application(final JLabel lblleaderBoardContent,
                                   final JLabel lblLeaderboard,
                                   final User userIn) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LeaderBoardChoice window
                            = new LeaderBoardChoice(lblleaderBoardContent,
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
     * @param lblleaderBoardContent the content
     * @param lblLeaderboard the leaderboard
     * @param userIn the user
     */
    public static void initialize(final JLabel lblleaderBoardContent,
                                  final JLabel lblLeaderboard,
                                  final User userIn) {
        final int twosixsix = 266;
        final int threezeroseven = 307;
        final int fivezerozero = 500;
        final int twofivefive = 255;
        final int onetwoseven = 127;
        final int threezerozero = 300;
        final int onezero = 10;
        final int twozero = 20;
        final int onetwotwo = 122;
        final int onethree = 13;
        final int fiveone = 51;
        final int oneeight = 18;
        final int fourseventhree = 473;
        final int eightfour = 84;
        final int twosevenfour = 274;
        final int twofive = 25;
        final int twothreesix = 236;
        final int twosixzero = 260;
        final int threeonetwo = 312;
        final int threefivezero = 350;
        final int threeeighteight = 388;
        final int threesix = 36;
        final int onenineeight = 198;
        final int onesixzero = 160;




        frame2 = new JFrame();
        frame2.getContentPane().setBackground(SystemColor.
                inactiveCaptionBorder);
        frame2.setBounds(threezerozero, fivezerozero,
                threezeroseven, fourseventhree);
        frame2.getContentPane().setLayout(null);
        frame2.setFocusable(true);

        JLabel lblWelcome
                = new JLabel("What do you want to depict?");
        lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
        lblWelcome.setBounds(onezero, fiveone, twosixsix, twozero);
        frame2.getContentPane().add(lblWelcome);

        JButton lblVegetarian = new JButton("Vegetarian Score");
        lblVegetarian.setBackground(new Color(0, twofivefive, onetwoseven));
        lblVegetarian.setForeground(Color.WHITE);
        lblVegetarian.setFont(new Font("Arial Black", Font.PLAIN, onethree));
        lblVegetarian.setHorizontalAlignment(SwingConstants.CENTER);
        lblVegetarian.setBounds(onezero, eightfour, twosixsix, twofive);
        lblVegetarian.addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent arg0) {
                String label
                        = lblVegetarian.getText();
                setLabel(label);
                lblleaderBoardContent.
                        setText(LeaderBoardEntry.
                                createLeaderboard(userIn, label));
                lblLeaderboard.setText("Leaderboard Top 10 Vegetarian Score");
                frame2.setVisible(false);
            }
        });
        frame2.getContentPane().add(lblVegetarian);

        JButton lblProduce = new JButton("Produce Score");
        lblProduce.setForeground(Color.WHITE);
        lblProduce.setFont(new Font("Arial Black", Font.PLAIN, onethree));
        lblProduce.setBackground(new Color(0, twofivefive, onetwoseven));
        lblProduce.setHorizontalAlignment(SwingConstants.CENTER);
        lblProduce.setBounds(onezero, onetwotwo, twosixsix, twofive);
        lblProduce.addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent arg0) {
                String label = lblProduce.getText();
                setLabel(label);
                lblleaderBoardContent.setText(LeaderBoardEntry.
                        createLeaderboard(userIn, label));
                lblLeaderboard.setText("Leaderboard Top 10 Produce Score");
                frame2.setVisible(false);
            }
        });
        frame2.getContentPane().add(lblProduce);

        JButton lblCar = new JButton("Car Score");
        lblCar.setBackground(new Color(0, twofivefive, onetwoseven));
        lblCar.setForeground(Color.WHITE);
        lblCar.setFont(new Font("Arial Black", Font.PLAIN, onethree));
        lblCar.setHorizontalAlignment(SwingConstants.CENTER);
        lblCar.setBounds(onezero, onesixzero, twosixsix, twofive);
        lblCar.addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent arg0) {
                String label = lblCar.getText();
                setLabel(label);
                lblleaderBoardContent.setText(LeaderBoardEntry.
                        createLeaderboard(userIn, label));
                lblLeaderboard.setText("Leaderboard Top 10 Car Score");
                frame2.setVisible(false);
            }
        });
        frame2.getContentPane().add(lblCar);

        JButton lblPublic_transportation = new JButton(
                "Public Transportation Score");
        lblPublic_transportation.setBackground(new Color(0,
                twofivefive, onetwoseven));
        lblPublic_transportation.setFont(new Font(
                "Arial Black", Font.PLAIN, onethree));
        lblPublic_transportation.setForeground(Color.WHITE);
        lblPublic_transportation.setHorizontalAlignment(SwingConstants.CENTER);
        lblPublic_transportation.setBounds(onezero,
                onenineeight, twosixsix, twofive);
        lblPublic_transportation.addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent arg0) {
                String label = lblPublic_transportation.getText();
                setLabel(label);
                lblleaderBoardContent.setText(LeaderBoardEntry.
                        createLeaderboard(userIn, label));
                lblLeaderboard.setText("Top 10 Public Transportation Score");
                frame2.setVisible(false);
            }
        });
        frame2.getContentPane().add(lblPublic_transportation);

        JButton lblBike = new JButton("Bike Score");
        lblBike.setFont(new Font("Arial Black", Font.PLAIN, onethree));
        lblBike.setForeground(Color.WHITE);
        lblBike.setBackground(new Color(0, twofivefive, onetwoseven));
        lblBike.setHorizontalAlignment(SwingConstants.CENTER);
        lblBike.setBounds(onezero, twothreesix, twosixsix, twofive);
        lblBike.addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent arg0) {
                String label = lblBike.getText();
                setLabel(label);
                lblleaderBoardContent.setText(LeaderBoardEntry.
                        createLeaderboard(userIn, label));
                lblLeaderboard.setText("Leaderboard Top 10 Bike Score");
                frame2.setVisible(false);
            }
        });
        frame2.getContentPane().add(lblBike);

        JButton lblTemperature = new JButton("Temperature Score");
        lblTemperature.setForeground(Color.WHITE);
        lblTemperature.setBackground(new Color(0, twofivefive, onetwoseven));
        lblTemperature.setFont(new Font("Arial Black", Font.PLAIN, onethree));
        lblTemperature.setHorizontalAlignment(SwingConstants.CENTER);
        lblTemperature.setBounds(onezero, twosevenfour, twosixsix, twofive);
        lblTemperature.addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent arg0) {
                String label = lblTemperature.getText();
                setLabel(label);
                lblleaderBoardContent.setText(LeaderBoardEntry.
                        createLeaderboard(userIn, label));
                lblLeaderboard.setText("Leaderboard Top 10 Temperature Score");
                frame2.setVisible(false);
            }
        });
        frame2.getContentPane().add(lblTemperature);

        JButton lblSolar = new JButton("Solar Score");
        lblSolar.setBackground(new Color(0, twofivefive, onetwoseven));
        lblSolar.setFont(new Font("Arial Black", Font.PLAIN, onethree));
        lblSolar.setForeground(Color.WHITE);
        lblSolar.setHorizontalAlignment(SwingConstants.CENTER);
        lblSolar.setBounds(onezero, threeonetwo, twosixsix, twofive);
        lblSolar.addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent arg0) {
                String label = lblSolar.getText();
                setLabel(label);
                lblleaderBoardContent.setText(LeaderBoardEntry.
                        createLeaderboard(userIn, label));
                lblLeaderboard.setText("Leaderboard Top 10 Solar Score");
                frame2.setVisible(false);
            }
        });
        frame2.getContentPane().add(lblSolar);

        JButton lblSaved = new JButton("Overall CO2 Saved");
        lblSaved.setForeground(Color.WHITE);
        lblSaved.setFont(new Font("Arial Black", Font.PLAIN, onethree));
        lblSaved.setBackground(new Color(0, twofivefive, onetwoseven));
        lblSaved.setHorizontalAlignment(SwingConstants.CENTER);
        lblSaved.setBounds(onezero, threefivezero, twosixsix, twofive);
        lblSaved.addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent arg0) {
                String label = lblSaved.getText();
                setLabel(label);
                lblleaderBoardContent.setText(LeaderBoardEntry.
                        createLeaderboard(userIn, label));
                lblLeaderboard.setText("Leaderboard Top 10 CO2 Saved Score");
                frame2.setVisible(false);
            }
        });
        frame2.getContentPane().add(lblSaved);

        JButton lblOverall = new JButton("Overall Score");
        lblOverall.setForeground(Color.WHITE);
        lblOverall.setBackground(new Color(0, twofivefive, onetwoseven));
        lblOverall.setFont(new Font("Arial Black", Font.PLAIN, onethree));
        lblOverall.setHorizontalAlignment(SwingConstants.CENTER);
        lblOverall.setBounds(onezero, threeeighteight, twosixsix, twofive);
        lblOverall.addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent arg0) {
                String label = lblOverall.getText();
                setLabel(label);
                lblleaderBoardContent.setText(LeaderBoardEntry.
                        createLeaderboard(userIn, label));
                lblLeaderboard.setText("Leaderboard Top 10 CO2 Used");
                frame2.setVisible(false);
            }
        });
        frame2.getContentPane().add(lblOverall);
        JLabel lblChangeLeaderboard = new JLabel("Change Leaderboard");
        lblChangeLeaderboard.setFont(new Font("Arial Black",
                Font.PLAIN, oneeight));
        lblChangeLeaderboard.setHorizontalAlignment(SwingConstants.CENTER);
        lblChangeLeaderboard.setBounds(onezero, onethree, twosixzero, threesix);
        frame2.getContentPane().add(lblChangeLeaderboard);
    }
}
