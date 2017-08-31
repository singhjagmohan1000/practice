package thread;

class Demo
{
synchronized void methodOne(Demo d)
{
	
	Thread t = Thread.currentThread();
System.out.println("In Method One executed by: "+t.getName());	
d.methodTwo(this);
System.out.println("Finish Method One executed by: "+t.getName());	

}
synchronized void methodTwo(Demo d)
{
	
	Thread t = Thread.currentThread();
System.out.println("In Method Two executed by: "+t.getName());	
d.methodOne(this);
System.out.println("Finish Method Two executed by: "+t.getName());	

}

}
public class Deadlock {
	
	public static void main(String[] args) {
		final Demo d1 = new Demo();
		final Demo d2 = new Demo();
		Thread t1 = new Thread(){
		public void run(){
			d1.methodOne(d2);
		}
	};
	
	Thread t2 = new Thread(){
		public void run(){
			d2.methodTwo(d1);
		}
	};
	t1.start();
	t2.start();
			

		
	}
	
	
}
