package com.pack;

import java.util.HashMap;

public class FindTargetNumber {

	public static void main(String[] args) {
		int[] indices={3,2,7,6,5};
		int[] indi=targetIndices(indices,9);
		System.out.println(indi[0]+" "+indi[1]);
	}
	static int[] targetIndices(int[] numbers, int target) {
		HashMap<Integer,Integer>indices=new HashMap<Integer, Integer>();
		for(int i=0;i<numbers.length;i++) {
			int compliment = target - numbers[i];
			if(indices.containsKey(compliment)) {
				return new int[] {indices.get(compliment),i};
			}
			indices.put(numbers[i], i);
		}
		return new int[]{};
	}
}	
