package helper;

import entity.LeaderBoardEntry;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/**
 * The type Comparator leader board.
 */
public class ComparatorLeaderBoard implements Comparator<LeaderBoardEntry> {
    /**
     * the compare.
     * @param arg0 argument 0
     * @param arg1 argument 1
     * @return the score
     */
    public int compare(LeaderBoardEntry arg0,
                             LeaderBoardEntry arg1) {

        if (arg0 != null && arg1 != null) {
            int finalScore = arg1.getScore() - arg0.getScore();
            return finalScore;
        } else {
            return -1;
        }
    }
}