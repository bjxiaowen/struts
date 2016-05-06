package com.test.pojo;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.struts.utils.IDGenerate;

public class MyTest {
	
	private ApplicationContext ac;
	
	private SessionFactory sessionFactory;
	
	private Session session;
	
	private Transaction transaction;
	
	@BeforeClass//在测试类初始化时调用此方法，完成静态对象的初始化
	public static void before(){
		
	}
	@Before//每一个被注解Test方法在调用前都会调用此方法一次
	public void setup(){//建立针对我们当前测试方法的的会话和事务
		ac = new ClassPathXmlApplicationContext("springDataSource.xml");
		sessionFactory = (SessionFactory) ac.getBean("sessionFactory");
		session = sessionFactory.openSession();
		transaction = session.beginTransaction();
	}
	
	@Test
	public void test1(){
		//set测试
		Customer product = new Customer(IDGenerate.getId(),"Andy","国美在线",new Date());
		try{
			session.save(product);
		}catch(Exception e){
			e.printStackTrace();
		}
	
		//list测试
//		Doctor doctor = new Doctor();
//		doctor.setName("doctor");
//		List<String> patients = new ArrayList<String>();
//		for(int i = 0 ; i < 5; i ++){
//			patients.add("patient" + i);
//		}
//		doctor.setPatientName(patients);
//		session.save(doctor);
		
//		Doctor doctor = session.get(Doctor.class, 1);
//		System.out.println(doctor);
//		for(String string : doctor.getPatientName()){
//			System.out.println(string);
//		}
		//Map测试
//		Product product = new Product();
//		product.setName("prodcut_with_many_prize");
//		HashMap prizes= new HashMap();
//		for(int i = 0 ; i < 5 ; i ++){
//			prizes.put("specs"+i,1.2* i);
//		}
//		product.setPrize(prizes);
//		session.save(product);
		
		/*Customer customer = session.get(Customer.class, 1);
		System.out.println(customer.toString());*/

	}
	
	
	@After//每一个被注解Test方法在调用后都会调用此方法一次
	public void teardown(){
		transaction.commit();
		session.clear();
		session.close();
		sessionFactory.close();
	}
	@After//在类销毁时调用一次
	public void after(){
		
	}

}
