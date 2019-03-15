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
		RestTemplate restTemplate = new RestTemplate();
		String postResourceUrl = "http://localhost:8082/spring_crm_rest_war_exploded/api/users/";
		User user = restTemplate.postForObject(postResourceUrl, theUser, User.class);
	}

	public User getUser(int theId) throws Exception{
		RestTemplate restTemplate = new RestTemplate();
		String getResourceUrl = "http://localhost:8082/spring_crm_rest_war_exploded/api/users/";
		ResponseEntity<String> response = restTemplate.getForEntity(getResourceUrl, String.class);
		User user = restTemplate.getForObject( getResourceUrl+ theId, User.class);
		System.out.println(user.toString());
		return null;
	}

	public User login(String user_name, String password) throws Exception{
		RestTemplate restTemplate = new RestTemplate();
		String getResourceUrl = "http://localhost:8082/spring_crm_rest_war_exploded/api/user/" + user_name +"/" + password;
		ResponseEntity<String> response = restTemplate.getForEntity(getResourceUrl, String.class);
		User user = restTemplate.getForObject( getResourceUrl, User.class);
		System.out.println(user.toString());
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

