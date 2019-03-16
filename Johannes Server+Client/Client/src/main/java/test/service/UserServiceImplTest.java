package test.service;

import entity.User;
import org.junit.Before;
import org.junit.Test;
import service.UserServiceImpl;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class UserServiceImplTest {

    private UserServiceImpl userServiceImplUnderTest;

    @Before
    public void setUp() {
        userServiceImplUnderTest = new UserServiceImpl();
    }

    @Test
    public void testGetUsers() {
        // Setup
        final List<User> expectedResult = Arrays.asList();

        // Run the test
        final List<User> result = userServiceImplUnderTest.getUsers();

        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public void testCreateUser() {
        // Setup
        final User theUser = null;

        // Run the test
        userServiceImplUnderTest.createUser(theUser);

        // Verify the results
    }

    @Test
    public void testGetUser() {
        // Setup
        final int theId = 0;
        final User expectedResult = null;

        // Run the test
        final User result = userServiceImplUnderTest.getUser(theId);

        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public void testGetUser2() {
        // Setup
        final String user_name = "user_name";
        final User expectedResult = null;

        // Run the test
        final User result = userServiceImplUnderTest.getUser2(user_name);

        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public void testLogin() {
        // Setup
        final String user_name = "user_name";
        final String password = "password";
        final User expectedResult = null;

        // Run the test
        final User result = userServiceImplUnderTest.login(user_name, password);

        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public void testDeleteUser() {
        // Setup
        final int theId = 0;

        // Run the test
        userServiceImplUnderTest.deleteUser(theId);

        // Verify the results
    }

    @Test
    public void testUpdateUser() {
        // Setup
        final User theUser = null;

        // Run the test
        userServiceImplUnderTest.updateUser(theUser);

        // Verify the results
    }
}
