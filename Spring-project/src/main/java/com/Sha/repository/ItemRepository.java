package com.Sha.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Sha.model.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {
	
	@Query("select u from Item u where u.name = ?1")
    Item findByName(String name);
	
	@Query("select u from Item u where u.date = ?1")
	Item findByDate(Date date);

}
