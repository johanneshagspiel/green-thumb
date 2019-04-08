package rest;

import com.luv2code.springdemo.entity.User;
import com.luv2code.springdemo.rest.UserRestController;
import com.luv2code.springdemo.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * The type User rest controller test.
 */
public class UserRestControllerTest {

    @Mock
    private UserService mockUserService;

    @InjectMocks
    private UserRestController userRestControllerUnderTest;

    /**
     * Sets up.
     */
    @Before
    public void setUp() {
        initMocks(this);
    }

    /**
     * Test get users.
     */
    @Test
    public void testGetUsers() {
        // Setup
        final List<User> expectedResult = Arrays.asList();

        // Run the test
        final List<User> result = userRestControllerUnderTest.getUsers();

        // Verify the results
        assertEquals(expectedResult, result);
    }

    /**
     * Test get user.
     */
    @Test
    public void testGetUser() {
        // Setup
        final int userId = 0;
        final User expectedResult = null;

        // Run the test
        final User result = userRestControllerUnderTest.getUser(userId);

        // Verify the results
        assertEquals(expectedResult, result);
    }

    /**
     * Test get user 2.
     */
    @Test
    public void testGetUser2() {
        // Setup
        final String user_name = "user_name";
        final String password = "password";
        final User expectedResult = null;

        // Run the test
        final User result = userRestControllerUnderTest.getUser2(user_name, password);

        // Verify the results
        assertEquals(expectedResult, result);
    }

    /**
     * Test get user 3.
     */
    @Test
    public void testGetUser3() {
        // Setup
        final String user_name = "user_name";
        final User expectedResult = null;

        // Run the test
        final User result = userRestControllerUnderTest.getUser3(user_name);

        // Verify the results
        assertEquals(expectedResult, result);
    }

    /**
     * Test add user.
     */
    @Test
    public void testAddUser() {
        // Setup
        final User theUser = null;
        final User expectedResult = null;

        // Run the test
        final User result = userRestControllerUnderTest.addUser(theUser);

        // Verify the results
        assertEquals(expectedResult, result);
    }

    /**
     * Test update user.
     */
    @Test
    public void testUpdateUser() {
        // Setup
        final User theUser = null;
        final User expectedResult = null;

        // Run the test
        final User result = userRestControllerUnderTest.updateUser(theUser);

        // Verify the results
        assertEquals(expectedResult, result);
    }

    /**
     * Test delete user.
     */
    @Test
    public void testDeleteUser() {
        // Setup
        final int userId = 0;
        final String expectedResult = "result";

        // Run the test
        final String result = userRestControllerUnderTest.deleteUser(userId);

        // Verify the results
        assertEquals(expectedResult, result);
    }
}
