package com.java8.practice;



public class FirstClass {

	public static void main(String[] args) {
		
		myLambda(s-> s.length());
		
		
	}
	
	public static void myLambda(StringLambdaLength l) {
		
		System.out.println(l.getLength("Jagmohan"));
		
		
	}
	interface StringLambdaLength{
		int getLength(String s);
	}
	
	
}
