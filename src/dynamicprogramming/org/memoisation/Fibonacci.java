package dynamicprogramming.org.memoisation;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Jagmohan Singh on 8/14/18.
 */
public class Fibonacci {

    public static int  fib(int n){
        int result=0;

        HashMap<Integer,Integer> memo = new HashMap<Integer,Integer>();

        if (n<=1 )
            return n;
        else {
            if(memo.containsKey(n))
                return memo.get(n);
            else
            result =  fib(n-1) + fib(n-2);
            memo.put(n,result);
            return result;
        }




    }

    public static void main (String args[]){

        System.out.println("Fibonnaci Number is :"+fib(6));

    }


}
