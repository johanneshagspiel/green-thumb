package com.luv2code.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.Friend;

/**
 * The type Friend dao.
 */
@Repository
public class FriendDAOImpl implements FriendDAO {

    // need to inject the session factory
    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public List<Friend> getFriends(String user_name_entry) {

        // get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // create a query  ... sort by last name
        Query query = currentSession.createSQLQuery("select * from friend where user_name_entry=:user_name_entry").addEntity(Friend.class).setParameter("user_name_entry", user_name_entry);

        List<Friend> friends = query.getResultList();

        // return the results
        return friends;
    }


    @Override
    public List<Friend> getFriends() {

        // get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // create a query  ... sort by last name
        Query query = currentSession.createSQLQuery("select * from friend").addEntity(Friend.class);

        // execute query and get result list
        List<Friend> friends = query.getResultList();

        // return the results
        return friends;
    }

    @Override
    public void saveFriend(Friend theFriend) {

        // get current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // save/upate the customer ... finally LOL
        currentSession.saveOrUpdate(theFriend);

    }

    @Override
    public void deleteFriend(int id) {

        // get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // delete object with primary key
        Query query = currentSession.createSQLQuery("delete from friend where id=:id").addEntity(Friend.class).setParameter("id", id);

        query.executeUpdate();
    }


}











