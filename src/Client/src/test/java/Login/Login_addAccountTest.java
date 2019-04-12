package Login;

import Login.Login_addAccount;
import entity.User;
import org.junit.Test;
import service.UserServiceImpl;

import javax.swing.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * The type Login add account test.
 */
public class Login_addAccountTest {

    /**
     * Test add account.
     */
	@Test
	public void testConstructor() {
		
		Login_addAccount Ardy = new Login_addAccount();
		
		assertNotNull(Ardy);
	}
	
    @Test
    public void testAddAccountWholeEmpty() {
        // Setup
        final String username = "";
        final String password = "";
        final User userIn = new User();
        final UserServiceImpl clientIn = new UserServiceImpl();
        final JTextField txtUsername = new JTextField("");
        final JTextField txtPassword = new JTextField("");
        final JTextField txtRPassword = new JTextField("");
        final JFrame hello = new JFrame();

        // Run the test
        final boolean result = Login_addAccount.addAccount(username, password, userIn, clientIn, txtUsername, txtPassword, txtRPassword, hello);

        // Verify the results
        assertFalse(result);
    }
    
    @Test
    public void testAddAccountUsernameEmpty() {
    	// Setup
        final String username = "";
        final String password = "pwd";
        User userIn = new User();
        final UserServiceImpl clientIn = new UserServiceImpl();
        final JTextField txtUsername = new JTextField("");
        final JTextField txtPassword = new JTextField("");
        final JTextField txtRPassword = new JTextField("");
        final JFrame hello = new JFrame();

        // Run the test
        final boolean result = Login_addAccount.addAccount(username, password, userIn, clientIn, txtUsername, txtPassword, txtRPassword, hello);
        
        // Verify the results
        assertFalse(result);
    }
    
    @Test
    public void testAddAccountPasswordEmpty1() {
    	// Setup
        final String username = "Test2";
        final String password = "";
        User userIn = new User();
        final UserServiceImpl clientIn = new UserServiceImpl();
        final JTextField txtUsername = new JTextField("");
        final JTextField txtPassword = new JTextField("");
        final JTextField txtRPassword = new JTextField("");
        final JFrame hello = new JFrame();

        // Run the test
        final boolean result = Login_addAccount.addAccount(username, password, userIn, clientIn, txtUsername, txtPassword, txtRPassword, hello);
        
        // Verify the results
        assertFalse(result);
    }
    
    @Test
    public void testAddAccountPasswordEmpty2() {
    	// Setup
        final String username = "Test";
        final String password = "";
        User userIn = new User();
        final UserServiceImpl clientIn = new UserServiceImpl();
        final JTextField txtUsername = new JTextField("");
        final JTextField txtPassword = new JTextField("");
        final JTextField txtRPassword = new JTextField("");
        final JFrame hello = new JFrame();

        // Run the test
        final boolean result = Login_addAccount.addAccount(username, password, userIn, clientIn, txtUsername, txtPassword, txtRPassword, hello);
        
        // Verify the results
        assertFalse(result);
    }
    
    @Test
    public void testAddAccountExsistingAcount() {
    	// Setup
        final String username = "Test";
        final String password = "pwd";
        User userIn = new User();
        final UserServiceImpl clientIn = new UserServiceImpl();
        final JTextField txtUsername = new JTextField("");
        final JTextField txtPassword = new JTextField("");
        final JTextField txtRPassword = new JTextField("");
        final JFrame hello = new JFrame();

        // Run the test
        final boolean result = Login_addAccount.addAccount(username, password, userIn, clientIn, txtUsername, txtPassword, txtRPassword, hello);
        
        // Verify the results
        assertFalse(result);
    }
    
    @Test
    public void testAddAccountNewUser() {
    	// Setup
        final String username = "Test2";
        final String password = "pwd";
        User userIn = new User();
        final UserServiceImpl clientIn = new UserServiceImpl();
        final JTextField txtUsername = new JTextField("");
        final JTextField txtPassword = new JTextField("");
        final JTextField txtRPassword = new JTextField("");
        final JFrame hello = new JFrame();

        // Run the test
        final boolean result = Login_addAccount.addAccount(username, password, userIn, clientIn, txtUsername, txtPassword, txtRPassword, hello);

        //Reseting the added account
        userIn = clientIn.getUser2("Test2");
        clientIn.deleteUser(userIn.getId());
        
        // Verify the results
        assertTrue(result);
    }
}
