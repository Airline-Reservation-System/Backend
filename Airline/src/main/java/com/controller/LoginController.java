package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Login;
import com.service.LoginService;

@RestController
@CrossOrigin
@RequestMapping(value = "login")
public class LoginController {

	@Autowired
	LoginService loginservice;
	
	@GetMapping(value = "user/{username}/{password}/{typeofuser}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Login getAllUser(@PathVariable("username") String username,@PathVariable("password") String password, @PathVariable("typeofuser") String typeofuser) {
		return loginservice.getAllUserData(username,password,typeofuser);
	}

	@PostMapping(value = "addUser", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String addUser(@RequestBody Login l) {
		return loginservice.addUserData(l);
	}
	
	@PutMapping(value = "updatePassword",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String updatePassword(@RequestBody Login l) {
			return loginservice.updatePasswordData(l);
	}
	@DeleteMapping(value = "deleteUser/{id}")
	public String deleteUser(@PathVariable("id")  int id) {
			return loginservice.deleteUserData(id);
	}
	
}
