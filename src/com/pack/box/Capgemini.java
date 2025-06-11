package com.pack.box;

import java.util.ArrayList;
import java.util.List;

public class Capgemini {

	public static void main(String[] args) {
		int[] arr=new int[] {1,2,3,4,5,6}; //  1,3,6,10,15,21
		
		int[]arr2=new int[arr.length];
		
		int sum=0;
		for(int c=0,j=1;c<arr.length;c++,j++) {	
			sum=sum+arr[c];
			arr2[c]=sum;
		}
		
		for(int i=0;i<arr2.length;i++)
			System.out.print(arr2[i] +" ");
		
		
		System.out.println();
		
		int[] arr3=new int[]{1,2,3, 2,3,4,5, 3,4,5,6,7, 1,2,3};
		int maxLength=1;
		int currentLen=1,startIndex=0,maxStartIndex=0;
		
		for(int i=1;i<arr3.length-1;i++) {
			if(arr3[i]==arr3[i-1]+1) {
				currentLen++;
				if(currentLen>maxLength) {
					maxLength=currentLen;
					maxStartIndex=startIndex;
				}
			}else {
				currentLen=1;
				startIndex=i;
			}
		}
		
		for(int i=maxStartIndex;i<maxStartIndex+maxLength;i++) {
			System.out.print(arr3[i]+" ");
		}
		
		System.out.println();
		int x=0,y=1,z=0;
		while(z<100) {
			z=x+y;
			System.out.print(z+" ");
			y=z;
			x=y;
		}
		
	}

}
