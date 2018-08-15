package dynamicprogramming.org.bottomup;

/**
 * Created by Jagmohan Singh on 8/14/18.
 */
public class BottomUpFibo {


    public static int  bottomUpFib(int n){
        int result =0;

        int fib[] = new int[n+1];
        fib[0]=0;
        fib[1]=1;
        fib[2]=1;
        for(int i=3;i<=n;i++)
        {
                result = fib[i-1]+fib[i-2];
                fib[i]=result;

        }
        return result;

    }




    public static void main(String args[]){

        System.out.println("Fibonnaci Number is :"+bottomUpFib(6));
    }
}
