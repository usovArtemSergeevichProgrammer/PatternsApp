package com.test.my;

import java.util.Date;

import com.test.single.Singleton;

public class A {
	
	private static A instance;
	
	private int x;
	
	private A(int bound) {
		x = (int)(Math.random() * bound);
	}
	
	public static A getInstance(int bound){
		if (instance == null) {
			instance = new A(bound);
		}
		return instance;
	}
	
	public int getX(){
		
		return x;
	}
}
