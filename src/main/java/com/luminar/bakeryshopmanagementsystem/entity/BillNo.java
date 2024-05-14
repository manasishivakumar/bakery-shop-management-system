package com.luminar.bakeryshopmanagementsystem.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BillNo {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private Long billNo;
	    private LocalDate date;
	    private double totalAmount;
		
	    public BillNo() {}
	    
	    public BillNo(Long id, Long billNo, LocalDate date, double totalAmount) {
			super();
			this.id = id;
			this.billNo = billNo;
			this.date=date;
			this.totalAmount = totalAmount;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getBillNo() {
			return billNo;
		}

		public void setBillNo(Long billNo) {
			this.billNo = billNo;
		}

		public LocalDate getDate() {
			return date;
		}

		public void setDate(LocalDate date) {
			this.date = date;
		}

		public double getTotalAmount() {
			return totalAmount;
		}

		public void setTotalAmount(double totalAmount) {
			this.totalAmount = totalAmount;
		}

}
