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
		assertEquals(Test.getuserNameEntry(), null);
	}
	
	@Test
	public void testUsername_SetGet() {
		Friend Test = new Friend();
		Test.setuserNameEntry(Ardy);
		assertEquals(Test.getuserNameEntry(), Ardy);
	}
	
	@Test
	public void testUsername_SetGetSetGet() {
		Friend Test = new Friend();
		Test.setuserNameEntry(Ardy);
		assertEquals(Test.getuserNameEntry(), Ardy);
		Test.setuserNameEntry(Nick);
		assertEquals(Test.getuserNameEntry(), Nick);
	}
	
	@Test
	public void testFriendname_Get() {
		Friend Test = new Friend();
		assertEquals(Test.getfriendName(), null);
	}
	
	@Test
	public void testFriendname_SetGet() {
		Friend Test = new Friend();
		Test.setfriendName(Ardy);
		assertEquals(Test.getfriendName(), Ardy);
	}
	
	@Test
	public void testFriendname_SetGetSetGet() {
		Friend Test = new Friend();
		Test.setfriendName(Ardy);
		assertEquals(Test.getfriendName(), Ardy);
		Test.setfriendName(Nick);
		assertEquals(Test.getfriendName(), Nick);
	}
	
	@Test
	public void testFriend_toString() {
		Friend Test = new Friend();
		Test.setId(twelf);
		Test.setfriendName(Ardy);
		Test.setuserNameEntry(Nick);
		assertEquals(Test.toString(), "Friend [id=12, user_name_entry=Nick, friend_name=Ardy]");
	}
	
	

}
