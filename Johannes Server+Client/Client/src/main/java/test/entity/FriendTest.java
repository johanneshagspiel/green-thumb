package test.entity;

import entity.Friend;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FriendTest {

    private Friend friendUnderTest;

    @Before
    public void setUp() {
        friendUnderTest = new Friend();
    }

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
