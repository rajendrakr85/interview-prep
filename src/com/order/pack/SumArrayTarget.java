package com.order.pack;

import java.util.HashMap;
import java.util.Map;

public class SumArrayTarget {

	public static void main(String[] args) {
		 int[] arr=new int[] {2, 7, 15, 11};
		 int target = 18;

		 int[]ind=findTarget(arr,target);
		 System.out.println(ind[0]+","+ind[1]);
	}
	
	static int[] findTarget(int[] arr,int target) {
		int[] finArr=new int[5];
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		for(int i=0; i<arr.length;i++){
			int sub=target-arr[i];
			if(map.containsKey(sub)){
				finArr= new int[]{map.get(sub),i};
			}
			map.put(arr[i],i);
		}
		return finArr;
	}

}
