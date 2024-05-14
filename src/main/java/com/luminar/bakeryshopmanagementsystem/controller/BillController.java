package com.luminar.bakeryshopmanagementsystem.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.luminar.bakeryshopmanagementsystem.entity.Bill;
import com.luminar.bakeryshopmanagementsystem.entity.BillNo;
import com.luminar.bakeryshopmanagementsystem.entity.Item;
import com.luminar.bakeryshopmanagementsystem.service.BillNoService;
import com.luminar.bakeryshopmanagementsystem.service.BillService;
import com.luminar.bakeryshopmanagementsystem.service.ItemService;

@Controller
public class BillController {

    @Autowired
    private ItemService itemService;

    @Autowired
    private BillService billService;
    
    @Autowired
    private BillNoService billNoService;
    
    @GetMapping("/bill-item")
	public String bill(){
		return "bill_form";
		
	}
    
    @GetMapping("/bill-items")
	public String cashierBill(){
		return "cashier_billform";
		
	}

    @GetMapping("/generateBill")
    public String generateBill(@RequestParam("itemId") Integer[] itemIds,
                               @RequestParam("quantity") Integer[] quantities,
                               Model model) {
        List<Item> items = new ArrayList<>();
        List<Bill> bills = new ArrayList<>();
        double totalAmount = 0.0;
        
        BillNo lastBill = billNoService.getFirstByOrderByBillNoDesc();
        Long newBillNo = generateBillNumber(lastBill);
        
        BillNo billno = new BillNo();
        billno.setBillNo(newBillNo);
        billno.setDate(LocalDate.now());

        for (int i = 0; i < itemIds.length; i++) {
            Integer itemId = itemIds[i];
            int quantity = quantities[i];
            Item item = itemService.getItemById(itemId);

            if (item != null) {
                items.add(item);
                totalAmount += item.getItemPrice() * quantity;

               
                Bill bill = new Bill();
                bill.setDate(LocalDate.now());
                bill.setBillNo(newBillNo);
                bill.setItemName(item.getItemName());
                bill.setItemPrice(item.getItemPrice());
                bill.setQuantity(quantity);
                bill.setTotalPrice(item.getItemPrice() * quantity);
                billService.saveBill(bill);
                bills.add(bill);
                model.addAttribute("bills", bills);
            }
        }
        billno.setTotalAmount(totalAmount);
        billNoService.saveBillNo(billno);
        
        model.addAttribute("billNo", newBillNo);
        model.addAttribute("items", items);
        model.addAttribute("totalAmount", totalAmount);
       

        return "bill";
    }
    
    
   
    @GetMapping("/soled-items")
    public ModelAndView  getUniqueDates() {
    	ModelAndView mav = new ModelAndView("sales_report");
        List<LocalDate> uniqueDates = billService.getUniqueDatesFromBills();
        mav.addObject("bill", uniqueDates);
		return mav;
    }
    
    @GetMapping("/view-sales/{date}")
	public ModelAndView viewSales(@PathVariable("date") LocalDate date) {
		ModelAndView mav = new ModelAndView("view_sales");
		List<BillNo> billList = billNoService.getByDate(date);
		mav.addObject("items", billList);
		return mav;
	}
    
    private Long generateBillNumber(BillNo lastBill) {
        if (lastBill != null) {
            return  lastBill.getBillNo() + 1;
        } else {
            
            return 62001L;
        }
    }
    
    @GetMapping("/bill-details/{billNo}")
	public ModelAndView getItems(@PathVariable("billNo") Long billNo) {
		ModelAndView mav = new ModelAndView("bill_details");
		List<Bill> itemList = billService.getByBillNo(billNo);
		mav.addObject("items", itemList);
		return mav;
	}
}
