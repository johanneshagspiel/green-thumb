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

	public void saveUser(User theUser) {

	}

	public User getUser(int theId) throws Exception{
		RestTemplate restTemplate = new RestTemplate();
		String getResourceUrl = "http://localhost:8082/spring_crm_rest_war_exploded/api/users/";
		ResponseEntity<String> response = restTemplate.getForEntity(getResourceUrl + "/1", String.class);
		User user = restTemplate.getForObject( getResourceUrl+ theId, User.class);
		System.out.println(user.toString());
		return null;
	}


	public void deleteUser(int theId) {

	}

	public void addUser(User theUser) {

		RestTemplate restTemplate = new RestTemplate();
		String putResourceUrl = "http://localhost:8082/spring_crm_rest_war_exploded/api/users/";

		User user = restTemplate.postForObject(putResourceUrl, theUser, User.class);

	}


}

