package GUI_mainscreen;

import entity.User;

import org.junit.Test;

import gui.mainscreen.MyProfile;
import service.FriendServiceImpl;
import service.UserServiceImpl;

import javax.swing.*;

/**
 * The type My profile test.
 */
public class MyProfileTest {

    /**
     * Test application.
     */
    @Test
    public void testApplication() {
        // Setup
        final User userIn = null;
        final UserServiceImpl clientIn = null;
        final FriendServiceImpl friendClientIn = null;
        final JFrame frame = null;

        // Run the test
        MyProfile.application(userIn, clientIn, null, friendClientIn, frame);

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
        final FriendServiceImpl friendClientIn = null;
        final JFrame frame = null;

        // Run the test
       // MyProfile.initialize(userIn, clientIn, friendClientIn, frame);

        // Verify the results
    }
}
