package test.mainscreen;

import entity.User;
import mainscreen.FriendsProfile;
import org.junit.Test;
import service.UserServiceImpl;

<<<<<<< .merge_file_a16632
/**
 * The type Friends profile test.
 */
public class FriendsProfileTest {

    /**
     * Test application.
     */
=======
public class FriendsProfileTest {

>>>>>>> .merge_file_a09308
    @Test
    public void testApplication() {
        // Setup
        final User userIn = null;
        final UserServiceImpl clientIn = null;

        // Run the test
        FriendsProfile.application(userIn, clientIn);

        // Verify the results
    }

<<<<<<< .merge_file_a16632
    /**
     * Test initialize.
     */
=======
>>>>>>> .merge_file_a09308
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
