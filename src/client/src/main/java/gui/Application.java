package gui;

import login.Login_r;
import entity.User;
import service.FriendServiceImpl;
import service.UserServiceImpl;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * The type Login s.
 */
public class Application {

    // Fields
    /** Initialise the frame. */
    public JFrame frame;
    /** Initialise the textfield. */
    private JTextField textField_1;
    /** Initialise the txtPassword. */
    private JPasswordField txtPassword;


    /**
     * The constant user.
     */
    public static User user;
    /**
     * The constant client.
     */
    public static UserServiceImpl client;
    /**
     * The constant friendClient.
     */
    public static FriendServiceImpl friendClient;


    /**
     * Create the application.
     */
    public Application() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        final int twozerotwo = 202;
        final int onetwoeight = 128;
        final int fourzero = 40;
        final int fivezero = 50;
        final int ninetwo = 92;
        final int eightsix = 86;
        final int eightseven = 87;
        final int onefourone = 141;
        final int eighteight = 88;
        final int twofourfive = 245;
        final int onefourfive = 145;
        final int sevenfive = 75;
        final int oneeighteight = 188;
        final int fivezerozero = 500;
        final int fouronesix = 416;
        final int four = 4;
        final int twofivefive = 255;
        final int onetwoseven = 127;
        final int twoeight = 28;
        final int threethree = 33;
        final int sixeight = 68;
        final int threezerozero = 300;
        final int onezero = 10;
        final int threezero = 30;
        final int onethree = 13;
        final int twozerozero = 200;
        final int onezerotwo = 102;
        final int twozerofour = 204;
        final int onefivethree = 153;
        final int oneeightseven = 187;
        final int oneeightone = 181;
        final int onefivezero = 150;
        final int onefourtwo = 142;
        final int onefive = 15;
        final int ninefour = 94;
        final int threezeroseven = 307;
        // Create the frame
        frame = new JFrame();
        //frame.setIconImage(Toolkit.getDefaultToolkit().
        // getImage(Login_S.class.
        // getResource("/GUI/Images/
        // Go Green Logo 50x50.jpg")));
        frame.setResizable(false);
        frame.setBackground(new Color(0,
                twofivefive,
                onetwoseven));
        frame.getContentPane().
                setBackground(SystemColor.inactiveCaptionBorder);
        frame.setBounds(twozerozero, twozerozero,
                fivezerozero, threezerozero);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setFocusable(true);


        UserServiceImpl client = new UserServiceImpl();
        User user = new User();

        // Add a key listener to the Enter
        KeyListener formSubmitKeyListener = new KeyAdapter() {
            @Override
            public void keyPressed(final KeyEvent event) {
                if (event.getKeyCode()
                        == KeyEvent.VK_ENTER) {

                    // Get the filled in username and password
                    @SuppressWarnings("deprecation")
                    String password
                            = txtPassword.getText();
                    String username
                            = textField_1.getText();

                    Login_r.Login_request(username,
                            password, user,
                            client, textField_1,
                            txtPassword, frame);
                }
            }
        };
        frame.addKeyListener(formSubmitKeyListener);

        // Labels
        JLabel lblLogin = new JLabel("Go Green");
        lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
        lblLogin.setForeground(new Color(0,
                onezerotwo, 0));
        lblLogin.setBackground(new Color(onetwoeight,
                onetwoeight, onetwoeight));
        lblLogin.setFont(new Font("Arial Black",
                Font.BOLD, fourzero));
        lblLogin.setBounds(threethree, onethree, fouronesix, fivezero);
        frame.getContentPane().add(lblLogin);

        JLabel lblUsername = new JLabel("Username");
        lblUsername.setFont(new Font("Arial Black", Font.PLAIN, onethree));
        lblUsername.setBounds(eightseven, ninetwo, eightsix, threezero);
        frame.getContentPane().add(lblUsername);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setFont(new Font("Arial Black",
                Font.PLAIN, onethree));
        lblPassword.setBounds(eightseven, onefourone,
                eighteight, twoeight);
        frame.getContentPane().add(lblPassword);

        // Text fields
        textField_1 = new JTextField();
        textField_1.setColumns(onezero);
        textField_1.setBounds(oneeightseven, ninefour,
                oneeightone, twoeight);
        frame.getContentPane().add(textField_1);
        textField_1.addKeyListener(formSubmitKeyListener);

        txtPassword = new JPasswordField();
        txtPassword.setBounds(oneeightseven, onefourtwo,
                oneeightone, twoeight);
        frame.getContentPane().add(txtPassword);
        txtPassword.addKeyListener(formSubmitKeyListener);

        //Buttons
        JButton btnLogin = new JButton("Login");
        btnLogin.setForeground(new Color(twofourfive,
                twofourfive, twofourfive));
        btnLogin.setFont(new Font("Arial Black", Font.PLAIN, onefive));
        btnLogin.setBackground(new Color(0, twofivefive, onetwoseven));
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent arg0) {
                //Get the filled in username
                // and password
                @SuppressWarnings("deprecation")
                String password
                        = txtPassword.getText();
                String username
                        = textField_1.getText();

                try {

                    Login_r.Login_request(username, password,
                            user, client,
                            textField_1, txtPassword, frame);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });
        btnLogin.setBounds(threezeroseven, twozerotwo, onefourtwo, threezero);
        frame.getContentPane().add(btnLogin);

        JButton btnReset = new JButton("Add Account");
        btnReset.setFont(new Font("Arial Black", Font.PLAIN, onefive));
        btnReset.setForeground(new Color(twofivefive,
                twofivefive, twofivefive));
        btnReset.setBackground(new Color(0, twofivefive, onetwoseven));
        btnReset.addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent arg0) {
                try {
                    frame.setVisible(false);
                    Login_A.Login_Add(client, user, frame);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        btnReset.setBounds(onefourfive, twozerotwo, onefivezero, threezero);
        frame.getContentPane().add(btnReset);

        JButton btnExit = new JButton("Exit");
        btnExit.setForeground(new Color(twofourfive, twofourfive, twofourfive));
        btnExit.setFont(new Font("Arial Black", Font.PLAIN, onefive));
        btnExit.setBackground(new Color(onezerotwo, twozerofour, onefivethree));
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent arg0) {
                frame = new JFrame("Exit");
                if (JOptionPane.showConfirmDialog(frame,
                        "Please confirm that you want to exit the program",
                        "Login Systems",
                        JOptionPane.YES_NO_OPTION)
                        == JOptionPane.YES_NO_OPTION) {
                    System.exit(0);
                }
            }
        });
        btnExit.setBounds(threethree, twozerotwo, sevenfive, threezero);
        frame.getContentPane().add(btnExit);

        // Separators
        JSeparator separator = new JSeparator();
        separator.setBounds(threethree, oneeighteight,
                fouronesix, four);
        frame.getContentPane().add(separator);

        JSeparator separator_1 = new JSeparator();
        separator_1.setBounds(threethree, sixeight,
                fouronesix, four);
        frame.getContentPane().add(separator_1);

        JLabel Title_background = new JLabel("");
        //Title_background.setIcon(new ImageIcon
        // (Login_S.class.getResource("/GUI/Images/Shape 416x50.png")));
        Title_background.setBounds(threethree, onethree,
                fouronesix, fivezero);
        frame.getContentPane().add(Title_background);
    }

    /**
     * Launch the application.
     *
     * @param args the input arguments
     */
    public static void main(final String[] args) {
        UserServiceImpl client = new UserServiceImpl();
        User user = new User();
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Application window = new Application();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

}
