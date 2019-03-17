package com.luv2code.springdemo.test.entity;

import com.luv2code.springdemo.entity.User;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * The type User test.
 */
public class UserTest {

    private User userUnderTest;

    /**
     * Sets up.
     */
    @Before
    public void setUp() {
        userUnderTest = new User();
    }

    /**
     * Test to string.
     */
    @Test
    public void testToString() {
        // Setup
        final String expectedResult = "result";

        // Run the test
        final String result = userUnderTest.toString();

        // Verify the results
        assertEquals(expectedResult, result);
    }
}
