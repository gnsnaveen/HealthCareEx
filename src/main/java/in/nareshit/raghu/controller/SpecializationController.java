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
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import in.nareshit.raghu.entity.Specialization;
import in.nareshit.raghu.service.ISpecializationService;
import in.nareshit.raghu.view.SpecializationExcelView;
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
			@RequestParam Long id,RedirectAttributes attributes
			) 
	{
		service.deleteSpecialization(id);
		String message = "SPECIALIZATION '"+id+"' CREATED";
		attributes.addAttribute("message", message);
		return "redirect:all";
	}
		
	@GetMapping("/edit")
	public String showEdit(
			@RequestParam Long id,
			Model model
			) 
	{
		//call service
		Specialization obj =  service.getOneSpecialization(id);
		//send data to UI
		model.addAttribute("specialization", obj);
		//Goto Edit HTML Page
		return "SpecializationEdit";
	}
	@PostMapping("/update")
	public String update(
			//reading Form data
			@ModelAttribute Specialization specialization,
			Model model) {
		
		//calling service
				Long id = service.saveSpecialization(specialization);
				
				//creating message 
				String message = "SPECIALIZATION '"+id+"' Updated";
				//System.out.println(message);
				
				//sending message to UI
				model.addAttribute("message", message);
				
				//goto FORM Page
				return "redirect:all";
		
	}
	
	@GetMapping("/excel")
	public ModelAndView excelExport() {
		//Create MAV obj 
		ModelAndView m = new ModelAndView();
		
		//provide view class object
		m.setView(new SpecializationExcelView());
		
		//Read data from DB and send to View class
		List<Specialization> list = service.getAllSpecializations();
		m.addObject("list", list);
		
		return m;
	}
		
	}
			

