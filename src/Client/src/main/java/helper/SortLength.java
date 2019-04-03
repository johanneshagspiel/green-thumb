package helper;

import java.util.Comparator;

import entity.User;

/**
 * The length sort.
 */
public class SortLength implements Comparator<User> {
    /**
     * The compare.
     * @param a the user a
     * @param b the user b
     * @return the result
     */
    public final int compare(final User a, final User b) {
        return a.getUser_name().length() - (b.getUser_name().length());
    }
}
