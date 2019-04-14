package server.dao;

import java.util.List;
import server.entity.User;

/**
 * The interface User dao.
 */
public interface UserDAO {

    /**
     * Gets users.
     *
     * @return the users
     */
     List<User> getUsers();

    /**
     * Save user.
     *
     * @return something
     * @param theUser the the user
     */
     User saveUser(User theUser);

    /**
     * Gets user.
     *
     * @param theId the the id
     * @return the user
     */
     User getUser(int theId);

    /**
     * Delete user.
     *
     * @return something
     * @param theId the the id
     */
     int deleteUser(int theId);

    /**
     * Gets user 2.
     *
     * @param userName the user name
     * @param password  the password
     * @return the user 2
     */
     User getUser2(String userName, String password);

    /**
     * Gets user 3.
     *
     * @param userName the user name
     * @return the user 3
     */
     User getUser3(String userName);

    /**
     * Gets user 3.
     *
     * @param theUser the User with the right username + password combination
     * @return the user 3
     */
     User getUserSafe(User theUser);
}
