package com.bazaar.model;

import java.util.Currency;
import java.util.Map;

import com.bazaar.common.constants.CartStatus;

/**
 * 
 * @author shashankawasthi
 * Cart
 */
public class Cart {
	
	/**
	 * The ID of the cart
	 */
	private long Id;
	
	/**
	 * The id of the customer who is ordering
	 */
	private long customerId;
	
	/**
	 * The id of the shop on which the customer is placing the order
	 */
	private long shopId;
	
	/**
	 * The item quantity map initially placed by the customer
	 */
	private Map<Long,Double> itemQuantityMap;
	
	/**
	 * The item qauntity map modified and suggested by the shopkeeper
	 */
	//private Map<Item,Double> itemModifiedQuantityMap;   // I think this belongs to order as the manipulation happens at the order level
	
	/**
	 * Total price of the cart
	 */
	private double totalPrice;
	
	/**
	 * Currency in which the order is placed
	 */
	private Currency currency;
	
	/**
	 * Total saving gained in a cart
	 */
	private double totalSavings;
	
	
	/**
	 * Status of the cart
	 */
	private CartStatus cartStatus;

	/**
	 * @return the id
	 */
	public long getId() {
		return Id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		Id = id;
	}

	/**
	 * @return the customerId
	 */
	public long getCustomerId() {
		return customerId;
	}

	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	/**
	 * @return the shopId
	 */
	public long getShopId() {
		return shopId;
	}

	/**
	 * @param shopId the shopId to set
	 */
	public void setShopId(long shopId) {
		this.shopId = shopId;
	}

	/**
	 * @return the itemQuantityMap
	 */
	public Map<Long, Double> getItemQuantityMap() {
		return itemQuantityMap;
	}

	/**
	 * @param itemQuantityMap the itemQuantityMap to set
	 */
	public void setItemQuantityMap(Map<Long, Double> itemQuantityMap) {
		this.itemQuantityMap = itemQuantityMap;
	}

	/**
	 * @return the totalPrice
	 */
	public double getTotalPrice() {
		return totalPrice;
	}

	/**
	 * @param totalPrice the totalPrice to set
	 */
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	/**
	 * @return the currency
	 */
	public Currency getCurrency() {
		return currency;
	}

	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	/**
	 * @return the totalSavings
	 */
	public double getTotalSavings() {
		return totalSavings;
	}

	/**
	 * @param totalSavings the totalSavings to set
	 */
	public void setTotalSavings(double totalSavings) {
		this.totalSavings = totalSavings;
	}	
	

	/**
	 * @return the cartStatus
	 */
	public CartStatus getCartStatus() {
		return cartStatus;
	}

	/**
	 * @param cartStatus the cartStatus to set
	 */
	public void setCartStatus(CartStatus cartStatus) {
		this.cartStatus = cartStatus;
	}

	@Override
	public String toString() {
		return "Cart [Id=" + Id + ", customerId=" + customerId + ", shopId=" + shopId + ", itemQuantityMap="
				+ itemQuantityMap + ", totalPrice=" + totalPrice + ", currency=" + currency + ", totalSavings="
				+ totalSavings + "]";
	}

	
	
}
