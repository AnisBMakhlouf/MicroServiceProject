package tn.iit.proxies;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import tn.iit.request.CreateUserRequest;
import tn.iit.response.UserResponse;

@FeignClient(value = "UserService", path = "/api/user")
public interface UserFeignClient {
	@PostMapping("/create")
	UserResponse createAddress(@RequestBody CreateUserRequest createUserRequest);

	@GetMapping("/getById/{id}")
	UserResponse getById(@PathVariable String id);
	
}
