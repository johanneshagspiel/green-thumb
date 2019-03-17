package test.entity;

import entity.LeaderBoardEntry;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

<<<<<<< .merge_file_a13368
/**
 * The type Leader board entry test.
 */
=======
>>>>>>> .merge_file_a12920
public class LeaderBoardEntryTest {

    private LeaderBoardEntry leaderBoardEntryUnderTest;

<<<<<<< .merge_file_a13368
    /**
     * Sets up.
     */
=======
>>>>>>> .merge_file_a12920
    @Before
    public void setUp() {
        leaderBoardEntryUnderTest = new LeaderBoardEntry("name", 0);
    }

<<<<<<< .merge_file_a13368
    /**
     * Test to string.
     */
=======
>>>>>>> .merge_file_a12920
    @Test
    public void testToString() {
        // Setup
        final String expectedResult = "result";

        // Run the test
        final String result = leaderBoardEntryUnderTest.toString();

        // Verify the results
        assertEquals(expectedResult, result);
    }

<<<<<<< .merge_file_a13368
    /**
     * Test create leaderboard.
     */
=======
>>>>>>> .merge_file_a12920
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
