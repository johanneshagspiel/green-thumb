package service;

import entity.User;
import org.junit.Before;
import org.junit.Test;
import service.UserServiceImpl;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * The type User service impl test.
 */
public class UserServiceImplTest {

    private UserServiceImpl userServiceImplUnderTest;
    private User createDelete;

    /**
     * Sets up.
     */
    @Before
    public void setUp() {
        userServiceImplUnderTest = new UserServiceImpl();
    }

    /**
     * Test get users.
     */
    @Test
    public void testGetUsers() {
        // Setup
        final List<User> expectedResult = Arrays.asList();

        // Run the test
        final List<User> result = userServiceImplUnderTest.getUsers();

        // Verify the results
        assertEquals(expectedResult, result);
    }

    /**
     * Test create user.
     */
    @Test
    public void testCreateUser() {
        // Setup
    	createDelete = new User();
    	createDelete.setUser_name("Testing");
    	createDelete.setPassword("pwd");
    	createDelete.setId(0);

        // Run the test
        userServiceImplUnderTest.createUser(createDelete);

        // Verify the results
        assertEquals(createDelete, userServiceImplUnderTest.getUser2("Testing"));
    }

    /**
     * Test get user.
     */
    @Test
    public void testGetUser() {
        // Setup
        final int theId = createDelete.getId();

        // Run the test
        final User result = userServiceImplUnderTest.getUser(theId);

        // Verify the results
        assertEquals(createDelete, result);
    }

    /**
     * Test get user 2.
     */
    @Test
    public void testGetUser2() {
        // Setup
        final String user_name = "Testing";

        // Run the test
        final User result = userServiceImplUnderTest.getUser2(user_name);

        // Verify the results
        assertEquals(createDelete, result);
    }

    /**
     * Test login.
     */
    @Test
    public void testLogin() {
        // Setup
        final String user_name = "Testing";
        final String password = "pwd";

        // Run the test
        final User result = userServiceImplUnderTest.login(user_name, password);

        // Verify the results
        assertEquals(createDelete, result);
    }

    /**
     * Test delete user.
     */
    @Test
    public void testZDeleteUser() {
        // Setup
        final int theId = createDelete.getId();
        final User user = null;

        // Run the test
        userServiceImplUnderTest.deleteUser(theId);

        // Verify the results
        assertEquals(userServiceImplUnderTest.getUser2("Testing"), user);
    }

    /**
     * Test update user.
     */
    @Test
    public void testUpdateUser() {
        // Setup
        final User theUser = null;

        // Run the test
        userServiceImplUnderTest.updateUser(theUser);

        // Verify the results
    }
}
