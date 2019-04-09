package entity;


import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static entity.LeaderBoardEntry.userSupplyEntry;
import static org.junit.Assert.*;

public class LeaderBoardEntryTest {
    User karel = new User();
    Friend karelFriend = new Friend();
    User lukas = new User();
    @Before public void initialize(){

        karel.setVegetarian(100);
        karel.setUser_name("karel");
        karel.setPassword("asdf");
        karel.setTotal(1000);
        karel.setTotal_saved(1000);
        karel.setProduce(101);
        karel.setSolar(102);
        karel.setTemperature(103);
        karel.setBike(104);
        karel.setCar(105);
        karel.setPublic_transportation(106);
        karel.setId(107);
        karel.setFriendlist(null);


        karelFriend.setId(1);
        karelFriend.setUser_name_entry("karel");
        karelFriend.setFriend_name("lukas");


        lukas.setVegetarian(100);
        lukas.setUser_name("lukas");
        lukas.setPassword("asdf");
        lukas.setTotal(1000);
        lukas.setTotal_saved(1000);
        lukas.setProduce(101);
        lukas.setSolar(102);
        lukas.setTemperature(103);
        lukas.setBike(104);
        lukas.setCar(105);
        lukas.setPublic_transportation(106);
        lukas.setId(107);
        List<Friend> friends = new ArrayList<Friend>();
        friends.add(karelFriend);
        lukas.setFriendlist(friends);
    }
	
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
    public void testUserSupplyEntryVegetarian(){
        LeaderBoardEntry entry = new LeaderBoardEntry("You", 100);

        LeaderBoardEntry supplied = userSupplyEntry(lukas, "Vegetarian Score");
        assertEquals(entry.toString(), supplied.toString());
    }

    @Test
    public void testUserSupplyEntryTopTen(){
        LeaderBoardEntry entry = new LeaderBoardEntry("You", 1000);

        LeaderBoardEntry supplied = userSupplyEntry(lukas, "Leaderboard Top 10 CO2 Used");
        assertEquals(entry.toString(), supplied.toString());
    }

    @Test
    public void testUserSupplyEntryOverallScore(){
        LeaderBoardEntry entry = new LeaderBoardEntry("You", 1000);

        LeaderBoardEntry supplied = userSupplyEntry(lukas, "Overall Score");
        assertEquals(entry.toString(), supplied.toString());
    }

    @Test
    public void testUserSupplyEntryProduceScore() {
        LeaderBoardEntry entry = new LeaderBoardEntry("You", 101);

        LeaderBoardEntry supplied = userSupplyEntry(lukas, "Produce Score");
        assertEquals(entry.toString(), supplied.toString());
    }

    @Test
    public void testUserSupplyEntryCarScore() {
        LeaderBoardEntry entry = new LeaderBoardEntry("You", 105);

        LeaderBoardEntry supplied = userSupplyEntry(lukas, "Car Score");
        assertEquals(entry.toString(), supplied.toString());
    }

    @Test
    public void testUserSupplyEntryPublTransportScore() {
        LeaderBoardEntry entry = new LeaderBoardEntry("You", 106);

        LeaderBoardEntry supplied = userSupplyEntry(lukas, "Public Transportation Score");
        assertEquals(entry.toString(), supplied.toString());
    }

    @Test
    public void testUserSupplyEntryBikeScore() {
        LeaderBoardEntry entry = new LeaderBoardEntry("You", 104);

        LeaderBoardEntry supplied = userSupplyEntry(lukas, "Bike Score");
        assertEquals(entry.toString(), supplied.toString());
    }

    @Test
    public void testUserSupplyEntryTemperatureScore() {
        LeaderBoardEntry entry = new LeaderBoardEntry("You", 103);

        LeaderBoardEntry supplied = userSupplyEntry(lukas, "Temperature Score");
        assertEquals(entry.toString(), supplied.toString());
    }

    @Test
    public void testUserSupplyEntrySolarScore() {
        LeaderBoardEntry entry = new LeaderBoardEntry("You", 102);

        LeaderBoardEntry supplied = userSupplyEntry(lukas, "Solar Score");
        assertEquals(entry.toString(), supplied.toString());
    }

    @Test
    public void testUserSupplyEntryOverallCO2Saved() {
        LeaderBoardEntry entry = new LeaderBoardEntry("You", 1000);

        LeaderBoardEntry supplied = userSupplyEntry(lukas, "Overall CO2 Saved");
        assertEquals(entry.toString(), supplied.toString());
    }

    @Test
    public void testUserSupplyEntryElse(){
        LeaderBoardEntry entry = null;

        LeaderBoardEntry supplied = userSupplyEntry(lukas, "asdfsadfsadffadf");
        assertEquals(entry, supplied);
    }
}
