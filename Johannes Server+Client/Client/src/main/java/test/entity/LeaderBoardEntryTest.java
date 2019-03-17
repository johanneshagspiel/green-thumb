package test.entity;

import entity.LeaderBoardEntry;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * The type Leader board entry test.
 */
public class LeaderBoardEntryTest {

    private LeaderBoardEntry leaderBoardEntryUnderTest;

    /**
     * Sets up.
     */
    @Before
    public void setUp() {
        leaderBoardEntryUnderTest = new LeaderBoardEntry("name", 0);
    }

    /**
     * Test to string.
     */
    @Test
    public void testToString() {
        // Setup
        final String expectedResult = "result";

        // Run the test
        final String result = leaderBoardEntryUnderTest.toString();

        // Verify the results
        assertEquals(expectedResult, result);
    }

    /**
     * Test create leaderboard.
     */
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
}
