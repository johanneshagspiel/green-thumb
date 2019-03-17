package test.GUI;

import GUI.Login_S;
import org.junit.Before;
import org.junit.Test;

<<<<<<< .merge_file_a18576
/**
 * The type Login s test.
 */
=======
>>>>>>> .merge_file_a05864
public class Login_STest {

    private Login_S login_sUnderTest;

<<<<<<< .merge_file_a18576
    /**
     * Sets up.
     */
=======
>>>>>>> .merge_file_a05864
    @Before
    public void setUp() {
        login_sUnderTest = new Login_S();
    }

<<<<<<< .merge_file_a18576
    /**
     * Test main.
     */
=======
>>>>>>> .merge_file_a05864
    @Test
    public void testMain() {
        // Setup
        final String[] args = new String[]{};

        // Run the test
        Login_S.main(args);

        // Verify the results
    }
}
