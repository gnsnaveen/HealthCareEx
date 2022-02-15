package in.nareshit.raghu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nareshit.raghu.entity.Appointment;
import in.nareshit.raghu.entity.Specialization;
import in.nareshit.raghu.repo.AppointmentRepository;
import in.nareshit.raghu.service.IAppointmentService;

@Service
public class AppointmentServiceImpl implements IAppointmentService {

	@Autowired
	AppointmentRepository repo;

	@Override
	public Long saveAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Appointment> getAllAppointments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAppointment(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Specialization getOneAppointment(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
