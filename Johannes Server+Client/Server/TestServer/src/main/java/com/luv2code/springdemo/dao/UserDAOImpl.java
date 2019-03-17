package com.luv2code.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.User;

<<<<<<< .merge_file_a02792
/**
 * The type User dao.
 */
=======
>>>>>>> .merge_file_a17188
@Repository
public class UserDAOImpl implements UserDAO {

	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;
			
	@Override
	public List<User> getUsers() {
		
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
				
		// create a query  ... sort by last name
		Query<User> theQuery =
				currentSession.createQuery("from User order by id",
						User.class);
		
		// execute query and get result list
		List<User> users = theQuery.getResultList();
				
		// return the results		
		return users;
	}

	@Override
	public void saveUser(User theUser) {

		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// save/upate the customer ... finally LOL
		currentSession.saveOrUpdate(theUser);
		
	}

	@Override
	public User getUser(int theId) {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// now retrieve/read from database using the primary key
		User theUser = currentSession.get(User.class, theId);
		
		return theUser;
	}

	@Override
	public void deleteUser(int theId) {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// delete object with primary key
		Query theQuery = 
				currentSession.createQuery("delete from User where id=:userId");
		theQuery.setParameter("userId", theId);
		
		theQuery.executeUpdate();		
	}

	@Override
	public User getUser2(String user_name, String password) {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		Query query = currentSession.createSQLQuery("select * from user where user_name=:user_name and password=:password").addEntity(User.class).setParameter("user_name", user_name).setParameter("password", password);

		List<User> users = query.getResultList();

		User theUser = users.get(0);

		return theUser;
	}

	@Override
	public User getUser3(String user_name) {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		Query query = currentSession.createSQLQuery("select * from user where user_name=:user_name").addEntity(User.class).setParameter("user_name", user_name);

		List<User> users = query.getResultList();

		User theUser = users.get(0);

		return theUser;
	}

}











