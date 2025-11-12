package metrefrence;

public class Task {
public static void main(String[] args) {
	Runnable r=new Runnable() {
		
		@Override
		public void run() {
			int i=1;
			while(i<=10) {
				System.out.println(i);
				i++;
			}
			
		}
	};
	Thread t=new Thread(r);
	t.start();
	
	
	Runnable r1=()->{
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
	};
	Thread t1=new Thread(r1);
	t1.start();
}
}
