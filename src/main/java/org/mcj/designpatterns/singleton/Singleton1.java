package org.mcj.designpatterns.singleton;

/**
 * Singleton1.
 * 
 * @author MrCuteJacky
 * @version 1.0
 */
public class Singleton1 {
	
	/** The instance. */
	public final static Singleton1 instance = new Singleton1();
	
	/**
	 * Constructor.
	 */
	private Singleton1() {
		
		System.out.println("Start instance Singleton1.");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Finish instance Singleton1.");
	}

}