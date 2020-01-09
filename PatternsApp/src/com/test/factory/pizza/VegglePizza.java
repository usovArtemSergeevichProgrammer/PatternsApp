package com.test.factory.pizza;

public class VegglePizza extends Pizza{

	@Override
	public void prepare() {
		
		System.out.println("VegglePizza <- Veggle -> Prepare()");
		
	}

	@Override
	public void bake() {
		
		System.out.println("VegglePizza <- Bak()");
		
	}

}
