package in.nareshit.raghu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import in.nareshit.raghu.entity.Specialization;
import in.nareshit.raghu.repo.SpecializationRepository;
import in.nareshit.raghu.service.ISpecializationService;
@Service
public class SpecializationServiceImpl implements ISpecializationService{
	
	@Autowired
private SpecializationRepository repo;

	@Override
	public Long saveSpecialization(Specialization specialization) {
		// TODO Auto-generated method stub
		
		specialization = repo.save(specialization);
		return specialization.getSpecId();
		
		
	}
	
	
	
}
