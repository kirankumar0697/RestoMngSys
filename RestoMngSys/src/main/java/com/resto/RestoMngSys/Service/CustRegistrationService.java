package com.resto.RestoMngSys.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resto.RestoMngSys.Dao.CustRegistrationDao;
import com.resto.RestoMngSys.Entity.Customer;

@Service
public class CustRegistrationService {
	
	@Autowired
	CustRegistrationDao custDao;

	public String registerCustomer(Customer customer) {
		
		custDao.save(customer);
		System.out.println("customer saved!");
		return "Thank you for Registration";
	}

}
