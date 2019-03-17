package com.luv2code.springdemo.test.entity;

import com.luv2code.springdemo.entity.User;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

<<<<<<< .merge_file_a10728
/**
 * The type User test.
 */
=======
>>>>>>> .merge_file_a03596
public class UserTest {

    private User userUnderTest;

<<<<<<< .merge_file_a10728
    /**
     * Sets up.
     */
=======
>>>>>>> .merge_file_a03596
    @Before
    public void setUp() {
        userUnderTest = new User();
    }

<<<<<<< .merge_file_a10728
    /**
     * Test to string.
     */
=======
>>>>>>> .merge_file_a03596
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
