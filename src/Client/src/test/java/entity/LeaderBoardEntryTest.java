package entity;


import org.junit.Before;
import org.junit.Test;
import service.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;

import static entity.LeaderBoardEntry.*;
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

    @Test
    public void testCreateLeaderboardVegetarian(){
        /*
            This only works if you have a user Test with values
            Test, pwd, 60, 0, 0, 0, 0, 0, 0, 69, 0, 1179

            and a user Test5 with values
            Test5, pwd, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10

            And the only friend Test has is Test5
         */
        UserServiceImpl uservice = new UserServiceImpl();
        User userIn = uservice.getUser2("Test");
        String output = createLeaderboard(userIn, "Vegetarian Score");
        String expected = "<html>Rank 1: You, 60<br/>Rank 2: Test5, 1<br/></html>";
        assertEquals(expected, output);
    }

    @Test
    public void testCreateLeaderboardTopTenUsed(){
        /*
            This only works if you have a user Test with values
            Test, pwd, 60, 0, 0, 0, 0, 0, 0, 69, 0, 1179

            and a user Test5 with values
            Test5, pwd, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10

            And the only friend Test has is Test5
         */
        UserServiceImpl uservice = new UserServiceImpl();
        User userIn = uservice.getUser2("Test");
        String output = createLeaderboard(userIn, "Leaderboard Top 10 CO2 Used");
        String expected = "<html>Rank 1: You, 1179<br/>Rank 2: Test5, 10<br/></html>";
        assertEquals(expected, output);
    }
    @Test
    public void testCreateLeaderboardOverallScore(){
        /*
            This only works if you have a user Test with values
            Test, pwd, 60, 0, 0, 0, 0, 0, 0, 69, 0, 1179

            and a user Test5 with values
            Test5, pwd, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10

            And the only friend Test has is Test5
         */
        UserServiceImpl uservice = new UserServiceImpl();
        User userIn = uservice.getUser2("Test");
        String output = createLeaderboard(userIn, "Overall Score");
        String expected = "<html>Rank 1: You, 1179<br/>Rank 2: Test5, 10<br/></html>";
        assertEquals(expected, output);
    }

    @Test
    public void testCreateLeaderboardProduce(){
        /*
            This only works if you have a user Test with values
            Test, pwd, 60, 0, 0, 0, 0, 0, 0, 69, 0, 1179

            and a user Test5 with values
            Test5, pwd, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10

            And the only friend Test has is Test5
         */
        UserServiceImpl uservice = new UserServiceImpl();
        User userIn = uservice.getUser2("Test");
        String output = createLeaderboard(userIn, "Produce Score");
        String expected = "<html>Rank 1: Test5, 2<br/>Rank 2: You, 0<br/></html>";
        assertEquals(expected, output);
    }

    @Test
    public void testCreateLeaderboardCarScore(){
        /*
            This only works if you have a user Test with values
            Test, pwd, 60, 0, 0, 0, 0, 0, 0, 69, 0, 1179

            and a user Test5 with values
            Test5, pwd, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10

            And the only friend Test has is Test5
         */
        UserServiceImpl uservice = new UserServiceImpl();
        User userIn = uservice.getUser2("Test");
        String output = createLeaderboard(userIn, "Car Score");
        String expected = "<html>Rank 1: Test5, 3<br/>Rank 2: You, 0<br/></html>";
        assertEquals(expected, output);
    }

    @Test
    public void testCreateLeaderboardPublicTransportScore(){
        /*
            This only works if you have a user Test with values
            Test, pwd, 60, 0, 0, 0, 0, 0, 0, 69, 0, 1179

            and a user Test5 with values
            Test5, pwd, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10

            And the only friend Test has is Test5
         */
        UserServiceImpl uservice = new UserServiceImpl();
        User userIn = uservice.getUser2("Test");
        String output = createLeaderboard(userIn, "Public Transportation Score");
        String expected = "<html>Rank 1: Test5, 4<br/>Rank 2: You, 0<br/></html>";
        assertEquals(expected, output);
    }

    @Test
    public void testCreateLeaderboardBikeScore(){
        /*
            This only works if you have a user Test with values
            Test, pwd, 60, 0, 0, 0, 0, 0, 0, 69, 0, 1179

            and a user Test5 with values
            Test5, pwd, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10

            And the only friend Test has is Test5
         */
        UserServiceImpl uservice = new UserServiceImpl();
        User userIn = uservice.getUser2("Test");
        String output = createLeaderboard(userIn, "Bike Score");
        String expected = "<html>Rank 1: Test5, 5<br/>Rank 2: You, 0<br/></html>";
        assertEquals(expected, output);
    }

    @Test
    public void testCreateLeaderboardTemperature(){
        /*
            This only works if you have a user Test with values
            Test, pwd, 60, 0, 0, 0, 0, 0, 0, 69, 0, 1179

            and a user Test5 with values
            Test5, pwd, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10

            And the only friend Test has is Test5
         */
        UserServiceImpl uservice = new UserServiceImpl();
        User userIn = uservice.getUser2("Test");
        String output = createLeaderboard(userIn, "Temperature Score");
        String expected = "<html>Rank 1: Test5, 6<br/>Rank 2: You, 0<br/></html>";
        assertEquals(expected, output);
    }

    @Test
    public void testCreateLeaderboardSolarScore(){
        /*
            This only works if you have a user Test with values
            Test, pwd, 60, 0, 0, 0, 0, 0, 0, 69, 0, 1179

            and a user Test5 with values
            Test5, pwd, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10

            And the only friend Test has is Test5
         */
        UserServiceImpl uservice = new UserServiceImpl();
        User userIn = uservice.getUser2("Test");
        String output = createLeaderboard(userIn, "Solar Score");
        String expected = "<html>Rank 1: Test5, 7<br/>Rank 2: You, 0<br/></html>";
        assertEquals(expected, output);
    }

    @Test
    public void testCreateLeaderboardOverallCO2Saved(){
        /*
            This only works if you have a user Test with values
            Test, pwd, 60, 0, 0, 0, 0, 0, 0, 69, 0, 1179

            and a user Test5 with values
            Test5, pwd, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10

            And the only friend Test has is Test5
         */
        UserServiceImpl uservice = new UserServiceImpl();
        User userIn = uservice.getUser2("Test");
        String output = createLeaderboard(userIn, "Overall CO2 Saved");
        String expected = "<html>Rank 1: You, 69<br/>Rank 2: Test5, 8<br/></html>";
        assertEquals(expected, output);
    }

    @Test(expected = NullPointerException.class)
    public void testCreateLeaderboardRandomString(){
        /*
            This only works if you have a user Test with values
            Test, pwd, 60, 0, 0, 0, 0, 0, 0, 69, 0, 1179

            and a user Test5 with values
            Test5, pwd, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10

            And the only friend Test has is Test5
         */
        UserServiceImpl uservice = new UserServiceImpl();
        User userIn = uservice.getUser2("Test");
        String output = createLeaderboard(userIn, "asdf");
        String expected = "<html>Rank 1: You, 0<br/>Rank 2: Test5, 0<br/></html>";
        assertEquals(expected, output);
    }

    @Test
    public void testPointSupplierVegetarian(){
        /*
            This only works if you have a user Test with values
            Test, pwd, 60, 0, 0, 0, 0, 0, 0, 69, 0, 1179

            and a user Test5 with values
            Test5, pwd, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10

            And the only friend Test has is Test5
         */
        UserServiceImpl uservice = new UserServiceImpl();
        User userIn = uservice.getUser2("Test");
        int output = pointSupplier(userIn, "Vegetarian Score");
        int expected = 60;
        assertEquals(expected, output);
    }

    @Test
    public void testPointSupplierTopTen(){
        /*
            This only works if you have a user Test with values
            Test, pwd, 60, 0, 0, 0, 0, 0, 0, 69, 0, 1179

            and a user Test5 with values
            Test5, pwd, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10

            And the only friend Test has is Test5
         */
        UserServiceImpl uservice = new UserServiceImpl();
        User userIn = uservice.getUser2("Test");
        int output = pointSupplier(userIn, "Leaderboard Top 10 CO2 Used");
        int expected = 1179;
        assertEquals(expected, output);
    }

    @Test
    public void testPointSupplierOverall(){
        /*
            This only works if you have a user Test with values
            Test, pwd, 60, 0, 0, 0, 0, 0, 0, 69, 0, 1179

            and a user Test5 with values
            Test5, pwd, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10

            And the only friend Test has is Test5
         */
        UserServiceImpl uservice = new UserServiceImpl();
        User userIn = uservice.getUser2("Test");
        int output = pointSupplier(userIn, "Overall Score");
        int expected = 1179;
        assertEquals(expected, output);
    }

    @Test
    public void testPointSupplierProduce(){
        /*
            This only works if you have a user Test with values
            Test, pwd, 60, 0, 0, 0, 0, 0, 0, 69, 0, 1179

            and a user Test5 with values
            Test5, pwd, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10

            And the only friend Test has is Test5
         */
        UserServiceImpl uservice = new UserServiceImpl();
        User userIn = uservice.getUser2("Test");
        int output = pointSupplier(userIn, "Produce Score");
        int expected = 0;
        assertEquals(expected, output);
    }

    @Test
    public void testPointSupplierCar(){
        /*
            This only works if you have a user Test with values
            Test, pwd, 60, 0, 0, 0, 0, 0, 0, 69, 0, 1179

            and a user Test5 with values
            Test5, pwd, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10

            And the only friend Test has is Test5
         */
        UserServiceImpl uservice = new UserServiceImpl();
        User userIn = uservice.getUser2("Test");
        int output = pointSupplier(userIn, "Car Score");
        int expected = 0;
        assertEquals(expected, output);
    }

    @Test
    public void testPointSupplierPublicTransport(){
        /*
            This only works if you have a user Test with values
            Test, pwd, 60, 0, 0, 0, 0, 0, 0, 69, 0, 1179

            and a user Test5 with values
            Test5, pwd, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10

            And the only friend Test has is Test5
         */
        UserServiceImpl uservice = new UserServiceImpl();
        User userIn = uservice.getUser2("Test");
        int output = pointSupplier(userIn, "Public Transportation Score");
        int expected = 0;
        assertEquals(expected, output);
    }

    @Test
    public void testPointSupplierBike(){
        /*
            This only works if you have a user Test with values
            Test, pwd, 60, 0, 0, 0, 0, 0, 0, 69, 0, 1179

            and a user Test5 with values
            Test5, pwd, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10

            And the only friend Test has is Test5
         */
        UserServiceImpl uservice = new UserServiceImpl();
        User userIn = uservice.getUser2("Test");
        int output = pointSupplier(userIn, "Bike Score");
        int expected = 0;
        assertEquals(expected, output);
    }

    @Test
    public void testPointSupplierTemperature(){
        /*
            This only works if you have a user Test with values
            Test, pwd, 60, 0, 0, 0, 0, 0, 0, 69, 0, 1179

            and a user Test5 with values
            Test5, pwd, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10

            And the only friend Test has is Test5
         */
        UserServiceImpl uservice = new UserServiceImpl();
        User userIn = uservice.getUser2("Test");
        int output = pointSupplier(userIn, "Temperature Score");
        int expected = 0;
        assertEquals(expected, output);
    }

    @Test
    public void testPointSupplierSolar(){
        /*
            This only works if you have a user Test with values
            Test, pwd, 60, 0, 0, 0, 0, 0, 0, 69, 0, 1179

            and a user Test5 with values
            Test5, pwd, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10

            And the only friend Test has is Test5
         */
        UserServiceImpl uservice = new UserServiceImpl();
        User userIn = uservice.getUser2("Test");
        int output = pointSupplier(userIn, "Solar Score");
        int expected = 0;
        assertEquals(expected, output);
    }

    @Test
    public void testPointSupplierOverallSaved(){
        /*
            This only works if you have a user Test with values
            Test, pwd, 60, 0, 0, 0, 0, 0, 0, 69, 0, 1179

            and a user Test5 with values
            Test5, pwd, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10

            And the only friend Test has is Test5
         */
        UserServiceImpl uservice = new UserServiceImpl();
        User userIn = uservice.getUser2("Test");
        int output = pointSupplier(userIn, "Overall CO2 Saved");
        int expected = 69;
        assertEquals(expected, output);
    }
}
