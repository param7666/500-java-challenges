package metrefrence;

import java.util.ArrayList;
import java.util.Collections;

public class NumberSorting {
public static void main(String[] args) {
	ArrayList<Integer> list=new ArrayList<>();
	Runnable r=()->{
		for(int i=1;i<=10;i++) {
			list.add(i);
		}
	};
	Thread t=new Thread(r);
	t.start();
	Collections.sort(list,(i,j)->(i>j)? -1:1);
	System.out.println(list);
}
}
