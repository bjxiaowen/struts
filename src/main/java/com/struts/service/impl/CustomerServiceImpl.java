package com.struts.service.impl;

import java.util.List;

import com.struts.dao.ICustomerDAO;
import com.struts.service.ICustomerService;
import com.test.pojo.Customer;

public class CustomerServiceImpl implements ICustomerService {
	
	ICustomerDAO customerDAO;


	public void setCustomerDAO(ICustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}

	public void addCustomer(Customer customer) {
		customerDAO.addCustomer(customer);
	}

	public List<Customer> listCustomer() throws Exception{
		try{
			customerDAO.listCustomer();
		}catch(Exception e){
			e.printStackTrace();
		}
		return customerDAO.listCustomer();
	}

}
