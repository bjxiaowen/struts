package com.struts.action;

/*import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;*/
import com.opensymphony.xwork2.ActionSupport;
import com.struts.service.ICustomerService;
//@Namespace("/")
public class WelcomeAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2835260965991648082L;
	
	private String username;
	
	ICustomerService customerService;
	

	public void setCustomerService(ICustomerService customerService) {
//		 org.hibernate.cache.CacheProvider aa=new  org.hibernate.cache.CacheProvider();
		this.customerService = customerService;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	//@Action(value="welcome", results={@Result(name="success",location="welcome.jsp")})
	public String welcome() {
		try{
			customerService.listCustomer();
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("你好！！！");
		return "success";
	}
}
