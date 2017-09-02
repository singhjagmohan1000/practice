package leetcode;

public class RemoveCharacter {
	
	public static String removeCharacter(String str, String remove){
		
		char[] s = str.toCharArray();
		char[] r = remove.toCharArray();
		boolean flags[] = new boolean[128];
		for(int i=0; i<remove.length();i++)
			flags[r[i]]=true;
		int j=0;
		for(int i=0;i<str.length();i++){
			if(!flags[s[i]])
				s[j++]=s[i];
		}
		
		return new String(s,0,j);
	}
	public static void main(String[] args) {
		System.out.println(removeCharacter("abcdefghijk", "ab"));
	}

}
