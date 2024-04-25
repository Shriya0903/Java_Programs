package com.FruitBasket;

class Apple extends Fruit {
	Apple(String name,String color,double weight,boolean fresh){
		super(name,color,weight,fresh);
	}
	public String taste() {
		return "sweet";

	}
	public void jam() {
		System.out.println("Fruit Name = "+getName() +" Making jam!");
	}

}
