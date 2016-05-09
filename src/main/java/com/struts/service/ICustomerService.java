package com.struts.service;

import java.util.List;

import com.struts.pojo.Customer;


public interface ICustomerService {

	void addCustomer(Customer customer);

	List<Customer> listCustomer()throws Exception;
}
