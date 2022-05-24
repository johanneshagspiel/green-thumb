package gui;

import org.junit.Before;
import org.junit.Test;

/**
 * The type Login s test.
 */
public class ApplicationTest {

    private Application applicationUnderTest;

    /**
     * Sets up.
     */
    @Before
    public void setUp() {
        applicationUnderTest = new Application();
    }

    /**
     * Test main.
     */
    @Test
    public void testMain() {
        // Setup
        final String[] args = new String[]{};

        // Run the test
        Application.main(args);

        // Verify the results
    }
}
