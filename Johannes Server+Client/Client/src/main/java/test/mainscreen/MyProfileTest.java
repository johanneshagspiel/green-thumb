package test.mainscreen;

import entity.User;
import mainscreen.MyProfile;
import org.junit.Test;
import service.UserServiceImpl;

<<<<<<< .merge_file_a16280
/**
 * The type My profile test.
 */
public class MyProfileTest {

    /**
     * Test application.
     */
=======
public class MyProfileTest {

>>>>>>> .merge_file_a16296
    @Test
    public void testApplication() {
        // Setup
        final User userIn = null;
        final UserServiceImpl clientIn = null;

        // Run the test
        MyProfile.application(userIn, clientIn);

        // Verify the results
    }

<<<<<<< .merge_file_a16280
    /**
     * Test initialize.
     */
=======
>>>>>>> .merge_file_a16296
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
