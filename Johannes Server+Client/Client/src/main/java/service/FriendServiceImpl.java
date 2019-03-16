package service;


import entity.Friend;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class FriendServiceImpl  {

    public List<Friend> getUsers() {

        return null;
    }

    public void createFriend(Friend theFriend) {
        try {
            RestTemplate restTemplate = new RestTemplate();
            String postResourceUrl = "http://localhost:8082/spring_crm_rest_war_exploded/api/friends/";
            Friend friend = restTemplate.postForObject(postResourceUrl, theFriend, Friend.class);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public List<Friend> getFriends(String user_name_entry) {
        try {
            RestTemplate restTemplate = new RestTemplate();
            String getResourceUrl = "http://localhost:8082/spring_crm_rest_war_exploded/api/friend/" + user_name_entry;

            ResponseEntity<List<Friend>> response = restTemplate.exchange(
                    getResourceUrl,
                    HttpMethod.GET,
                    null,
                    new ParameterizedTypeReference<List<Friend>>(){});
            List<Friend> friends = response.getBody();

            return friends;

        } catch (Exception e) {
            e.printStackTrace();
        } return null;
    }

    public void deleteUser(int theId) {
        RestTemplate restTemplate = new RestTemplate();
        String deleteResourceUrl = "http://localhost:8082/spring_crm_rest_war_exploded/api/friends/" + theId;
        restTemplate.delete(deleteResourceUrl);
    }

    public void updateUser(Friend theFriend) {
        RestTemplate restTemplate = new RestTemplate();
        String putResourceUrl = "http://localhost:8082/spring_crm_rest_war_exploded/api/friends/";
        restTemplate.put(putResourceUrl, theFriend);
    }

}

