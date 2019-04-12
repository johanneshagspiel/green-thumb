package Server.dao;

import java.util.List;

import Server.entity.Friend;

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
     List<Friend> getFriends(String user_name_entry);

    /**
     * Gets friends.
     *
     * @return the friends
     */
     List<Friend> getFriends();

    /**
     * Save friend.
     *
     * @param theFriend the the friend
     */
     Friend saveFriend(Friend theFriend);

    /**
     * Delete friend.
     *
     * @param theId the the id
     */
     int deleteFriend(int theId);

}
