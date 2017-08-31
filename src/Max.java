import java.util.HashMap;
import java.util.Map;

public class Max {
	
	static Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	
	static String max(int arr[]){
		int count=1;
		
		for(int i=0;i<arr.length;i++){
			if(!map.containsKey(arr[i]))
			map.put(arr[i], 1);
			else
				{
					Integer value=map.get(arr[i]);
					value=value+1;
					if(value>(arr.length)/2)
						return arr[i]+"";
					
					map.put(arr[i], value);
				
				}
			
			
		}
		
		return "None";
		
	}
	
	public static void main(String[] args) {
		int arr[] ={3, 3, 3, 2, 3, 4,2, 3, 4}; 
		
		System.out.println(max(arr));
		
		
	}

}
