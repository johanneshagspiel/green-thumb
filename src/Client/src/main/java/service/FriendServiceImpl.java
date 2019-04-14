package service;


import entity.Friend;
import helper.ServerConfig;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * The type Friend service.
 */
@Service
public class FriendServiceImpl  {


    /**
     * Create friend.
     *
     * @param theFriend the the friend
     */
    public Friend createFriend(final Friend theFriend) {
        try {
            RestTemplate restTemplate = new RestTemplate();
            String postResourceUrl =
                    ServerConfig.getFriendspageURL();
            Friend friend =
                    restTemplate.postForObject(
                            postResourceUrl, theFriend, Friend.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return theFriend;
    }

    /**
     * Gets friends.
     *
     * @param userNameEntry the user name entry
     * @return the friends
     */
    public List<Friend> getFriends(final String userNameEntry) {
        try {
            RestTemplate restTemplate = new RestTemplate();
            String getResourceUrl =
                    ServerConfig.getFriendpageURL()
                            + userNameEntry;

            ResponseEntity<List<Friend>> response
                    = restTemplate.exchange(
                    getResourceUrl,
                    HttpMethod.GET,
                    null,
                    new ParameterizedTypeReference<List<Friend>>(){});
            List<Friend> friends = response.getBody();

            return friends;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Delete user.
     *
     * @param theId the the id
     */
    public int deleteUser(final int theId) {
        RestTemplate restTemplate = new RestTemplate();
        String deleteResourceUrl =
                ServerConfig.getFriendspageURL()
                        + theId;
        restTemplate.delete(deleteResourceUrl);
        return theId;
    }

    /**
     * Update user.
     *
     * @param theFriend the the friend
     */
    public Friend updateUser(final Friend theFriend) {
        RestTemplate restTemplate = new RestTemplate();
        String putResourceUrl =
                ServerConfig.getFriendspageURL();
        restTemplate.put(putResourceUrl, theFriend);
        return theFriend;
    }

}

