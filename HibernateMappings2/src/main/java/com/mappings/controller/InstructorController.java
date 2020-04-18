package com.mappings.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mappings.model.InstructorModel;
import com.mappings.service.InstructorServiceImpl;

@Controller
public class InstructorController {
	
	@Autowired
	private InstructorServiceImpl instrServiceImpl;
	
	@GetMapping("/showInstructorForm")
	public String showInstructorForm(@PathParam("id") Integer id,Model model) {
		
		InstructorModel instrModel=new InstructorModel();
		model.addAttribute("instrModel", instrModel);
		model.addAttribute("id", id);
		
		return "Instructor";
	}
	
	@PostMapping("/instrRegister")
	public String RegisterInstructorInfo(@ModelAttribute("instrModel")InstructorModel instrModel,@PathParam("id") Integer id) {
		
		instrServiceImpl.registerInstructorDetails(id, instrModel);
		
		return "Instructor";
	}
	
	@GetMapping("/instrById")
	public @ResponseBody InstructorModel findByInstrId(@PathParam("id") Integer id) {
		
		return instrServiceImpl.findBYId(id);
	}
	
	@GetMapping("/instrDeleteById")
	public @ResponseBody String deleteByInstrId(@PathParam("id") Integer id) {
		
		return instrServiceImpl.deleteBYId(id);
	}
	

}
