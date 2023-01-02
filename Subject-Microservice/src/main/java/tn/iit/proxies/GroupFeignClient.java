package tn.iit.proxies;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import tn.iit.request.CreateGroupRequest;
import tn.iit.response.GroupResponse;

@FeignClient(value = "GroupService", path = "/api/group")
public interface GroupFeignClient {
	@PostMapping("/create")
	GroupResponse createGroup(@RequestBody CreateGroupRequest createGroupRequest);

	@GetMapping("/getById/{id}")
	GroupResponse getById(@PathVariable String id);
}
