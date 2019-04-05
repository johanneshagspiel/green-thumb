package Login;

import Login.Login_r;
import entity.User;
import org.junit.Test;
import service.UserServiceImpl;

import javax.swing.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * The type Login r test.
 */
public class Login_rTest {

    /**
     * Test login request.
     */
    @Test
    public void testWrongNamePassword() {
        // Setup
        final String username = "username";
        final String password = "password";
        final User userIn = new User();
        final UserServiceImpl clientIn = new UserServiceImpl();
        final JTextField textField_1 = new JTextField("");
        final JTextField txtPassword = new JTextField("");
        final JFrame frame = new JFrame();

        // Run the test
        final boolean result = Login_r.Login_request(username, password, userIn, clientIn, textField_1, txtPassword, frame);

        // Verify the results
        assertFalse(result);
    }
    
    @Test
    public void testWrongName() {
        // Setup
        final String username = "Test2";
        final String password = "pwd";
        final User userIn = new User();
        final UserServiceImpl clientIn = new UserServiceImpl();
        final JTextField textField_1 = new JTextField("");
        final JTextField txtPassword = new JTextField("");
        final JFrame frame = new JFrame();

        // Run the test
        final boolean result = Login_r.Login_request(username, password, userIn, clientIn, textField_1, txtPassword, frame);

        // Verify the results
        assertFalse(result);
    }
    
    @Test
    public void testWrongPassword() {
        // Setup
        final String username = "Test";
        final String password = "MichaelJakson";
        final User userIn = new User();
        final UserServiceImpl clientIn = new UserServiceImpl();
        final JTextField textField_1 = new JTextField("");
        final JTextField txtPassword = new JTextField("");
        final JFrame frame = new JFrame();

        // Run the test
        final boolean result = Login_r.Login_request(username, password, userIn, clientIn, textField_1, txtPassword, frame);

        // Verify the results
        assertFalse(result);
    }
    
    @Test
    public void testRigth() {
        // Setup
        final String username = "Test";
        final String password = "pwd";
        final User userIn = new User();
        final UserServiceImpl clientIn = new UserServiceImpl();
        final JTextField textField_1 = new JTextField("");
        final JTextField txtPassword = new JTextField("");
        final JFrame frame = new JFrame();

        // Run the test
        final boolean result = Login_r.Login_request(username, password, userIn, clientIn, textField_1, txtPassword, frame);

        // Verify the results
        assertTrue(result);
    }
    
}
