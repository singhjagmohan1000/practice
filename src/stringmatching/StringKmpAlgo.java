package stringmatching;

public class StringKmpAlgo {

	public static int[] prefixPattern(String s){
		int m = s.length();
		int prefix[] = new int[m];
		int k=0;
		prefix[0]=0;
		for(int i=1;i<m;i++)
		{
			if(s.charAt(i)==s.charAt(k))
				prefix[i]=++k;
			else{
				if(k!=0)
					k=prefix[k-1];
				else
					prefix[i]=0;
					
			}
		}
		return prefix;
	}
	public static int findPattern(String s, String p){
		
		int n = s.length();
		int m=p.length();
		int prefix[]=prefixPattern(p);
		int q=-1;
		for(int i=0;i<n;i++)
		{
			while(q>-1 && s.charAt(i) != p.charAt(q+1))
				q=prefix[q]-1;
			if(s.charAt(i) == p.charAt(q+1))
				q=q+1;
			if((q+1)==m)
				return i-m+1;
			
		}
		return -1;
	}
//	public static int findPattern(String s, String p){
//		int n = s.length();
//		int m = p.length();
//		
//		int i=0,j=0;
//		int prefix[] =prefixPattern(p);
//		while(i<n && j<m){
//			if(s.charAt(i)==p.charAt(j))
//			{
//				i++;
//				j++;
//				if(j==m)
//					return i-m;
//			}
//			else{
//				if(j!=0)
//					j=prefix[j-1];
//				else
//					i++;
//					
//			}
//		}
//		
//		return -1;
//	}
	public static void main(String[] args) {
		System.out.println(findPattern("abcdefhabcdtiabcpqbcryewriue","abcpqbc"));
		System.out.println(findPattern("mississippi","pp"));
		System.out.println(findPattern("a","a"));
		//System.out.println(findPattern("abc",""));
		System.out.println(findPattern("abc","b"));
		System.out.println(findPattern("bacbababaabcbabioababatababaca","ababaca"));
	}
}
