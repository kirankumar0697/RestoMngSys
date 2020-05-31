package com.resto.RestoMngSys.Service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resto.RestoMngSys.Dao.AdminLoginDao;
import com.resto.RestoMngSys.Entity.Admin;

@Service
public class AdminLoginService {
	
	@Autowired
	AdminLoginDao addao;
	
	Admin admin;
	
	public Admin isValid(Admin admin) throws SQLException {
		admin = addao.isValid(admin);
		return admin;
	}

}
