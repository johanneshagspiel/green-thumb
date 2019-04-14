package server.service;

import java.util.List;

import server.dao.FriendDAO;
import server.entity.Friend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * The type Friend service.
 */
@Service
public final class FriendServiceImpl implements FriendService {

    /**Javadoc comment.*/
    @Autowired
    private FriendDAO friendDAO;

    @Override
    @Transactional
    public List<Friend> getFriends(final String userNameEntry) {
        return friendDAO.getFriends(userNameEntry);
    }

    @Override
    @Transactional
    public List<Friend> getFriends() {
        return friendDAO.getFriends();
    }

    @Override
    @Transactional
    public Friend saveFriend(final Friend theFriend) {
        friendDAO.saveFriend(theFriend);
        return theFriend;
    }

    @Override
    @Transactional
    public int deleteFriend(final int theId) {
        friendDAO.deleteFriend(theId);
        return theId;
    }
}





