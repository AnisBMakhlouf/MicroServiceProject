package tn.iit.service;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.bind.annotation.ResponseBody;

import reactor.core.publisher.Mono;
import tn.iit.entity.Subject;
import tn.iit.repository.SubjectRepository;
import tn.iit.request.CreateSubjectRequest;
import tn.iit.response.SubjectResponse;

@Service
public class SubjectService {

	@Autowired
	SubjectRepository subjectRepository;

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
		//User user = userRepository.findById(id).get();
		SubjectResponse subjectResponse = new SubjectResponse(subjectRepository.findById(id).get());
				
		return subjectResponse;
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
