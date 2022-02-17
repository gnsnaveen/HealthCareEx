package in.nareshit.raghu.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nareshit.raghu.entity.Specialization;
import in.nareshit.raghu.repo.SpecializationRepository;
import in.nareshit.raghu.service.ISpecializationService;
@Service
public class SpecializationServiceImpl implements ISpecializationService{
	
	@Autowired
private SpecializationRepository repo;

	@Override
	public Long saveSpecialization(Specialization obj) {
		// TODO Auto-generated method stub
		
		
		obj = repo.save(obj);		
		return obj.getSpecId();
		
		
	}@Override
	public void deleteSpecialization(Long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		
	}
	
	@Override
	public List<Specialization> getAllSpecializations() {
		List<Specialization> list =  repo.findAll();
		return list;
	}
	@Override
	public Specialization getOneSpecialization(Long id) {
		// TODO Auto-generated method stub
		Optional<Specialization> opt = repo.findById(id);
		return opt.get();
	}
}
