package GUI_mainscreen;

import GUI.GUI_App;
import entity.LeaderBoardEntry;
import entity.User;
import service.UserServiceImpl;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static GUI.GUI_App.getUsername;
import static GUI.GUI_App.setLabel;

/**
 * The type My profile.
 */
public class LeaderBoardChoice {

    private static JFrame frame2;

    private LeaderBoardChoice(JLabel lblLeaderboardContent, JLabel lblLeaderboard, User userIn) {
        initialize(lblLeaderboardContent, lblLeaderboard, userIn);
    }


    public static void application(JLabel lblLeaderboardContent, JLabel lblLeaderboard, User userIn) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LeaderBoardChoice window = new LeaderBoardChoice(lblLeaderboardContent, lblLeaderboard, userIn);
                    LeaderBoardChoice.frame2.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public static void initialize(JLabel lblLeaderboardContent, JLabel lblLeaderboard, User userIn) {

        frame2 = new JFrame();
        frame2.setBounds(300, 500, 300, 500);
        frame2.getContentPane().setLayout(null);
        frame2.setFocusable(true);

        JLabel lblWelcome = new JLabel("What do you want to depict?");
        lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
        lblWelcome.setBounds(10, 10, 266, 20);
        frame2.getContentPane().add(lblWelcome);

        JButton lblVegetarian = new JButton("Vegetarian Score");
        lblVegetarian.setHorizontalAlignment(SwingConstants.CENTER);
        lblVegetarian.setBounds(10, 50, 266, 20);
        lblVegetarian.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String label = lblVegetarian.getText();
                setLabel(label);
                lblLeaderboardContent.setText(LeaderBoardEntry.createLeaderboard(userIn, label));
                lblLeaderboard.setText("Leaderboard Top 10 Vegetarian Score");
                frame2.setVisible(false);
            }
        });
        frame2.getContentPane().add(lblVegetarian);

        JButton lblProduce = new JButton("Produce Score");
        lblProduce.setHorizontalAlignment(SwingConstants.CENTER);
        lblProduce.setBounds(10, 75, 266, 20);
        lblProduce.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String label = lblProduce.getText();
                setLabel(label);
                lblLeaderboardContent.setText(LeaderBoardEntry.createLeaderboard(userIn, label));
                lblLeaderboard.setText("Leaderboard Top 10 Produce Score");
                frame2.setVisible(false);
            }
        });
        frame2.getContentPane().add(lblProduce);

        JButton lblCar = new JButton("Car Score");
        lblCar.setHorizontalAlignment(SwingConstants.CENTER);
        lblCar.setBounds(10, 100, 266, 20);
        lblCar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String label = lblCar.getText();
                setLabel(label);
                lblLeaderboardContent.setText(LeaderBoardEntry.createLeaderboard(userIn, label));
                lblLeaderboard.setText("Leaderboard Top 10 Car Score");
                frame2.setVisible(false);
            }
        });
        frame2.getContentPane().add(lblCar);

        JButton lblPublic_transportation = new JButton("Public Transportation Score");
        lblPublic_transportation.setHorizontalAlignment(SwingConstants.CENTER);
        lblPublic_transportation.setBounds(10, 125, 266, 20);
        lblPublic_transportation.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String label = lblPublic_transportation.getText();
                setLabel(label);
                lblLeaderboardContent.setText(LeaderBoardEntry.createLeaderboard(userIn, label));
                lblLeaderboard.setText("Top 10 Public Transportation Score");
                frame2.setVisible(false);
            }
        });
        frame2.getContentPane().add(lblPublic_transportation);

        JButton lblBike = new JButton("Bike Score");
        lblBike.setHorizontalAlignment(SwingConstants.CENTER);
        lblBike.setBounds(10, 150, 266, 20);
        lblBike.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String label = lblBike.getText();
                setLabel(label);
                lblLeaderboardContent.setText(LeaderBoardEntry.createLeaderboard(userIn, label));
                lblLeaderboard.setText("Leaderboard Top 10 Bike Score");
                frame2.setVisible(false);
            }
        });
        frame2.getContentPane().add(lblBike);

        JButton lblTemperature = new JButton("Temperature Score");
        lblTemperature.setHorizontalAlignment(SwingConstants.CENTER);
        lblTemperature.setBounds(10, 175, 266, 20);
        lblTemperature.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String label = lblTemperature.getText();
                setLabel(label);
                lblLeaderboardContent.setText(LeaderBoardEntry.createLeaderboard(userIn, label));
                lblLeaderboard.setText("Leaderboard Top 10 Temperature Score");
                frame2.setVisible(false);
            }
        });
        frame2.getContentPane().add(lblTemperature);

        JButton lblSolar = new JButton("Solar Score" );
        lblSolar.setHorizontalAlignment(SwingConstants.CENTER);
        lblSolar.setBounds(10, 200, 266, 20);
        lblSolar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String label = lblSolar.getText();
                setLabel(label);
                lblLeaderboardContent.setText(LeaderBoardEntry.createLeaderboard(userIn, label));
                lblLeaderboard.setText("Leaderboard Top 10 Solar Score");
                frame2.setVisible(false);
            }
        });
        frame2.getContentPane().add(lblSolar);

        JButton lblSaved = new JButton("Overall CO2 Saved");
        lblSaved.setHorizontalAlignment(SwingConstants.CENTER);
        lblSaved.setBounds(10, 225, 266, 20);
        lblSaved.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String label = lblSaved.getText();
                setLabel(label);
                lblLeaderboardContent.setText(LeaderBoardEntry.createLeaderboard(userIn, label));
                lblLeaderboard.setText("Leaderboard Top 10 CO2 Saved Score");
                frame2.setVisible(false);
            }
        });
        frame2.getContentPane().add(lblSaved);

        JButton lblOverall = new JButton("Overall Score");
        lblOverall.setHorizontalAlignment(SwingConstants.CENTER);
        lblOverall.setBounds(10, 250, 266, 20);
        lblOverall.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String label = lblOverall.getText();
                setLabel(label);
                lblLeaderboardContent.setText(LeaderBoardEntry.createLeaderboard(userIn, label));
                lblLeaderboard.setText("Leaderboard Top 10 CO2 Used");
                frame2.setVisible(false);
            }
        });
        frame2.getContentPane().add(lblOverall);
    }
}
