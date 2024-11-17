package com.ecom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.ecom.model.UserDtls;
import com.ecom.service.UserService;

@RestController
public class ApiUserController {
	@Autowired
	private UserService userService;

	@PostMapping("/save-User")
	public ResponseEntity<?> saveUser(@RequestBody UserDtls user) {
		UserDtls saveUserApi = userService.saveUser(user);

		if (ObjectUtils.isEmpty(saveUserApi)) {
			return new ResponseEntity<>("User not saved", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(saveUserApi, HttpStatus.CREATED);
	}

	@GetMapping("/get-AllUsers")
	public ResponseEntity<?> getAllUser() {
		List<UserDtls> allUsers = userService.getAllUserApi();
		return new ResponseEntity<>(allUsers, HttpStatus.OK);
	}

	@PutMapping("/update-User")
	public ResponseEntity<?> updateUser(@RequestBody UserDtls user) {
		UserDtls saveUserApi = userService.saveUser(user);

		if (ObjectUtils.isEmpty(saveUserApi)) {
			return new ResponseEntity<>("User not updated", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(saveUserApi, HttpStatus.OK);
	}

	@DeleteMapping("/delete-User/{id}")
	public ResponseEntity<?> deleteUser(@PathVariable Integer id) {
		userService.deleteUserApi(id);
		return new ResponseEntity<>("Delete Successfully", HttpStatus.OK);
	}

	@GetMapping("/get-user/{id}")
	public ResponseEntity<?> getUserById(@PathVariable Integer id) {
		UserDtls userById = userService.getUserByIdApi(id);
		if (ObjectUtils.isEmpty(userById)) {
			return new ResponseEntity<>("User not found", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(userById, HttpStatus.OK);
	}
	
}
