package server.rest;

import java.util.List;

import server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import server.entity.User;

/**
 * The type User rest controller.
 */
@RestController
@RequestMapping("/api")
public final class UserRestController {

    /**Javadoc comment.*/
    @Autowired
    private UserService userService;

    /**
     * Gets users.
     *
     * @return the users
     */
    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    /**Javadoc comment.
     * @return theUser
     * @param userId is used here*/
    @GetMapping("/users/{userId}")
    public User getUser(@PathVariable final int userId) {
        User theUser = userService.getUser(userId);
        return theUser;
    }

    /**Javadoc comment.
     * @return theUser
     * @param userName is used here*
     * @param password is used here*/
    @GetMapping("/user/{userName}/{password}")
    public User getUser2(@PathVariable final String userName,
                         @PathVariable final String password) {
        User theUser = userService.getUser2(userName, password);
        return theUser;
    }

    /**Javadoc comment.
     * @return theUserReturn
     * @param theUser is used here*/
    @GetMapping("/users3")
    public User getUserSafeNW(@RequestBody final User theUser) {
        User theUserReturn = userService.getUserSafe(theUser);
        return theUserReturn;
    }

    /** Javadoc comment.
     * @return theUserReturn
     * @param theUser is used here*/
    @PutMapping("/users3")
    public User getUserSafe(@RequestBody final User theUser) {
        User theUserReturn = userService.getUserSafe(theUser);
        return theUserReturn;
    }

    /**Javadoc comment.
     * @return theUser
     * @param userName is used here*/
    @GetMapping("/user2/{userName}")
    public User getUser3(@PathVariable final String userName) {
        User theUser = userService.getUser3(userName);
        return theUser;
    }

    /**Javadoc comment.
     * @return theUser
     * @param theUser is used here*/
    @PostMapping("/users")
    public User addUser(@RequestBody final User theUser) {
        theUser.setId(0);
        userService.saveUser(theUser);
        return theUser;
    }

    /**Javadoc comment.
     * @return theUser
     * @param theUser is used here*/
    @PutMapping("/users")
    public User updateUser(@RequestBody final User theUser) {
        userService.saveUser(theUser);
        return theUser;
    }

    /**Javadoc comment.
     * @return Text + userID
     * @param userId is used here*/
    @DeleteMapping("/users/{userId}")
    public String deleteUser(@PathVariable final int userId) {
        User tempCustomer = userService.getUser(userId);
        userService.deleteUser(userId);
        return "Deleted user id - " + userId;
    }
}
