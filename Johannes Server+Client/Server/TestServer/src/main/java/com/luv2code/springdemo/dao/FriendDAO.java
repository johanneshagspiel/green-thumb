package com.luv2code.springdemo.dao;

import java.util.List;
import com.luv2code.springdemo.entity.Friend;

/**
 * The interface Friend dao.
 */
public interface FriendDAO {


    /**
     * Gets friends.
     *
     * @param user_name_entry the user name entry
     * @return the friends
     */
    public List<Friend> getFriends(String user_name_entry);

    /**
     * Gets friends.
     *
     * @return the friends
     */
    public List<Friend> getFriends();

    /**
     * Save friend.
     *
     * @param theFriend the the friend
     */
    public void saveFriend(Friend theFriend);

    /**
     * Delete friend.
     *
     * @param theId the the id
     */
    public void deleteFriend(int theId);

}