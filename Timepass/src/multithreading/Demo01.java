package multithreading;


class ImpRunnable implements Runnable{
	
	@Override
	public void run() {
		System.out.println("Run method Executing....");
	}
}



public class Demo01 {

	public static void main(String[] args) {
		ImpRunnable i=new ImpRunnable();
		
		Thread t=new Thread(i);
		t.start();
	}
	
}
