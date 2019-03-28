package test.entity;

import entity.Friend;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * The type Friend test.
 */
public class FriendTest {

	/**
	 * Test creates a Friend and tests if that is not null
	 */
	@Test
	public void testConstructor() {
		Friend test = new Friend(1, "Ardy", "Johannes");
		assertNotNull(test);
	}

	/**
	 * Test to string.
	 */
	@Test
	public void test_toString() {
		Friend test = new Friend(1, "Ardy", "Johannes");
		assertTrue(test.toString().equals("Friend [id=1, user_name_entry=Ardy, friend_name=Johannes]"));
	}

	@Test
	public void test_getId() {
		Friend test = new Friend(1, "Ardy", "Johannes");
		assertEquals(test.getId(), 1);
	}

	@Test
	public void test_setId() {
		Friend test = new Friend(1, "Ardy", "Johannes");
		test.setId(5);
		assertEquals(test.getId(), 5);
	}

	@Test
	public void test_getUser_name_entry() {
		Friend test = new Friend(1, "Ardy", "Johannes");
		assertEquals(test.getUser_name_entry(), "Ardy");
	}
	
	@Test
	public void test_setUser_name_entry() {
		Friend test = new Friend(1, "Ardy", "Johannes");
		test.setUser_name_entry("Nick");
		assertEquals(test.getUser_name_entry(), "Nick");
	}

	@Test
	public void test_getFriend_name() {
		Friend test = new Friend(1, "Ardy", "Johannes");
		assertEquals(test.getFriend_name(), "Johannes");
	}
	
	@Test
	public void test_setFriend_name() {
		Friend test = new Friend(1, "Ardy", "Johannes");
		test.setFriend_name("Nick");
		assertEquals(test.getFriend_name(), "Nick");
	}

}
