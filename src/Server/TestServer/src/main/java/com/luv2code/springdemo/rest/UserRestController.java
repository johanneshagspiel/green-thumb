package com.luv2code.springdemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springdemo.entity.User;
import com.luv2code.springdemo.service.UserService;

/**
 * The type User rest controller.
 */
@RestController
@RequestMapping("/api")
public class UserRestController {

	// autowire the CustomerService
	@Autowired
	private UserService userService;

    /**
     * Gets users.
     *
     * @return the users
     */
// add mapping for GET /customers
	@GetMapping("/users")
	public List<User> getUsers() {
		
		return userService.getUsers();
		
	}
	
	// add mapping for GET /customers/{customerId}

    /**
     * Gets user.
     *
     * @param userId the user id
     * @return the user
     */
    @GetMapping("/users/{userId}")
	public User getUser(@PathVariable int userId) {
		
		User theUser = userService.getUser(userId);
		
		if (theUser == null) {
			throw new UserNotFoundException("User id not found - " + userId);
		}
		
		return theUser;
	}

    /**
     * Gets user 2.
     *
     * @param user_name the user name
     * @param password  the password
     * @return the user 2
     */
    @GetMapping("/user/{user_name}/{password}")
	public User getUser2(@PathVariable String user_name,@PathVariable String password) {

		User theUser = userService.getUser2(user_name, password);

		if (theUser == null) {
			throw new UserNotFoundException("User  not found with the name " + user_name);
		}

		return theUser;
	}

	@GetMapping("/users3")
	public User getUserSafeNW(@RequestBody User theUser) {

		// also just in case the pass an id in JSON ... set id to 0
		// this is force a save of new item ... instead of update

		User theUserReturn = userService.getUserSafe(theUser);

		return theUserReturn;
	}

	@PutMapping("/users3")
	public User getUserSafe(@RequestBody User theUser) {

		// also just in case the pass an id in JSON ... set id to 0
		// this is force a save of new item ... instead of update

		User theUserReturn = userService.getUserSafe(theUser);

		return theUserReturn;
	}

    /**
     * Gets user 3.
     *
     * @param user_name the user name
     * @return the user 3
     */
    @GetMapping("/user2/{user_name}")
	public User getUser3(@PathVariable String user_name) {

		User theUser = userService.getUser3(user_name);

		if (theUser == null) {
			throw new UserNotFoundException("User  not found with the name " + user_name);
		}

		return theUser;
	}
	
	// add mapping for POST /customers  - add new customer

    /**
     * Add user user.
     *
     * @param theUser the the user
     * @return the user
     */
    @PostMapping("/users")
	public User addUser(@RequestBody User theUser) {
		
		// also just in case the pass an id in JSON ... set id to 0
		// this is force a save of new item ... instead of update

		theUser.setId(0);
		
		userService.saveUser(theUser);
		
		return theUser;
	}
	
	// add mapping for PUT /customers - update existing customer

    /**
     * Update user user.
     *
     * @param theUser the the user
     * @return the user
     */
    @PutMapping("/users")
	public User updateUser(@RequestBody User theUser) {
		
		userService.saveUser(theUser);
		
		return theUser;
		
	}
	
	// add mapping for DELETE /customers/{customerId} - delete customer

    /**
     * Delete user string.
     *
     * @param userId the user id
     * @return the string
     */
    @DeleteMapping("/users/{userId}")
	public String deleteUser(@PathVariable int userId) {
		
		User tempCustomer = userService.getUser(userId);
		
		// throw exception if null
		
		if (tempCustomer == null) {
			throw new UserNotFoundException("User id not found - " + userId);
		}

		userService.deleteUser(userId);
		
		return "Deleted user id - " + userId;
	}
}