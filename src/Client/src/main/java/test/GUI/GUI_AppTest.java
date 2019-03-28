package GUI;

import GUI.GUI_App;
import entity.User;
import org.junit.Before;
import org.junit.Test;
import service.UserServiceImpl;

/**
 * The type Gui app test.
 */
public class GUI_AppTest {

    private GUI_App gui_appUnderTest;

    /**
     * Sets up.
     */
    @Before
    public void setUp() {
        gui_appUnderTest = null /* TODO: construct the instance */;
    }

    /**
     * Test application.
     */
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
