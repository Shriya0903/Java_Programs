package com.FruitBasket;

class Mango extends Fruit {
		Mango(String name,String color,double weight,boolean fresh){
			super(name,color,weight,fresh);
		}
		public String taste() {
			return "sweet n sour";
	
		}
		public void pulp() {
			System.out.println("Fruit Name="+getName() +" Mango color"+ getColor()+"Creating pulp!");
		}
	
	
}
