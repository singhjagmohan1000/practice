package amazon;

public class GasStation {
	
	public static boolean isComplete(int start,int gasArr[],int costArr[]){
		
		int totalGas=0;
		int i=start;
		
	   while(true){
		   totalGas=totalGas+gasArr[i];
		   if(totalGas>=costArr[i]){
			   totalGas=totalGas-costArr[i];
			   if(i+1==gasArr.length)
				   i=0;
			   else
				   i++;
			
			   if(i==start)
				   return true;
			   
			   
		   }
		   else
			   break;
		   
	   }
		
		
		return false;
	}
	
	public static int gasStation(int gas[],int cost[]){
		
		for(int i=0;i<gas.length;i++){
			
			if(isComplete(i, gas, cost))
			 return i;
		}
		return -1;
	}
 public static void main(String[] args) {
	int gas[]= {1,2};
	int cost[]={2,1};
	System.out.println(gasStation(gas,cost));
}
}
