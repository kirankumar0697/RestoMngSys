package com.resto.RestoMngSys.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.resto.RestoMngSys.Entity.CustomerFeedback;
import com.resto.RestoMngSys.Service.CustFeedbackService;

@CrossOrigin
@RestController
public class CustFeedbackController {
	
	@Autowired
	CustFeedbackService feedbackservice;
	
	@RequestMapping(value="/feedmsg")
	public String getHey() {
		return "Feedback controller accessed";
	}

	@RequestMapping(value="/feedback", method=RequestMethod.POST)
	public String getFeedback(@RequestBody CustomerFeedback feedback) {
		//System.out.println("feedback : "+feedback.getCustmail() +" " + feedback.getMessage());
		String result = feedbackservice.postFeedback(feedback);
		return result;
	}
}
