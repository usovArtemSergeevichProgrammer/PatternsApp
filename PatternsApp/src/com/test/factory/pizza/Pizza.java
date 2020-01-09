package com.test.factory.pizza;

public abstract class Pizza {

	public abstract void prepare();
	public abstract void bake();
	
	public void cut(){
		System.out.println("Pizza -> Cut()");
	}
	public void box(){
		System.out.println("Pizza -> Box()");
	}
}
