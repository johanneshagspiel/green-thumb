package service;

import entity.Friend;
import org.junit.Before;
import org.junit.Test;
import service.FriendServiceImpl;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * The type Friend service impl test.
 */
public class FriendServiceImplTest {

    private FriendServiceImpl friendServiceImplUnderTest;

    /**
     * Sets up.
     */
    @Before
    public void setUp() {
        friendServiceImplUnderTest = new FriendServiceImpl();
    }

    /**
     * Test get users.
     */
    @Test
    public void testGetUsers() {
        // Setup
        final List<Friend> expectedResult = Arrays.asList();

        // Run the test
        final List<Friend> result = friendServiceImplUnderTest.getUsers();

        // Verify the results
        assertNull(result);
    }

    /**
     * Test create friend.
     */
    @Test
    public void testCreateFriend() {
        // Setup
        final Friend theFriend = null;

        // Run the test
        friendServiceImplUnderTest.createFriend(theFriend);

        // Verify the results
    }

    /**
     * Test get friends.
     */
    @Test
    public void testGetFriends() {
        // Setup
        final String user_name_entry = "user_name_entry";
        final List<Friend> expectedResult = Arrays.asList();

        // Run the test
        final List<Friend> result = friendServiceImplUnderTest.getFriends(user_name_entry);

        // Verify the results
        assertEquals(expectedResult, result);
    }

    /**
     * Test delete user.
     */
    @Test
    public void testDeleteUser() {
        // Setup
        final int theId = 0;

        // Run the test
        friendServiceImplUnderTest.deleteUser(theId);

        // Verify the results
    }

    /**
     * Test update user.
     */
    @Test
    public void testUpdateUser() {
        // Setup
        final Friend theFriend = null;

        // Run the test
        friendServiceImplUnderTest.updateUser(theFriend);

        // Verify the results
    }
}
