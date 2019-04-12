package Server.test.java.dao;

import Server.dao.FriendDAOImpl;
import Server.entity.Friend;
import org.hibernate.SessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * The type Friend dao impl test.
 */
public class FriendDAOImplTest {

    @Mock
    private SessionFactory mockSessionFactory;

    @InjectMocks
    private FriendDAOImpl friendDAOImplUnderTest;

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
        final List<Friend> result = friendDAOImplUnderTest.getFriends(user_name_entry);

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
        final List<Friend> result = friendDAOImplUnderTest.getFriends();

        // Verify the results
        assertEquals(expectedResult, result);
    }

    /**
     * Test save friend.
     */
    @Test
    public void testSaveFriend() {
        // Setup
        final Friend theFriend = null;

        // Run the test
        friendDAOImplUnderTest.saveFriend(theFriend);

        // Verify the results
    }

    /**
     * Test delete friend.
     */
    @Test
    public void testDeleteFriend() {
        // Setup
        final int theId = 0;

        // Run the test
        friendDAOImplUnderTest.deleteFriend(theId);

        // Verify the results
    }
}
