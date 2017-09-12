package array;

public class MaximumSumofSubArray {
	
	public static void maximumSum(int[] arr){
		int l = arr.length;
		int maxStart=Integer.MIN_VALUE;
		int maxEnd=0;
		int s=0,start=0,end=0;
		
		for(int i=0;i<l;i++)
		{
			maxEnd=maxEnd+arr[i];
			if(maxStart<maxEnd){
				maxStart=maxEnd;
				start=s;
				end=i;
			}
			if(maxEnd<0){
				maxEnd=0;
				s=s+i;
			}
			
		}
		System.out.println(maxStart+"  "+start+"  "+end);
				
	}
	public static void main(String[] args) {
		int arr[]={1,8,-16,4,-5,6,7,-9};
		maximumSum(arr);
	}

}
