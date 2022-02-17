package in.nareshit.raghu.service;

import java.util.List;

import in.nareshit.raghu.entity.Appoinment;
import in.nareshit.raghu.entity.Specialization;

public interface IAppoinmentService {

	Long saveAppoinment(Appoinment appoinment);
	void updateAppoinment(Appoinment appoinment);
	void deleteAppoinment(Long id);
	Appoinment getOneAppoinment(Long id);
	List<Appoinment> getAllAppoinments();


	
	
}
