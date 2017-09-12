package stringmatching;

public class Permutation {
	 static void permutation(String string,int begin,int end) {
		 
		// TODO Auto-generated method stub
		 
		 if(begin==end)
			 System.out.println(string);
		 else{
			 for(int i=begin;i<=end;i++)
			 {
				 string=swap(string,begin,i);
				 permutation(string,begin+1,end);
				 string=swap(string,begin,i);
			 }
		 }
		
	}
	
	static String swap(String string, int i, int j) {
		// TODO Auto-generated method stub
		char temp;
		char str[] =string.toCharArray();
		temp=str[i];
		str[i]=str[j];
		str[j]=temp;
		return String.valueOf(str);
	}

	public static void main(String[] args) {
		
		String str="ABC";
	
		
		permutation(str,0,str.length()-1);
		
	}

	

}
