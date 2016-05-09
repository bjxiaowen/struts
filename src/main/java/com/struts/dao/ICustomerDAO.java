package com.struts.dao;

import java.util.List;

import com.struts.pojo.Customer;


public interface ICustomerDAO {

	void addCustomer(Customer customer);

	List<Customer> listCustomer()throws Exception;

}
