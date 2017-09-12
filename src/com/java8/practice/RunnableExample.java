package com.java8.practice;

public class RunnableExample {
	
	public static void main(String[] args) {
		Thread myThread =  new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Inside Thread");
				
			}
		});
		
		myThread.run();
		
		Thread myThreadLambda = new Thread(()->System.out.println("In Lambda Thread"));
		myThreadLambda.start();
	}
	
	
	

}
