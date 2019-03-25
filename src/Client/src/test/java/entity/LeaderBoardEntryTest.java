package test.entity;

import entity.LeaderBoardEntry;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeaderBoardEntryTest {

    private LeaderBoardEntry leaderBoardEntryUnderTest;

    @Before
    public void setUp() {
        leaderBoardEntryUnderTest = new LeaderBoardEntry("name", 0);
    }

    @Test
    public void testToString() {
        // Setup
        final String expectedResult = "result";

        // Run the test
        final String result = leaderBoardEntryUnderTest.toString();

        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public void testCreateLeaderboard() {
        // Setup
        final int pointsIn = 0;
        final String usernameIn = "usernameIn";
        final String expectedResult = "result";

        // Run the test
        final String result = LeaderBoardEntry.createLeaderboard(pointsIn, usernameIn);

        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public void getName() {
        LeaderBoardEntry test = new LeaderBoardEntry("test", 1);
        assertEquals(test.getName(), "test");
    }

    @Test
    public void setName() {
        LeaderBoardEntry test = new LeaderBoardEntry("test", 1);
        LeaderBoardEntry test2 = new LeaderBoardEntry("test2", 1);
        test2.setName("test");
        assertEquals(test, test2);
    }

    @Test
    public void getScore() {
        LeaderBoardEntry test = new LeaderBoardEntry("test", 1);
        assertEquals(test.getScore(), 1);
    }

    @Test
    public void setScore() {
        LeaderBoardEntry test = new LeaderBoardEntry("test", 1);
        LeaderBoardEntry test2 = new LeaderBoardEntry("test", 2);
        test2.setScore(1);
        assertEquals(test, test2);
    }

    @Test
    public void createLeaderboard() {
    }
}
