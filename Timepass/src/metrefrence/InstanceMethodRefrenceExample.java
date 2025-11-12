package metrefrence;

import java.util.function.Supplier;

public class InstanceMethodRefrenceExample {

	public void m1() {
		int i=0;
		while(i<=10) {
			System.out.println(i+" ");
			i++;
		}
	}
	
	public static void main(String[] args) {
		InstanceMethodRefrenceExample im=new InstanceMethodRefrenceExample();
		Runnable r=im::m1;
		Thread t=new Thread(r);
		//t.start();
		Supplier<InstanceMethodRefrenceExample> im2=InstanceMethodRefrenceExample::new;
		InstanceMethodRefrenceExample r1=im2.get();
		System.out.println(r1.hashCode());
		System.out.println(im.hashCode());
		
	}
}
