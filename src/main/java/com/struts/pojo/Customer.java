package com.struts.pojo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer implements Serializable {

	public Customer() {

	}

	public Customer(Long customerId, String name, String address, Date createdDate) {
		this.customerId = customerId;
		this.name = name;
		this.address = address;
		this.createdDate = createdDate;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -5802019527611714786L;

	// @GeneratedValue(strategy = GenerationType.AUTO)
	// @Column(name = "customer_id")
	@Id
	@Column(name = "customer_id")
	private Long customerId;

	@Column(name = "name")
	private String name;

	@Column(name = "address")
	private String address;

	@Column(name = "create_date")
	private Date createdDate;

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", address=" + address + ", createdDate="
				+ createdDate + "]";
	}
}
