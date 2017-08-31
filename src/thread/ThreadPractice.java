package thread;


	
	class Thread1  implements Runnable
	{
		@Override
		public void run() {
			// TODO Auto-generated method stub
//			for(int i=0;i<1000;i++)
//				System.out.println(i);
			System.out.println("hi");
//			Thread t = new Thread();
//			System.out.println(t.isDaemon());
		}
	}
	class Thread2 extends Thread{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int i=1595;i<1600;i++)
			System.out.println(i);
		}
	}
	public class ThreadPractice {
	
	public static void main(String[] args) {
		
//		Thread1 t1 = new Thread1();
//		Thread2 t2 = new Thread2();
//		t1.start();
//		t2.start();
		Thread2 t2 = new Thread2();
		t2.setDaemon(true);
		t2.start();
		Thread1 t1 = new Thread1();
		Thread t = new Thread(t1);
		t.start();
		System.out.println(t.getName()+"id is: "+t.getId()+"priority is: "+t.getPriority());
		System.out.println(t2.getName()+"id is: "+t2.getId()+"priority is: "+t2.getPriority());
//		Thread t = Thread.currentThread();
//		System.out.println(t.getName()+"id is: "+t.getId()+"priority is: "+t.getPriority());
	}

}
