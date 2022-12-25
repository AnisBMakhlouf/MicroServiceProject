package tn.iit.service;


import tn.iit.response.ImpressionResponse;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import reactor.core.publisher.Mono;
import tn.iit.entity.Impression;
import tn.iit.repository.ImpressionRepository;
import tn.iit.request.CreateImpressionRequest;
import tn.iit.response.ImpressionResponse;

public class ImpressionService {
	
	@Autowired
	static
	ImpressionRepository ImpressionRepository;
	
	public static ImpressionResponse createImpression(CreateImpressionRequest createimpressionRequest) {

		Impression impression = new Impression();
		impression.setDate(createimpressionRequest.getDate());
		impression.setId_Ens(createimpressionRequest.getId_Ens());
		impression.setNbrCopie(createimpressionRequest.getNbrCopie());
		impression.setFile(createimpressionRequest.getFile());
		impression.setStatus(createimpressionRequest.getStatus());
		
		impression = ImpressionRepository.save(impression);

		ImpressionResponse impressionResponse = new ImpressionResponse(impression);
		return impressionResponse;
	}
	
	

	public static ImpressionResponse getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}



	public static List<Impression> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
