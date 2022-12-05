package com.design;

public class Singleton {

	private static Singleton singletonobj=new Singleton();
	
	private Singleton() {
		
	}
	public static Singleton getInstance() {
		return singletonobj;
		
	}
}
