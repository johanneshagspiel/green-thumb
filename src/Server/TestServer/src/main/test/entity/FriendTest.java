package entity;

import server.entity.Friend;
import org.junit.Test;

import static org.junit.Assert.*;

public class FriendTest {

    @Test
    public void getId() {
        Friend test = new Friend();
        test.setId(1);
        assertEquals(test.getId(),1);
    }

    @Test
    public void setId() {
        Friend test = new Friend();
        test.setId(1);
        assertEquals(test.getId(),1);
    }

    @Test
    public void getUserNameEntry() {
        Friend test = new Friend();
        test.setUserNameEntry("test");
        assertEquals(test.getUserNameEntry(),"test");
    }

    @Test
    public void setUserNameEntry() {
        Friend test = new Friend();
        test.setUserNameEntry("test");
        assertEquals(test.getUserNameEntry(),"test");
    }

    @Test
    public void getFriendName() {
        Friend test = new Friend();
        test.setFriendName("test");
        assertEquals(test.getFriendName(),"test");
    }

    @Test
    public void setFriendName() {
        Friend test = new Friend();
        test.setFriendName("test");
        assertEquals(test.getFriendName(),"test");
    }

    @Test
	public void testFriend_toString() {
		Friend Test = new Friend();
		Test.setId(12);
		Test.setFriendName("Ardy");
		Test.setUserNameEntry("Nick");
		assertEquals(Test.toString(), "Friend [id=12, user_name_entry=Nick, friend_name=Ardy]");
	}

}