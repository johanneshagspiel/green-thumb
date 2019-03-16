package com.luv2code.springdemo.test.service;

import com.luv2code.springdemo.dao.FriendDAO;
import com.luv2code.springdemo.entity.Friend;
import com.luv2code.springdemo.service.FriendServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

public class FriendServiceImplTest {

    @Mock
    private FriendDAO mockFriendDAO;

    @InjectMocks
    private FriendServiceImpl friendServiceImplUnderTest;

    @Before
    public void setUp() {
        initMocks(this);
    }

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

    @Test
    public void testGetFriends1() {
        // Setup
        final List<Friend> expectedResult = Arrays.asList();

        // Run the test
        final List<Friend> result = friendServiceImplUnderTest.getFriends();

        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public void testSaveFriend() {
        // Setup
        final Friend theFriend = null;

        // Run the test
        friendServiceImplUnderTest.saveFriend(theFriend);

        // Verify the results
    }

    @Test
    public void testDeleteFriend() {
        // Setup
        final int theId = 0;

        // Run the test
        friendServiceImplUnderTest.deleteFriend(theId);

        // Verify the results
    }
}
