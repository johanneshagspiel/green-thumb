package service;

import entity.Friend;

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

import service.FriendServiceImpl;


/**
 * The type Friend service impl test.
 */
@RunWith(MockitoJUnitRunner.class)
public class FriendServiceImplTest {

    @Mock
    private FriendServiceImpl mockFriendServiceImpl;

    @InjectMocks
    public Friend test1;
    public Friend test2;

    /**
     * Sets up.
     */
    @Before
    public void setUp() {
        test1 = new Friend();
        test2 = new Friend();

        test1.setFriend_name("Test1111");
        test1.setUser_name_entry("Test2222");
        test1.setId(111);

        test2.setFriend_name("Test3333");
        test2.setUser_name_entry("Test2222");
        test2.setId(112);

        initMocks(this);
    }


    /**
     * Test create friend.
     */
    @Test
    public void testCreateFriend() {

        when(mockFriendServiceImpl.createFriend(test1)).thenReturn(test1);
        assertEquals(test1, mockFriendServiceImpl.createFriend(test1));
    }

    /**
     * Test get friends.
     */
    @Test
    public void testGetFriends() {

        final List<Friend> expectedResult = new ArrayList<>();
        expectedResult.add(0, test1);
        expectedResult.add(1, test2);

        when(mockFriendServiceImpl.getFriends("Test2222")).thenReturn(expectedResult);
        assertEquals(expectedResult, mockFriendServiceImpl.getFriends("Test2222"));
    }

    /**
     * Test delete user.
     */
    @Test
    public void testDeleteUser() {

        when(mockFriendServiceImpl.deleteUser(111)).thenReturn(111);
        assertEquals(111, mockFriendServiceImpl.deleteUser(111));
    }

    /**
     * Test update user.
     */
    @Test
    public void testUpdateUser() {

        when(mockFriendServiceImpl.updateUser(test1)).thenReturn(test1);
        assertEquals(test1, mockFriendServiceImpl.updateUser(test1));

    }
}
