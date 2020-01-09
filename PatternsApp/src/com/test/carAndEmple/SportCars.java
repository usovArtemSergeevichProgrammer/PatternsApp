package com.test.carAndEmple;

public class SportCars extends Cars{

	public SportCars(double price) {
		super(price);
		
		if(price > 50000 && price <= 65000){
			tipe();
			System.out.println("Audi RS4");
		}else if(price > 65000 && price <= 80000){
			tipe();
			System.out.println("Subaru Impreza STi ");
		}else if(price > 80000 && price <= 100000){
			tipe();
			System.out.println("Mercedes-Benz SLR McLaren");
		}else if(price > 100000 ){
			tipe();
			System.out.println("Porsche Carrera GT");
		}else{
			tipe();
			System.out.println("SORRY.NOT FOUND!");
		}
	}

	@Override
	public void tipe() {
		
		System.out.println("SportCars Class");	
		
	}

}
