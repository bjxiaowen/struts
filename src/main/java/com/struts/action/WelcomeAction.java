package com.struts.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import com.opensymphony.xwork2.ActionSupport;
@ParentPackage("struts-default")
public class WelcomeAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2835260965991648082L;
	
	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Action(value="/welcome", results={@Result(name="success",location="welcome_user.jsp")})
	public String welcome() {
		System.out.println("你好！！！");
		return "success";
	}
}
