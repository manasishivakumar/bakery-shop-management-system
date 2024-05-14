package com.luminar.bakeryshopmanagementsystem.entity;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bill {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	private LocalDate date;
	private Long billNo;
    private String itemName;
    private Integer itemPrice;
    private int quantity;
    private double totalPrice;

    public Bill() {}
	
    public Bill(Integer id,LocalDate date,Long billNo, String itemName,Integer itemPrice, int quantity, double totalPrice) {
		super();
		this.id = id;
		this.date=date;
		this.billNo=billNo;
		this.itemName = itemName;
		this.itemPrice=itemPrice;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Long getBillNo() {
		return billNo;
	}

	public void setBillNo(Long billNo) {
		this.billNo = billNo;
	}

	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Integer getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(Integer itemPrice) {
		this.itemPrice = itemPrice;
	}

	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

    
}
    
   