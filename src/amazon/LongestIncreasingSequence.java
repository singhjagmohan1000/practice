package amazon;

public class LongestIncreasingSequence {
   
    public static int longestIncreasingSubSequence(int input[]){
        int max=0;
        int arr[]=new int[input.length];
        for(int  i=0;i<input.length;i++){
        	arr[i]=1;
        }
 
        for(int i=1;i<input.length;i++){
        	
        	for(int j=0;j<i;j++){
        		
        		if(input[i]>input[j])
        			arr[i]=Math.max(arr[j]+1, arr[i]);
        	}
        	
        }
        for(int i=0;i<arr.length;i++)
        	{if(arr[i]>max)
        		max=arr[i];}
        return max;
    }
    
    public static void main(String args[]){
        //int input[] = {2,5,3,1,2,10,6,7,8};
        int input[] = {3, 4, -1, 5, 8, 2, 3, 12, 7, 9, 10};
     
        System.out.println("Maximum length " + longestIncreasingSubSequence(input));
    }

}
