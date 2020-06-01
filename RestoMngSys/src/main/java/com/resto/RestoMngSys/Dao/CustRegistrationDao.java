package com.resto.RestoMngSys.Dao;

import org.springframework.data.repository.CrudRepository;

import com.resto.RestoMngSys.Entity.Customer;

public interface CustRegistrationDao extends CrudRepository<Customer, Long> {

}
