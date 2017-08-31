package stringmatching;

public class StringKmpAlgo {

	public static int[] prefixPattern(String s){
		int m = s.length();
		int prefix[] = new int[m];
		int k=0;
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
		int m = p.length();
		
		int i=0,j=0;
		int prefix[] =prefixPattern(p);
		while(i<n && j<m){
			if(s.charAt(i)==p.charAt(j))
			{
				i++;
				j++;
			}
			else{
				if(j!=0)
					j=prefix[j-1];
				else
					i++;
					
			}
		}
		if(j==m)
			return 1;
		else
		return -1;
	}
	public static void main(String[] args) {
		System.out.println(findPattern("mississippi","pp"));
	}
}
