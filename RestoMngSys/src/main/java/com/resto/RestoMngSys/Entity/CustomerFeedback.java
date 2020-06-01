package com.resto.RestoMngSys.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="custfeedbacktbl")
public class CustomerFeedback {
	
	@Id
	private String custmail;
	
	private String message;
	
	public String getCustmail() {
		return custmail;
	}
	public void setCustmail(String custmail) {
		this.custmail = custmail;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "CustomerFeedback [custmail=" + custmail + ", message=" + message + "]";
	}
	
}
