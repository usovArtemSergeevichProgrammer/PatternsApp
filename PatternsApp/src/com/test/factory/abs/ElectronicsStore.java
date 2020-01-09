package com.test.factory.abs;

public class ElectronicsStore {

	public static void build(ElectronicFactory factory) {
		Device d1 = factory.createLaptop();
		d1.info();
		Device d2 = factory.createMobilePhone();
		d2.info();
		Device d3 = factory.createSmartWatch();
		d3.info();
		Device d4 = factory.createTV();
		d4.info();
		System.out.println("------------");
	}

	static ElectronicFactory getFactory(String key) {
		switch (key.toLowerCase()) {
		case "sony":

			return new SonyFactory();

		case "apple":

			return new AppleFactory();
		default:
			break;
		}

		return null;

	}

	public static void main(String[] args) {
		
		build(getFactory("SONY"));
		build(getFactory("APPLE"));

		ElectronicFactory factory = new SonyFactory();
		build(factory);

		build(new AppleFactory());

	}

}
