package com.luv2code.springdemo.test.rest;

import com.luv2code.springdemo.entity.Friend;
import com.luv2code.springdemo.rest.FriendRestController;
import com.luv2code.springdemo.service.FriendService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

<<<<<<< .merge_file_a15196
/**
 * The type Friend rest controller test.
 */
=======
>>>>>>> .merge_file_a08392
public class FriendRestControllerTest {

    @Mock
    private FriendService mockFriendService;

    @InjectMocks
    private FriendRestController friendRestControllerUnderTest;

<<<<<<< .merge_file_a15196
    /**
     * Sets up.
     */
=======
>>>>>>> .merge_file_a08392
    @Before
    public void setUp() {
        initMocks(this);
    }

<<<<<<< .merge_file_a15196
    /**
     * Test get friends.
     */
=======
>>>>>>> .merge_file_a08392
    @Test
    public void testGetFriends() {
        // Setup
        final String user_name_entry = "user_name_entry";
        final List<Friend> expectedResult = Arrays.asList();

        // Run the test
        final List<Friend> result = friendRestControllerUnderTest.getFriends(user_name_entry);

        // Verify the results
        assertEquals(expectedResult, result);
    }

<<<<<<< .merge_file_a15196
    /**
     * Test get friends 1.
     */
=======
>>>>>>> .merge_file_a08392
    @Test
    public void testGetFriends1() {
        // Setup
        final List<Friend> expectedResult = Arrays.asList();

        // Run the test
        final List<Friend> result = friendRestControllerUnderTest.getFriends();

        // Verify the results
        assertEquals(expectedResult, result);
    }

<<<<<<< .merge_file_a15196
    /**
     * Test add friend.
     */
=======
>>>>>>> .merge_file_a08392
    @Test
    public void testAddFriend() {
        // Setup
        final Friend theFriend = null;
        final Friend expectedResult = null;

        // Run the test
        final Friend result = friendRestControllerUnderTest.addFriend(theFriend);

        // Verify the results
        assertEquals(expectedResult, result);
    }

<<<<<<< .merge_file_a15196
    /**
     * Test update friend.
     */
=======
>>>>>>> .merge_file_a08392
    @Test
    public void testUpdateFriend() {
        // Setup
        final Friend theFriend = null;
        final Friend expectedResult = null;

        // Run the test
        final Friend result = friendRestControllerUnderTest.updateFriend(theFriend);

        // Verify the results
        assertEquals(expectedResult, result);
    }

<<<<<<< .merge_file_a15196
    /**
     * Test delete friend.
     */
=======
>>>>>>> .merge_file_a08392
    @Test
    public void testDeleteFriend() {
        // Setup
        final int userId = 0;
        final String expectedResult = "result";

        // Run the test
        final String result = friendRestControllerUnderTest.deleteFriend(userId);

        // Verify the results
        assertEquals(expectedResult, result);
    }
}
