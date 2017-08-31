
public class Test {
	
	Test(){
		System.out.println("a");
	}
	
	{
		System.out.println("k");
	}
	
	{
		System.out.println("l");
	}
	
	
	public static void main(String[] args) {
		Test t = new Test();
		
		System.out.println("j");
		
		
		
	}
	static{
		System.out.println("i");
	}

}
