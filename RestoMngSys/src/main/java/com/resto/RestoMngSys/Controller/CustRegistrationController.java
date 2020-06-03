package com.resto.RestoMngSys.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.resto.RestoMngSys.Entity.Customer;
import com.resto.RestoMngSys.Service.CustRegistrationService;

@CrossOrigin
@RestController
public class CustRegistrationController {
	
	@Autowired
	CustRegistrationService custservice;
	
	@RequestMapping(value="/hey")
	public String getHey() {
		return "Hey registration";
	}

	@RequestMapping(value="/registration", method = RequestMethod.POST)
	public String doRegistration(@RequestBody Customer customer) {
		String result = custservice.registerCustomer(customer);
//		ModelAndView mv = new ModelAndView();
//		if(result == "success")
//			mv.setViewName("registrationsuccesspage");
//		else
//			mv.setViewName("registration");
//		return mv;
		return result;
	}
}
