package amazon;

public class BuyStockTwo {
	
	public static int maxProfit(int arr[]){
		
		int profit=0;
		if(arr.length==0)
			return 0;
		
		for(int i=0;i<arr.length-1;i++){
			if(arr[i+1]>arr[i])
				profit+=arr[i+1]-arr[i];
		}
		return profit;
	}
	public static void main(String[] args) {
		int arr[]={1,2,3};
		System.out.println(maxProfit(arr));
	}

}
