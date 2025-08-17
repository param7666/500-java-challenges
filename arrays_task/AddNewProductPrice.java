package arrays_task;

import java.util.Arrays;

/*
Add New Product Price 
Scenario: Prices: {10, 20, 30} — add new price 40.
Task:
Method: addPrice(int[] prices, int newPrice)
Return a new int[] with price added at the end.
If newPrice < 0, return the same array.
 */

public class AddNewProductPrice {
	
	public static int[] addPrice(int[]price,int newPrice) {
		int []updatePrice=new int[price.length+1];
		for(int i=0;i<price.length;i++) {
			updatePrice[i]=price[i];
		}
		updatePrice[updatePrice.length-1]=newPrice;
		return updatePrice;
	}
	
	public static void main(String[] args) {
		int[]price= {10,20,30};
		System.out.println(Arrays.toString(price));
		System.out.println(Arrays.toString(addPrice(price, 40)));

		
	}

}
