package com.practice.amazon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

public class MyDataStructure {

	HashMap<Integer,Integer> map ;
	ArrayList<Integer> arr;
	public MyDataStructure() {
		// TODO Auto-generated constructor stub
		map=new HashMap<Integer,Integer>();
		arr=new ArrayList<Integer>();
	}

	void add(int number){

		if(map.get(number)!=null)
			return;
		else{
			int s=arr.size();
			arr.add(number);
			map.put(number, s);
		}

	}

	int search(int number){

		if(map.get(number)==null)
		{
			System.out.println(number + " not found");	
			return -1;
		}

		return map.get(number);
	}

	void remove(int number){
		if(map.get(number)==null)
		{
			System.out.println(number + "  not found");	
			return;
		}
		else{
			int index=map.get(number);
			map.remove(number);
			int s=arr.size()-1;
			int temp=arr.get(s);
			Collections.swap(arr, index, s);
			arr.remove(s);
			map.put(temp, index);
			System.out.println(number+  " is Removed");
		}

	}

	int randomNumber(){
		
		Random random=new Random();
		int num=random.nextInt(arr.size());
		return arr.get(num);
	}
	public static void main(String[] args) {
		MyDataStructure myDataStructure = new MyDataStructure();
		myDataStructure.add(1);
		myDataStructure.add(4);
		myDataStructure.add(7);
		myDataStructure.add(3);
		myDataStructure.add(9);
		myDataStructure.add(2);
		myDataStructure.add(6);
		myDataStructure.add(5);
		System.out.println(myDataStructure.search(9));
		myDataStructure.remove(9);
		System.out.println(myDataStructure.search(9));
		System.out.println(myDataStructure.randomNumber());

	}
}
