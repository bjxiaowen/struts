package com.struts.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.struts.dao.ICustomerDAO;
import com.struts.pojo.Customer;

public class CustomerDAOImpl extends HibernateDaoSupport implements ICustomerDAO{

	public void addCustomer(Customer customer) {
		getHibernateTemplate().save(customer);
	}

	public List<Customer> listCustomer() {
		try{
		List<Customer> list=  (List<Customer>) getHibernateTemplate().find("from Customer");
		return list;
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

}
