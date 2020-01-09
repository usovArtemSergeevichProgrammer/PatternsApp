package com.test.factory.pizza;

public class PepperoniPizza extends Pizza{

	@Override
	public void prepare() {
		System.out.println("PepperoniPizza <- Pepperoni -> Prepare()");
		
	}

	@Override
	public void bake() {
		System.out.println("PepperoniPizza <- Bak()");
		
	}

}
