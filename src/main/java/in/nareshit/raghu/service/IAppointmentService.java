package in.nareshit.raghu.service;

import java.util.List;

import in.nareshit.raghu.entity.Appointment;
import in.nareshit.raghu.entity.Specialization;

public interface IAppointmentService {

	Long saveAppointment(Appointment appointment);

	List<Appointment> getAllAppointments();

	void deleteAppointment(Long id);

	Specialization getOneAppointment(Long id);
	
	
	
}
