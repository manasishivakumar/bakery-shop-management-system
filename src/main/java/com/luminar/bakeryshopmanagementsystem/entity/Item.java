package com.luminar.bakeryshopmanagementsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer itemId;
	private String itemName;
	private Integer itemQuantity;
	private Integer itemPrice;
	
	public Item() {
		
	}
	
	public Item(Integer itemId, String itemName, Integer itemQuantity, Integer itemPrice) {		
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemQuantity = itemQuantity;
		this.itemPrice = itemPrice;
	}
	
	public Integer getItemId() {
		return itemId;
	}
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Integer getItemQuantity() {
		return itemQuantity;
	}
	public void setItemQuantity(Integer itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	public Integer getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(Integer itemPrice) {
		this.itemPrice = itemPrice;
	}
	

}
