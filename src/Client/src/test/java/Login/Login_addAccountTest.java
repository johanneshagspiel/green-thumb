package Login;

import Login.Login_addAccount;
import entity.User;
import org.junit.Test;
import service.UserServiceImpl;

import javax.swing.*;

import static org.junit.Assert.assertFalse;

/**
 * The type Login add account test.
 */
public class Login_addAccountTest {

    /**
     * Test add account.
     */
    @Test
    public void testAddAccountEmpty() {
        // Setup
        final String username = "";
        final String password = "";
        final User userIn = null;
        final UserServiceImpl clientIn = null;
        final JTextField txtUsername = null;
        final JTextField txtPassword = null;
        final JTextField txtRPassword = null;
        final JFrame hello = null;

        // Run the test
        final boolean result = Login_addAccount.addAccount(username, password, userIn, clientIn, txtUsername, txtPassword, txtRPassword, hello);

        // Verify the results
        assertFalse(result);
    }
}
