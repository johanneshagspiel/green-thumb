package com.luv2code.springdemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springdemo.entity.Friend;
import com.luv2code.springdemo.service.FriendService;

@RestController
@RequestMapping("/api")
public class FriendRestController {

    // autowire the CustomerService
    @Autowired
    private FriendService friendService;

    // add mapping for GET /customers
    @GetMapping("/friend/{user_name_entry}")
    public List<Friend> getUsers(@PathVariable String user_name_entry) {

        return friendService.getFriends(user_name_entry);

    }

    // add mapping for GET /customers
    @GetMapping("/friends")
    public List<Friend> getUsers() {

        return friendService.getFriends();

    }

    // add mapping for POST /customers  - add new customer

    @PostMapping("/friends")
    public Friend addFriend(@RequestBody Friend theFriend) {

        // also just in case the pass an id in JSON ... set id to 0
        // this is force a save of new item ... instead of update

        theFriend.setId(0);

        friendService.saveFriend(theFriend);

        return theFriend;
    }

    // add mapping for PUT /customers - update existing customer

    @PutMapping("/friends")
    public Friend updateFriend(@RequestBody Friend theFriend) {

        friendService.saveFriend(theFriend);

        return theFriend;

    }

    // add mapping for DELETE /customers/{customerId} - delete customer

    @DeleteMapping("/friends/{userId}")
    public String deleteFriend(@PathVariable int userId) {


        friendService.deleteFriend(userId);

        return "Deleted user id - " + userId;
    }

}


















