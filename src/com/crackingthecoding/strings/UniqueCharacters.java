package com.crackingthecoding.strings;

public class UniqueCharacters {
	
	/**
	 * O(n*n)
	 * @param string
	 * @return
	 */
	 static boolean isUnique(String string) {
		// TODO Auto-generated method stub
		 
		 for(int i=0;i<string.length();i++)
			 for(int j=i+1;j<string.length();j++)
				 if(string.charAt(i)==string.charAt(j))
					 return false;
		return true;
	}
	 /**
	  * O(n)
	  * @param string
	  * @return
	  */
	 static boolean isUniqueString(String string) {
			// TODO Auto-generated method stub
			 boolean charArray[] = new boolean[256];
			 for(int i=0;i<string.length();i++)
				 if(charArray[string.charAt(i)])
					 return false;
				 else
					 charArray[string.charAt(i)]=true;
			return true;
		}
	public static void main(String[] args) {
		
		System.out.println(isUniqueString("ABCD"));
		
	}

	
}
