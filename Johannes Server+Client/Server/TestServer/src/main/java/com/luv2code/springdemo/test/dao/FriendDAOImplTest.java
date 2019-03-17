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

<<<<<<< .merge_file_a08332
/**
 * The type Friend dao impl test.
 */
=======
>>>>>>> .merge_file_a03024
public class FriendDAOImplTest {

    @Mock
    private SessionFactory mockSessionFactory;

    @InjectMocks
    private FriendDAOImpl friendDAOImplUnderTest;

<<<<<<< .merge_file_a08332
    /**
     * Sets up.
     */
=======
>>>>>>> .merge_file_a03024
    @Before
    public void setUp() {
        initMocks(this);
    }

<<<<<<< .merge_file_a08332
    /**
     * Test get friends.
     */
=======
>>>>>>> .merge_file_a03024
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

<<<<<<< .merge_file_a08332
    /**
     * Test get friends 1.
     */
=======
>>>>>>> .merge_file_a03024
    @Test
    public void testGetFriends1() {
        // Setup
        final List<Friend> expectedResult = Arrays.asList();

        // Run the test
        final List<Friend> result = friendDAOImplUnderTest.getFriends();

        // Verify the results
        assertEquals(expectedResult, result);
    }

<<<<<<< .merge_file_a08332
    /**
     * Test save friend.
     */
=======
>>>>>>> .merge_file_a03024
    @Test
    public void testSaveFriend() {
        // Setup
        final Friend theFriend = null;

        // Run the test
        friendDAOImplUnderTest.saveFriend(theFriend);

        // Verify the results
    }

<<<<<<< .merge_file_a08332
    /**
     * Test delete friend.
     */
=======
>>>>>>> .merge_file_a03024
    @Test
    public void testDeleteFriend() {
        // Setup
        final int theId = 0;

        // Run the test
        friendDAOImplUnderTest.deleteFriend(theId);

        // Verify the results
    }
}
