package service;


import entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class UserServiceImpl  {

	public List<User> getUsers() {

		return null;
	}

	public void createUser(User theUser) {
		try {
			RestTemplate restTemplate = new RestTemplate();
			String postResourceUrl = "http://localhost:8082/spring_crm_rest_war_exploded/api/users/";
			User user = restTemplate.postForObject(postResourceUrl, theUser, User.class);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public User getUser(int theId) {
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

	public User getUser2(String user_name) {
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

	public User login(String user_name, String password) {
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

	public void deleteUser(int theId) {
		RestTemplate restTemplate = new RestTemplate();
		String deleteResourceUrl = "http://localhost:8082/spring_crm_rest_war_exploded/api/users/" + theId;
		restTemplate.delete(deleteResourceUrl);
	}

	public void updateUser(User theUser) {
		RestTemplate restTemplate = new RestTemplate();
		String putResourceUrl = "http://localhost:8082/spring_crm_rest_war_exploded/api/users/";
		restTemplate.put(putResourceUrl, theUser);
	}


}

