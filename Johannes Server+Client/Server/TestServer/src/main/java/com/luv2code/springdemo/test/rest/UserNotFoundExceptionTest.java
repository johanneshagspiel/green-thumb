package com.luv2code.springdemo.test.rest;

import com.luv2code.springdemo.rest.UserNotFoundException;
import org.junit.Before;
import org.mockito.Mock;

import static org.mockito.MockitoAnnotations.initMocks;

<<<<<<< .merge_file_a15704
/**
 * The type User not found exception test.
 */
=======
>>>>>>> .merge_file_a02796
public class UserNotFoundExceptionTest {

    @Mock
    private Throwable mockCause;

    private UserNotFoundException userNotFoundExceptionUnderTest;

<<<<<<< .merge_file_a15704
    /**
     * Sets up.
     */
=======
>>>>>>> .merge_file_a02796
    @Before
    public void setUp() {
        initMocks(this);
        userNotFoundExceptionUnderTest = new UserNotFoundException("message", mockCause, false, false);
    }
}
