package rest;

import com.luv2code.springdemo.rest.UserNotFoundException;
import org.jboss.logging.Message;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.awt.event.FocusEvent;

import static junit.framework.TestCase.assertEquals;
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

    @Test
    public void testConstructor() {
        UserNotFoundException test = new UserNotFoundException();
        assertEquals(test, null);
    }

    @Deprecated
    @Test
    public void testConstructor2() {
        Throwable test = null;
        UserNotFoundException test2 = new UserNotFoundException(test);
        assertEquals(test, null);
    }

    @Deprecated
    @Test
    public void testConstructor3() {
        String message = "Hello";
        Throwable test = null;
        UserNotFoundException test2 = new UserNotFoundException(message, test);
        assertEquals(test, null);
    }

}
