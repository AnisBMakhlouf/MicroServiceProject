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


import tn.iit.entity.Subject;
import tn.iit.repository.SubjectRepository;
import tn.iit.request.CreateSubjectRequest;
import tn.iit.response.SubjectResponse;
import tn.iit.service.SubjectService;
import org.springframework.web.bind.annotation.ResponseBody;
@RestController
@RequestMapping("/api/subject")
public class SubjectController {
	
	@Autowired
	SubjectService subjectService;
	@Autowired
	private SubjectRepository subjectRepository;
	@CrossOrigin
	@PostMapping("/create")
	public SubjectResponse createSubject (@RequestBody CreateSubjectRequest createSubjectRequest) {
		return subjectService.createSubject(createSubjectRequest);
	}
	@CrossOrigin
	@GetMapping("getById/{id}")
	public SubjectResponse getById (@PathVariable long id) {
		return subjectService.getById(id);
	}
	@CrossOrigin
	 @GetMapping("/all")
	  public @ResponseBody Iterable<Subject> getAllUsers() {
	    return subjectService.getAllSubjects();
	  }
	@CrossOrigin
	 @PostMapping("/update/{id}")
		public SubjectResponse updateSubject (@PathVariable long id,@RequestBody CreateSubjectRequest createSubjectRequest) {
			return subjectService.UpdateById(id, createSubjectRequest);
		}
	@CrossOrigin
	 @PostMapping("/delete/{id}")
		public void deleteSubject (@PathVariable long id) {
		 subjectService.DeleteSubject(id);
		}
}
