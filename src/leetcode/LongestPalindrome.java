package leetcode;

import java.util.HashMap;

public class LongestPalindrome {
	
	public static boolean isPalindrome(String s){
		
		int i=0;
		int l=s.length()-1;
		while(l>i){
			if(s.charAt(i++)!=s.charAt(l--))
				return false;
		}
		
		return true;
	}
	
	 public static String longestPalindrome(String s) {
		 
		 String str;
		 String str1=s.charAt(0)+"";
		 int max=0;
		 
		 if(s.length()==1)
			 return s;
		 HashMap<Character,Integer> hashMap = new HashMap<Character,Integer>();
		 for(int i=0;i<s.length();i++){
			 if(hashMap.containsKey(s.charAt(i))){
				 
				str =s.substring(hashMap.get(s.charAt(i)), i+1);
			
				if(isPalindrome(str))
					if(str.length()>max)
						{max=str.length(); 
						str1=str;
						}
				
				
			 }
			 
			 hashMap.put(s.charAt(i), i);
		 }
		 
		 return str1;
	        
	    }
	 public static void main(String[] args) {
		 System.out.println(isPalindrome("baba"));
		 System.out.println(isPalindrome("babab"));
		 System.out.println(isPalindrome("baab"));
		System.out.println(longestPalindrome("babadada"));
		System.out.println(longestPalindrome("abcd"));
		System.out.println(longestPalindrome("ccc"));
	}

}
