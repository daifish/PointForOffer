package com.arp.work;
/**
 * 
 * @author daiyu
 * 单例模式
 */
public class Singleton {
	/**
	private static Singleton2 singleton = new Singleton2();
	
	private Singleton2() {}
	
	public static Singleton2 getInstance() {
		return singleton;
	}
	**/
	
	private static Singleton singleton = null;
	
	public synchronized static Singleton getInstance() {
		
		if (singleton == null)
			singleton = new Singleton();
		
		return singleton;
	}
	
}
