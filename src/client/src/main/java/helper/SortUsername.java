package helper;

import java.util.Comparator;
import entity.User;

/**
 * The username sort.
 */
public class SortUsername implements Comparator<User> {
    /**
     * The compare.
     * @param a the user a
     * @param b the user b
     * @return the result
     */
    @Override
    public final int compare(final User a, final User b) {
        return a.getUser_name().compareToIgnoreCase(b.getUser_name());
    }
}
