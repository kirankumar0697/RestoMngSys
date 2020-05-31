package com.resto.RestoMngSys.Dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.resto.RestoMngSys.Entity.Admin;

@Repository
public class AdminLoginDao {
	
	@Autowired
	JdbcTemplate jdbctemp;

	Admin adm;
	
	List<Admin> list;
	
	public Admin isValid(Admin admin) throws SQLException {
		
		System.out.println(admin);
		try{
			
				return jdbctemp.queryForObject("select adusrname, adpassword from admintbl where adusrname=? and adpassword=?",
						new Object[]{admin.getAdusrname(), admin.getAdpassword()}, 
						new BeanPropertyRowMapper<Admin>(Admin.class));
			
			
		}catch(Exception e){
			return null;
		}
	}
}
