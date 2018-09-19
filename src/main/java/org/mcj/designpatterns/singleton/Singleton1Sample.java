package org.mcj.designpatterns.singleton;

/**
 * Singleton1Sample.
 * 
 * @author MrCuteJacky
 * @version 1.0
 */
public class Singleton1Sample {

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
					Singleton1 sigleton1 = Singleton1.instance;
					System.out.println(sigleton1.hashCode());
				}
			}).start();
		}
	}

}