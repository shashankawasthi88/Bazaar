package com.bazaar.entity;

import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class OrderEntity {
	
	
	/**
	 * Identifier
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	/**
	 * Customer
	 */
	@ManyToOne
	@JoinColumn(name = "customer_id", nullable = false)
	private CustomerEntity customerEntity;
	
	@ManyToOne
	@JoinColumn(name = "shop_id", nullable = false)
	private ShopEntity shopEntity;
	
	/**
	 * Status of the order
	 */
	private OrderStatus orderStatus;
	
	/**
	 * Days in which the order can be returned
	 */
	private int returnWindow;
	
	/**
	 * Days in which the order can be cancelled
	 */
	private int cancellationWindow;
	
	
	/**
	 * If delivery is available or not
	 */
	private boolean deliveryFlag;
	
	/**
	 * Discount percentage
	 */
	private int discountPercent;
	
	/**
	 * Loyalty points earned
	 */
	private int loyaltyEarned;
	
	/**
	 * Loyalty points consumed
	 */
	private int loyaltyConsumed;
	
	/**
	 * Timestamps corresponding to each state of the order
	 */
	private Map<OrderStatus,Long> orderTimestamps;
	
	/**
	 * Invoice ID
	 */
	private String invoiceId;
	
	
	/**
	 * Order delivery address
	 */
	private String deliveryAddress;
	
	

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
	 * @return the customerEntity
	 */
	public CustomerEntity getCustomerEntity() {
		return customerEntity;
	}

	/**
	 * @param customerEntity the customerEntity to set
	 */
	public void setCustomerEntity(CustomerEntity customerEntity) {
		this.customerEntity = customerEntity;
	}

	/**
	 * @return the shopEntity
	 */
	public ShopEntity getShopEntity() {
		return shopEntity;
	}

	/**
	 * @param shopEntity the shopEntity to set
	 */
	public void setShopEntity(ShopEntity shopEntity) {
		this.shopEntity = shopEntity;
	}

	/**
	 * @return the orderStatus
	 */
	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	/**
	 * @param orderStatus the orderStatus to set
	 */
	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
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
	 * @return the cancellationWindow
	 */
	public int getCancellationWindow() {
		return cancellationWindow;
	}

	/**
	 * @param cancellationWindow the cancellationWindow to set
	 */
	public void setCancellationWindow(int cancellationWindow) {
		this.cancellationWindow = cancellationWindow;
	}

	/**
	 * @return the deliveryFlag
	 */
	public boolean isDeliveryFlag() {
		return deliveryFlag;
	}

	/**
	 * @param deliveryFlag the deliveryFlag to set
	 */
	public void setDeliveryFlag(boolean deliveryFlag) {
		this.deliveryFlag = deliveryFlag;
	}

	/**
	 * @return the discountPercent
	 */
	public int getDiscountPercent() {
		return discountPercent;
	}

	/**
	 * @param discountPercent the discountPercent to set
	 */
	public void setDiscountPercent(int discountPercent) {
		this.discountPercent = discountPercent;
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
	public String getInvoiceId() {
		return invoiceId;
	}

	/**
	 * @param invoiceId the invoiceId to set
	 */
	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
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
}
