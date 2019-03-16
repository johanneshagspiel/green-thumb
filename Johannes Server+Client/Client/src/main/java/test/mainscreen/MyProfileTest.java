package test.mainscreen;

import entity.User;
import mainscreen.MyProfile;
import org.junit.Test;
import service.UserServiceImpl;

public class MyProfileTest {

    @Test
    public void testApplication() {
        // Setup
        final User userIn = null;
        final UserServiceImpl clientIn = null;

        // Run the test
        MyProfile.application(userIn, clientIn);

        // Verify the results
    }

    @Test
    public void testInitialize() {
        // Setup
        final User userIn = null;
        final UserServiceImpl clientIn = null;

        // Run the test
        MyProfile.initialize(userIn, clientIn);

        // Verify the results
    }
}
