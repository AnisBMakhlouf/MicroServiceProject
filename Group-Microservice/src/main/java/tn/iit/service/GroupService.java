package tn.iit.service;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.bind.annotation.ResponseBody;

import reactor.core.publisher.Mono;
import tn.iit.entity.Group;
import tn.iit.repository.GroupRepository;
import tn.iit.request.CreateGroupRequest;
import tn.iit.response.GroupResponse;
import tn.iit.service.GroupService;

@Service
public class GroupService {

	@Autowired
	GroupRepository groupRepository;

	public GroupResponse createGroup(CreateGroupRequest creategroupRequest) {

		Group group = new Group();
		group.setGroupName(creategroupRequest.getGroupName());
		group.setStudentNB(creategroupRequest.getStudentNB());
		
		group = groupRepository.save(group);

		GroupResponse groupResponse = new GroupResponse(group);
		return groupResponse;
	}
	
	public GroupResponse getById (long id) {
		Group group = groupRepository.findById(id).get();
		GroupResponse groupResponse = new GroupResponse(groupRepository.findById(id).get());
				
		return groupResponse;
	}
	
	public GroupResponse updateById (long id,CreateGroupRequest creategroupRequest) {
		Group group = groupRepository.findById(id).get();
		group.setGroupName(creategroupRequest.getGroupName());
		group.setStudentNB(creategroupRequest.getStudentNB());
		group = groupRepository.save(group);
		GroupResponse groupResponse = new GroupResponse(groupRepository.findById(id).get());
				
		return groupResponse;
	}
	
	public @ResponseBody Iterable<Group> getAllGroups() {
	    return groupRepository.findAll();
	  }
	
	public void DeleteGroup (long id) {
		 groupRepository.deleteById(id);
	}
	
}
