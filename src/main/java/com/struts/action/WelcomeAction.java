package com.struts.action;

import java.util.List;

import javax.annotation.Resource;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import com.opensymphony.xwork2.ActionSupport;
import com.struts.pojo.Customer;
import com.struts.service.ICustomerService;
@Namespace("/")
public class WelcomeAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2835260965991648082L;
	
	private String username;
	
	@Resource(name="customerService")
	ICustomerService customerService;
	

	public void setCustomerService(ICustomerService customerService) {
		this.customerService = customerService;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Action(value="welcome", results={@Result(name="success",location="welcome.jsp")})
	public String welcome() {
		try{
			List<Customer> list=customerService.listCustomer();
			for(Customer cust:list){
				System.out.println(cust.toString());
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("你好！！！");
		return "success";
	}
}
