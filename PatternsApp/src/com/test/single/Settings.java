package com.test.single;

public class Settings {

	private static Settings instance = null;

	private String[] keys;
	private String[] values;

	private Settings(String[] keys, String[] values) {
		super();
		this.keys = keys;
		this.values = values;
	}

	public String getValue(String key) {

		int index = -1;
		for (int i = 0; i < keys.length; i++) {
			if (key.equalsIgnoreCase(keys[i])) {
				System.out.println("Key [" + key + "] found");
				index = i;
				break;
			}
		}
		if (index == -1) {
			System.out.println("Key [" + key + "] is not found");
			return null;
		}
		return values[index];
	}

	public void setValue(String key, String val) {

		int index = -1;
		for (int i = 0; i < keys.length; i++) {
			if (key.equalsIgnoreCase(keys[i])) {
				System.out.println("Key [" + key + "] found");
				index = i;
				break;
			}
		}
		if (index == -1) {
			System.out.println("Key [" + key + "] is not found");

		} else {
			values[index] = val;
		}
	}

	public void print() {
		for (int i = 0; i < keys.length; i++) {
			System.out.println("KEY [" + keys[i] + "] -> VALUES [" + values[i] + "]");
		}
	}

	public static Settings getInstance(String[] keys, String[] values) {
		if (instance == null) {
			instance = new Settings(keys, values);
		}
		return instance;
	}

}
