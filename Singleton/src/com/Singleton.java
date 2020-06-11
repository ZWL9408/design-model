package com;

public class Singleton {
	private static Singleton singleton = new Singleton();
	private Singleton(){
		System.out.println("create an example");
	}
	public static Singleton getInStance(){
		return singleton;
	}
}
