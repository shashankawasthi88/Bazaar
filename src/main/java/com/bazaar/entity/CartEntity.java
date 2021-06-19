package com.bazaar.entity;

import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.MapKey;
import javax.persistence.MapKeyColumn;
import javax.persistence.OneToMany;

@Entity
public class CartEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;

	@ManyToOne
	@JoinColumn(name = "customer_id", nullable = false)
	private CustomerEntity customerEntity;

	/**
	 * Corresponding shop ID for which the cart is meant for
	 */
	private Long shopEntityId;

	/**
	 * Quantities of item ordered
	 */
	@ElementCollection
    @CollectionTable(name = "cart_item_mapping", 
      joinColumns = {@JoinColumn(name = "cart_id", referencedColumnName = "id")})
    @MapKeyColumn(name = "item_id")
    @Column(name = "quantity")
	private Map<Long, Double> itemQuantities;

	/**
	 * Quantities of item modified by the shopkeeper
	 */
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinTable(name = "modified_cart_item_mapping", joinColumns = {
//			@JoinColumn(name = "cart_id", referencedColumnName = "id") }, inverseJoinColumns = {
//					@JoinColumn(name = "item_id", referencedColumnName = "id") })
//	private Map<ItemEntity, Double> modifiedItemQuantities;

	/**
	 * Total price of the order
	 */
	private double totalPrice;

	
	/**
	 * Total savings on the order
	 */
	private double toalSavings;

	/**
	 * Status of the cart
	 */
	@Enumerated(EnumType.ORDINAL)
	private CartEntityStatus cartEntityStatus;

	/**
	 * @return the id
	 */
	public Long getId() {
		return Id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		Id = id;
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
	 * @return the shopEntityId
	 */
	public Long getShopEntityId() {
		return shopEntityId;
	}

	/**
	 * @param shopEntityId the shopEntityId to set
	 */
	public void setShopEntityId(Long shopEntityId) {
		this.shopEntityId = shopEntityId;
	}

	/**
	 * @return the itemQuantities
	 */
	public Map<Long, Double> getItemQuantities() {
		return itemQuantities;
	}

	/**
	 * @param itemQuantities the itemQuantities to set
	 */
	public void setItemQuantities(Map<Long, Double> itemQuantities) {
		this.itemQuantities = itemQuantities;
	}

	/**
	 * @return the modifiedItemQuantities
	 */
//	public Map<ItemEntity, Double> getModifiedItemQuantities() {
//		return modifiedItemQuantities;
//	}
//
//	/**
//	 * @param modifiedItemQuantities the modifiedItemQuantities to set
//	 */
//	public void setModifiedItemQuantities(Map<ItemEntity, Double> modifiedItemQuantities) {
//		this.modifiedItemQuantities = modifiedItemQuantities;
//	}

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
	 * @return the toalSavings
	 */
	public double getToalSavings() {
		return toalSavings;
	}

	/**
	 * @param toalSavings the toalSavings to set
	 */
	public void setToalSavings(double toalSavings) {
		this.toalSavings = toalSavings;
	}

	/**
	 * @return the cartEntityStatus
	 */
	public CartEntityStatus getCartEntityStatus() {
		return cartEntityStatus;
	}

	/**
	 * @param cartEntityStatus the cartEntityStatus to set
	 */
	public void setCartEntityStatus(CartEntityStatus cartEntityStatus) {
		this.cartEntityStatus = cartEntityStatus;
	}

}