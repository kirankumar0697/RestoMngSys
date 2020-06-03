package com.resto.RestoMngSys.Service;

import java.util.ArrayList;
import java.util.List;

import org.aspectj.weaver.ast.Var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resto.RestoMngSys.Dao.CustomerFeedbackViewDao;
import com.resto.RestoMngSys.Entity.CustomerFeedback;

@Service
public class CustomerFeedbackViewService {

	@Autowired
	CustomerFeedbackViewDao viewDao;
	
	public List<CustomerFeedback> getAllFeedback() {
		List<CustomerFeedback> allfeeds =new ArrayList<CustomerFeedback>();
		viewDao.findAll().forEach(allfeeds::add);;
		return allfeeds;
	}

}
