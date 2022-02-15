package in.nareshit.raghu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import in.nareshit.raghu.entity.Appointment;
import in.nareshit.raghu.service.IAppointmentService;

@Controller
@RequestMapping("/appointment")
public class AppointmentController {

	@Autowired
	IAppointmentService service;
	
	@GetMapping("/save")
	public String saveAppointment(@ModelAttribute Appointment appointment,Model model) {
		
		Long id=service.saveAppointment(appointment);
		model.addAttribute("id", id);
		return "AppointmentRegister";
		
		
		
	}
	
}
