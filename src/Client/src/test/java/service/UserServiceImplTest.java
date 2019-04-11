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
        
    }

    /**
     * Test create user.
     */
    @Test
    public void testCreateUser() {
        // Setup

        // Run the test
        
        
        // Delete the user
        
    }

    /**
     * Test get user.
     */
    @Test
    public void testGetUser() {
        // Setup
        

        // Run the test
        

        // Verify the results
        
    }

    /**
     * Test get user 2.
     */
    @Test
    public void testGetUser2() {
        // Setup
    	createDelete = userServiceImplUnderTest.getUser2("Testing");
        final String user_name = "Testing";

        // Run the test
        final User result = userServiceImplUnderTest.getUser2(user_name);

        // Verify the results

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
        
    }

    /**
     * Test delete user.
     */
    @Test
    public void testZDeleteUser() {
        // Setup
        

        // Run the test
        

        // Verify the results
        
    }

    /**
     * Test update user.
     */
    @Test
    public void testUpdateUser() {
        // Setup
        

        // Run the test
        

        // Verify the results
    }
}
