package server.dao;

import java.util.List;

import server.entity.Friend;

/**
 * The interface Friend dao.
 */
public interface FriendDAO {


    /**
     * Gets friends.
     *
     * @param userNameEntry the user name entry
     * @return the friends
     */
    List<Friend> getFriends(String userNameEntry);

    /**
     * Gets friends.
     *
     * @return the friends
     */
    List<Friend> getFriends();

    /**
     * Save friend friend.
     *
     * @param theFriend the the friend
     * @return the friend
     */
    Friend saveFriend(Friend theFriend);

    /**
     * Delete friend int.
     *
     * @param theId the the id
     * @return the int
     */
    int deleteFriend(int theId);

}
