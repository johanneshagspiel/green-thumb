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
public class UserRestController {

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

    @GetMapping("/users/{userId}")
	public User getUser(@PathVariable int userId) {
		User theUser = userService.getUser(userId);
		return theUser;
	}

    @GetMapping("/user/{user_name}/{password}")
	public User getUser2(@PathVariable String user_name,@PathVariable String password) {
		User theUser = userService.getUser2(user_name, password);
		return theUser;
	}

	@GetMapping("/users3")
	public User getUserSafeNW(@RequestBody User theUser) {
		User theUserReturn = userService.getUserSafe(theUser);
		return theUserReturn;
	}

	@PutMapping("/users3")
	public User getUserSafe(@RequestBody User theUser) {
		User theUserReturn = userService.getUserSafe(theUser);
		return theUserReturn;
	}

    @GetMapping("/user2/{user_name}")
	public User getUser3(@PathVariable String user_name) {
		User theUser = userService.getUser3(user_name);
		return theUser;
	}

    @PostMapping("/users")
	public User addUser(@RequestBody User theUser) {
		theUser.setId(0);
		userService.saveUser(theUser);
		return theUser;
	}

    @PutMapping("/users")
	public User updateUser(@RequestBody User theUser) {
		userService.saveUser(theUser);
		return theUser;
	}

    @DeleteMapping("/users/{userId}")
	public String deleteUser(@PathVariable int userId) {
		User tempCustomer = userService.getUser(userId);
		userService.deleteUser(userId);
		return "Deleted user id - " + userId;
	}
}