package gui.mainscreen;

import entity.User;
import service.UserServiceImpl;
import javax.swing.*;
import java.awt.*;

/**
 * The type My profile.
 */
public class MyProfile2 {
    /**
     * Initialise the frame.
     */
    private static JFrame frame2;

    /**
     * The profile.
     * @param userIn the userIn
     * @param clientIn the clientIn
     */
    private MyProfile2(final User userIn,
                       final UserServiceImpl clientIn) {
        initialize(userIn, clientIn);
    }

    /**
     * The Application.
     * @param userIn the user in
     * @param clientIn the client in
     * @param username the username
     */
    public static void application(
            final User userIn,
            final UserServiceImpl clientIn,
            final String username) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MyProfile2 window = new MyProfile2(userIn,
                            clientIn);
                    MyProfile2.frame2.setVisible(true);
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
    public static void initialize(
            final User userIn,
            final UserServiceImpl clientIn) {
        final int twosixsix = 266;
        final int fivezero = 50;
        final int fivezerozero = 500;
        final int twoeight = 28;
        final int ninezero = 90;
        final int threezerozero = 300;
        final int onezero = 10;
        final int twozero = 20;
        final int onethreezero = 130;
        final int onefivezero = 150;
        final int sevenzero = 70;
        final int onefive = 15;
        final int twoonezero = 210;
        final int twoeightsix = 286;
        final int oneonezero = 110;
        final int onesevenzero = 170;
        final int oneninezero = 190;



        frame2 = new JFrame();
        frame2.getContentPane().setBackground(SystemColor.
                inactiveCaptionBorder);
        frame2.setBounds(threezerozero, fivezerozero,
                threezerozero, twoeightsix);
        frame2.getContentPane().setLayout(null);
        frame2.setFocusable(true);

            JLabel lblWelcome = new JLabel("Profile of "
                   + userIn.getUser_name());
            lblWelcome.setFont(new Font("Arial Black",
                    Font.PLAIN, onefive));
            lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
            lblWelcome.setBounds(onezero, onezero, twosixsix, twoeight);
            frame2.getContentPane().add(lblWelcome);

            JLabel lblVegetarian = new JLabel("Vegetarian Score:"
                    + userIn.getVegetarian());
            lblVegetarian.setHorizontalAlignment(SwingConstants.LEFT);
            lblVegetarian.setBounds(onezero, fivezero, twosixsix, twozero);
            frame2.getContentPane().add(lblVegetarian);

            JLabel lblProduce = new JLabel("Produce Score: "
                    + userIn.getProduce());
            lblProduce.setHorizontalAlignment(SwingConstants.LEFT);
            lblProduce.setBounds(onezero, sevenzero, twosixsix, twozero);
            frame2.getContentPane().add(lblProduce);

            JLabel lblCar = new JLabel("Car Score: "
                    + userIn.getCar());
            lblCar.setHorizontalAlignment(SwingConstants.LEFT);
            lblCar.setBounds(onezero, ninezero, twosixsix, twozero);
            frame2.getContentPane().add(lblCar);

            JLabel lblPublic_transportation
                    = new JLabel("Public Transportation Score: "
                    + userIn.getPublic_transportation());
            lblPublic_transportation.
                    setHorizontalAlignment(SwingConstants.LEFT);
            lblPublic_transportation.
                    setBounds(onezero, oneonezero, twosixsix, twozero);
            frame2.getContentPane().add(lblPublic_transportation);

            JLabel lblBike = new JLabel("Bike Score: "
                    + userIn.getBike());
            lblBike.setHorizontalAlignment(SwingConstants.LEFT);
            lblBike.setBounds(onezero, onethreezero, twosixsix, twozero);
            frame2.getContentPane().add(lblBike);

            JLabel lblTemperature = new JLabel("Temperature Score: "
                    + userIn.getTemperature());
            lblTemperature.setHorizontalAlignment(SwingConstants.LEFT);
            lblTemperature.setBounds(onezero, onefivezero, twosixsix, twozero);
            frame2.getContentPane().add(lblTemperature);

            JLabel lblSolar = new JLabel("Solar Score: "
                    + userIn.getSolar());
            lblSolar.setHorizontalAlignment(SwingConstants.LEFT);
            lblSolar.setBounds(onezero, onesevenzero, twosixsix, twozero);
            frame2.getContentPane().add(lblSolar);

            JLabel lblSaved = new JLabel("Overall CO2 Saved: "
                    + userIn.getTotal_saved());
            lblSaved.setHorizontalAlignment(SwingConstants.LEFT);
            lblSaved.setBounds(onezero, oneninezero, twosixsix, twozero);
            frame2.getContentPane().add(lblSaved);

            JLabel lblOverall = new JLabel("Overall Score: "
                    + userIn.getTotal());
            lblOverall.setHorizontalAlignment(SwingConstants.LEFT);
            lblOverall.setBounds(onezero, twoonezero, twosixsix, twozero);
            frame2.getContentPane().add(lblOverall);
            }
    }
