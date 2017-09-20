package leetcode;

public class LongestIncreasingSubsequence {


	static int longestIncreasingSubSequence(int arr[]){

		int l=1;
		int tail[]=new int[arr.length];
		if(arr.length==0 )
			return 0;
		if(arr.length==1 )
			return 1;
		tail[0]=arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]<tail[0])
				tail[0]=arr[i];
			else if(arr[i]>tail[l-1]){
				tail[l++]=arr[i];
			}
			else
				tail[binarySearch(tail,-1,l-1,arr[i])]=arr[i];
		}
		return l;
	}
	private static int binarySearch(int[] tail, int low, int high, int j) {
		// TODO Auto-generated method stub
		while(low<high){


			int mid=low+(high-low)/2;

			if(j<tail[mid])
				high=mid;
			else 
				if(j>tail[mid])
					low=mid+1;
				else
					return mid;
		}
		return high;
	}
	public static void main(String[] args) {
		int[] arr= new int[]{2, 5, 3, 7, 11, 8, 10, 13, 6};
		System.out.println(longestIncreasingSubSequence(arr));
	}

}
