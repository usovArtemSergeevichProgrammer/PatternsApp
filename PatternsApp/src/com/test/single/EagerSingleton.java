package com.test.single;

import java.util.Date;
/**
 * EAGER initialization at the moment loader class.в момент загрузки класа
 * @author ma
 *
 */
public class EagerSingleton {

	// field to hold single instance
		private static EagerSingleton instance = new EagerSingleton();

		
		//to test
		public static String label = "TEST";
		
		// Lock constructor and do not let Client
		// create instances of this class
		private EagerSingleton() {
			try {
				// make some job
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("EagerSingleton instance was created! -> " + new Date());
		}

		// Other way to create instance.
		public static EagerSingleton getInstance(){
			return instance;
		}
	
}
