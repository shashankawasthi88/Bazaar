/**
 * This class represent the user facing represntation of the Customer object
 */
package com.bazaar.model;

import java.util.List;
import java.util.Map;

/**
 * @author shashankawasthi
 *
 */
public class Customer {

	/**
	 * Customer ID
	 */
	private Long id;

	/**
	 * Name of the Customer
	 */
	private String name;

	private String address;

	private String phoneNumber;

	private Map<String, String> addresses;

	// Bag object to have list of orders

	private List<Order> pastOrders;

	private List<Order> currentOrders;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the addresses
	 */
	public Map<String, String> getAddresses() {
		return addresses;
	}

	/**
	 * @param addresses the addresses to set
	 */
	public void setAddresses(Map<String, String> addresses) {
		this.addresses = addresses;
	}

	/**
	 * @return the pastOrders
	 */
	public List<Order> getPastOrders() {
		return pastOrders;
	}

	/**
	 * @param pastOrders the pastOrders to set
	 */
	public void setPastOrders(List<Order> pastOrders) {
		this.pastOrders = pastOrders;
	}

	/**
	 * @return the currentOrders
	 */
	public List<Order> getCurrentOrders() {
		return currentOrders;
	}

	/**
	 * @param currentOrders the currentOrders to set
	 */
	public void setCurrentOrders(List<Order> currentOrders) {
		this.currentOrders = currentOrders;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
