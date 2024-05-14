package com.luminar.bakeryshopmanagementsystem.service;

import java.time.LocalDate;
import java.util.List;


import com.luminar.bakeryshopmanagementsystem.entity.BillNo;

public interface BillNoService {
	BillNo getFirstByOrderByBillNoDesc();

	void saveBillNo(BillNo billno);
	
	List<BillNo> getByDate(LocalDate date);
}
