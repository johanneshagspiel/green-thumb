package com.luv2code.springdemo.test.rest;

import com.luv2code.springdemo.rest.UserErrorResponse;
import org.junit.Before;

/**
 * The type User error response test.
 */
public class UserErrorResponseTest {

    private UserErrorResponse userErrorResponseUnderTest;

    /**
     * Sets up.
     */
    @Before
    public void setUp() {
        userErrorResponseUnderTest = new UserErrorResponse(0, "message", 0L);
    }
}
