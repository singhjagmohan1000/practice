package array;

public class Test1 {
	
	public void testPrint(int a[]){
		
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		changePrint(a);
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}
	public void changePrint(int b[]){
		b[0]=b[1]+10;
	}
	public static void main(String[] args) {
		Test1 test1 = new Test1();
		int arr[] = {1,2,3};
		test1.testPrint(arr);
		System.out.println(arr[0]);
		
	}

}
