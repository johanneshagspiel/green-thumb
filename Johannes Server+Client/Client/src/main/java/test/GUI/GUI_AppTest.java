package test.GUI;

import GUI.GUI_App;
import entity.User;
import org.junit.Before;
import org.junit.Test;
import service.UserServiceImpl;

<<<<<<< .merge_file_a14328
/**
 * The type Gui app test.
 */
=======
>>>>>>> .merge_file_a05596
public class GUI_AppTest {

    private GUI_App gui_appUnderTest;

<<<<<<< .merge_file_a14328
    /**
     * Sets up.
     */
=======
>>>>>>> .merge_file_a05596
    @Before
    public void setUp() {
        gui_appUnderTest = null /* TODO: construct the instance */;
    }

<<<<<<< .merge_file_a14328
    /**
     * Test application.
     */
=======
>>>>>>> .merge_file_a05596
    @Test
    public void testApplication() {
        // Setup
        final String username = "username";
        final User userIn = null;
        final UserServiceImpl clientIn = null;

        // Run the test
        GUI_App.application(username, userIn, clientIn);

        // Verify the results
    }
}
