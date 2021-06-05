package com.bazaar.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.bazaar.model.Shop;

/**
 * @author shashankawasthi
 *
 */
@Entity
public class ItemEntity {

	/**
	 * Unique ID of the item
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	/**
	 * Name of the item
	 */
	private String name;

	/**
	 * Image URL of the Item
	 */
	private String imageURL;

	/**
	 * Unit price of the item
	 */
	private double unitPrice;

	/**
	 * Measurement unit. To be converted to ENUM in future
	 */
	private String measurementUnit;

	@ManyToOne
	@JoinColumn(name = "shop_id", nullable = false)
	private ShopEntity shop;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	/**
	 * @return the unitPrice
	 */
	public double getUnitPrice() {
		return unitPrice;
	}

	/**
	 * @param unitPrice the unitPrice to set
	 */
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	/**
	 * @return the measurementUnit
	 */
	public String getMeasurementUnit() {
		return measurementUnit;
	}

	/**
	 * @param measurementUnit the measurementUnit to set
	 */
	public void setMeasurementUnit(String measurementUnit) {
		this.measurementUnit = measurementUnit;
	}

	public ShopEntity getShop() {
		return shop;
	}

	public void setShop(ShopEntity shop) {
		this.shop = shop;
	}

	

}
