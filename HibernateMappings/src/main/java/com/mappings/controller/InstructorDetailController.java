package com.mappings.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mappings.model.InstructorDetailModel;
import com.mappings.service.InstructorDetailServiceImpl;

@Controller
public class InstructorDetailController {

	@Autowired
	private InstructorDetailServiceImpl instrDtlsServce;

	@GetMapping("/showForm")
	public String showInstructorDetailForm(Model model) {

		InstructorDetailModel instrDtlModel = new InstructorDetailModel();
		model.addAttribute("instrDtlModel", instrDtlModel);
		
		return "instructorDetail";
	}

	@PostMapping("/register")
	public  String registerInstructorDetails(@ModelAttribute("instrDtlModel") InstructorDetailModel instrDtlModel) {
	
		Integer id = instrDtlsServce.registerInstructorDetails(instrDtlModel);
		
		return "redirect:/showInstructorForm?id="+id;
	}
	@GetMapping("/instrDtlsDeleteById")
	public @ResponseBody String deleteInstrDtlsById(@PathParam("id") Integer id) {
	 
		return instrDtlsServce.deleteBYId(id);
	}
	

}
