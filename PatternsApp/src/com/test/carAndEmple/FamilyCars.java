package com.test.carAndEmple;

public class FamilyCars extends Cars{

	public FamilyCars(double price) {
		super(price);
		
		if(price > 10000 && price <= 20000){
			tipe();
			System.out.println("Peugeot 807");
		}else if(price > 20000 && price <= 30000){
			tipe();
			System.out.println("Hyundai Grand Santa Fe");
		}else if(price > 30000 && price <= 40000){
			tipe();
			System.out.println("Chevrolet Captiva");
		}else if(price > 40000 ){
			tipe();
			System.out.println("Mercedes-Benz Viano");
		}else{
			tipe();
			System.out.println("SORRY.NOT FOUND!");
		}
		
	}

	
	@Override
	public void tipe() {
		
		System.out.println("FamilyCars Class");
		
	}

}
