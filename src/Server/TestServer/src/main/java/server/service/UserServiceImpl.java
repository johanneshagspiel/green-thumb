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

    /**Javadoc comment.*/
    @Autowired
    private UserDAO userDAO;

    /**Javadoc comment.*/
    @Override
    @Transactional
    public List<User> getUsers() {
        return userDAO.getUsers();
    }

    /**Javadoc comment.*/
    @Override
    @Transactional
    public User saveUser(final User theUser) {
        userDAO.saveUser(theUser);
        return theUser;
    }

    /**Javadoc comment.*/
    @Override
    @Transactional
    public User getUser(final int theId) {
        return userDAO.getUser(theId);
    }

    /**Javadoc comment.*/
    @Override
    @Transactional
    public int deleteUser(final int theId) {
        userDAO.deleteUser(theId);
        return theId;
    }

    /**Javadoc comment.*/
    @Override
    @Transactional
    public User getUser2(final String userName, final String password) {
        return userDAO.getUser2(userName, password);
    }

    /**Javadoc comment.*/
    @Override
    @Transactional
    public User getUser3(final String userName) {
        return userDAO.getUser3(userName);
    }

    /**Javadoc comment.*/
    @Override
    @Transactional
    public User getUserSafe(final User theUser) {
        return userDAO.getUserSafe(theUser);
    }
}





