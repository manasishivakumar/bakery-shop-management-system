package com.luminar.bakeryshopmanagementsystem.service;

import java.time.LocalDate;
import java.util.List;

import com.luminar.bakeryshopmanagementsystem.entity.Bill;

public interface BillService {
    void saveBill(Bill bill);
    
    List<Bill> getAll();
    
    List<LocalDate> getUniqueDatesFromBills();
    
    List<Bill> getByDate(LocalDate date);
    
    List<Bill> getByBillNo(Long billNo);
}

