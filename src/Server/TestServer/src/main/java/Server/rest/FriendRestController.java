package Server.rest;

import java.util.List;

import Server.entity.Friend;
import Server.service.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Friend rest controller.
 */
@RestController
@RequestMapping("/api")
public class FriendRestController {

    // autowire the CustomerService
    @Autowired
    private FriendService friendService;

    /**
     * Gets friends.
     *
     * @param user_name_entry the user name entry
     * @return the friends
     */
// add mapping for GET /customers
    @GetMapping("/friend/{user_name_entry}")
    public List<Friend> getFriends(@PathVariable String user_name_entry) {

        return friendService.getFriends(user_name_entry);

    }

    /**
     * Gets friends.
     *
     * @return the friends
     */
// add mapping for GET /customers
    @GetMapping("/friends")
    public List<Friend> getFriends() {

        return friendService.getFriends();

    }

    // add mapping for POST /customers  - add new customer

    /**
     * Add friend friend.
     *
     * @param theFriend the the friend
     * @return the friend
     */
    @PostMapping("/friends")
    public Friend addFriend(@RequestBody Friend theFriend) {

        // also just in case the pass an id in JSON ... set id to 0
        // this is force a save of new item ... instead of update

        theFriend.setId(0);

        friendService.saveFriend(theFriend);

        return theFriend;
    }

    // add mapping for PUT /customers - update existing customer

    /**
     * Update friend friend.
     *
     * @param theFriend the the friend
     * @return the friend
     */
    @PutMapping("/friends")
    public Friend updateFriend(@RequestBody Friend theFriend) {

        friendService.saveFriend(theFriend);

        return theFriend;

    }

    // add mapping for DELETE /customers/{customerId} - delete customer

    /**
     * Delete friend string.
     *
     * @param userId the user id
     * @return the string
     */
    @DeleteMapping("/friends/{userId}")
    public String deleteFriend(@PathVariable int userId) {

        friendService.deleteFriend(userId);

        return "Deleted user id - " + userId;
    }

}

















