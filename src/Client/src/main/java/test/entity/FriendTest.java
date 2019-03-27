package entity;

import entity.Friend;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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

        // Run the test
        final String result = friendUnderTest.toString();

        // Verify the results
        assertEquals(expectedResult, result);
    }

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
    public void getUser_name_entry() {
        Friend test = new Friend();
        test.setUser_name_entry("test");
        assertEquals(test.getUser_name_entry(),"test");
    }

    @Test
    public void setUser_name_entry() {
        Friend test = new Friend();
        test.setUser_name_entry("test");
        assertEquals(test.getUser_name_entry(),"test");
    }

    @Test
    public void getFriend_name() {
        Friend test = new Friend();
        test.setFriend_name("test");
        assertEquals(test.getFriend_name(),"test");
    }

    @Test
    public void setFriend_name() {
        Friend test = new Friend();
        test.setFriend_name("test");
        assertEquals(test.getFriend_name(),"test");
    }


}
