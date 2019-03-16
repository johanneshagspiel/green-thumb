package com.luv2code.springdemo.test.dao;

import com.luv2code.springdemo.dao.FriendDAOImpl;
import com.luv2code.springdemo.entity.Friend;
import org.hibernate.SessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

public class FriendDAOImplTest {

    @Mock
    private SessionFactory mockSessionFactory;

    @InjectMocks
    private FriendDAOImpl friendDAOImplUnderTest;

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
        final List<Friend> result = friendDAOImplUnderTest.getFriends(user_name_entry);

        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public void testGetFriends1() {
        // Setup
        final List<Friend> expectedResult = Arrays.asList();

        // Run the test
        final List<Friend> result = friendDAOImplUnderTest.getFriends();

        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public void testSaveFriend() {
        // Setup
        final Friend theFriend = null;

        // Run the test
        friendDAOImplUnderTest.saveFriend(theFriend);

        // Verify the results
    }

    @Test
    public void testDeleteFriend() {
        // Setup
        final int theId = 0;

        // Run the test
        friendDAOImplUnderTest.deleteFriend(theId);

        // Verify the results
    }
}
