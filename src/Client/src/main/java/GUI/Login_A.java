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

    // Fields
    private static JFrame frame;
    private static JTextField txtUsername;
    private static JPasswordField txtPassword;
    private static JPasswordField txtRPassword;
    private static UserServiceImpl client;
    private static User user;

    /**
     * Launch the application.
     */

    public static boolean Login_Add(UserServiceImpl client2, User user2, JFrame frame2) {
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
     */
    public Login_A(UserServiceImpl client, User user, JFrame frame) {
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
        frame = new JFrame();
        frame.setBounds(200, 200, 500, 300);
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
                        JOptionPane.showMessageDialog(null, "Passwords cannot be the same as username",
                                "Create a account error", JOptionPane.ERROR_MESSAGE);
                        txtPassword.setText(null);
                        txtRPassword.setText(null);
                    } else if (password.equals(rpassword)) {
                        try {
                            Login_addAccount.addAccount(username, password, user, client, txtUsername, txtPassword, txtRPassword, frame);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Passwords do not match", "Create a account error",
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
        lblAccount.setHorizontalAlignment(SwingConstants.CENTER);
        lblAccount.setBounds(10, 28, 466, 30);
        frame.getContentPane().add(lblAccount);

        JLabel lblUsername = new JLabel("Username");
        lblUsername.setBounds(33, 68, 61, 30);
        frame.getContentPane().add(lblUsername);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setBounds(33, 108, 63, 28);
        frame.getContentPane().add(lblPassword);

        JLabel lblRPassword = new JLabel("Repeat password");
        lblRPassword.setBounds(33, 146, 90, 28);
        frame.getContentPane().add(lblRPassword);

        // Text fields
        txtUsername = new JTextField();
        txtUsername.setColumns(10);
        txtUsername.setBounds(187, 68, 181, 28);
        frame.getContentPane().add(txtUsername);
        txtUsername.addKeyListener(formSubmitKeyListener);

        txtPassword = new JPasswordField();
        txtPassword.setBounds(187, 106, 181, 28);
        frame.getContentPane().add(txtPassword);
        txtPassword.addKeyListener(formSubmitKeyListener);

        txtRPassword = new JPasswordField();
        txtRPassword.setBounds(187, 150, 181, 28);
        frame.getContentPane().add(txtRPassword);
        txtRPassword.addKeyListener(formSubmitKeyListener);

        // Buttons
        JButton btnReset = new JButton("Add Account");
        btnReset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                // Get the filled in username and password
                @SuppressWarnings("deprecation")
                String password = txtPassword.getText();
                String username = txtUsername.getText();
                @SuppressWarnings("deprecation")
                String rpassword = txtRPassword.getText();

                // Check if password equals repeat password
                if (password.equals(username)) {
                    JOptionPane.showMessageDialog(null, "Passwords cannot be the same as username",
                            "Create a account error", JOptionPane.ERROR_MESSAGE);
                    txtPassword.setText(null);
                    txtRPassword.setText(null);
                } else if (password.equals(rpassword)) {
                    try {
                        Login_addAccount.addAccount(username, password, user, client, txtUsername, txtPassword, txtRPassword, frame);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Passwords do not match", "Create a account error",
                            JOptionPane.ERROR_MESSAGE);
                    txtPassword.setText(null);
                    txtRPassword.setText(null);
                }

            }
        });
        btnReset.setBounds(187, 210, 134, 21);
        frame.getContentPane().add(btnReset);
        
        JButton btnBack = new JButton("Go Back");
        btnBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	frame.setVisible(false);
				Login_S.main(null);
            }
        });
        btnBack.setBounds(75, 210, 100, 21);
        frame.getContentPane().add(btnBack);

        // Separators
        JSeparator separator = new JSeparator();
        separator.setBounds(33, 196, 416, 4);
        frame.getContentPane().add(separator);

        JSeparator separator_1 = new JSeparator();
        separator_1.setBounds(33, 54, 416, 4);
        frame.getContentPane().add(separator_1);

    }
}
