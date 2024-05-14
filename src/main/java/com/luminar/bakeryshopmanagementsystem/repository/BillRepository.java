package com.luminar.bakeryshopmanagementsystem.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.luminar.bakeryshopmanagementsystem.entity.Bill;

public interface BillRepository extends JpaRepository<Bill, Long> {
	@Query("SELECT DISTINCT b.date FROM Bill b")
	List<LocalDate> findDistinctDate();
	 
	List<Bill> findByDate(LocalDate date);
	
	List<Bill> findByBillNo(Long billNo);
}
