package arrays_task;

import java.util.Arrays;

/*
City Search with Indices 
Scenario: A travel agency keeps a list of cities: {"Pune", "Mumbai", "Delhi", "Mumbai"}

Task: Create a method findCityIndices(String[] cities, String cityName)

Return a new int[] with {firstIndex, lastIndex} of cityName.

If not found, return {-1, -1}.

Validate if the array is empty or null.

 */


public class CitySearch {
	
	public static int[] findCityIndices(String[] cities, String cityName) {
		if(cities==null || cities.length==0) {
			return new int[] {-1,-1};
		}
		
		int[] arr = {-1, -1}; // defualt array
		
		for(int i=0;i<cities.length-1;i++) {
			if(cities[i].equalsIgnoreCase(cityName)) {
				arr[0]=i; // for first index
				break;
			}
		}
		for(int i=cities.length-1;i>=0;i--) {
			if(cities[i].equalsIgnoreCase(cityName)) {
				arr[1]=i; // for last index
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
		return arr;
		
	}
	
public static void main(String[] args) {
	String[] cities= {"Pune", "Mumbai", "Delhi", "Mumbai"};
	System.out.println(Arrays.toString(findCityIndices(cities, "mumbai")));
}
}
