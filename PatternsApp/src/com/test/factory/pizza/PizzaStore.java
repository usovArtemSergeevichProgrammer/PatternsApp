package com.test.factory.pizza;

public class PizzaStore {

	public static void main(String[] args) {
	
		Pizza p = orderPizza("CHEESE");
		Pizza m = orderPizza("VEGGLE");
		
		
	}
	public static Pizza orderPizza(String s){
		Pizza p = SimplePizzaFactory.createPizza(s);
		p.prepare();
		p.bake();
		p.box();
		p.cut();
		return p;
		
	}
	
}
