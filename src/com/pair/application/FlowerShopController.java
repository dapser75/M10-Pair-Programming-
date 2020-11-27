package com.pair.application;

import com.pair.persistence.FlowerShopRepository;

public class FlowerShopController {

	public FlowerShopRepository repository; 	
	
	public FlowerShopController(FlowerShopRepository repository){  // constructor
		
		this.repository = repository;
		
	}	
}
