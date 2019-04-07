package service;


import entity.Friend;
import helper.ServerConfig;
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
    public final List<Friend> getUsers() {

        return null;
    }

    /**
     * Create friend.
     *
     * @param theFriend the the friend
     */
    public final  void createFriend(final Friend theFriend) {
        try {
            RestTemplate restTemplate = new RestTemplate();
            String postResourceUrl =
                    ServerConfig.getFriendpageURL();
            Friend friend =
                    restTemplate.postForObject(
                            postResourceUrl, theFriend, Friend.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Gets friends.
     *
     * @param user_name_entry the user name entry
     * @return the friends
     */
    public final List<Friend> getFriends(final String user_name_entry) {
        try {
            RestTemplate restTemplate = new RestTemplate();
            String getResourceUrl =
                    ServerConfig.getFriendpageURL()
                            + user_name_entry;

            ResponseEntity<List<Friend>> response
                    = restTemplate.exchange(
                    getResourceUrl,
                    HttpMethod.GET,
                    null,
                    new ParameterizedTypeReference<List<Friend>>(){} );
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
    public final void deleteUser(final int theId) {
        RestTemplate restTemplate = new RestTemplate();
        String deleteResourceUrl =
                ServerConfig.getFriendpageURL()
                        + theId;
        restTemplate.delete(deleteResourceUrl);
    }

    /**
     * Update user.
     *
     * @param theFriend the the friend
     */
    public final void updateUser(final Friend theFriend) {
        RestTemplate restTemplate = new RestTemplate();
        String putResourceUrl =
                ServerConfig.getFriendpageURL();
        restTemplate.put(putResourceUrl, theFriend);
    }

}

