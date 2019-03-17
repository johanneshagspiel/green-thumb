package com.luv2code.springdemo.test.rest;

import com.luv2code.springdemo.rest.UserNotFoundException;
import org.junit.Before;
import org.mockito.Mock;

import static org.mockito.MockitoAnnotations.initMocks;

/**
 * The type User not found exception test.
 */
public class UserNotFoundExceptionTest {

    @Mock
    private Throwable mockCause;

    private UserNotFoundException userNotFoundExceptionUnderTest;

    /**
     * Sets up.
     */
    @Before
    public void setUp() {
        initMocks(this);
        userNotFoundExceptionUnderTest = new UserNotFoundException("message", mockCause, false, false);
    }
}
