package com.mappings.controller;

import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.mappings.model.ReviewModel;
import com.mappings.service.ReviewServiceImpl;

@Controller
public class ReviewController {

	private ReviewServiceImpl reviewServiceImpl;
	
	@GetMapping("/showReviewForm")
	public String showReviewForm(@PathParam("id") Integer id,Model model) {
		
		ReviewModel reviewModel=new ReviewModel();
		model.addAttribute("reviewModel", reviewModel);
		model.addAttribute("id",id);

		return "review";
	}

	@PostMapping("/reviewRegister")
	public String reviewRegister(@PathParam("id") Integer id, @ModelAttribute("reviewModel") ReviewModel reviewModel) {

		reviewServiceImpl.saveReviewDtls(id, reviewModel);		
		return "review";
	}

}
