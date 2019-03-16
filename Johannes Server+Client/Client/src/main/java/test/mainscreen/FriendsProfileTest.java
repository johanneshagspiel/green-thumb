package test.mainscreen;

import entity.User;
import mainscreen.FriendsProfile;
import org.junit.Test;
import service.UserServiceImpl;

public class FriendsProfileTest {

    @Test
    public void testApplication() {
        // Setup
        final User userIn = null;
        final UserServiceImpl clientIn = null;

        // Run the test
        FriendsProfile.application(userIn, clientIn);

        // Verify the results
    }

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
