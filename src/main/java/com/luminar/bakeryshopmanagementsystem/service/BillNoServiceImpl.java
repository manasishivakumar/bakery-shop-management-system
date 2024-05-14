package com.luminar.bakeryshopmanagementsystem.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luminar.bakeryshopmanagementsystem.entity.Bill;
import com.luminar.bakeryshopmanagementsystem.entity.BillNo;
import com.luminar.bakeryshopmanagementsystem.repository.BillNoRepository;

@Service
public class BillNoServiceImpl implements BillNoService{
	
	 @Autowired
	 private BillNoRepository billNoRepository;
	
	public BillNo getFirstByOrderByBillNoDesc() {
        return billNoRepository.findFirstByOrderByBillNoDesc();
    }
	
	@Override
    public void saveBillNo(BillNo billno) {
        billNoRepository.save(billno);
    }
	
	 @Override
		public List<BillNo> getByDate(LocalDate date) {
			return billNoRepository.findByDate(date);

		}

}
