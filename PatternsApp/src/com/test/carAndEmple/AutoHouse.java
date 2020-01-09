package com.test.carAndEmple;

public class AutoHouse {

	public static void main(String[] args) {
		
		Person p1 = new FamilyMan(14000);
		orderCar(p1);
		
		Person p2 = new RichMan(85000);
		orderCar(p2);
	
		orderCar(new StudentMan(55000));
	}

	public static void orderCar(Person p){
		p.tipe();
		System.out.println("     --------     ");
		CarFactory.buildCar(p);
		System.out.println("==================");
		
		}
}
