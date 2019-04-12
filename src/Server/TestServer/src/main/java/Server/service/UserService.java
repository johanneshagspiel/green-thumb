package Server.service;

import java.util.List;

import Server.entity.User;

/**
 * The interface User service.
 */
public interface UserService {

    /**
     * Gets users.
     *
     * @return the users
     */
    public List<User> getUsers();

    /**
     * Save user.
     *
     * @param theUser the the user
     */
    public void saveUser(User theUser);

    /**
     * Gets user.
     *
     * @param theId the the id
     * @return the user
     */
    public User getUser(int theId);

    /**
     * Delete user.
     *
     * @param theId the the id
     */
    public void deleteUser(int theId);

    /**
     * Gets user 2.
     *
     * @param user_name the user name
     * @param password  the password
     * @return the user 2
     */
    public User getUser2(String user_name, String password);

    /**
     * Gets user 3.
     *
     * @param user_name the user name
     * @return the user 3
     */
    public User getUser3(String user_name);

    /**
     * Get a user based on a password + username combination
     *
     * @param theUser the the user
     */
    public User getUserSafe(User theUser);
}
