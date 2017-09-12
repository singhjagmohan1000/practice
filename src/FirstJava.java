import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FirstJava { 
	
	public static void eval(List<Integer> list,Predicate<Integer> predicate){
		for(Integer n:list){
			if(predicate.test(n)){
				System.out.println(n+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		List<Integer> list =Arrays.asList(1,2,3,4,5,6,7,8,9);
//		System.out.println("Print all numbers:");
//		eval(list,n->true);
//		 System.out.println("Print even numbers:");
//	      eval(list, n-> n%2 == 0 );
//	      System.out.println("Print number greater than 3: ");
//	      eval(list,n->n>3);
	      MathOperation add=(a,b) -> a-b;
	      FirstJava firstJava = new FirstJava();
	      System.out.println(firstJava.operate(30, 4, add));
	      
	}
	interface MathOperation{
		int operate(int a,int b);
	}
	private int operate(int a, int b,MathOperation operation){
		return operation.operate(a,b);
	}

}
