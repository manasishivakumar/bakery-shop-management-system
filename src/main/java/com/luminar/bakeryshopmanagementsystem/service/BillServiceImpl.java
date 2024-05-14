package com.luminar.bakeryshopmanagementsystem.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luminar.bakeryshopmanagementsystem.entity.Bill;
import com.luminar.bakeryshopmanagementsystem.repository.BillRepository;

@Service
public class BillServiceImpl implements BillService {
    @Autowired
    private BillRepository billRepository;

    @Override
    public void saveBill(Bill bill) {
        billRepository.save(bill);
    }
    
    @Override
	public List<Bill> getAll() {
		return billRepository.findAll();
	}
    
    @Override
	public List<Bill> getByDate(LocalDate date) {
		return billRepository.findByDate(date);

	}
    
    public List<LocalDate> getUniqueDatesFromBills() {
        return billRepository.findDistinctDate();
    }
    
    @Override
   	public List<Bill> getByBillNo(Long billNo) {
   		return billRepository.findByBillNo(billNo);

   	}
}

