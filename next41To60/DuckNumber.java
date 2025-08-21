package next41To60;

public class DuckNumber {

	public static void duckNumber(int num) {
		String num2 = String.valueOf(num);
		System.out.println(num2);
		if (num2.charAt(0) == 0) {
			System.out.println(num + "Is not duck number beacuse of first 0");
		} else if (num2.contains("0")) {
			System.out.println(num + "Is duck number");
		} else {
			System.out.println(num + " is not duck");
		}
	}

	public static void main(String[] args) {
		duckNumber(202);
	}

}
