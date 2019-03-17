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
    public int compare(LeaderBoardEntry arg0, LeaderBoardEntry arg1) {
        return arg1.getScore() - arg0.getScore();
    }
}