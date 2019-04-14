package server.service;

import java.util.List;

import server.entity.Friend;

/**
 * The interface Friend service.
 */
public interface FriendService {

    /**
     * Gets friends.
     *
     * @param userNameEntry the user name entry
     * @return the friends
     */
    public List<Friend> getFriends(String userNameEntry);

    /**
     * Gets friends.
     *
     * @return the friends
     */
    public List<Friend> getFriends();

    /**
     * Save friend friend.
     *
     * @param theFriend the the friend
     * @return the friend
     */
    public Friend saveFriend(Friend theFriend);

    /**
     * Delete friend int.
     *
     * @param theId the the id
     * @return the int
     */
    public int deleteFriend(int theId);

}
