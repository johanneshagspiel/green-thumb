package com.luv2code.springdemo.dao;

import java.util.List;
import com.luv2code.springdemo.entity.Friend;

public interface FriendDAO {


    public List<Friend> getFriends(String user_name_entry);

    public List<Friend> getFriends();

    public void saveFriend(Friend theFriend);

    public void deleteFriend(int theId);

}