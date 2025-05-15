package com.pack;

import java.util.Arrays;

public class ArrayProduct {

	public static void main(String[] args) {
		int[] result=productArray(new int[]{1,2,3,4});
		for(int i: result) {
			System.out.println(i);
		}
	}
	
	public static int[] productArray(int[] nums) {
		int[] result = new int[nums.length];
		Arrays.fill(result, 1);
		
		int pre=1, post=1;
		
		for(int i=0;i<nums.length;i++) {
			result[i] = pre;
			pre=nums[i]*pre;
		}
		
		for(int i=nums.length-1;i>=0;i--) {
			result[i]=result[i]*post;
			post=post*nums[i];
		}
		return result; 
	}
}
