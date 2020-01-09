package com.test.carAndEmple;

public class CarFactory {

	public static Cars buildCar(Person p) {
		if (p == null) {
			return null;
		} else if (p instanceof RichMan) {
			return new LuxureCars(p.cash);
		} else if (p instanceof FamilyMan) {
			return new FamilyCars(p.cash);
		} else if (p instanceof StudentMan) {
			return new SportCars(p.cash);
		}

		return null;

	}
}
