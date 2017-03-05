/**
 * 
 */
package com.practice.usermgmt.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.practice.usermgmt.entities.User;
import com.practice.usermgmt.models.CreateUserRequest;
import com.practice.usermgmt.models.CreateUserResponse;
import com.practice.usermgmt.models.GetUsersResponse;
import com.practice.usermgmt.services.UserService;

/**
 * @author gauta
 *
 */
@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping(value = "", method = RequestMethod.POST)
	public ResponseEntity<CreateUserResponse> createUser(RequestEntity<CreateUserRequest> createUserRequest) {
		CreateUserResponse response = new CreateUserResponse();
		response.setUserId(userService.add(createUserRequest.getBody().getUser()));
		ResponseEntity<CreateUserResponse> responseEntity = new ResponseEntity<>(response, HttpStatus.OK);
		return responseEntity;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<CreateUserResponse> updateUser(RequestEntity<CreateUserRequest> createUserRequest,
			@PathVariable Integer id) {

		HttpStatus status = HttpStatus.OK;

		User user = createUserRequest.getBody().getUser();

		if (null == userService.getById(id)) {
			status = HttpStatus.CREATED;
			user.setId(null);
		} else {
			user.setId(id);
		}

		CreateUserResponse response = new CreateUserResponse();
		response.setUserId(userService.update(user));
		ResponseEntity<CreateUserResponse> responseEntity = new ResponseEntity<>(response, status);
		return responseEntity;
	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	public ResponseEntity<GetUsersResponse> getAllUsers() {
		GetUsersResponse response = new GetUsersResponse();
		response.getUsers().addAll(userService.getAll());
		ResponseEntity<GetUsersResponse> responseEntity = new ResponseEntity<>(response, HttpStatus.OK);
		return responseEntity;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<GetUsersResponse> getUserById(@PathVariable Integer id) {
		GetUsersResponse response = new GetUsersResponse();
		response.getUsers().add(userService.getById(id));
		ResponseEntity<GetUsersResponse> responseEntity = new ResponseEntity<>(response, HttpStatus.OK);
		return responseEntity;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Boolean> deleteById(@PathVariable Integer id) {

		HttpStatus status = HttpStatus.OK;
		boolean deleteFlag = true;

		if (null == userService.getById(id)) {
			status = HttpStatus.BAD_REQUEST;
			deleteFlag = false;
		} else {
			userService.delete(id);
		}

		ResponseEntity<Boolean> responseEntity = new ResponseEntity<>(deleteFlag, status);
		return responseEntity;
	}

}
