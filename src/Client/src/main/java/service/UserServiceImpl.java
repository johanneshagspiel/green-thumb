package service;


import entity.User;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

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
    public final List<User> getUsers() {
        return null;
    }

    /**
     * Create user.
     *
     * @param theUser the the user
     */
    public final void createUser(final User theUser) {
        try {
            RestTemplate restTemplate = new RestTemplate();
            String postResourceUrl = "http://localhost:8082/spring_crm"
                    + "_rest_war_exploded/api/users/";
            User user = restTemplate.postForObject(
                    postResourceUrl, theUser, User.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Gets user.
     *
     * @param theId the the id
     * @return the user
     */
    public final User getUser(final int theId) {
        try {
            RestTemplate restTemplate = new RestTemplate();
            String getResourceUrl = "http://localhost:8082/spring_crm"
                    + "_rest_war_exploded/api/users/";
            ResponseEntity<String> response =
                    restTemplate.getForEntity(
                            getResourceUrl,
                            String.class);
            User user =
                    restTemplate.getForObject(
                            getResourceUrl + theId,
                            User.class);
            System.out.println(user.toString());
            return user;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Gets user 2.
     *
     * @param user_name the user name
     * @return the user 2
     */
    public final User getUser2(final String user_name) {
        try {
            RestTemplate restTemplate = new RestTemplate();
            String getResourceUrl = "http://localhost:8082/spring_crm"
                    + "_rest_war_exploded/api/user2/"
                    + user_name;
            ResponseEntity<String> response =
                    restTemplate.getForEntity(
                            getResourceUrl,
                            String.class);
            User user =
                    restTemplate.getForObject(
                            getResourceUrl,
                            User.class);
            System.out.println(user.toString());
            return user;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    /**
     * Gets friends.
     *
     * @return all the users
     */
    public final List<User> getAllUsers() {
        try {
            RestTemplate restTemplate = new RestTemplate();
            String getResourceUrl = "http://localhost:8082/spring_crm"
                    + "_rest_war_exploded/api/users/";

            ResponseEntity<List<User>> response =
                    restTemplate.exchange(
                            getResourceUrl,
                            HttpMethod.GET,
                            null,
                            new ParameterizedTypeReference<List<User>>(){});
            List<User> allUsers = response.getBody();

            return allUsers;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Login user.
     *
     * @param user_name the user name
     * @param password  the password
     * @return the user
     */
    public final User loginOld(
            final String user_name,
            final String password) {
        try {
            RestTemplate restTemplate =
                    new RestTemplate();
            String getResourceUrl = "http://localhost:8082/spring_crm"
                    + "_rest_war_exploded/api/user/"
                    + user_name + "/" + password;
            ResponseEntity<String> response =
                    restTemplate.getForEntity(
                            getResourceUrl,
                            String.class);
            User user = restTemplate.getForObject(
                    getResourceUrl,
                    User.class);
            System.out.println(user.toString());
            return user;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * The Login.
     * @param user_name the username
     * @param password the password
     * @return the user
     */
    public final User login(final String user_name,
                            final String password) {
        try {

            RestTemplate restTemplate =
                    new RestTemplate();
            User userToSend = new User();
            userToSend.setPassword(password);
            userToSend.setUser_name(user_name);
            String putResourceUrl = "http://localhost:8082/spring_crm"
                    + "_rest_war_exploded/api/users3";


            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(
                    MediaType.APPLICATION_JSON);
            HttpEntity<User> entity =
                    new HttpEntity<User>(userToSend);
            ResponseEntity<User> response =
                    restTemplate.
                            exchange(
                            putResourceUrl,
                            HttpMethod.PUT,
                            entity, User.class);
            //check the response, e.g. Location header,
            //Status, and body
            //response.getHeaders().getLocation();
            //response.getStatusCode();
            User userToReturn = response.getBody();

            // User userToReturn =
            // restTemplate.put(getResourceUrl, userToSend);
            // ResponseEntity<String> response =
            // restTemplate.getForEntity(
            // getResourceUrl, User.class, userToSend);
            // User userToReturn =
            // restTemplate.getForObject(
            // getResourceUrl, User.class);

            return userToReturn;
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
        String deleteResourceUrl
                = "http://localhost:8082/spring_crm"
                + "_rest_war_exploded/api/users/" + theId;
        restTemplate.delete(deleteResourceUrl);
    }

    /**
     * Update user.
     *
     * @param theUser the the user
     */
    public final void updateUser(final User theUser) {
        RestTemplate restTemplate = new RestTemplate();
        String putResourceUrl = "http://localhost:8082/spring_crm"
                + "_rest_war_exploded/api/users/";
        restTemplate.put(putResourceUrl, theUser);
    }


}

