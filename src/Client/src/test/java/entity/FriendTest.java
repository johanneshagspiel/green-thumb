package entity;

import static org.junit.Assert.*;

import org.junit.Test;

public class FriendTest {

	final int nul = 0;
	final int twelf = 12;
	final int twelfhunderd = 1200;
	
	final String Ardy = "Ardy";
	final String Nick = "Nick";
	
	@Test
	public void testConstructor() {
		Friend Test = new Friend();
		assertNotNull(Test);
	}
	
	@Test
	public void testId_Get() {
		Friend Test = new Friend();
		assertEquals(Test.getId(), nul);
	}
	
	@Test
	public void testId_SetGet() {
		Friend Test = new Friend();
		Test.setId(twelf);
		assertEquals(Test.getId(), twelf);
	}
	
	@Test
	public void testId_SetGetSetGet() {
		Friend Test = new Friend();
		Test.setId(twelf);
		assertEquals(Test.getId(), twelf);
		Test.setId(twelfhunderd);
		assertEquals(Test.getId(), twelfhunderd);
	}
	
	@Test
	public void testUsername_Get() {
		Friend Test = new Friend();
		assertEquals(Test.getUser_name_entry(), null);
	}
	
	@Test
	public void testUsername_SetGet() {
		Friend Test = new Friend();
		Test.setUser_name_entry(Ardy);
		assertEquals(Test.getUser_name_entry(), Ardy);
	}
	
	@Test
	public void testUsername_SetGetSetGet() {
		Friend Test = new Friend();
		Test.setUser_name_entry(Ardy);
		assertEquals(Test.getUser_name_entry(), Ardy);
		Test.setUser_name_entry(Nick);
		assertEquals(Test.getUser_name_entry(), Nick);
	}
	
	@Test
	public void testFriendname_Get() {
		Friend Test = new Friend();
		assertEquals(Test.getFriend_name(), null);
	}
	
	@Test
	public void testFriendname_SetGet() {
		Friend Test = new Friend();
		Test.setFriend_name(Ardy);
		assertEquals(Test.getFriend_name(), Ardy);
	}
	
	@Test
	public void testFriendname_SetGetSetGet() {
		Friend Test = new Friend();
		Test.setFriend_name(Ardy);
		assertEquals(Test.getFriend_name(), Ardy);
		Test.setFriend_name(Nick);
		assertEquals(Test.getFriend_name(), Nick);
	}
	
	@Test
	public void testFriend_toString() {
		Friend Test = new Friend();
		Test.setId(twelf);
		Test.setFriend_name(Ardy);
		Test.setUser_name_entry(Nick);
		assertEquals(Test.toString(), "Friend [id=12, user_name_entry=Nick, friend_name=Ardy]");
	}
	
	

}
