package com.resto.RestoMngSys.Controller;

import java.awt.PageAttributes.MediaType;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.resto.RestoMngSys.Entity.Admin;
import com.resto.RestoMngSys.Service.AdminLoginService;

@CrossOrigin
@RestController
public class AdminController {
	
	@Autowired
	AdminLoginService adservice;

	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String getMessage() {
		return "Hello Dear";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public ModelAndView getLogin() {
		System.out.println("get login");
		ModelAndView model = new ModelAndView();
		model.setViewName("login");
		
		return model;
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public ModelAndView validateLogin(Admin admin) throws SQLException{
		ModelAndView model = new ModelAndView();
		System.out.println("post login  " + admin);
		System.out.println("details: " + admin.getAdusrname() + " " + admin.getAdpassword());
		Admin adm = adservice.isValid(admin);
		
		if(adm == null) {
			System.out.println("loginpage");
			model.setViewName("login");

		} else {
			System.out.println("home page");
			model.setViewName("home");
		}
		
		return model;
	}
	
}
