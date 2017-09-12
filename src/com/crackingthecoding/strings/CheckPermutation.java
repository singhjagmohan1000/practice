package com.crackingthecoding.strings;

import java.util.Arrays;


public class CheckPermutation {
	static boolean check(String str1,String str2){

		if(str1.length()!=str2.length())
			return false;

		char[] str=str1.toCharArray();
		Arrays.sort(str);
		str1=String.valueOf(str);

		str=str2.toCharArray();
		Arrays.sort(str);
		str2=String.valueOf(str);
		if(str1.equals(str2))
			return true;
		else
			return false;
	}

	static boolean checkAnagram(String str1,String str2){

		int[] arr = new int[128];
		for(int i=0;i<str1.length();i++)
			arr[str1.charAt(i)]++;

	
	for(int i=0;i<str2.length();i++)
	{
		arr[str2.charAt(i)]--;
		if(arr[str2.charAt(i)]<0)
			return false;
	}

	return true;
}
public static void main(String[] args) {
	System.out.println(checkAnagram("DBCA","CBDA"));
}

}
