package com.luv2code.springdemo.test.rest;

import com.luv2code.springdemo.rest.UserErrorResponse;
import com.luv2code.springdemo.rest.UserNotFoundException;
import com.luv2code.springdemo.rest.UserRestExceptionHandler;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.ResponseEntity;

import static org.junit.Assert.assertEquals;

<<<<<<< .merge_file_a07116
/**
 * The type User rest exception handler test.
 */
=======
>>>>>>> .merge_file_a18964
public class UserRestExceptionHandlerTest {

    private UserRestExceptionHandler userRestExceptionHandlerUnderTest;

<<<<<<< .merge_file_a07116
    /**
     * Sets up.
     */
=======
>>>>>>> .merge_file_a18964
    @Before
    public void setUp() {
        userRestExceptionHandlerUnderTest = new UserRestExceptionHandler();
    }

<<<<<<< .merge_file_a07116
    /**
     * Test handle exception.
     */
=======
>>>>>>> .merge_file_a18964
    @Test
    public void testHandleException() {
        // Setup
        final UserNotFoundException exc = null;
        final ResponseEntity<UserErrorResponse> expectedResult = null;

        // Run the test
        final ResponseEntity<UserErrorResponse> result = userRestExceptionHandlerUnderTest.handleException(exc);

        // Verify the results
        assertEquals(expectedResult, result);
    }

<<<<<<< .merge_file_a07116
    /**
     * Test handle exception 1.
     */
=======
>>>>>>> .merge_file_a18964
    @Test
    public void testHandleException1() {
        // Setup
        final Exception exc = null;
        final ResponseEntity<UserErrorResponse> expectedResult = null;

        // Run the test
        final ResponseEntity<UserErrorResponse> result = userRestExceptionHandlerUnderTest.handleException(exc);

        // Verify the results
        assertEquals(expectedResult, result);
    }
}
