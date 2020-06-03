package com.resto.RestoMngSys.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.resto.RestoMngSys.Entity.CustomerFeedback;
import com.resto.RestoMngSys.Service.CustomerFeedbackViewService;

@CrossOrigin
@RestController
public class CustomerFeedbackViewController {
	
	@Autowired
	CustomerFeedbackViewService viewservice;

	@RequestMapping(value="/viewfeedback", method=RequestMethod.GET)
	public List<CustomerFeedback> getAllFeedback() {
		List<CustomerFeedback> feedbacklist = viewservice.getAllFeedback();
		return feedbacklist;
	}
}
