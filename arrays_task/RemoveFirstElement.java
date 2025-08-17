package arrays_task;

import java.util.Arrays;

/*
Remove First Country 
Scenario: Countries: {"India", "USA", "UK"} — remove first.

Task:

Method: removeFirstCountry(String[] countries)

Return a new String[] without first element.

If empty, return same array. 
*/

public class RemoveFirstElement {
	
	public static String[] removeFirstCountry(String[] c) {
		if(c==null && c.length==0) {
			return c;
		} 
		String []newCountry=new String[c.length-1];
		for(int i=1;i<c.length;i++) {
			newCountry[i-1]=c[i];
		}
		System.out.println(Arrays.toString(newCountry));
		return newCountry;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(removeFirstCountry(new String[] {"India", "USA", "UK"})));

	}

}
