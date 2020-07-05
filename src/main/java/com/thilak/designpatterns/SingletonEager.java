package com.thilak.designpatterns;

public class SingletonEager {

	private static SingletonEager eagerInstance = new SingletonEager();
	// private constructor
	private SingletonEager() {
		
	}
	//Eager initialization
	
	public static SingletonEager getEagerSingleton() {		
		return eagerInstance;
	}
		
}
