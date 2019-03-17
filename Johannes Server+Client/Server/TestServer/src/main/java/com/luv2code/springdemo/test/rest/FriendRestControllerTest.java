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

/**
 * The type Friend rest controller test.
 */
public class FriendRestControllerTest {

    @Mock
    private FriendService mockFriendService;

    @InjectMocks
    private FriendRestController friendRestControllerUnderTest;

    /**
     * Sets up.
     */
    @Before
    public void setUp() {
        initMocks(this);
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
        final List<Friend> result = friendRestControllerUnderTest.getFriends(user_name_entry);

        // Verify the results
        assertEquals(expectedResult, result);
    }

    /**
     * Test get friends 1.
     */
    @Test
    public void testGetFriends1() {
        // Setup
        final List<Friend> expectedResult = Arrays.asList();

        // Run the test
        final List<Friend> result = friendRestControllerUnderTest.getFriends();

        // Verify the results
        assertEquals(expectedResult, result);
    }

    /**
     * Test add friend.
     */
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

    /**
     * Test update friend.
     */
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

    /**
     * Test delete friend.
     */
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
