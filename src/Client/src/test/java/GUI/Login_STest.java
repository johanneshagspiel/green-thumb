package test.GUI;

import GUI.Login_S;
import org.junit.Before;
import org.junit.Test;

/**
 * The type Login s test.
 */
public class Login_STest {

    private Login_S login_sUnderTest;

    /**
     * Sets up.
     */
    @Before
    public void setUp() {
        login_sUnderTest = new Login_S();
    }

    /**
     * Test main.
     */
    @Test
    public void testMain() {
        // Setup
        final String[] args = new String[]{};

        // Run the test
        Login_S.main(args);

        // Verify the results
    }
}
