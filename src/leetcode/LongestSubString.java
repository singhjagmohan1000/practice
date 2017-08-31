package leetcode;

import java.util.HashMap;

public class LongestSubString {
	
	    public static int lengthOfLongestSubstring(String s) {
	    	HashMap<Character,Integer> hashMap = new HashMap<Character,Integer>();
	    	
	    	
	    int max=0,count=0;
	    for(int i=0;i<s.length();i++){
	    	if(hashMap.containsKey(s.charAt(i)))
	    	{
	    		count=Math.max(hashMap.get(s.charAt(i)), count);
	    	}
	    	max=Math.max(max, i-count+1);
	    	hashMap.put(s.charAt(i), i+1);
	    	
	    	
	    }
		    return max;
	        
	    }
	    public static void main(String[] args) {
	
			System.out.println(lengthOfLongestSubstring("abcabcbb"));
			System.out.println(lengthOfLongestSubstring("bbbbb"));
			System.out.println(lengthOfLongestSubstring("pwwkew"));
			System.out.println(lengthOfLongestSubstring("dvdf"));
		}
	
}
