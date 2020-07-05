package com.thilak.designpatterns;

public class Singleton {

	
	/*properties*/
	// its a object creation design pattern
	// only one instance of a class should exist and is allowed and 
	//other classes should be able to get the instance of singleton class 
	
	/*advantages*/
	//if several people have same requirement then only one object Should be allowed for that class and should be reused
	//eg: Runtime runtime = Runtime.getRuntime();
	//    Runtime runtime2 = Runtime.getRuntime();
	
	//Types 1. Eager initialization 2. lazy initialization, 3. Thread safe Method initialization
	
	
	/*Implementation*/
	// a public method to get instance 
	// instance type : private static
	// private constructor : to disallow creation of instance outside the class
	//
	
	
	public static void main(String [] args) {
		SingletonEager eagerInstance1 = SingletonEager.getEagerSingleton();
		SingletonEager eagerInstance2 = SingletonEager.getEagerSingleton();
		if(eagerInstance1 == eagerInstance2)// **** true
			System.out.println(eagerInstance1 +"   "+ eagerInstance2);
		
		
		SingletonLazy lazyInstance1 = SingletonLazy.getLazyInstance();
		SingletonLazy lazyInstance2 = SingletonLazy.getLazyInstance();
		if(lazyInstance1 == lazyInstance2)// **** true
			System.out.println(lazyInstance1 +"   "+ lazyInstance2);
		
		
		ThreadSafeSingleton threadSafeInstance1 = ThreadSafeSingleton.getthreadSafeInstance();
		ThreadSafeSingleton threadSafeInstance2 = ThreadSafeSingleton.getthreadSafeInstance();
		if(threadSafeInstance1 == threadSafeInstance2)// **** true
			System.out.println(threadSafeInstance2 +"   "+ threadSafeInstance2);
	}
}
