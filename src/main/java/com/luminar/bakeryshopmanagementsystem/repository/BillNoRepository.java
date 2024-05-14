package com.luminar.bakeryshopmanagementsystem.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.luminar.bakeryshopmanagementsystem.entity.BillNo;

public interface BillNoRepository extends JpaRepository<BillNo, Long> {
    BillNo findFirstByOrderByBillNoDesc();

    List<BillNo> findByDate(LocalDate date);

}
