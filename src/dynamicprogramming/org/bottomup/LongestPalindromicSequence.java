package dynamicprogramming.org.bottomup;

/**
 * Created by Jagmohan Singh on 8/16/18.
 */
public class LongestPalindromicSequence {


    static int lps(String s){

        int length = s.length();
        int dp[][]=new int[length][length];
        for(int i=0;i<length;i++){
            dp[i][i]=1;
        }
        int j=0;
        for(int k=2;k<=length;k++){
            for(int i=0;i<length-k+1;i++){
                j=i+k-1;
                if(s.charAt(i)==s.charAt(j)){
                    if(i==j)
                        dp[i][j]=1;
                    else if(i+1==j)
                        dp[i][j]=2;
                        else
                          dp[i][j]=2+dp[i+1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i+1][j],dp[i][j-1]);
                }
            }
        }
        return dp[0][length-1];
    }

    public static void main(String[] args) {

        String a="turboventilator";
        String b="bbabcbcab";
        System.out.print(lps(a));


    }
}
