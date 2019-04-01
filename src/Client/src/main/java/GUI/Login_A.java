package GUI;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import Login.Login_addAccount;
import entity.User;
import service.UserServiceImpl;
import javax.swing.SwingConstants;

public class Login_A {
/** Initialising Login Screen. */
    // Fields
        /** Initialising the frame. */
    private static JFrame frame;
    /** Initialising the txtUsername. */
    private static JTextField txtUsername;
    /** Initialising the txtPassword.*/
    private static JPasswordField txtPassword;
    /** Initialising the txtRPassword. */
    private static JPasswordField txtRPassword;
    /** Initialising the client. */
    private static UserServiceImpl client;
    /** Initialising the user. */
    private static User user;

    /**
     * Initialising the Login.
     * @param client2 the client
     * @param user2 the user
     * @param frame2 the frame
     * @return login
     */

    public static boolean Login_Add(final UserServiceImpl client2,
                                    final User user2,
                                    final JFrame frame2) {
        Login_A.client = client2;
        Login_A.user = user2;
        Login_A.frame = frame2;
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    @SuppressWarnings("unused")
                    Login_A window = new Login_A(client, user, frame);
                    Login_A.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        return true;
    }

    /**
     * Create the application.
     * @param client the client
     * @param user the user
     * @param frame the frame
     */
    public Login_A(final UserServiceImpl client,
                   final User user, final JFrame frame) {
        Login_A.client = client;
        Login_A.user = user;
        Login_A.frame = frame;
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private static void initialize() {
        // Create the frame
        final int twozerozero = 200;
        final int fivezerozero = 500;
        final int threezerozero = 300;
        frame = new JFrame();
        frame.setBounds(twozerozero, twozerozero, fivezerozero, threezerozero);
        frame.getContentPane().setLayout(null);
        frame.setFocusable(true);

        // Add a key listener to the Enter
        KeyListener formSubmitKeyListener = new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent event) {
                if (event.getKeyCode() == KeyEvent.VK_ENTER) {

                    // Get the filled in username and password
                    @SuppressWarnings("deprecation")
                    String password = txtPassword.getText();
                    String username = txtUsername.getText();
                    @SuppressWarnings("deprecation")
                    String rpassword = txtRPassword.getText();

                    // Check if password equals repeat password
                    if (password.equals(username)) {
                        JOptionPane.showMessageDialog(null,
                                "Passwords cannot be the same as username",
                                "Create a account error",
                                JOptionPane.ERROR_MESSAGE);
                        txtPassword.setText(null);
                        txtRPassword.setText(null);
                    } else if (password.equals(rpassword)) {
                        try {
                            Login_addAccount.addAccount(username,
                                    password, user, client, txtUsername,
                                    txtPassword, txtRPassword, frame);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Passwords do not match",
                                "Create a account error",
                                JOptionPane.ERROR_MESSAGE);
                        txtPassword.setText(null);
                        txtRPassword.setText(null);
                    }
                }
            }
        };
        frame.addKeyListener(formSubmitKeyListener);
        final int onezero = 10;
        final int twoeight = 28;
        final int foursixsix = 466;
        final int threezero = 30;
        final int threethree = 33;
        final int sixeight = 68;
        final int sixone = 61;
        final int onezeroeight = 108;
        final int sixthree = 63;
        final int onefoursix = 146;
        final int ninezero = 90;


        // Labels
        JLabel lblAccount = new JLabel("Add an Account");
        lblAccount.setHorizontalAlignment(SwingConstants.CENTER);
        lblAccount.setBounds(onezero,
                twoeight, foursixsix, threezero);
        frame.getContentPane().add(lblAccount);

        JLabel lblUsername = new JLabel("Username");
        lblUsername.setBounds(threethree,
                sixeight, sixone, threezero);
        frame.getContentPane().add(lblUsername);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setBounds(threethree,
                onezeroeight, sixthree, twoeight);
        frame.getContentPane().add(lblPassword);

        JLabel lblRPassword = new JLabel("Repeat password");
        lblRPassword.setBounds(threethree,
                onefoursix, ninezero, twoeight);
        frame.getContentPane().add(lblRPassword);
        final int oneeightseven = 187;
        final int oneeightone = 181;
        final int onezerosix = 106;
        final int onefivezero = 150;

        // Text fields
        txtUsername = new JTextField();
        txtUsername.setColumns(onezero);
        txtUsername.setBounds(oneeightseven,
                sixeight, oneeightone, twoeight);
        frame.getContentPane().add(txtUsername);
        txtUsername.addKeyListener(formSubmitKeyListener);

        txtPassword = new JPasswordField();
        txtPassword.setBounds(oneeightseven,
                onezerosix, oneeightone, twoeight);
        frame.getContentPane().add(txtPassword);
        txtPassword.addKeyListener(formSubmitKeyListener);

        txtRPassword = new JPasswordField();
        txtRPassword.setBounds(oneeightseven,
                onefivezero, oneeightone, twoeight);
        frame.getContentPane().add(txtRPassword);
        txtRPassword.addKeyListener(formSubmitKeyListener);

        // Buttons
        JButton btnReset = new JButton("Add Account");
        btnReset.addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent arg0) {

                // Get the filled in username and password
                @SuppressWarnings("deprecation")
                String password = txtPassword.getText();
                String username = txtUsername.getText();
                @SuppressWarnings("deprecation")
                String rpassword = txtRPassword.getText();

                // Check if password equals repeat password
                if (password.equals(username)) {
                    JOptionPane.showMessageDialog(null,
                            "Passwords cannot be the same as username",
                            "Create a account error",
                            JOptionPane.ERROR_MESSAGE);
                    txtPassword.setText(null);
                    txtRPassword.setText(null);
                } else if (password.equals(rpassword)) {
                    try {
                        Login_addAccount.addAccount(username,
                                password, user, client,
                                txtUsername, txtPassword,
                                txtRPassword, frame);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Passwords do not match",
                            "Create a account error",
                            JOptionPane.ERROR_MESSAGE);
                    txtPassword.setText(null);
                    txtRPassword.setText(null);
                }

            }
        });
        final int twoonezero = 210;
        final int onethreefour = 134;
        final int twoone = 21;
        final int sevenfive = 75;
        final int onezerozero = 100;
        final int oneninesix = 196;
        final int four = 4;
        final int fouronesix = 416;
        final int fivefour = 54;
        btnReset.setBounds(oneeightseven, twoonezero, onethreefour, twoone);
        frame.getContentPane().add(btnReset);
        
        JButton btnBack = new JButton("Go Back");
        btnBack.addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent arg0) {
            	frame.setVisible(false);
				Login_S.main(null);
            }
        });
        btnBack.setBounds(sevenfive, twoonezero, onezerozero, twoone);
        frame.getContentPane().add(btnBack);

        // Separators
        JSeparator separator = new JSeparator();
        separator.setBounds(threethree, oneninesix, fouronesix, four);
        frame.getContentPane().add(separator);

        JSeparator separator_1 = new JSeparator();
        separator_1.setBounds(threethree, fivefour, fouronesix, four);
        frame.getContentPane().add(separator_1);

    }
}
