package dynamicprogramming.org.bottomup;

/**
 * Created by gaggi on 8/19/18.
 */
public class KnapSack {

 static int solutionKanpSack(int[] value,int[] weight,int totalWeight){

     int[][] dp = new int[value.length+1][totalWeight+1];

     for(int i=0;i<=value.length;i++){
         for(int j=0;j<=totalWeight;j++){
             if(i==0 || j==0){
                 dp[i][j]=0;

             }
             else{
                 if(j-weight[i-1]>=0)
                   dp[i][j]=Math.max(dp[i-1][j],value[i-1]+dp[i-1][j-weight[i-1]]);
                 else
                     dp[i][j]=dp[i-1][j];
             }
         }
     }

     return dp[value.length][totalWeight];
    }
    public static void main(String args[]){

        int value[]={60,100,120};
        int weight[]={10,20,30};
        int totalWeight=50;

        System.out.print("Maximum Value it can Carry: "+solutionKanpSack(value,weight,totalWeight));
    }
}
