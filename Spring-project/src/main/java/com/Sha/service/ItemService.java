package com.Sha.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.Sha.model.Item;
import com.Sha.model.dto.ItemDto;
import com.Sha.repository.ItemRepository;
import com.Sha.service.api.IItemService;

public class ItemService implements IItemService {
	
	@Autowired
	private ItemRepository itemRepository;

	@Override
	public Item createItem(ItemDto itemDto) {
		Item item = new Item();
		item.setName(itemDto.getName());
		item.setDate(new Date());
		item.setUser(itemDto.getUser());
		
		itemRepository.save(item);
		return item;
	}
	
	@Override
	public Item findbyId(Integer id) {
		return itemRepository.findById(id).get();
	}

	@Override
	public Item findbyName(String name) {
		return itemRepository.findByName(name);
	}

	@Override
	public List<Item> findAll() {
		return itemRepository.findAll();
	}

	@Override
	public Item update(Item user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Item findbyDate(Date date) {
		return itemRepository.findByDate(date);
	}

}
