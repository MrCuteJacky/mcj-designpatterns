package org.mcj.designpatterns.singleton;

/**
 * Singleton1Sample.
 * 
 * @author MrCuteJacky
 * @version 1.0
 */
public class Singleton2Sample {

	/**
	 * main.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("start process.");
		for (int i = 0; i < 10; i++) {
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					Singleton2 sigleton2 = Singleton2.getInstance();
					System.out.println(sigleton2.hashCode());
				}
			}).start();
		}
	}

}