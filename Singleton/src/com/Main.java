package com;

public class Main {
	public static void main(String[] args) {
		System.out.println("Start.");
		Singleton obj1 = Singleton.getInStance();
		Singleton obj2 = Singleton.getInStance();
		if(obj1 == obj2){
			System.out.println("obj1 equals obj2");
		}else{
			System.out.println("obj1 doesn't equals obj2");
		}
		System.out.println("End.");
	}
}
