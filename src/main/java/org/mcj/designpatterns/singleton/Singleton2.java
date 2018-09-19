package org.mcj.designpatterns.singleton;

/**
 * Singleton2.
 * 
 * @author MrCuteJacky
 * @version 1.0
 */
public class Singleton2 {
	
	/** The instance. */
	private static Singleton2 instance;

	/**
	 * Constructor.
	 */
	private Singleton2() {
		
		System.out.println("Start instance Singleton2.");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Finish instance Singleton2.");
	}
	
	/**
	 * getInstance.
	 * 
	 * @return
	 */
	public static Singleton2 getInstance() {
		
		if (instance == null) {
			instance();
		}
		
		return instance;
	}
	
	/**
	 * instance.
	 */
	private static synchronized void instance() {
		
		if (instance == null) {
			instance = new Singleton2();
		}
	}

}