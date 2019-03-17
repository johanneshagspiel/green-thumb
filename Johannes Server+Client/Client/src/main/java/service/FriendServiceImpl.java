package service;


import entity.Friend;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

<<<<<<< .merge_file_a14576
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
=======
@Service
public class FriendServiceImpl  {

>>>>>>> .merge_file_a08956
    public List<Friend> getUsers() {

        return null;
    }

<<<<<<< .merge_file_a14576
    /**
     * Create friend.
     *
     * @param theFriend the the friend
     */
=======
>>>>>>> .merge_file_a08956
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

<<<<<<< .merge_file_a14576
    /**
     * Gets friends.
     *
     * @param user_name_entry the user name entry
     * @return the friends
     */
=======
>>>>>>> .merge_file_a08956
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

<<<<<<< .merge_file_a14576
    /**
     * Delete user.
     *
     * @param theId the the id
     */
=======
>>>>>>> .merge_file_a08956
    public void deleteUser(int theId) {
        RestTemplate restTemplate = new RestTemplate();
        String deleteResourceUrl = "http://localhost:8082/spring_crm_rest_war_exploded/api/friends/" + theId;
        restTemplate.delete(deleteResourceUrl);
    }

<<<<<<< .merge_file_a14576
    /**
     * Update user.
     *
     * @param theFriend the the friend
     */
=======
>>>>>>> .merge_file_a08956
    public void updateUser(Friend theFriend) {
        RestTemplate restTemplate = new RestTemplate();
        String putResourceUrl = "http://localhost:8082/spring_crm_rest_war_exploded/api/friends/";
        restTemplate.put(putResourceUrl, theFriend);
    }

}

