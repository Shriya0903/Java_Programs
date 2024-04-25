package com.FruitBasket;

import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit[] f=new Fruit[10];
	
		Scanner sc=new Scanner(System.in);
		int a=0;
		int i=1;
		String name;
		String color;
		double weight;
		boolean fresh;
		
		while(true) {
			System.out.println("Enter choice");
			System.out.println("1.add mango");
			System.out.println("2.add Apple");
			System.out.println("3.add Orange");
			System.out.println("4.exit");
			System.out.println("5.Print Only Fruit Name");
			System.out.println("6.To Print all fruit details ");
			System.out.println("7.call fruit function");
			System.out.println("8.Total fruit in the basket");
			a=sc.nextInt();
			switch(a){
			case 1:
				System.out.println("Enter fruit name");
				name=sc.next();
				System.out.println("Enter color");
				color=sc.next();
				System.out.println("Enter weight");
				weight=sc.nextDouble();
				System.out.println("Enter fruit freshness");
				fresh=sc.nextBoolean();
				f[i]=new Mango(name,color,weight,fresh);
				i++;
				System.out.println("Added successful");
				System.out.println();
				break;
			case 2:
				System.out.println("Enter fruit name");
				name=sc.next();
				System.out.println("Enter color");
				color=sc.next();
				System.out.println("Enter weight");
				weight=sc.nextDouble();
				System.out.println("Enter fruit freshness");
				fresh=sc.nextBoolean();
				f[i]=new Apple(name,color,weight,fresh);
				i++;
				System.out.println("Added successful");
				System.out.println();
				break;
			case 3:
				System.out.println("Enter fruit name");
				name=sc.next();
				System.out.println("Enter color");
				color=sc.next();
				System.out.println("Enter weight");
				weight=sc.nextDouble();
				System.out.println("Enter fruit freshness");
				fresh=sc.nextBoolean();
				f[i]=new Orange(name,color,weight,fresh);
				i++;
				System.out.println("Added successful");
				System.out.println();
				break;
			case 4:
				System.out.println("Exit");
				break;
			case 5:
				for(int j=0; j<i; j++) {
					System.out.println(f[j].getName());
				}
				break;
			case 6:
				for(int j=0; j<i; j++) {
					System.out.println(f[j].toString());
				}
				break;
			case 7:
				int q;
				q=sc.nextInt();
				if(f[q] instanceof Mango) {
					Mango m1=(Mango)(f[q]);
					m1.taste();
					m1.pulp();
				}
				else if(f[q] instanceof Apple) {
					Apple a1=(Apple)(f[q]);
					a1.taste();
					a1.jam();	
				}
				
				else if(f[q] instanceof Orange) {
					Orange o1=(Orange)(f[q]);
					o1.taste();
					o1.juice();
				}
				break;
			case 8:
				int o;
				o=i;
				System.out.println("Total no of fruit in the basket="+o--);
				System.out.println();
				break;
			default:
				System.out.println("Invalid!!!");
				break;
				
			}
			
		}
		
		
	}

}
