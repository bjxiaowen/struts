package com.struts.dao.impl;

import java.util.List;
import javax.annotation.Resource;  
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.struts.dao.ICustomerDAO;
import com.struts.pojo.Customer;
@Repository("customerDAO") 
public class CustomerDAOImpl extends HibernateDaoSupport implements ICustomerDAO{

	
	@Resource
	public void setSessionFactory0(SessionFactory sessionFactory){  
		super.setSessionFactory(sessionFactory);  
	}

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
