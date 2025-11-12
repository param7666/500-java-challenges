package metrefrence;

interface Bank{
	public double getIntrest(double princ,double rate, int year);
}


public class Task1 {
public static double calculateIntrest(double princ,double rate, int year) {
	 double tax= (princ * rate * year) / 100;
	 princ+=tax;
	 return princ;
}
public static void main(String[] args) {
	Bank b=Task1::calculateIntrest;
	System.out.println(b.getIntrest(100000.0,5.0,12));
}
}
