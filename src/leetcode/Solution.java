package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    static  List<List<Integer>> threeSum(int[] nums) {
        
        List list=new ArrayList(new ArrayList());
        
        if(nums.length <3)
            return null;
        
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            int l=i+1;
            int r=nums.length-1;
            while(l<r){
                if(nums[i]+nums[l]+nums[r]==0)
                { List temp=new ArrayList();
                 temp.add(nums[i]);
                  temp.add(nums[l]);
                  temp.add(nums[r]);
                    list.add(temp);
                l++;
                r--;}
                else if(nums[i]+nums[l]+nums[r]<0)
                             l++;
                else
                           r--;            
                    
            }
        }
        return list;
    }
    public static void main(String[] args) {
		int nums[]=new int[]{-1,0,1,2,-1,-4};
		System.out.println(threeSum(nums));
	}
}