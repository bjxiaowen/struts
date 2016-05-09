package com.struts.service.impl;

import java.util.List;

import com.struts.dao.ICustomerDAO;
import com.struts.pojo.Customer;
import com.struts.service.ICustomerService;

public class CustomerServiceImpl implements ICustomerService {
	
	ICustomerDAO customerDAO;


	public void setCustomerDAO(ICustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}

	public void addCustomer(Customer customer) {
		customerDAO.addCustomer(customer);
	}

	public List<Customer> listCustomer() throws Exception{
		return customerDAO.listCustomer();
	}

}
