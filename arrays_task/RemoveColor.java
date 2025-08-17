package arrays_task;

import java.util.Arrays;

/*
Remove Last Color 
Scenario: Colors: {"Red", "Green", "Blue"} — remove last color.
Task:
Method: removeLastColor(String[] colors)
Return a new String[] without last element.
If array empty, return same array.
 */

public class RemoveColor {
	
	public static String[] removeLastColor(String[] colors) {
		String[] newColors = new String[colors.length-1];
		for(int i=0;i<colors.length-1;i++) {
			newColors[i]=colors[i];
		}
		return newColors;
	}
public static void main(String[] args) {
	String[] colors = {"Red", "Green", "Blue"};
	System.out.println(Arrays.toString(removeLastColor(colors)));
}
}
