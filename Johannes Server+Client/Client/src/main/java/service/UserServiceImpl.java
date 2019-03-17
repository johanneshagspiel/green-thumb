package service;


import entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

<<<<<<< .merge_file_a19884
/**
 * The type User service.
 */
@Service
public class UserServiceImpl  {

    /**
     * Gets users.
     *
     * @return the users
     */
    public List<User> getUsers() {
=======
@Service
public class UserServiceImpl  {

	public List<User> getUsers() {
>>>>>>> .merge_file_a13088

		return null;
	}

<<<<<<< .merge_file_a19884
    /**
     * Create user.
     *
     * @param theUser the the user
     */
    public void createUser(User theUser) {
=======
	public void createUser(User theUser) {
>>>>>>> .merge_file_a13088
		try {
			RestTemplate restTemplate = new RestTemplate();
			String postResourceUrl = "http://localhost:8082/spring_crm_rest_war_exploded/api/users/";
			User user = restTemplate.postForObject(postResourceUrl, theUser, User.class);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

<<<<<<< .merge_file_a19884
    /**
     * Gets user.
     *
     * @param theId the the id
     * @return the user
     */
    public User getUser(int theId) {
=======
	public User getUser(int theId) {
>>>>>>> .merge_file_a13088
		try {
			RestTemplate restTemplate = new RestTemplate();
			String getResourceUrl = "http://localhost:8082/spring_crm_rest_war_exploded/api/users/";
			ResponseEntity<String> response = restTemplate.getForEntity(getResourceUrl, String.class);
			User user = restTemplate.getForObject(getResourceUrl + theId, User.class);
			System.out.println(user.toString());
			return user;
		} catch (Exception e) {
			e.printStackTrace();
		} return null;
	}

<<<<<<< .merge_file_a19884
    /**
     * Gets user 2.
     *
     * @param user_name the user name
     * @return the user 2
     */
    public User getUser2(String user_name) {
=======
	public User getUser2(String user_name) {
>>>>>>> .merge_file_a13088
		try {
			RestTemplate restTemplate = new RestTemplate();
			String getResourceUrl = "http://localhost:8082/spring_crm_rest_war_exploded/api/user2/" + user_name;
			ResponseEntity<String> response = restTemplate.getForEntity(getResourceUrl, String.class);
			User user = restTemplate.getForObject(getResourceUrl, User.class);
			System.out.println(user.toString());
			return user;
		} catch (Exception e) {
			e.printStackTrace();
		} return null;
	}

<<<<<<< .merge_file_a19884
    /**
     * Login user.
     *
     * @param user_name the user name
     * @param password  the password
     * @return the user
     */
    public User login(String user_name, String password) {
=======
	public User login(String user_name, String password) {
>>>>>>> .merge_file_a13088
		try {
			RestTemplate restTemplate = new RestTemplate();
			String getResourceUrl = "http://localhost:8082/spring_crm_rest_war_exploded/api/user/" + user_name +"/" + password;
			ResponseEntity<String> response = restTemplate.getForEntity(getResourceUrl, String.class);
			User user = restTemplate.getForObject( getResourceUrl, User.class);
			System.out.println(user.toString());
			return user;
		} catch (Exception e) {
			e.printStackTrace();
		}
			return null;
	}

<<<<<<< .merge_file_a19884
    /**
     * Delete user.
     *
     * @param theId the the id
     */
    public void deleteUser(int theId) {
=======
	public void deleteUser(int theId) {
>>>>>>> .merge_file_a13088
		RestTemplate restTemplate = new RestTemplate();
		String deleteResourceUrl = "http://localhost:8082/spring_crm_rest_war_exploded/api/users/" + theId;
		restTemplate.delete(deleteResourceUrl);
	}

<<<<<<< .merge_file_a19884
    /**
     * Update user.
     *
     * @param theUser the the user
     */
    public void updateUser(User theUser) {
=======
	public void updateUser(User theUser) {
>>>>>>> .merge_file_a13088
		RestTemplate restTemplate = new RestTemplate();
		String putResourceUrl = "http://localhost:8082/spring_crm_rest_war_exploded/api/users/";
		restTemplate.put(putResourceUrl, theUser);
	}


}

