package test.GUI;

import GUI.Login_S;
import org.junit.Before;
import org.junit.Test;

public class Login_STest {

    private Login_S login_sUnderTest;

    @Before
    public void setUp() {
        login_sUnderTest = new Login_S();
    }

    @Test
    public void testMain() {
        // Setup
        final String[] args = new String[]{};

        // Run the test
        Login_S.main(args);

        // Verify the results
    }
}
