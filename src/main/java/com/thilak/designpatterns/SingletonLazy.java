package com.thilak.designpatterns;

public class SingletonLazy {

	private static SingletonLazy lazyInstance = null;
	private SingletonLazy() {
		
	} 
	
	
	public static SingletonLazy getLazyInstance() {
		if(null == lazyInstance)
			lazyInstance = new SingletonLazy();
		
		return lazyInstance;
	}
	
}
