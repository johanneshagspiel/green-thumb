package test.helper;

import entity.LeaderBoardEntry;
import helper.ComparatorLeaderBoard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * The type Comparator leader board test.
 */
public class ComparatorLeaderBoardTest {

    private ComparatorLeaderBoard comparatorLeaderBoardUnderTest;

    /**
     * Sets up.
     */
    @Before
    public void setUp() {
        comparatorLeaderBoardUnderTest = new ComparatorLeaderBoard();
    }

    /**
     * Test compare equal
     */
    @Test
    public void testCompare1() {
        // Setup
        final LeaderBoardEntry arg0 = new LeaderBoardEntry("Ardy", 50);
        final LeaderBoardEntry arg1 = new LeaderBoardEntry("Ardy", 50);
        final int expectedResult = 0;

        // Run the test
        final int result = comparatorLeaderBoardUnderTest.compare(arg0, arg1);

        // Verify the results
        assertEquals(expectedResult, result);
    }
    
    /**
     * Test compare arg0 < arg1
     */
    @Test
    public void testCompare2() {
        // Setup
        final LeaderBoardEntry arg0 = new LeaderBoardEntry("Ardy", 50);
        final LeaderBoardEntry arg1 = new LeaderBoardEntry("Ardy", 150);
        final int expectedResult = 100;

        // Run the test
        final int result = comparatorLeaderBoardUnderTest.compare(arg0, arg1);

        // Verify the results
        assertEquals(expectedResult, result);
    }
    
    /**
     * Test compare arg0 > arg1
     */
    @Test
    public void testCompare3() {
        // Setup
        final LeaderBoardEntry arg0 = new LeaderBoardEntry("Ardy", 150);
        final LeaderBoardEntry arg1 = new LeaderBoardEntry("Ardy", 50);
        final int expectedResult = -100;

        // Run the test
        final int result = comparatorLeaderBoardUnderTest.compare(arg0, arg1);

        // Verify the results
        assertEquals(expectedResult, result);
    }
}
