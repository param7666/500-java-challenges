package functional;

@FunctionalInterface
interface MyInterface{
	public boolean check(int num);
}




public class Demo01 {

	public static void main(String[] args) {
		MyInterface m=(num)->{
			if(num%2==0) return true;
			else return false;
		};
		
		System.out.println(m.check(15));
	}
}
