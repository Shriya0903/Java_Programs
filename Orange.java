package com.FruitBasket;

public class Orange extends Fruit {
	Orange(String name,String color,double weight,boolean fresh){
		super(name,color,weight,fresh);
	}
	public String taste() {
		return "sweet";
	}
	public void juice() {
		System.out.println("Fruit Name="+getName()+" weight="+getWeight()+" Extracting juice");
	}
}
