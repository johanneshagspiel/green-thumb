package Login;

import Login.Login_addAccount;
import entity.User;
import org.junit.Test;
import service.UserServiceImpl;

import javax.swing.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * The type Login add account test.
 */
public class Login_addAccountTest {

    /**
     * Test add account.
     */
    @Test
    public void testAddAccountAllEmpty() {
        // Setup
        final String username = "";
        final String password = "";
        final User userIn = null;
        final UserServiceImpl clientIn = null;
        final JTextField txtUsername = new JTextField ("");
        final JTextField txtPassword = new JTextField ("");
        final JTextField txtRPassword = new JTextField ("");
        final JFrame hello = null;

        // Run the test
        final boolean result = Login_addAccount.addAccount(username, password, userIn, clientIn, txtUsername, txtPassword, txtRPassword, hello);

        // Verify the results
        assertFalse(result);
    }
    
    @Test
    public void testAddAccountUsernameExsists() throws Exception {
        // Setup
        final String username = "Test";
        final String password = "pwd";
        final User userIn = null;
        final UserServiceImpl clientIn = null;
        final JTextField txtUsername = new JTextField ("Test");
        final JTextField txtPassword = new JTextField ("pwd");
        final JTextField txtRPassword = new JTextField ("pwd");
        final JFrame hello = null;
        boolean result = true;

        // Run the test
        try {
        	 result = Login_addAccount.addAccount(username, password, userIn, clientIn, txtUsername, txtPassword, txtRPassword, hello);
        } catch (Exception e) {
        	result = false;
        }
        // Verify the results
        assertFalse(result);
    }
}
