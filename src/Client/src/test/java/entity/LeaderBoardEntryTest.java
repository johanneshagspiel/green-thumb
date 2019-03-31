package entity;

import entity.LeaderBoardEntry;
import org.junit.Test;

import static org.junit.Assert.*;

public class LeaderBoardEntryTest {
	
	@Test
	public void test_Constructor() {
		LeaderBoardEntry Ardy = new LeaderBoardEntry("Ardy", 9001);
		assertNotNull(Ardy);
	}
	
	@Test
    public void test_getName() {
        LeaderBoardEntry test = new LeaderBoardEntry("test", 1);
        assertEquals(test.getName(), "test");
    }
	
	@Test
    public void test_setName() {
        LeaderBoardEntry test = new LeaderBoardEntry("test", 1);
        test.setName("Ardy");
        assertEquals(test.getName(), "Ardy");
    }
	
	@Test
    public void test_getScore() {
        LeaderBoardEntry test = new LeaderBoardEntry("test", 1);
        assertEquals(test.getScore(), 1);
    }

    @Test
    public void test_setScore() {
        LeaderBoardEntry test = new LeaderBoardEntry("test", 1);
        test.setScore(5);
        assertEquals(test.getScore(), 5);
    }
	
	

    @Test
    public void test_toString() {
    	LeaderBoardEntry Ardy = new LeaderBoardEntry("Ardy", 9001);
    	assertTrue(Ardy.toString().equals("Ardy, 9001"));
    }

    
}
