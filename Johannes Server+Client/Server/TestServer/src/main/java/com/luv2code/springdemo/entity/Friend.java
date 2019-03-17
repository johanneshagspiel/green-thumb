package com.luv2code.springdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="friend")
public class Friend {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="user_name_entry")
    private String user_name_entry;

    @Column(name="friend_name")
    private String friend_name;


    public Friend(int id, String user_name_entry, String friend_name) {
    	this.id = id;
    	this.user_name_entry = user_name_entry;
    	this.friend_name = friend_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_name_entry() {
        return user_name_entry;
    }

    public void setUser_name_entry(String user_name_entry) {
        this.user_name_entry = user_name_entry;
    }

    public String getFriend_name() {
        return friend_name;
    }

    public void setFriend_name(String friend_name) {
        this.friend_name = friend_name;
    }

    @Override
    public String toString() {
        return "Friend [id=" + id + ", user_name_entry=" + user_name_entry + ", friend_name=" + friend_name + "]";
    }

}





