package Server.service;

import java.util.List;

import Server.entity.Friend;

/**
 * The interface Friend service.
 */
public interface FriendService {

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
    public Friend saveFriend(Friend theFriend);

    /**
     * Delete friend.
     *
     * @param theId the the id
     */
    public int deleteFriend(int theId);

}
