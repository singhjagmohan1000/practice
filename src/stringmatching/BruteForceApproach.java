package stringmatching;

public class BruteForceApproach {
	
	public static boolean compareString(String s1,String s2){
		
		for(int i=0;i<s1.length();i++){
			if(s1.charAt(i)!=s2.charAt(i))
				return false;
			
		}
		return true;
		
	}
	
	public static int matchPattern(String text,String p){
		
		if(text.length()==0 && p.length() == 0)
			return 0;
		
		
		
		
	int n = text.length();
	int m = p.length();
	if(n==m)
		if(compareString(text,p))
			return 0;
		else
			return -1;
	for(int i=0;i<=n-m;i++){
		
		if(compareString(text.substring(i, i+m), p))
			return i;
		
	}
		return -1;
	}
	
	public static void main(String[] args) {
		int a[]={1,2,3,4,5};
		int i=1,j=10;
		a[i++]=j++;
		System.out.println(a[1]+" "+i+" "+j);
		System.out.println(matchPattern("mississippi","pi"));
	}

}
