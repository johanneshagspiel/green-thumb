package test.helper;

import entity.LeaderBoardEntry;
import helper.ComparatorLeaderBoard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComparatorLeaderBoardTest {

    private ComparatorLeaderBoard comparatorLeaderBoardUnderTest;

    @Before
    public void setUp() {
        comparatorLeaderBoardUnderTest = new ComparatorLeaderBoard();
    }

    @Test
    public void testCompare() {
        // Setup
        final LeaderBoardEntry arg0 = null;
        final LeaderBoardEntry arg1 = null;
        final int expectedResult = 0;

        // Run the test
        final int result = comparatorLeaderBoardUnderTest.compare(arg0, arg1);

        // Verify the results
        assertEquals(expectedResult, result);
    }
}
