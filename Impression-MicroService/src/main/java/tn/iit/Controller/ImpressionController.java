package tn.iit.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import tn.iit.entity.Impression;
import tn.iit.request.CreateImpressionRequest;
import tn.iit.response.ImpressionResponse;
import tn.iit.service.ImpressionService;

@RestController
@RequestMapping("/api/Impression")
public class ImpressionController {
	
	@Autowired
	ImpressionService impressionService;
	
	@PostMapping("/create")
	public ImpressionResponse createUser (@RequestBody CreateImpressionRequest createImpressionRequest) {
		return impressionService.createImpression(createImpressionRequest);
	}
	
	@GetMapping("getById/{id}")
	public ImpressionResponse getById (@PathVariable long id) {
		return ImpressionService.getById(id);
	}
	
	@GetMapping("/all")
	public @ResponseBody Iterable<Impression> getAll () {
		return impressionService.getAllImpressions();
	}
	

}
