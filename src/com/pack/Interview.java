package com.pack;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Interview {

	public static void main(String[] args) {
		List<Integer> al= Arrays.asList(10,30,22,23,56,278, 23, 55 , 24);
		
		System.out.println(al.stream()
				.map(no->String.valueOf(no))
				.filter(sno->sno.startsWith("2"))
				.collect(Collectors.toList()));
		
		System.out.println(al.stream()
				.collect(Collectors.averagingInt(Integer::valueOf)));
		
		System.out.println(System.currentTimeMillis());
		ExecutorService ex=Executors.newFixedThreadPool(50);
		ex.execute(new Runnable() {
			@Override
			public void run() {
				IntStream.range(1, 100).forEach(no->System.out.print(no +" "));
			}
		});
		ex.shutdown();
		System.out.println(System.currentTimeMillis());
		
		int[] arr=new int[] {0,0,1,0,2,2,0,1,2};
		sort012(arr);
		IntStream.of(arr).boxed().forEach(System.out::println);
		
		 
	}
	
	public static void sort012(int[] arr) {
        // code here
        int low=0,mid=0,high=arr.length-1;
        
        while(mid<=high) {
        	switch(arr[mid]) {
        	case 0:
        		swap(arr,low++,mid++);
        		break;
        	case 1:
        		mid++;
        		break;
        	case 2:
        		swap(arr,mid,high--);
        	}
        }
    }
	static void swap(int[] arr,int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

}
