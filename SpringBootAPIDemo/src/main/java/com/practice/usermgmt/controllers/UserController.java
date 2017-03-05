/**
 * 
 */
package com.practice.usermgmt.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.practice.usermgmt.beans.User;
import com.practice.usermgmt.models.CreateUserRequest;
import com.practice.usermgmt.models.CreateUserResponse;
import com.practice.usermgmt.models.GetUsersResponse;

/**
 * @author gauta
 *
 */
@RestController
@RequestMapping("/users")
public class UserController {

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ResponseEntity<CreateUserResponse> createUser(RequestEntity<CreateUserRequest> createUserRequest) {
		CreateUserResponse response = new CreateUserResponse();
		response.setUserId(111);

		ResponseEntity<CreateUserResponse> responseEntity = new ResponseEntity<>(response, HttpStatus.OK);

		return responseEntity;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ResponseEntity<GetUsersResponse> createUser() {
		GetUsersResponse response = new GetUsersResponse();

		User user1 = new User();
		user1.setId(111);
		user1.setFirstName("Gautam");
		user1.setMiddleName("Dilipbhai");
		user1.setLastName("Trivedi");
		user1.setEmail("gautamtrivedi@email.com");
		user1.setRoleId(1);

		response.getUsers().add(user1);

		User user2 = new User();
		user2.setId(222);
		user2.setFirstName("Gautam1");
		user2.setMiddleName("Dilipbhai1");
		user2.setLastName("Trivedi1");
		user2.setEmail("gautamtrivedi1@email.com");
		user2.setRoleId(1);

		response.getUsers().add(user2);

		ResponseEntity<GetUsersResponse> responseEntity = new ResponseEntity<>(response, HttpStatus.OK);

		return responseEntity;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<GetUsersResponse> createUser(@PathVariable Integer id) {
		GetUsersResponse response = new GetUsersResponse();

		User user1 = new User();
		user1.setId(111);
		user1.setFirstName("Gautam");
		user1.setMiddleName("Dilipbhai");
		user1.setLastName("Trivedi");
		user1.setEmail("gautamtrivedi@email.com");
		user1.setRoleId(1);

		response.getUsers().add(user1);

		ResponseEntity<GetUsersResponse> responseEntity = new ResponseEntity<>(response, HttpStatus.OK);

		return responseEntity;
	}

}
