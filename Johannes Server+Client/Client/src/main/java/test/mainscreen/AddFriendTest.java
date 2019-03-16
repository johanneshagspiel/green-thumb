package test.mainscreen;

import entity.User;
import mainscreen.AddFriend;
import org.junit.Test;
import service.UserServiceImpl;

public class AddFriendTest {

    @Test
    public void testApplication() {
        // Setup
        final User userIn = null;
        final UserServiceImpl clientIn = null;

        // Run the test
        AddFriend.application(userIn, clientIn);

        // Verify the results
    }

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
