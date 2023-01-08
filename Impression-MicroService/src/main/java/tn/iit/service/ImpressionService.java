package tn.iit.service;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.bind.annotation.ResponseBody;

import reactor.core.publisher.Mono;
import tn.iit.Proxies.GroupFeignClient;
import tn.iit.Proxies.SubjectFeignClient;
import tn.iit.Proxies.UserFeignClient;
import tn.iit.entity.Impression;
import tn.iit.repository.ImpressionRepository;
import tn.iit.request.CreateImpressionRequest;
import tn.iit.response.GroupResponse;
import tn.iit.response.ImpressionResponse;
import tn.iit.response.SubjectResponse;
import tn.iit.response.UserResponse;

@Service
public class ImpressionService {
	
	@Autowired
	ImpressionRepository impressionRepository;
	@Autowired
	GroupFeignClient GfeignClient;
	@Autowired
	SubjectFeignClient SfeignClient;
	@Autowired
	UserFeignClient UfeignClient;
	public ImpressionResponse createImpression(CreateImpressionRequest createimpressionRequest) {

		Impression impression = new Impression();
		impression.setDate(createimpressionRequest.getDate());
		impression.setFile(createimpressionRequest.getFile());
		impression.setId_Ens(createimpressionRequest.getId_Ens());
		impression.setId_Group(createimpressionRequest.getId_Group());
		impression.setId_Subject(createimpressionRequest.getId_Subject());
		impression.setNbrCopie(createimpressionRequest.getNbrCopie());
		impression.setStatus(createimpressionRequest.getStatus());
		
		impression = impressionRepository.save(impression);

		ImpressionResponse impressionResponse = new ImpressionResponse(impression);
		return impressionResponse;
	}
	
	public ImpressionResponse UpdateImpression(long id, CreateImpressionRequest createimpressionRequest) {

		Impression imp = impressionRepository.findById(id).get();
		imp.setDate(createimpressionRequest.getDate());
		imp.setFile(createimpressionRequest.getFile());
		imp.setId_Ens(createimpressionRequest.getId_Ens());
		imp.setId_Group(createimpressionRequest.getId_Group());
		imp.setId_Subject(createimpressionRequest.getId_Subject());
		imp.setNbrCopie(createimpressionRequest.getNbrCopie());
		imp.setStatus(createimpressionRequest.getStatus());
		
		imp = impressionRepository.save(imp);
		ImpressionResponse impressionResponse = new ImpressionResponse(imp);
		return impressionResponse;
	}
	
	public @ResponseBody ImpressionResponse getById(long id) {
		Impression impression = impressionRepository.findById(id).get();
		GroupResponse groupResponse = getGroupById(impression.getId_Group());
		UserResponse userResponse = getUserById(impression.getId_Ens());
		SubjectResponse subjectResponse = getSubjectById(impression.getId_Subject());
		
		ImpressionResponse impressionResponse = new ImpressionResponse(impressionRepository.findById(id).get());
		impressionResponse.setNom_Ens(userResponse.getFullName());
		impressionResponse.setNom_Group(groupResponse.getGroupName());
		impressionResponse.setNom_Subject(subjectResponse.getSubjectName());
		return impressionResponse;
	}

	private SubjectResponse getSubjectById(long Id_Subject) {
		// TODO Auto-generated method stub
		return SfeignClient.getById(Id_Subject);
	}

	private UserResponse getUserById(long id_Ens) {
		return UfeignClient.getById(id_Ens);
	}

	private GroupResponse getGroupById(String Id_Group) {
		return GfeignClient.getById(Id_Group);
	}
	public @ResponseBody Iterable<Impression> getAllImpressions() {
	    return impressionRepository.findAll();
	  }
	public void DeleteImpression (long id) {
		 impressionRepository.deleteById(id);
	}
}
