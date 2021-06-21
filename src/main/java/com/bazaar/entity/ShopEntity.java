package com.bazaar.entity;

import java.net.URL;
import java.time.LocalTime;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class ShopEntity {
	
	/**
	 * Identifier
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	/**
	 * Name of the shop
	 */
	private String name;
	
	/**
	 * Items in the shop
	 */
	@OneToMany(mappedBy="shop")
	private Set<ItemEntity> items;
	
	/**
	 * Customers who have shopped from here
	 */
	@ManyToMany(mappedBy = "shopEntities")
	private Set<CustomerEntity> customerEntities;
	
	/**
	 * Orders of this shop
	 */
	@ManyToMany(mappedBy = "shopEntity")
	private Set<OrderEntity> orderEntities;
	
	
	/**
	 * Name of the shop owner
	 */
	private String ownerName;
	
	/**
	 * Phone number of the shop
	 */
	private Long phoneNumber;
	
	/**
	 * Address of the shop
	 */
	private String address;
	
	/**
	 * Category to which the shop belongs
	 */
	private ShopCategory category;
	
	/**
	 * The weburl of the shop
	 */
	private URL url;
	
	
	/**
	 * Open time of the shop
	 */
	private LocalTime openTime;
	
	

	/**
	 * Close time of the shop
	 */
	private LocalTime closeTime;
	
	
	/**
	 * Image of the shop
	 */
	private String imageURL;
	
	
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

	public Set<ItemEntity> getItems() {
		return items;
	}

	public void setItems(Set<ItemEntity> items) {
		this.items = items;
	}

	/**
	 * @return the customerEntities
	 */
	public Set<CustomerEntity> getCustomerEntities() {
		return customerEntities;
	}

	/**
	 * @param customerEntities the customerEntities to set
	 */
	public void setCustomerEntities(Set<CustomerEntity> customerEntities) {
		this.customerEntities = customerEntities;
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
	 * @return the ownerName
	 */
	public String getOwnerName() {
		return ownerName;
	}

	/**
	 * @param ownerName the ownerName to set
	 */
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	/**
	 * @return the phoneNumber
	 */
	public Long getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
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
	 * @return the category
	 */
	public ShopCategory getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(ShopCategory category) {
		this.category = category;
	}

	/**
	 * @return the url
	 */
	public URL getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(URL url) {
		this.url = url;
	}

	/**
	 * @return the openTime
	 */
	public LocalTime getOpenTime() {
		return openTime;
	}

	/**
	 * @param openTime the openTime to set
	 */
	public void setOpenTime(LocalTime openTime) {
		this.openTime = openTime;
	}

	/**
	 * @return the closeTime
	 */
	public LocalTime getCloseTime() {
		return closeTime;
	}

	/**
	 * @param closeTime the closeTime to set
	 */
	public void setCloseTime(LocalTime closeTime) {
		this.closeTime = closeTime;
	}

	/**
	 * @return the imageURL
	 */
	public String getImageURL() {
		return imageURL;
	}

	/**
	 * @param imageURL the imageURL to set
	 */
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
	
}
