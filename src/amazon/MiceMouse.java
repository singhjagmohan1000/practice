package amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MiceMouse {
	public static int mice(ArrayList<Integer> a, ArrayList<Integer> b) {
		Collections.sort(a);
		Collections.sort(b);
		
		int min=0;int time;
		
		for(int i=0;i<a.size();i++)
			
		{
			time=Math.abs(a.get(i)-b.get(i));
			if(time>min){
				min=time;
			}
			
			
		}
		return min;
    }
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>(Arrays.asList(-49, 58, 72, -78, 9, 65, -42, -3 ));
		
		ArrayList<Integer> b=new ArrayList<>(Arrays.asList(30, -13, -70, 58, -34, 79, -36, 27 ));
		
		System.out.println(mice(a,b));
	}

}
