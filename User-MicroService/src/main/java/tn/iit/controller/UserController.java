package tn.iit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.iit.entity.User;
import tn.iit.request.CreateUserRequest;
import tn.iit.response.UserResponse;
import tn.iit.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/create")
	public UserResponse createUser (@RequestBody CreateUserRequest createUserRequest) {
		return userService.createUser(createUserRequest);
	}
	
	@GetMapping("getById/{id}")
	public UserResponse getById (@PathVariable long id) {
		return userService.getById(id);
	}
	
	@GetMapping("/all")
	public List<User> getAll (@PathVariable long id) {
		return userService.getAll();
	}
}
