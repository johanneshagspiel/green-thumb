package test.service;

import entity.Friend;
import org.junit.Before;
import org.junit.Test;
import service.FriendServiceImpl;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

<<<<<<< .merge_file_a13180
/**
 * The type Friend service impl test.
 */
=======
>>>>>>> .merge_file_a10800
public class FriendServiceImplTest {

    private FriendServiceImpl friendServiceImplUnderTest;

<<<<<<< .merge_file_a13180
    /**
     * Sets up.
     */
=======
>>>>>>> .merge_file_a10800
    @Before
    public void setUp() {
        friendServiceImplUnderTest = new FriendServiceImpl();
    }

<<<<<<< .merge_file_a13180
    /**
     * Test get users.
     */
=======
>>>>>>> .merge_file_a10800
    @Test
    public void testGetUsers() {
        // Setup
        final List<Friend> expectedResult = Arrays.asList();

        // Run the test
        final List<Friend> result = friendServiceImplUnderTest.getUsers();

        // Verify the results
        assertEquals(expectedResult, result);
    }

<<<<<<< .merge_file_a13180
    /**
     * Test create friend.
     */
=======
>>>>>>> .merge_file_a10800
    @Test
    public void testCreateFriend() {
        // Setup
        final Friend theFriend = null;

        // Run the test
        friendServiceImplUnderTest.createFriend(theFriend);

        // Verify the results
    }

<<<<<<< .merge_file_a13180
    /**
     * Test get friends.
     */
=======
>>>>>>> .merge_file_a10800
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

<<<<<<< .merge_file_a13180
    /**
     * Test delete user.
     */
=======
>>>>>>> .merge_file_a10800
    @Test
    public void testDeleteUser() {
        // Setup
        final int theId = 0;

        // Run the test
        friendServiceImplUnderTest.deleteUser(theId);

        // Verify the results
    }

<<<<<<< .merge_file_a13180
    /**
     * Test update user.
     */
=======
>>>>>>> .merge_file_a10800
    @Test
    public void testUpdateUser() {
        // Setup
        final Friend theFriend = null;

        // Run the test
        friendServiceImplUnderTest.updateUser(theFriend);

        // Verify the results
    }
}
