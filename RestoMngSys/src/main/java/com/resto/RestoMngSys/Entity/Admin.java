package com.resto.RestoMngSys.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {
	@Id
	private String adusrname;
	private String adpassword;
	
	public Admin() {
		// TODO Auto-generated constructor stub
	}
	
	public Admin(String adusrname, String adpassword) {
		super();
		this.adusrname = adusrname;
		this.adpassword = adpassword;
	}

	public String getAdusrname() {
		return adusrname;
	}

	public void setAdusrname(String adusrname) {
		this.adusrname = adusrname;
	}

	public String getAdpassword() {
		return adpassword;
	}

	public void setAdpassword(String adpassword) {
		this.adpassword = adpassword;
	}

	@Override
	public String toString() {
		return "Admin [adusrname=" + adusrname + ", adpassword=" + adpassword + "]";
	}
	
	
}
