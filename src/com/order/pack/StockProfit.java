package com.order.pack;

public class StockProfit {

	public static void main(String[] args) {
		//Given prices of a stock on each day, find the maximum profit by choosing a day to buy and a day in the future to sell.
		int[]arr=new int[] {7,11,5,3,6,4,8};

		int minPrice=0,maxPrifit=0;
		
		minPrice=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			int currentProfit=arr[i]-minPrice;
			maxPrifit=maxPrifit>currentProfit?maxPrifit:currentProfit;
			minPrice=minPrice<arr[i]?minPrice:arr[i]; 
		}
		System.out.println(maxPrifit);
		
		
	}

}
