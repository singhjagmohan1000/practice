package leetcode;

public class ZigZag {
	public static String convert(String s, int numRows) {
        if (numRows == 1 || s.length() < numRows) {
           return s;
       }
       StringBuilder builder = new StringBuilder();
       int len = s.length();
       int adder = 2 * (numRows - 1);
       for (int i = 0; i < numRows; i++) {
           builder.append(s.charAt(i));
           int j = i;
           while (j < len) {
               if (i != 0 && i != numRows - 1) {
                   int index = j + 2 * (numRows - i - 1);
                   if (index < len) {
                       builder.append(s.charAt(index));
                   }
               }
               j += adder;
               if (j < len) {
                   builder.append(s.charAt(j));
               }

           }

       }
       return builder.toString();
}


public static void main(String[] args) {
	
	
		System.out.println(convert("PAYPALISHIRING", 3));
	
}

}
