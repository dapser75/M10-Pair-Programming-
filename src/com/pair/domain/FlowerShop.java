package com.pair.domain;

import java.util.ArrayList;

public class FlowerShop {

		private String name;									
		private ArrayList<Tree> trees = new ArrayList<Tree>();
		private ArrayList<Flower> flowers = new ArrayList<Flower>();
		private ArrayList<Decoration> decoration = new ArrayList<Decoration>();
		
		public FlowerShop (String name, ArrayList<Tree> trees, ArrayList<Flower> flowers, ArrayList<Decoration> decoration) {
								
			this.name = name;
			this.trees = trees;
			this.flowers= flowers;	
			this.decoration = decoration;
		}
}