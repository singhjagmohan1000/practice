package com.java8.practice;

import java.util.Arrays;

import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;


public class Excercise {
	
	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("Jagmohan","Singh",30),
				new Person("Ankit","Gupta",29),
				new Person("Chandeep","Khamba",25),
				new Person("Raminder","Lakhan",31),
				new Person("Gagan","Deol",28),
				new Person("Ram","Rahim",50));
		
		people.stream().filter(p->p.getAge()>28).forEach(p->System.out.println(p.getFirstname()));

		//Step1: Sort List By Last Name
		Collections.sort(people,( p1, p2)->p1.getLastname().compareTo(p2.getLastname()));
		
		
		//Step2: Create a method to list all names
		print (people,p->true);
		//Step1: Create method to print name start with R
		print(people,p->p.getLastname().startsWith("S"));
			
			
			
		}
		private static void print(List<Person> people, Predicate<Person> predicate) {
			// TODO Auto-generated method stub
			for(Person p : people){
				if(predicate.test(p))
				System.out.println(p);
				}
		}

		

		
		
	
}
