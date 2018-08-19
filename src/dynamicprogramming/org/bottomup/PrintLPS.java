package dynamicprogramming.org.bottomup;

/**
 * Created by gaggi on 8/19/18.
 */
public class PrintLPS {


    static String printLCS(String a,String b){

        int length = a.length();
        int dp[][]=new int[length+1][length+1];

        for(int i=0;i<=length;i++){

            for(int j=0;j<=length;j++){
                if(i==0 || j==0)
                    dp[i][j]=0;
                else
                    if(a.charAt(i-1)==b.charAt(j-1))
                        dp[i][j]=1+dp[i-1][j-1];
                    else
                        dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);

            }
        }
        int lcsLength=dp[length][length];
        char lps[]=new char[lcsLength];
        int i=length,j=length;
        while(i>0 && j>0){
            if(a.charAt(i-1)==b.charAt(j-1))
            {lps[lcsLength-1]=a.charAt(i-1);
                lcsLength--;
                i--;
                j--;
            }
            else if(dp[i-1][j]>dp[i][j-1])
                   i--;
                 else
                     j--;

        }

        return String.valueOf(lps);
    }

    static String printLPS(String a){

        String b= reverse(a);



       return printLCS(a,b);
    }

    static String reverse(String b){

        int l=b.length();

        char arr[]=new char[b.length()];
        for(int i=l-1, j=0;i>=0;i--,j++)

            arr[j]=b.charAt(i);


        return String.valueOf(arr);
    }


    public static void main(String[] args) {
        String a="turboventilator";
        String b="bbabcbcab";
        System.out.print(printLPS(b));
    }
}
