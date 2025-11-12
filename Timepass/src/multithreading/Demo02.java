package multithreading;


class TestSleep extends Thread{
	
	public void run() {
		System.out.println("Run method called");
		try {
			Thread.sleep(2000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Run method stoped");
	}
}

public class Demo02 {
public static void main(String[] args) {
	TestSleep t=new TestSleep();
	t.start();
}
}
