package com.luv2code.springdemo.dao;

import java.util.List;
import com.luv2code.springdemo.entity.User;

<<<<<<< .merge_file_a15044
/**
 * The interface User dao.
 */
public interface UserDAO {

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
=======
public interface UserDAO {

	public List<User> getUsers();

	public void saveUser(User theUser);

	public User getUser(int theId);

	public void deleteUser(int theId);

	public User getUser2(String user_name, String password);

	public User getUser3(String user_name);
>>>>>>> .merge_file_a12064
}
