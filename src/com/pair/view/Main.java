package com.pair.view;

import com.pair.application.FlowerShopController;
import com.pair.persistence.FlowerShopRepository;

public class Main {

	private FlowerShopRepository shopsList = new FlowerShopRepository(); // Field declaration of New EmployeeRepository Object
	private FlowerShopController controller = new FlowerShopController(shopsList);
	
	public static void Main (String[] args) {
	

	}
}
