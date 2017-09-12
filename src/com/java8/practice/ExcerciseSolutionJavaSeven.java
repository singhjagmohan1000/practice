package com.java8.practice;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExcerciseSolutionJavaSeven {
public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("Jagmohan","Singh",30),
				new Person("Ankit","Gupta",29),
				new Person("Chandeep","Khamba",25),
				new Person("Raminder","Lakhan",31),
				new Person("Gagan","Deol",28),
				new Person("Ram","Rahim",50));
		
		//Step1: Sort List By Last Name
		Collections.sort(people,new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getLastname().compareTo(o2.getLastname());
			}
		});
		
		//Step2: Create a method to list all names
		
	printAll(people);
		//Step1: Create method to print name start with R
	print(people,new Condition(){

		@Override
		public boolean test(Person p) {
			// TODO Auto-generated method stub 
			return p.getFirstname().startsWith("A");
		}
		
	});
		
		
		
	}

private static void print(List<Person> people, Condition condition) {
	// TODO Auto-generated method stub
	for(Person p : people){
		if(condition.test(p))
		System.out.println(p);
		}
}

private static void printAll(List<Person> people) {
	for(Person p : people)
		System.out.println(p);
	
}
public interface Condition{
	public boolean test(Person p);
}

}
