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
public class FriendServiceImpl implements FriendService {

    @Autowired
    private FriendDAO friendDAO;

    @Override
    @Transactional
    public List<Friend> getFriends(String user_name_entry) {
        return friendDAO.getFriends(user_name_entry);
    }

    @Override
    @Transactional
    public List<Friend> getFriends() {
        return friendDAO.getFriends();
    }

    @Override
    @Transactional
    public Friend saveFriend(Friend theFriend) {
        friendDAO.saveFriend(theFriend);
        return theFriend;
    }

    @Override
    @Transactional
    public int deleteFriend(int theId) {
        friendDAO.deleteFriend(theId);
        return theId;
    }
}





