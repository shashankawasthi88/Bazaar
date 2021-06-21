package com.bazaar.model;

/**
 * @author shashankawasthi
 *
 */
public class Item {

	/**
	 * Unique ID of the item
	 */
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
	
	private double quantity;

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

	/**
	 * @return the quantity
	 */
	public double getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	
	
	
}
