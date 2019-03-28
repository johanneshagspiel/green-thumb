package test.Login;

import Login.Login_r;
import entity.User;
import org.junit.Test;
import service.UserServiceImpl;

import javax.swing.*;

import static org.junit.Assert.assertTrue;

/**
 * The type Login r test.
 */
public class Login_rTest {

    /**
     * Test login request.
     */
    @Test
    public void testLogin_request() {
        // Setup
        final String username = "username";
        final String password = "password";
        final User userIn = null;
        final UserServiceImpl clientIn = null;
        final JTextField textField_1 = null;
        final JTextField txtPassword = null;
        final JFrame frame = null;

        // Run the test
        final boolean result = Login_r.Login_request(username, password, userIn, clientIn, textField_1, txtPassword, frame);

        // Verify the results
        assertTrue(result);
    }
}
