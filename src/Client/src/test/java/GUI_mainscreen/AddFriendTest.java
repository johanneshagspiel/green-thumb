package test.GUI_mainscreen;

import entity.User;

import org.junit.Test;

import GUI_mainscreen.AddFriend;
import service.UserServiceImpl;

/**
 * The type Add friend test.
 */
public class AddFriendTest {

    /**
     * Test application.
     */
    @Test
    public void testApplication() {
        // Setup
        final User userIn = null;
        final UserServiceImpl clientIn = null;

        // Run the test
        AddFriend.application(userIn, clientIn);

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
        AddFriend.initialize(userIn, clientIn);

        // Verify the results
    }
}
