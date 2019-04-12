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
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;
/** The Login. */
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
        // Some used values
        final int fivezerozero = 500;
        final int oneninesix = 196;
        final int fouronesix = 416;
        final int four = 4;
        final int twofivefive = 255;
        final int onetwoseven = 127;
        final int twoeight = 28;
        final int foursixsix = 466;
        final int threethree = 33;
        final int sixeight = 68;
        final int onezeroeight = 108;
        final int onefoursix = 146;
        final int threezerozero = 300;
        final int onezero = 10;
        final int onetwo = 12;
        final int threezero = 30;
        final int onethree = 13;
        final int twozerozero = 200;
        final int onezerotwo = 102;
        final int twozerofour = 204;
        final int onefivethree = 153;
        final int fivefive = 55;
        final int oneeightone = 181;
        final int sixfive = 65;
        final int onefourtwo = 142;
        final int onezeroseven = 107;
        final int twoonenine = 219;
        final int sevenzero = 70;
        final int onefourseven = 147;
        final int onefive = 15;
        final int twoonezero = 210;
        final int fiveone = 51;
        final int oneeight = 18;

        frame = new JFrame();
        frame.setBackground(new Color(0, twofivefive, onetwoseven));
		frame.getContentPane().setBackground(
		        SystemColor.inactiveCaptionBorder);
        frame.setBounds(twozerozero, twozerozero, fivezerozero, threezerozero);
        frame.getContentPane().setLayout(null);
        frame.setFocusable(true);

        // Add a key listener to the Enter
        KeyListener formSubmitKeyListener = new KeyAdapter() {
            @Override
            public void keyPressed(final KeyEvent event) {
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




        // Labels
        JLabel lblAccount = new JLabel("Add an Account");
        lblAccount.setFont(new Font("Arial Black", Font.PLAIN, oneeight));
        lblAccount.setHorizontalAlignment(SwingConstants.CENTER);
        lblAccount.setBounds(onetwo, 0, foursixsix, fivefive);
        frame.getContentPane().add(lblAccount);

        JLabel lblUsername = new JLabel("Username");
        lblUsername.setFont(new Font("Arial Black", Font.PLAIN, onethree));
        lblUsername.setBounds(sixfive, sixeight, onefourtwo, threezero);
        frame.getContentPane().add(lblUsername);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setFont(new Font("Arial Black", Font.PLAIN, onethree));
        lblPassword.setBounds(sixfive, onezeroseven, onefourtwo, twoeight);
        frame.getContentPane().add(lblPassword);

        JLabel lblRPassword = new JLabel("Repeat password");
        lblRPassword.setFont(new Font("Arial Black", Font.PLAIN, onethree));
        lblRPassword.setBounds(sixfive, onefoursix, onefourtwo, twoeight);
        frame.getContentPane().add(lblRPassword);

        // Text fields
        txtUsername = new JTextField();
        txtUsername.setColumns(onezero);
        txtUsername.setBounds(twoonenine, sevenzero,
                oneeightone, twoeight);
        frame.getContentPane().add(txtUsername);
        txtUsername.addKeyListener(formSubmitKeyListener);

        txtPassword = new JPasswordField();
        txtPassword.setBounds(twoonenine, onezeroeight,
                oneeightone, twoeight);
        frame.getContentPane().add(txtPassword);
        txtPassword.addKeyListener(formSubmitKeyListener);

        txtRPassword = new JPasswordField();
        txtRPassword.setBounds(twoonenine, onefourseven,
                oneeightone, twoeight);
        frame.getContentPane().add(txtRPassword);
        txtRPassword.addKeyListener(formSubmitKeyListener);

        // Buttons
        JButton btnReset = new JButton("Add Account");
        btnReset.setBackground(new Color(0, twofivefive, onetwoseven));
        btnReset.setForeground(Color.WHITE);
        btnReset.setFont(new Font("Arial Black", Font.PLAIN, onefive));
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
        btnReset.setBounds(twoonenine, twoonezero,
                oneeightone, threezero);
        frame.getContentPane().add(btnReset);
        JButton btnBack = new JButton("Go Back");
        btnBack.setBackground(new Color(onezerotwo,
                twozerofour, onefivethree));
        btnBack.setForeground(Color.WHITE);
        btnBack.setFont(new Font("Arial Black", Font.PLAIN, onefive));
        btnBack.addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent arg0) {
            	frame.setVisible(false);
				Login_S.main(null);
            }
        });
        btnBack.setBounds(sixfive, twoonezero, onezeroeight, threezero);
        frame.getContentPane().add(btnBack);

        // Separators
        JSeparator separator = new JSeparator();
		separator.setBounds(threethree, oneninesix, fouronesix, four);
        frame.getContentPane().add(separator);

        JSeparator separator_1 = new JSeparator();
        separator_1.setBounds(threethree, fiveone, fouronesix, four);
        frame.getContentPane().add(separator_1);

    }
}
