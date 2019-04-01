package helper;

import java.util.Comparator;
import entity.User;

public class Sort implements Comparator<User> {

	@Override
    public int compare(User a, User b) {
        return a.getUser_name().compareToIgnoreCase(b.getUser_name());
    }

}
