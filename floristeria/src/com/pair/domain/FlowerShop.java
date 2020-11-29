package com.pair.domain;

import java.util.ArrayList;

public class FlowerShop {

		private String name;	
		private ArrayList<FlowerShopObject> flowershopobject = new ArrayList<FlowerShopObject>();
		
	//	private ArrayList<Tree> trees = new ArrayList<Tree>();
	//	private ArrayList<Flower> flowers = new ArrayList<Flower>();
	//	private ArrayList<Decoration> decoration = new ArrayList<Decoration>();
		
		public FlowerShop (String name, ArrayList<Tree> trees, ArrayList<Flower> flowers, ArrayList<Decoration> decoration) {
	//	public FlowerShop (String name, ArrayList<Tree> trees, ArrayList<Flower> flowers, ArrayList<Decoration> decoration) {
								
			this.name = name;
		//	this.trees = trees;
		//	this.flowers= flowers;	
		//	this.decoration = decoration;
		}

		public String getName() {
			return name;
		}
		
		public FlowerShop (String name) {
			this.name=name;
		}
		
	
		
}