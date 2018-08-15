package dynamicprogramming.org.memoisation;

/**
 * Created by Jagmohan Singh on 8/14/18.
 */
public class Fibonacci {

    public static int  fib(int n){

        if(n == 0)
            return 0;
        else if (n<=2 )
            return 1;
        else return fib(n-1) + fib(n-2);




    }

    public static void main (String args[]){

        System.out.println("Fibonnaci Number is :"+fib(6));

    }


}
