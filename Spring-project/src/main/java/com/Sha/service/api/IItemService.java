package com.Sha.service.api;

import java.util.Date;
import java.util.List;

import com.Sha.model.Item;
import com.Sha.model.dto.ItemDto;


public interface IItemService {

	Item createItem(ItemDto itemDto);
	
	Item findbyId(Integer id);
	
	Item findbyName(String name);
	
	Item findbyDate(Date date);
	
	List<Item> findAll();
	
	Item update(Item user);
}
