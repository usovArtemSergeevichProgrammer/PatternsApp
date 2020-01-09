package com.test.factory.pizza;

public class CheesePizza extends Pizza{

	@Override
	public void prepare() {
		System.out.println("CheesePizza <- Cheese -> Prepare()");
		
	}

	@Override
	public void bake() {
		System.out.println("CheesePizza <- Bak()");
		
	}

}
