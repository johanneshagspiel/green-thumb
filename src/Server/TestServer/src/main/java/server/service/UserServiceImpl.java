package server.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import server.dao.UserDAO;
import server.entity.User;

/**
 * The type User service.
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;
	
	@Override
	@Transactional
	public List<User> getUsers() {
		return userDAO.getUsers();
	}

	@Override
	@Transactional
	public User saveUser(User theUser) {
		userDAO.saveUser(theUser);
		return theUser;
	}

	@Override
	@Transactional
	public User getUser(int theId) {
		return userDAO.getUser(theId);
	}

	@Override
	@Transactional
	public int deleteUser(int theId) {
		userDAO.deleteUser(theId);
		return theId;
	}

	@Override
	@Transactional
	public User getUser2(String user_name, String password) {
		return userDAO.getUser2(user_name, password);
	}

	@Override
	@Transactional
	public User getUser3(String user_name) {
		return userDAO.getUser3(user_name);
	}

	@Override
	@Transactional
	public User getUserSafe(User theUser) {
		return userDAO.getUserSafe(theUser);
	}
}





