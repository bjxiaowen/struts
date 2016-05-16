package com.struts.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.struts.dao.ICustomerDAO;
import com.struts.pojo.Customer;
import com.struts.service.ICustomerService;
@Service("customerService")
public class CustomerServiceImpl implements ICustomerService {
	
	@Resource(name="customerDAO")
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
