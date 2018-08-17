package dynamicprogramming.org.bottomup;

/**
 * Created by Jagmohan Singh on 8/16/18.
 */
public class LongestCommonSubSequence {

    static int lengthLongestCommonSubSequence(String a, String b){
        int c[][]=new int[a.length()+1][b.length()+1];

        for(int i=0;i<=a.length();i++){
            for(int j=0;j<=b.length();j++){
                if(i==0 || j==0)

                    c[i][j]=0;

                else if(a.charAt(i-1)==b.charAt(j-1)){
                        c[i][j]=c[i-1][j-1]+1;


                }
                else{
                    c[i][j]=Math.max(c[i][j-1],c[i-1][j]);
                }
            }


        }

        return c[a.length()][b.length()];
    }



    public static void main(String args[]){

        String a="BANANA";
        String b="ATANA";

       System.out.println( lengthLongestCommonSubSequence(a,b));


    }
}
