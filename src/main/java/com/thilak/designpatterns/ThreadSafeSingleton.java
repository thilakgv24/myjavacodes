package com.thilak.designpatterns;

public class ThreadSafeSingleton {
	
	private static ThreadSafeSingleton threadSafeInstance = null;
	
	private ThreadSafeSingleton() {
		
	}

	public static synchronized ThreadSafeSingleton getthreadSafeInstance() {
		if(null == threadSafeInstance)
			threadSafeInstance = new ThreadSafeSingleton();
		
		return threadSafeInstance;
	}
	
}
