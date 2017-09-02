package leetcode;

public class StringToInt {
	
	public static int convertInt(String s){
		
		char[] charArr=s.toCharArray();
		int arr[]=new int[s.length()];
		for(int i=0;i<s.length();i++){
			
			switch(charArr[i]){
			case '0': arr[i]=0;
					break;
			case '1': arr[i]=1;
			break;
			case '2': arr[i]=2;
			break;
			case '3': arr[i]=3;
			break;
			case '4': arr[i]=4;
			break;
			case '5': arr[i]=5;
			break;
			case '6': arr[i]=6;
			break;
			case '7': arr[i]=7;
			break;
			case '8': arr[i]=8;
			break;
			case '9': arr[i]=9;
			break;
			default: return 0;
			}
		}
		int num = arr[0];
			for(int i=1;i<arr.length;i++)
			{
				num=num*10+arr[i
				               ];
			}
		return num;
	}
	
	public static int convertInteger(String s){
		int num=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=48 && s.charAt(i)<=59)
				num=num*10+(int)(s.charAt(i)-48);
			
		}
		return num;
	}
	
	public static void main(String[] args) {
		Integer a=convertInt("11");
		Integer b=convertInteger("1234");
		System.out.println(b instanceof Integer);
		System.out.println(a);
		System.out.println(a instanceof Integer);
	}

}
