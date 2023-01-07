package tn.iit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.iit.entity.Group;
import tn.iit.repository.GroupRepository;
import tn.iit.request.CreateGroupRequest;
import tn.iit.response.GroupResponse;
import tn.iit.service.GroupService;
import org.springframework.web.bind.annotation.ResponseBody;
@RestController
@RequestMapping("/api/group")
public class GroupController {
	
	@Autowired
	GroupService groupService;
	@Autowired
	private GroupRepository groupRepository;
	@CrossOrigin
	@PostMapping("/create")
	public GroupResponse createGroup (@RequestBody CreateGroupRequest createGroupRequest) {
		return groupService.createGroup(createGroupRequest);
	}
	@CrossOrigin
	@GetMapping("getById/{id}")
	public GroupResponse getById (@PathVariable long id) {
		return groupService.getById(id);
	}
	@CrossOrigin
	 @GetMapping("/all")
	  public @ResponseBody Iterable<Group> getAllGroups() {
	    return groupService.getAllGroups();
	  }
	@CrossOrigin
	 @PostMapping("/update/{id}")
		public GroupResponse updateGroup (@PathVariable long id, @RequestBody CreateGroupRequest createGroupRequest) {
			return groupService.updateById(id, createGroupRequest);
		}
	@CrossOrigin
	 @PostMapping("/delete/{id}")
		public void deleteGroup (@PathVariable long id) {
		 	groupService.DeleteGroup(id);
		}
}
