package leetcode;

public class RemoveElement {
	 public static int removeElement(int[] nums, int val) {
		 int count=0;
		 for(int i=0;i<nums.length;i++)
			 
		 {
			 if(val!=nums[i])
				nums[count++]=nums[i];
				 
		 }
		 
		 
		 return count;
		 
	        
	    }
	 
	 public static void main(String[] args) {
		int arr[]={3,2,2,3};
		for(int i=0;i<removeElement(arr, 3)+1;i++){
			System.out.println(arr[i]);
		}
	}

}
