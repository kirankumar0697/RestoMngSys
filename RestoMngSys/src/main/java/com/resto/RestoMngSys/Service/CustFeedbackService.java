package com.resto.RestoMngSys.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resto.RestoMngSys.Dao.CustFeedbackDao;
import com.resto.RestoMngSys.Entity.CustomerFeedback;

@Service
public class CustFeedbackService {

	@Autowired
	CustFeedbackDao feedbackdao;
	
	public String postFeedback(CustomerFeedback feedback) {
		feedbackdao.save(feedback);
		return "Thank You For Your Precious Feedback";
	}

}
