package com.learning.springbootrestcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.springbootrestcrud.entity.User;
import com.learning.springbootrestcrud.service.UserService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("api/users")
public class UserController {
	
	@Autowired
	private UserService userService;

	    // build create User REST API
	    @PostMapping
	    public ResponseEntity<User> createUser(@RequestBody User user){
	        User savedUser = userService.createUser(user);
	        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
	    }

	    // build get user by id REST API
	    @GetMapping("{id}")
	    public ResponseEntity<User> getUserById(@PathVariable("id") Long userId){
	        User user = userService.getUserById(userId);
	        return new ResponseEntity<>(user, HttpStatus.OK);
	    }

	    // Build Get All Users REST API
	    @GetMapping
	    public ResponseEntity<List<User>> getAllUsers(){
	        List<User> users = userService.getAllUsers();
	        return new ResponseEntity<>(users, HttpStatus.OK);
	    }

	    // Build Update User REST API
	    @PutMapping("{id}")
	    public ResponseEntity<User> updateUser(@PathVariable("id") Long userId,
	                                           @RequestBody User user){
	        user.setId(userId);
	        User updatedUser = userService.updateUser(user);
	        return new ResponseEntity<>(updatedUser, HttpStatus.OK);
	    }

	    // Build Delete User REST API
	    @DeleteMapping("{id}")
	    public ResponseEntity<String> deleteUser(@PathVariable("id") Long userId){
	        userService.deleteUser(userId);
	        return new ResponseEntity<>("User successfully deleted!", HttpStatus.OK);
	    }

}
