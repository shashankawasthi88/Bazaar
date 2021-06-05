package com.bazaar.model;

import java.util.List;

/**
 * @author shashankawasthi
 *
 */
public class Shop {

	private Long id;

	private String name;

	private String address;

	private String phoneNumber;

	private List<Item> itemList;

	private List<Order> activeOrder;

	private List<Order> pastOrders;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the itemList
	 */
	public List<Item> getItemList() {
		return itemList;
	}

	/**
	 * @param itemList the itemList to set
	 */
	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}

	/**
	 * @return the activeOrder
	 */
	public List<Order> getActiveOrder() {
		return activeOrder;
	}

	/**
	 * @param activeOrder the activeOrder to set
	 */
	public void setActiveOrder(List<Order> activeOrder) {
		this.activeOrder = activeOrder;
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

}
