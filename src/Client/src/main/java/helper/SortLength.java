package helper;

import java.util.Comparator;

import entity.User;

public class SortLength implements Comparator<User>{

	public int compare(User a, User b) {
        return a.getUser_name().length() - (b.getUser_name().length());
    }
}
