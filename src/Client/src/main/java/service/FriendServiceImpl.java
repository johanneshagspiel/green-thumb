package service;


import entity.Friend;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Friend service.
 */
@Service
public class FriendServiceImpl  {

    /**
     * Gets users.
     *
     * @return the users
     */
    public List<Friend> getUsers() {

        return null;
    }

    /**
     * Create friend.
     *
     * @param theFriend the the friend
     */
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

    /**
     * Gets friends.
     *
     * @param user_name_entry the user name entry
     * @return the friends
     */
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

    /**
     * Delete user.
     *
     * @param theId the the id
     */
    public void deleteUser(int theId) {
        RestTemplate restTemplate = new RestTemplate();
        String deleteResourceUrl = "http://localhost:8082/spring_crm_rest_war_exploded/api/friends/" + theId;
        restTemplate.delete(deleteResourceUrl);
    }

    /**
     * Update user.
     *
     * @param theFriend the the friend
     */
    public void updateUser(Friend theFriend) {
        RestTemplate restTemplate = new RestTemplate();
        String putResourceUrl = "http://localhost:8082/spring_crm_rest_war_exploded/api/friends/";
        restTemplate.put(putResourceUrl, theFriend);
    }

}

