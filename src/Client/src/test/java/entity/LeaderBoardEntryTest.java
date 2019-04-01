package entity;

import entity.LeaderBoardEntry;
import service.FriendServiceImpl;
import service.UserServiceImpl;

import org.junit.Test;

import static org.junit.Assert.*;

public class LeaderBoardEntryTest {
	
	//Fields
	User userIn;
	
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
    
    @Test
    public void test_createLeaderboard_Vegetarian() {
    	userIn = createTestUser();
    	String result = LeaderBoardEntry.createLeaderboard(userIn, "Vegetarian Score");
    	assertTrue(result.equals(""));
    }
    
    public User createTestUser() {
    	
    	// Create data for test
    	UserServiceImpl clientIn = new UserServiceImpl();
    	FriendServiceImpl client = new FriendServiceImpl();
    	
    	// Create first the user for all tests
    	User result1 = new User();
    	result1.setId(1);
    	result1.setUser_name("Ardy");
    	result1.setVegetarian(200);
    	result1.setProduce(200);
    	result1.setCar(200);
    	result1.setPublic_transportation(200);
    	result1.setBike(200);
    	result1.setTemperature(200);
    	result1.setSolar(200);
    	result1.setTotal_saved(1400);
    	result1.setTotal_used(200);
    	result1.setTotal(10000);
    	clientIn.createUser(result1);
    	
    	// Create second the user for all tests
    	User result2 = new User();
    	result2.setId(1);
    	result2.setUser_name("Johannes");
    	result2.setVegetarian(50);
    	result2.setProduce(300);
    	result2.setCar(50);
    	result2.setPublic_transportation(300);
    	result2.setBike(50);
    	result2.setTemperature(300);
    	result2.setSolar(50);
    	result2.setTotal_saved(1200);
    	result2.setTotal_used(300);
    	result2.setTotal(9800);
    	clientIn.createUser(result2);
    	
    	// Create first the user for all tests
    	User result3 = new User();
    	result3.setId(1);
    	result3.setUser_name("Nick");
    	result3.setVegetarian(375);
    	result3.setProduce(50);
    	result3.setCar(350);
    	result3.setPublic_transportation(50);
    	result3.setBike(350);
    	result3.setTemperature(50);
    	result3.setSolar(350);
    	result3.setTotal_saved(1425);
    	result3.setTotal_used(150);
    	result3.setTotal(10025);
    	clientIn.createUser(result3);
    	
    	// Create first friend
    	Friend friend1 = new Friend();
    	friend1.setId(1);
    	friend1.setUser_name_entry("Ardy");
    	friend1.setFriend_name("Johannes");
    	client.createFriend(friend1);
    	
    	// Create first friend
    	Friend friend2 = new Friend();
    	friend2.setId(1);
    	friend2.setUser_name_entry("Ardy");
    	friend2.setFriend_name("Nick");
    	client.createFriend(friend2);
    	
    	return result1;
    }

    
}
