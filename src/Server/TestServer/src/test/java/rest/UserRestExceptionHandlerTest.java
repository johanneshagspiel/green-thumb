package rest;

import com.luv2code.springdemo.rest.UserErrorResponse;
import com.luv2code.springdemo.rest.UserNotFoundException;
import com.luv2code.springdemo.rest.UserRestExceptionHandler;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.ResponseEntity;

import static org.junit.Assert.assertEquals;

/**
 * The type User rest exception handler test.
 */
public class UserRestExceptionHandlerTest {

    private UserRestExceptionHandler userRestExceptionHandlerUnderTest;

    /**
     * Sets up.
     */
    @Before
    public void setUp() {
        userRestExceptionHandlerUnderTest = new UserRestExceptionHandler();
    }

    /**
     * Test handle exception.
     */
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

    /**
     * Test handle exception 1.
     */
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
