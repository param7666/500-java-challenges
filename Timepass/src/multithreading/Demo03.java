package multithreading;



class TestThread implements Runnable {
	
	@Override
	public void run() {
		System.out.println("Run Started...."+Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Run stop  "+Thread.currentThread().getName());
	}
}

public class Demo03 {
public static void main(String[] args) {
	TestThread t=new TestThread();
	Thread t1=new Thread(t);
	
	t1.setPriority(10);
	t1.start();
	
	Thread t2=new Thread(t);
	t2.setPriority(10);
	t2.start();
	
	Thread t3=new Thread(t);
	t3.setPriority(10);
	t3.start();
}
}
