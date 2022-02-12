package in.nareshit.raghu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.nareshit.raghu.entity.Specialization;
import in.nareshit.raghu.service.ISpecializationService;
@Controller
@RequestMapping("/spec")
public class SpecializationController {

	@Autowired
	private ISpecializationService service;
	@PostMapping("/save")
	public String save(
			//reading Form data
			@ModelAttribute Specialization specialization,
			Model model) {
		
		//calling service
				Long id = service.saveSpecialization(specialization);
				
				//creating message 
				String message = "SPECIALIZATION '"+id+"' CREATED";
				//System.out.println(message);
				
				//sending message to UI
				model.addAttribute("message", message);
				
				//goto FORM Page
				return "SpecializationRegister";
		
	}
	
	//1. Show Register Page
			@GetMapping("/register")
			public String showReg() {
				return "SpecializationRegister";
			}
			
	//1. Get SpecializationData		
	@GetMapping("/all")	
	public String showData(Model model) {
		
		List<Specialization> list=service.getAllSpecializations();
		
		model.addAttribute("list",list);
		
		return "SpecializationData";
		
		
	}
	
	
	//3. delete SpecializationData
	@GetMapping("/delete")
	public String delete(
			@RequestParam Long id
			) 
	{
		service.deleteSpecialization(id);
		return "redirect:all";
	}
		
		
		
	}
			

