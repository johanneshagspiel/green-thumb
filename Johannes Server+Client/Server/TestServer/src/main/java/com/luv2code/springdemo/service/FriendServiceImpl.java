package com.luv2code.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.luv2code.springdemo.dao.FriendDAO;
import com.luv2code.springdemo.entity.Friend;

@Service
public class FriendServiceImpl implements FriendService {

    // need to inject customer dao
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
    public void saveFriend(Friend theFriend) {

        friendDAO.saveFriend(theFriend);
    }

    @Override
    @Transactional
    public void deleteFriend(int theId) {

        friendDAO.deleteFriend(theId);
    }
}





