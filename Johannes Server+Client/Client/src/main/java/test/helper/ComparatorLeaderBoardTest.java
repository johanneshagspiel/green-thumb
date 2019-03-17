package test.helper;

import entity.LeaderBoardEntry;
import helper.ComparatorLeaderBoard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

<<<<<<< .merge_file_a19984
/**
 * The type Comparator leader board test.
 */
=======
>>>>>>> .merge_file_a03620
public class ComparatorLeaderBoardTest {

    private ComparatorLeaderBoard comparatorLeaderBoardUnderTest;

<<<<<<< .merge_file_a19984
    /**
     * Sets up.
     */
=======
>>>>>>> .merge_file_a03620
    @Before
    public void setUp() {
        comparatorLeaderBoardUnderTest = new ComparatorLeaderBoard();
    }

<<<<<<< .merge_file_a19984
    /**
     * Test compare.
     */
=======
>>>>>>> .merge_file_a03620
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
