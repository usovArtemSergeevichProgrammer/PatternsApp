package com.test.factory;

public class ShapeFactory {

	public Shape getShape(int code) {

		/**
		 * FACTORY METHOD
		 * @param can be 1, 2, 3
		 * @return Shape
		 * @see Shape
		 */
		switch (code) {
		case 1:
			return new Circle();

		case 2:

			return new Square();

		case 3:

			return new Triangle();

		default:
			System.out.println("No such Code SHAPE" + code);
			return null;
		}
	}
	
	public Shape getShape(String type){
		
		if(type == null){
			return null;
		}else if(type.trim().equalsIgnoreCase("Circle")){
			return new Circle();
		}else if(type.trim().equalsIgnoreCase("Triangle")){
			return new Triangle();
		}else if(type.trim().equalsIgnoreCase("Square")){
			return new Square();
		}
		return null;
		
	}
}
