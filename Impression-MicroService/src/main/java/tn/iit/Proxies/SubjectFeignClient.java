package tn.iit.Proxies;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import tn.iit.request.CreateSubjectRequest;
import tn.iit.response.SubjectResponse;

@FeignClient(value = "SubjectService", path = "/api/subject")
public interface SubjectFeignClient {

	@PostMapping("/create")
	SubjectResponse createAddress(@RequestBody CreateSubjectRequest createSubjectRequest);

	@GetMapping("getById/{id}")
	SubjectResponse getById(@PathVariable long id);

}
