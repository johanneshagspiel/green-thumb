package test.entity;

import static org.junit.jupiter.api.Assertions.*;

<<<<<<< .merge_file_a19012
/**
 * The type Friend test.
 */
public class FriendTest {

    private Friend friendUnderTest;

    /**
     * Sets up.
     */
    @Before
    public void setUp() {
        friendUnderTest = new Friend();
    }

    /**
     * Test to string.
     */
    @Test
    public void testToString() {
        // Setup
        final String expectedResult = "result";
=======
import org.junit.jupiter.api.Test;

import entity.Friend;

class FriendTest {
	
	@Test
	void testConstructor() {
		Friend Ardy = new Friend (5, "ArdyZ", "Nick");
		assertNotNull(Ardy);
	}
>>>>>>> .merge_file_a05732

	@Test
	void testGetIdTrue() {
		Friend Ardy = new Friend (5, "ArdyZ", "Nick");
		assertTrue(5 == Ardy.getId());
	}
	
	@Test
	void testGetIdFalse() {
		Friend Ardy = new Friend (21, "ArdyZ", "Nick");
		assertFalse(5 == Ardy.getId());
	}
	
	@Test
	void testSetIdTrue() {
		Friend Ardy = new Friend (5, "ArdyZ", "Nick");
		assertTrue(5 == Ardy.getId());
		Ardy.setId(21);
		assertTrue(21 == Ardy.getId());
	}
	
	@Test
	void testGetUser_name_entry() {
		Friend Ardy = new Friend (5, "ArdyZ", "Nick");
		assertTrue(Ardy.getUser_name_entry().equals("ArdyZ"));
	}
	
	@Test
	void testSetUser_name_entry() {
		Friend Ardy = new Friend (5, "ArdyZ", "Nick");
		assertTrue(Ardy.getUser_name_entry().equals("ArdyZ"));
		Ardy.setUser_name_entry("Johannes");
		assertTrue(Ardy.getUser_name_entry().equals("Johannes"));
	}
	
	@Test
	void testGetFriend_name() {
		Friend Ardy = new Friend (5, "ArdyZ", "Nick");
		assertTrue(Ardy.getFriend_name().equals("Nick"));
	}
	
	@Test
	void testSetFriend_name() {
		Friend Ardy = new Friend (5, "ArdyZ", "Nick");
		assertTrue(Ardy.getFriend_name().equals("Nick"));
		Ardy.setFriend_name("Johannes");
		assertTrue(Ardy.getFriend_name().equals("Johannes"));
	}
	
	@Test
	void testToString() {
		Friend Ardy = new Friend (5, "ArdyZ", "Nick");
		assertTrue(Ardy.toString().equals("Friend [id=5, user_name_entry=ArdyZ, friend_name=Nick]"));
	}

}
