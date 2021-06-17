package com.bazaar.model;

import java.util.Currency;
import java.util.Map;

/**
 * @author shashankawasthi
 *
 *Model class that represents the order
 */
public class Order {

	/**
	 * The order identifier 
	 */
	private Long id;
	
	/**
	 * The ID of the customer
	 */
	private String customerId;

	/**
	 * The ID of the shop on which the order is placed
	 */
	private String shopId;

	/**
	 * Address for the order delivery
	 */
	private String deliveryAddress;

	/**
	 * Items of the order
	 */
	private Map<String, Float> itemQuantities;

	/**
	 * Total price for the order
	 */
	private Double totalPrice;
	
	/**
	 * Currency of the order
	 */
	private Currency currency;

	/**
	 * The status of the order
	 */
	private OrderStatus status;
	
	/**
	 * Number of days for which the return is allowed
	 */
	private int returnWindow;
	
	/**
	 * Flag to denote if delivery is available on this order or not
	 */
	private boolean isDeliverable;
	
	
	/**
	 * Discount percent offered on the order
	 */
	private int discountPercentage;
	
	
	/**
	 * Loyalty points earned on an order
	 */
	private int loyaltyEarned;
	
	/**
	 * Loyalty points consumed on an order
	 */
	private int loyaltyConsumed;
	
	/**
	 * Timestamps corresponding to each state of the order
	 */
	private Map<OrderStatus,Long> orderTimestamps;
	
	/**
	 * The invoice ID
	 */
	private long invoiceId;
	
	
	
	/**
	 * The cart ID from which the order is placed
	 */
	private Long cartId;   // Do we really need this, does the concept of cart not gets over when you create an Order

	
	/**
	 * The item qauntity map modified and suggested by the shopkeeper
	 */
	private Map<Item,Double> itemModifiedQuantityMap;


	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}



	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}



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
	 * @return the status
	 */
	public OrderStatus getStatus() {
		return status;
	}



	/**
	 * @param status the status to set
	 */
	public void setStatus(OrderStatus status) {
		this.status = status;
	}



	/**
	 * @return the returnWindow
	 */
	public int getReturnWindow() {
		return returnWindow;
	}



	/**
	 * @param returnWindow the returnWindow to set
	 */
	public void setReturnWindow(int returnWindow) {
		this.returnWindow = returnWindow;
	}



	/**
	 * @return the isDeliverable
	 */
	public boolean isDeliverable() {
		return isDeliverable;
	}



	/**
	 * @param isDeliverable the isDeliverable to set
	 */
	public void setDeliverable(boolean isDeliverable) {
		this.isDeliverable = isDeliverable;
	}



	/**
	 * @return the discountPercentage
	 */
	public int getDiscountPercentage() {
		return discountPercentage;
	}



	/**
	 * @param discountPercentage the discountPercentage to set
	 */
	public void setDiscountPercentage(int discountPercentage) {
		this.discountPercentage = discountPercentage;
	}



	/**
	 * @return the loyaltyEarned
	 */
	public int getLoyaltyEarned() {
		return loyaltyEarned;
	}



	/**
	 * @param loyaltyEarned the loyaltyEarned to set
	 */
	public void setLoyaltyEarned(int loyaltyEarned) {
		this.loyaltyEarned = loyaltyEarned;
	}



	/**
	 * @return the loyaltyConsumed
	 */
	public int getLoyaltyConsumed() {
		return loyaltyConsumed;
	}



	/**
	 * @param loyaltyConsumed the loyaltyConsumed to set
	 */
	public void setLoyaltyConsumed(int loyaltyConsumed) {
		this.loyaltyConsumed = loyaltyConsumed;
	}



	/**
	 * @return the orderTimestamps
	 */
	public Map<OrderStatus, Long> getOrderTimestamps() {
		return orderTimestamps;
	}



	/**
	 * @param orderTimestamps the orderTimestamps to set
	 */
	public void setOrderTimestamps(Map<OrderStatus, Long> orderTimestamps) {
		this.orderTimestamps = orderTimestamps;
	}



	/**
	 * @return the invoiceId
	 */
	public long getInvoiceId() {
		return invoiceId;
	}



	/**
	 * @param invoiceId the invoiceId to set
	 */
	public void setInvoiceId(long invoiceId) {
		this.invoiceId = invoiceId;
	}



	/**
	 * @return the cartId
	 */
	public Long getCartId() {
		return cartId;
	}



	/**
	 * @param cartId the cartId to set
	 */
	public void setCartId(Long cartId) {
		this.cartId = cartId;
	}



	/**
	 * @return the itemModifiedQuantityMap
	 */
	public Map<Item, Double> getItemModifiedQuantityMap() {
		return itemModifiedQuantityMap;
	}



	/**
	 * @param itemModifiedQuantityMap the itemModifiedQuantityMap to set
	 */
	public void setItemModifiedQuantityMap(Map<Item, Double> itemModifiedQuantityMap) {
		this.itemModifiedQuantityMap = itemModifiedQuantityMap;
	}
	
	
	
}
