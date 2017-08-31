package leetcode;

public class RemoveDuplicate {
	 public static int removeDuplicates(int[] nums) {
		 int count = 0;
		 for (int i=0; i<nums.length; i++)
	            if (nums[i]!=nums[count]) 
	                nums[++count]=nums[i];
	       
		 
		 return count+1;
	        
	    }
	 
	 public static void main(String[] args) {
		int arr[]={1,1,1,1,5,6,6,6,6,8};
		int l = removeDuplicates(arr);
		for(int i=0;i<l;i++)
			System.out.println(arr[i]);
		
		System.out.println(l);
	}

}
