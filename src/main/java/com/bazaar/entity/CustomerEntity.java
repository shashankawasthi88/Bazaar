package com.bazaar.entity;

import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;


@Entity
public class CustomerEntity {

	/**
	 * Customer ID
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	/**
	 * Name of the Customer
	 */

	private String name;

	/**
	 * List of addresses
	 */
	@ElementCollection(targetClass=String.class)
	private Set<String> address;

	/**
	 * Phone number of the customer
	 */
	private String phoneNumber;

	/**
	 * List of completed order
	 */
	@OneToMany(mappedBy="customerEntity")
	private Set<OrderEntity> orderEntities;

	/**
	 * List of shops the user has ordered from
	 */
	@ManyToMany
	@JoinTable(
			  name = "customer_shop", 
			  joinColumns = @JoinColumn(name = "customer_id"), 
			  inverseJoinColumns = @JoinColumn(name = "shop_id"))
	private Set<ShopEntity> shopEntities;

	// private Long loayaltyId;

	// Payment Method

	@OneToMany(mappedBy="customerEntity")
	private Set<CartEntity> cartEntities;
	
	@OneToMany(mappedBy="customerEntity")
	private Set<OrderEntity> orderEntity;

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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the address
	 */
	public Set<String> getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Set<String> address) {
		this.address = address;
	}

	/**
	 * @return the orderEntities
	 */
	public Set<OrderEntity> getOrderEntities() {
		return orderEntities;
	}

	/**
	 * @param orderEntities the orderEntities to set
	 */
	public void setOrderEntities(Set<OrderEntity> orderEntities) {
		this.orderEntities = orderEntities;
	}

	/**
	 * @return the cartEntities
	 */
	public Set<CartEntity> getCartEntities() {
		return cartEntities;
	}

	/**
	 * @param cartEntities the cartEntities to set
	 */
	public void setCartEntities(Set<CartEntity> cartEntities) {
		this.cartEntities = cartEntities;
	}

	/**
	 * @return the shopEntities
	 */
	public Set<ShopEntity> getShopEntities() {
		return shopEntities;
	}

	/**
	 * @param shopEntities the shopEntities to set
	 */
	public void setShopEntities(Set<ShopEntity> shopEntities) {
		this.shopEntities = shopEntities;
	}

	/**
	 * @return the orderEntity
	 */
	public Set<OrderEntity> getOrderEntity() {
		return orderEntity;
	}

	/**
	 * @param orderEntity the orderEntity to set
	 */
	public void setOrderEntity(Set<OrderEntity> orderEntity) {
		this.orderEntity = orderEntity;
	}

	
	
}
