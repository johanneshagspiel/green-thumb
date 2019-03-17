package test.mainscreen;

import entity.User;
import mainscreen.FriendsProfile;
import org.junit.Test;
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
        final User userIn = null;
        final UserServiceImpl clientIn = null;

        // Run the test
        FriendsProfile.initialize(userIn, clientIn);

        // Verify the results
    }
}
