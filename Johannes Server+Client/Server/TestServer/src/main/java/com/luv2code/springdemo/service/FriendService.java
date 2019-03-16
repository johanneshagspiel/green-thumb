package com.luv2code.springdemo.service;

import java.util.List;

import com.luv2code.springdemo.entity.Friend;

public interface FriendService {

    public List<Friend> getFriends(String user_name_entry);

    public List<Friend> getFriends();

    public void saveFriend(Friend theFriend);

    public void deleteFriend(int theId);

}
