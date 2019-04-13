package Server.dao;

import java.util.List;
import Server.entity.User;

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
     * @param theId the the id
     */
     int deleteUser(int theId);

    /**
     * Gets user 2.
     *
     * @param user_name the user name
     * @param password  the password
     * @return the user 2
     */
     User getUser2(String user_name, String password);

    /**
     * Gets user 3.
     *
     * @param user_name the user name
     * @return the user 3
     */
     User getUser3(String user_name);

    /**
     * Gets user 3.
     *
     * @param theUser the User with the right username + password combination
     * @return the user 3
     */
     User getUserSafe(User theUser);
}
