package com.springboot.restcontroller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.exception.CustomerIdNotFoundException;
import com.springboot.model.CustomerModel;
import com.springboot.service.CustomerServiceImpl;

@RestController
public class CustomerRestController {

	@Autowired
	private CustomerServiceImpl customerService;

	@GetMapping("/logInCustomerForm")
	public ModelAndView logInCustomerForm(Model model) {

		CustomerModel customerModel = new CustomerModel();
		model.addAttribute("customerModel", customerModel);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("CustomerLogIn");

		return mav;
	}

	@PostMapping("/saveCustomeDtls")
	public ModelAndView saveCustomerDtls(@ModelAttribute("customerModel") CustomerModel customerModel) {

		String msg = "Registration failed";

		ModelAndView mav = new ModelAndView();
		mav.setViewName("CustomerLogIn");

		if (customerService.saveCustomer(customerModel))
			msg = "Registration SuccessFully Completed..!";

		mav.addObject("msg", msg);

		return mav;
	}

	@GetMapping("/getCustomeDtls")
	public ModelAndView getAllCustomerDtls() {

		ModelAndView modelAndView = new ModelAndView();
		List<CustomerModel> customerDtls = customerService.getCustomerDtls();
		modelAndView.addObject("customerDtls", customerDtls);
		modelAndView.setViewName("CustomerData");

		return modelAndView;
	}

	@GetMapping("/editCustomerData")
	public ModelAndView editCustomerData(Model model, @PathParam("id") Integer id) {

		CustomerModel customer = customerService.findByCustomerId(id);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("editCustomerData");
		model.addAttribute("customer", customer);

		return modelAndView;
	}

	@PostMapping("/saveEditedCustomerDtls")
	public ModelAndView saveEditedCustomerDtls(@ModelAttribute("customerModel") CustomerModel customerModel) {

		String msg ="Customer Details are not Modified";		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("CustomerLogIn");
		if(customerService.saveCustomer(customerModel)) 
			msg="Customer Details are Modified";
		
		mav.addObject("msg", msg);

		return mav;
	}
	@GetMapping("/deleteCustomerData")
	public ModelAndView deleteCustomerById(@PathParam("id") Integer id) {
		
		ModelAndView modelAndView = new ModelAndView();	
		
		if(id==null) {		
		String msg="Customer Record is not deleted";
			if(!customerService.deleteCustomerById(id)) 		
			msg="Customer Record is deleted";
		List<CustomerModel> customerDtls = customerService.getCustomerDtls();
		modelAndView.addObject("customerDtls", customerDtls);
		modelAndView.addObject("msg", msg);
		modelAndView.setViewName("CustomerData");
		}else {
			
			throw new CustomerIdNotFoundException();
		}
		return modelAndView;
	}
	
	

}
