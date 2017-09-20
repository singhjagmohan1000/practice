package com.crackingthecoding.strings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;



public class PermuntationPalindrome {

	
	/**
	 * Hint if more than one characters have odd count than return false
	 */
	
	static boolean permutationPalindrome(String str){
		int oddcount=0; int count=0;
		HashMap<Character,Integer> map =  new HashMap<Character,Integer>();
		
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)!=' '){
				if(map.containsKey(str.charAt(i))){
					
					count=map.get(str.charAt(i))+1;
					map.put(str.charAt(i), count);
				}
				else{
					map.put(str.charAt(i), 1);
					
				}
			}
				
				
		}
		 Iterator it = map.entrySet().iterator();
		    while (it.hasNext()) {
		        Map.Entry pair = (Map.Entry)it.next();
		       if((int)pair.getValue()%2!=0)
		    	   oddcount++;
		    }
		return (oddcount > 1) ? false: true;
	}
	public static void main(String[] args) {
		System.out.println(permutationPalindrome("taco cora"));
	}
}
