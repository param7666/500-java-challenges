package arrays_task;

import java.util.Arrays;

/*
8. Reverse Scores 
Scenario: Scores: {10, 20, 30, 40} — reverse order.
Task:
Method: reverseScores(int[] scores)
Return a new int[] reversed.
If only 1 element, return same array.
 */
public class ReverseArrays {
	
	public static int[] reverseScore(int[]score) {
		if(score.length==1) {
			return score;
		}
		int[]reverseScore=new int[score.length];
		for(int i=0;i<score.length;i++) {
			reverseScore[i]=score[score.length-1-i];
		}
		System.out.println(Arrays.toString(reverseScore)); //[40, 30, 20, 10]
		return reverseScore;
	}
public static void main(String[] args) {
	System.out.println(Arrays.toString(reverseScore(new int[] {10, 20, 30, 40}))); //[40, 30, 20, 10]
}
}
