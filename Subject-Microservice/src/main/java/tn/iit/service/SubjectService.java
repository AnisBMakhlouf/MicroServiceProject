package tn.iit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import tn.iit.proxies.UserFeignClient;
import tn.iit.entity.Subject;
import tn.iit.repository.SubjectRepository;
import tn.iit.request.CreateSubjectRequest;
import tn.iit.response.SubjectResponse;
import tn.iit.proxies.UserFeignClient;
import tn.iit.proxies.GroupFeignClient;
import tn.iit.response.GroupResponse;
import tn.iit.response.UserResponse;

@Service
public class SubjectService {

	@Autowired
	SubjectRepository subjectRepository;
	@Autowired
	GroupFeignClient feignClient;
	@Autowired
	UserFeignClient UfeignClient;

	public SubjectResponse createSubject(CreateSubjectRequest createsubjectRequest) {

		Subject subject = new Subject();
		subject.setSubjectName(createsubjectRequest.getSubjectName());
		subject.setId_Group(createsubjectRequest.getId_Group());
		subject.setId_Ens(createsubjectRequest.getId_Ens());
		
		subject = subjectRepository.save(subject);

		SubjectResponse subjectResponse = new SubjectResponse(subject);
		return subjectResponse;
	}
	
	public SubjectResponse getById (long id) {
		Subject subject = subjectRepository.findById(id).get();
		GroupResponse groupResponse = getGroupById(subject.getId_Group());
		UserResponse userResponse = getUserById(subject.getId_Ens());
		
		SubjectResponse subjectResponse = new SubjectResponse(subjectRepository.findById(id).get());
		subjectResponse.setNom_Group(groupResponse.getGroupName());
		subjectResponse.setNom_Ens(userResponse.getFullName());
				
		return subjectResponse;
	}
	private GroupResponse getGroupById(String id) {
		return feignClient.getById(id);
	}
	private UserResponse getUserById(String id) {
		return UfeignClient.getById(id);
	}
	
	public SubjectResponse UpdateById (long id,CreateSubjectRequest createsubjectRequest) {
		Subject subject = new Subject();
		subject.setSubjectName(createsubjectRequest.getSubjectName());
		subject.setId_Group(createsubjectRequest.getId_Group());
		subject.setId_Ens(createsubjectRequest.getId_Ens());
		
		subject = subjectRepository.save(subject);
		SubjectResponse subjectResponse = new SubjectResponse(subjectRepository.findById(id).get());
				
		return subjectResponse;
	}
	
	public @ResponseBody Iterable<Subject> getAllSubjects() {
	    return subjectRepository.findAll();
	  }
	
	
	
	public void DeleteSubject (long id) {
		subjectRepository.deleteById(id);
	}
	
}
