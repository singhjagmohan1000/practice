package com.practice.amazon;

public class PalindromeUptoNumber {
	
	static int createPalindrome(int input,int div,boolean isOdd){
		int n=input;
		int palindrome=input;
		if(isOdd)
			n/=div;
		
		while(n>0){
			palindrome=palindrome*div+(n%div);
			n/=div;
		}	
		return palindrome;
		
	}
	
	public static void main(String[] args) {
		int num=104;
		int j,number;
		for(int i=0;i<2;i++){
			j=1;
			while((number=createPalindrome(j,10,i%2==0))<num){
				System.out.print(number+" ");
				j++;
			}
		}
	}
}
