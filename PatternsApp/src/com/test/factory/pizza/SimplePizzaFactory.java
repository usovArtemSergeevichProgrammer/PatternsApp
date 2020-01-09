package com.test.factory.pizza;


public class SimplePizzaFactory {

public static Pizza createPizza(String str){
		if(str == null){
			return null;
		}else if(str.trim().equalsIgnoreCase("Cheese")){
			return new CheesePizza();
		}else if(str.trim().equalsIgnoreCase("Veggle")){
			return new VegglePizza();
		}else if(str.trim().equalsIgnoreCase("Pepperoni")){
			return new PepperoniPizza();
		}
		return null;
		
		
	}
}
