package com.lazyInstantation;

public class Main {

	public static void main(String[] args) {
Test obj1=Test.getData();
Test obj2=(Test)obj1;
System.out.println(obj1.hashCode());
System.out.println(obj2.hashCode());
	}

}
