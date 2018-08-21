package dynamicprogramming.org.bottomup;

/**
 * Created by gaggi on 8/20/18.
 */
public class LongestPalindromicSubstring {

    static String lpss(String s ){

        if(s==null || s.length()<1)
            return "";
        int length = s.length();
        if(length==1)
            return s;


        if(length==2){
            if(s.charAt(0)==s.charAt(1))
                    return s;
            else
                return s.substring(0,1);
        }

        boolean dp[][]=new boolean[length][length];

        int start =0,end =0;

        for(int i=0;i<length-1;i++) {

            if(s.charAt(i)==s.charAt(i+1)){
            dp[i][i + 1]=true;
            start=i;
            end=i+1;}
        }
        for(int i=0;i<length;i++)
            dp[i][i]=true;

        for(int k=3;k<=length;k++){
            for(int i=0;i<length-k+1;i++){

                int j=i+k-1;
                if(dp[i+1][j-1]) {
                    if (s.charAt(i) == s.charAt(j)) {
                        dp[i][j] = true;
                        start=i;
                        end=j;

                    }
                    else dp[i][j]=false;
                }
                else
                    dp[i][j]=false;

            }
        }
        return s.substring(start,end+1);
    }

    public static void main(String[] args) {

        String a ="";
        String b="ac";
        String c="aabc";
        String d= "cbbd";
        String e="babacd";

        System.out.println(lpss(a));
        System.out.println(lpss(b));
        System.out.println(lpss(c));
        System.out.println(lpss(d));
        System.out.println(lpss(e));

    }
}
