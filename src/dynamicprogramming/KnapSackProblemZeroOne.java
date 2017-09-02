package dynamicprogramming;

public class KnapSackProblemZeroOne {
	
	public static int max(int a,int b){
		return (a>b) ?a :b;
	}

	
	public static int knapSack(int wt[],int val[], int wT){
		
		int knapArray[][] = new int[val.length+1][wT+1];
		
		for(int i=0;i<=val.length;i++){
			for(int j=0;j<=wT;j++){
				if(i==0 || j== 0)
					knapArray[i][j]=0;
				else if(j-wt[i-1]>=0)
					knapArray[i][j]=max(val[i-1]+knapArray[i-1][j-wt[i-1]],knapArray[i-1][j]);
				else
					knapArray[i][j]=knapArray[i-1][j];
		}
		}
		return knapArray[val.length][wT];
	}
	
	public static void main(String[] args) {
		
		int wt[] = new int[]{1,3,4,5};
		int val[] = new int[]{1,4,5,7};
		int weight=7;
		System.out.println(knapSack(wt, val, weight));
	}
}
