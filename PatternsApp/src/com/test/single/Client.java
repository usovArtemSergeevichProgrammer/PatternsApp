package com.test.single;

public class Client {

	public static void main(String[] args) {

		// Singleton single = null;
		Singleton s = Singleton.getInstance();
		for (int i = 0; i < 10; i++) {
			s = Singleton.getInstance();
		}

		System.out.println(EagerSingleton.label);
		for (int i = 0; i < 10; i++) {
			EagerSingleton.getInstance();
		}

		String keys[] = { "lang", "version", "size" };
		String values[] = { "EN", "V.1.01", "22" };
		
		String keys2[] = { "lang", "version", "size" };
		String values2[] = { "EN", "V.1.01", "22" };
		
		Settings settings1 = Settings.getInstance(keys, values);
		Settings settings2 = Settings.getInstance(keys2, values2);
		Settings settings3 = Settings.getInstance(keys2, values2);

		System.out.println(settings1.getValue("lang"));
		System.out.println(settings2.getValue("version"));
		System.out.println(settings3.getValue("size"));
		
		settings1.setValue("lang", "RU");
		System.out.println(settings1.getValue("lang"));
		System.out.println(settings2.getValue("lang"));
		settings2.setValue("lang", "PL");
		System.out.println(settings1.getValue("lang"));
		System.out.println(settings2.getValue("lang"));
		System.out.println(settings3.getValue("lang"));

	}

}
