package com.luminar.bakeryshopmanagementsystem.service;

import java.util.List;

import com.luminar.bakeryshopmanagementsystem.entity.Item;


public interface ItemService {
	
	List<Item> getAll();
	
	Item save(Item item);
	
	Item getById(Integer id);
	
	void delete(Item item);
	
	 Item getItemById(Integer id);
	
}
