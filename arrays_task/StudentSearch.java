package arrays_task;

/* 
Student Name Search 
Simply check if "Raj" exists and print true/false.

*/

public class StudentSearch {
	public static boolean checkName(String arr[]) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i].equalsIgnoreCase("Raj")) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println(checkName(new String[] {"Arnav","Kishor","Raj"})); // true
		System.out.println(checkName(new String[] {"Arnav","Kishor","Mahesh"})); // false

		
	}

}
