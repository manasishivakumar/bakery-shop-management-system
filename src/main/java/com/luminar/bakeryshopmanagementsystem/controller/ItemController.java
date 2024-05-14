package com.luminar.bakeryshopmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.servlet.ModelAndView;

import com.luminar.bakeryshopmanagementsystem.entity.Item;
import com.luminar.bakeryshopmanagementsystem.service.ItemService;

@Controller
public class ItemController {
	
	@Autowired
	ItemService itemService;
	
	@GetMapping("/view-item")
	public ModelAndView getAllItems() {
		ModelAndView mav = new ModelAndView("view_item");
		List<Item> itemList = itemService.getAll();
		mav.addObject("items", itemList);
		return mav;
	}
	
	@GetMapping("/add-item")
	public ModelAndView addItem() {		
		ModelAndView mav = new ModelAndView("add_item");
		mav.addObject("command", new Item());	
		return mav;
	}
	
	@PostMapping("/save-item")
	public String saveItem(@ModelAttribute Item item) {
		itemService.save(item);
		return "redirect:/add-item";
	}
	
	@GetMapping("/item-update/{id}")
	public ModelAndView updateItem(@PathVariable("id") Integer id) {
		ModelAndView mav = new ModelAndView("add_item");
		Item item = itemService.getById(id);
		mav.addObject("command", item);
		return mav;
	}
	
	@GetMapping("/item-delete/{id}")
	public String deleteItem(@PathVariable("id") Integer id) {
		Item item = itemService.getById(id);
		itemService.delete(item);
		return "redirect:/view-item";
	}
	
	
	
	
}
