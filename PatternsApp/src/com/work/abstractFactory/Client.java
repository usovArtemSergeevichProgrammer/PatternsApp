package com.work.abstractFactory;

public class Client {
	
	public static void create(GUIFactory factory){
		
		Element e1 = factory.creatButton();
		e1.info();
		Element e2 = factory.creatRadioButton();
		e2.info();
		Element e3 = factory.creatChackButton();
		e3.info();
		System.out.println("---------");
	}

	public static void main(String[] args) {
		
		GUIFactory factory = new WindowsFactory();
		create(factory);
		

	}

}
