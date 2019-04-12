package Server.test.java.rest;

import Server.entity.Friend;
import Server.rest.FriendRestController;
import Server.service.FriendService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;


import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * The type Friend rest controller test.
 */
@RunWith(MockitoJUnitRunner.class)
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
        int theId = 111;
        String user_name_entry = "Test2222";
        String friend_name = "Test1111";
        Friend test1 = new Friend();
        test1.setFriend_name(friend_name);
        test1.setUser_name_entry(user_name_entry);
        test1.setId(theId);

        int theId2 = 112;
        String user_name_entry2 = "Test2222";
        String friend_name2 = "Test3333";
        Friend test2 = new Friend();
        test2.setFriend_name(friend_name2);
        test2.setUser_name_entry(user_name_entry2);
        test2.setId(theId2);

        final List<Friend> expectedResult = new ArrayList<>();
        expectedResult.add(0, test1);
        expectedResult.add(1, test2);

        when(mockFriendService.getFriends()).thenReturn(expectedResult);
        assertEquals(expectedResult, friendRestControllerUnderTest.getFriends());
    }


    /**
     * Test get friends 1.
     */
    @Test
    public void testGetFriends1() {
        int theId = 111;
        String user_name_entry = "Test2222";
        String friend_name = "Test1111";
        Friend test1 = new Friend();
        test1.setFriend_name(friend_name);
        test1.setUser_name_entry(user_name_entry);
        test1.setId(theId);

        int theId2 = 112;
        String user_name_entry2 = "Test2222";
        String friend_name2 = "Test3333";
        Friend test2 = new Friend();
        test2.setFriend_name(friend_name2);
        test2.setUser_name_entry(user_name_entry2);
        test2.setId(theId2);

        final List<Friend> expectedResult = new ArrayList<>();
        expectedResult.add(0, test1);
        expectedResult.add(1, test2);

        when(mockFriendService.getFriends(user_name_entry)).thenReturn(expectedResult);
        assertEquals(expectedResult, friendRestControllerUnderTest.getFriends(user_name_entry));
    }

    /**
     * Test add friend.
     */
    @Test
    public void testAddFriend() {

        // Setup
        int theId = 111;
        String user_name_entry = "Test2222";
        String friend_name = "Test1111";
        Friend test = new Friend();
        test.setFriend_name(friend_name);
        test.setUser_name_entry(user_name_entry);
        test.setId(111);

        //Run the test
        when(mockFriendService.saveFriend(test)).thenReturn(test);
        assertEquals(test, friendRestControllerUnderTest.addFriend(test));
    }

    /**
     * Test update friend.
     */
    @Test
    public void testUpdateFriend() {
        // Setup
        int theId = 111;
        String user_name_entry = "Test2222";
        String friend_name = "Test1111";
        Friend test = new Friend();
        test.setFriend_name(friend_name);
        test.setUser_name_entry(user_name_entry);
        test.setId(111);

        //Run the test
        when(mockFriendService.saveFriend(test)).thenReturn(test);
        assertEquals(test, friendRestControllerUnderTest.updateFriend(test));
    }

    /**
     * Test delete friend.
     */
    @Test
    public void testDeleteFriend() {

        // Setup
        int theId = 111;
        String user_name_entry = "Test2222";
        String friend_name = "Test1111";
        Friend test = new Friend();
        test.setFriend_name(friend_name);
        test.setUser_name_entry(user_name_entry);
        test.setId(111);

        //Run the test
        when(mockFriendService.deleteFriend(111)).thenReturn(111);
        assertEquals("Deleted user id - " + 111, friendRestControllerUnderTest.deleteFriend(111));
    }
}
