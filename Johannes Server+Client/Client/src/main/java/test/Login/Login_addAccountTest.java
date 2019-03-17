package test.Login;

import Login.Login_addAccount;
import entity.User;
import org.junit.Test;
import service.UserServiceImpl;

import javax.swing.*;

import static org.junit.Assert.assertTrue;

/**
 * The type Login add account test.
 */
public class Login_addAccountTest {

    /**
     * Test add account.
     */
    @Test
    public void testAddAccount() {
        // Setup
        final String username = "username";
        final String password = "password";
        final User userIn = null;
        final UserServiceImpl clientIn = null;
        final JTextField txtUsername = null;
        final JTextField txtPassword = null;

        // Run the test
        final boolean result = Login_addAccount.addAccount(username, password, userIn, clientIn, txtUsername, txtPassword);

        // Verify the results
        assertTrue(result);
    }
}
