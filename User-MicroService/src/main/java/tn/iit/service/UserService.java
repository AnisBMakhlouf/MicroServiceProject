package tn.iit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;
import tn.iit.entity.User;
import tn.iit.repository.UserRepository;
import tn.iit.request.CreateUserRequest;
import tn.iit.response.UserResponse;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

//	@Autowired
//	WebClient webClient;
//	@Autowired
//	AddressFeignClient feignClient;

	public UserResponse createUser(CreateUserRequest createuserRequest) {

		User user = new User();
		user.setFullName(createuserRequest.getFullName());
		user.setMail(createuserRequest.getMail());
		user.setPassword(createuserRequest.getPassword());
		user.setRole(createuserRequest.getRole());
		
		user = userRepository.save(user);

		UserResponse userResponse = new UserResponse(user);
		return userResponse;
	}
	
	public UserResponse getById (long id) {
		User user = userRepository.findById(id).get();
		UserResponse userResponse = new UserResponse(userRepository.findById(id).get());
				
		return userResponse;
	}
	
	public List<User> getAll () {
		List<User> users = userRepository.findAll();
				
		return users;
	}
	
}
