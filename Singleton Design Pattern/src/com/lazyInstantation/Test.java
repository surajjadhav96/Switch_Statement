package com.lazyInstantation;

public class Test implements Cloneable {

	private static Test test=new Test();
	
	private Test() {
		
	}
	
	public static Test getData() {
		synchronized (Test.class) {
			if(test==null) {
				test=new Test();
			}else {
				return test;
			}
			return test;
		}
	}
}
