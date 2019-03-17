package test.mainscreen;

import entity.User;
import mainscreen.AddFriend;
import org.junit.Test;
import service.UserServiceImpl;

<<<<<<< .merge_file_a20440
/**
 * The type Add friend test.
 */
public class AddFriendTest {

    /**
     * Test application.
     */
=======
public class AddFriendTest {

>>>>>>> .merge_file_a18996
    @Test
    public void testApplication() {
        // Setup
        final User userIn = null;
        final UserServiceImpl clientIn = null;

        // Run the test
        AddFriend.application(userIn, clientIn);

        // Verify the results
    }

<<<<<<< .merge_file_a20440
    /**
     * Test initialize.
     */
=======
>>>>>>> .merge_file_a18996
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
