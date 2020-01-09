package com.test.carAndEmple;

public class LuxureCars extends Cars{

	public LuxureCars(double price) {
		super(price);
		
		if(price > 50000 && price <= 65000){
			tipe();
			System.out.println("Jaguar XJ");
		}else if(price > 65000 && price <= 80000){
			tipe();
			System.out.println("Aston Martin DB9");
		}else if(price > 80000 && price <= 100000){
			tipe();
			System.out.println("Bugatti Veyron");
		}else if(price > 100000){
			tipe();
			System.out.println("Lamborghini Aventador LP700-4");
		}else{
			tipe();
			System.out.println("SORRY.NOT FOUND!");
		}
	}

	@Override
	public void tipe() {
		
		System.out.println("LuxureCars Class");
		
	}

}
