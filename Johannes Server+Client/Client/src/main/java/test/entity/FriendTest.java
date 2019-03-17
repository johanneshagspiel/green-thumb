package test.entity;

import entity.Friend;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * The type Friend test.
 */
public class FriendTest {

    private Friend friendUnderTest;

    /**
     * Sets up.
     */
    @Before
    public void setUp() {
        friendUnderTest = new Friend();
    }

    /**
     * Test to string.
     */
    @Test
    public void testToString() {
        // Setup
        final String expectedResult = "result";

        // Run the test
        final String result = friendUnderTest.toString();

        // Verify the results
        assertEquals(expectedResult, result);
    }
}
