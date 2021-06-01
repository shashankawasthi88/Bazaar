package com.bazaar.modal;

import java.util.Map;
/**
 * @author shashankawasthi
 *
 */
public class Order {
	
	private String customerId;
	
	private String shopId;
	
	private String deliveryAddress;
	
	private String id;
	
	Map<String,Float> itemQuantities;
	
	private Double totalPrice;
	
	private String orderTimestamp;
	
	private String status;

	/**
	 * @return the customerId
	 */
	public String getCustomerId() {
		return customerId;
	}

	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	/**
	 * @return the deliveryAddress
	 */
	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	/**
	 * @param deliveryAddress the deliveryAddress to set
	 */
	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the itemQuantities
	 */
	public Map<String, Float> getItemQuantities() {
		return itemQuantities;
	}

	/**
	 * @param itemQuantities the itemQuantities to set
	 */
	public void setItemQuantities(Map<String, Float> itemQuantities) {
		this.itemQuantities = itemQuantities;
	}

	/**
	 * @return the totalPrice
	 */
	public Double getTotalPrice() {
		return totalPrice;
	}

	/**
	 * @param totalPrice the totalPrice to set
	 */
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	/**
	 * @return the orderTimestamp
	 */
	public String getOrderTimestamp() {
		return orderTimestamp;
	}

	/**
	 * @param orderTimestamp the orderTimestamp to set
	 */
	public void setOrderTimestamp(String orderTimestamp) {
		this.orderTimestamp = orderTimestamp;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the shopId
	 */
	public String getShopId() {
		return shopId;
	}

	/**
	 * @param shopId the shopId to set
	 */
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}	
}
