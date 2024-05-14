package com.luminar.bakeryshopmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luminar.bakeryshopmanagementsystem.entity.Item;
import com.luminar.bakeryshopmanagementsystem.repository.ItemRepository;



@Service
public class ItemServiceImpl implements ItemService{
	@Autowired
	ItemRepository itemRepository;
	

	@Override
	public List<Item> getAll() {
		return itemRepository.findAll();
	}
	
	@Override
	public Item save(Item item) {
		return itemRepository.save(item);
		
	}
	
	@Override
	public Item getById(Integer id) {
		return itemRepository.findById(id).get();

	}
	
	@Override
	public void delete(Item item) {
		itemRepository.delete(item);
	}
	
	@Override
    public Item getItemById(Integer id) {
        return itemRepository.findById(id).orElse(null);
    }
	

}
