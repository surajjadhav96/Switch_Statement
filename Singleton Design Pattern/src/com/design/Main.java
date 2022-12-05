package com.design;

public class Main {

	public static void main(String[] args) {
Singleton obj=Singleton.getInstance();
Singleton obj2=Singleton.getInstance();

System.out.println(obj.hashCode());
System.out.println(obj2.hashCode());
	}

}
