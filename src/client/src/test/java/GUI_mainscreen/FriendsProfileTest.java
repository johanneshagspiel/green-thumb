package GUI_mainscreen;

import entity.User;

import org.junit.Test;

import gui.mainscreen.FriendsProfile;
import service.UserServiceImpl;

/**
 * The type Friends profile test.
 */
public class FriendsProfileTest {

    /**
     * Test application.
     */
    @Test
    public void testApplication() {
        // Setup
        final User userIn = null;
        final UserServiceImpl clientIn = null;

        // Run the test
        FriendsProfile.application(userIn, clientIn);

        // Verify the results
    }

    /**
     * Test initialize.
     */
    @Test
    public void testInitialize() {
        // Setup
    	final UserServiceImpl clientIn = new UserServiceImpl();
        final User userIn = clientIn.getUser2("Test");
        

        // Run the test
        FriendsProfile.application(userIn, clientIn);

        // Verify the results
    }
}
