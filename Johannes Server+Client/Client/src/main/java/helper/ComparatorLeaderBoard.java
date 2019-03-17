package helper;

import entity.LeaderBoardEntry;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

<<<<<<< .merge_file_a09892
/**
 * The type Comparator leader board.
 */
=======
>>>>>>> .merge_file_a01108
public class ComparatorLeaderBoard implements Comparator<LeaderBoardEntry> {
    public int compare(LeaderBoardEntry arg0, LeaderBoardEntry arg1) {
        return arg1.getScore() - arg0.getScore();
    }
}