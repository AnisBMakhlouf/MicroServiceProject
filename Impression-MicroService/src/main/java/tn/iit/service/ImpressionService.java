package tn.iit.service;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.bind.annotation.ResponseBody;

import reactor.core.publisher.Mono;
import tn.iit.entity.Impression;
import tn.iit.repository.ImpressionRepository;
import tn.iit.request.CreateImpressionRequest;
import tn.iit.response.ImpressionResponse;

@Service
public class ImpressionService {
	
	@Autowired
	ImpressionRepository impressionRepository;
	
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

	public ImpressionResponse getById(long id) {
		ImpressionResponse impressionResponse = new ImpressionResponse(impressionRepository.findById(id).get());
		return impressionResponse;
	}

	public @ResponseBody Iterable<Impression> getAllImpressions() {
	    return impressionRepository.findAll();
	  }
	public void DeleteImpression (long id) {
		 impressionRepository.deleteById(id);
	}
}
