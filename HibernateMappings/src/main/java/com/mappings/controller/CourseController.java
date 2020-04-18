package com.mappings.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mappings.model.CourseModel;
import com.mappings.service.CourseServiceImpl;

@Controller
public class CourseController {

	@Autowired
	private CourseServiceImpl courseServiceImpl;

	@GetMapping("/showCourseForm")
	public String showCourseForm(@PathParam("id") Integer id, Model model) {
		CourseModel courseModel = new CourseModel();
		model.addAttribute("courseModel", courseModel);
		model.addAttribute("id", id);

		return "course";
	}

	@PostMapping("/courseRegister")
	public String RegisterCourseForm(@PathParam("id") Integer id,@ModelAttribute("courseModel") CourseModel courseModel) {

		courseServiceImpl.registerCourseDtls(id, courseModel);
		
		return "redirect:/showReviewForm?id="+id;
	}
	
	@GetMapping("/courseById")
	public @ResponseBody CourseModel courseById(@PathParam("id")Integer id) {
		
		return courseServiceImpl.courseById(id);
	}

}
