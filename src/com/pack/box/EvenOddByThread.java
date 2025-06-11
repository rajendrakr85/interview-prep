package com.pack.box;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EvenOddByThread {

	public static volatile boolean isOddEven=true;
	public static void main(String[] args) {
		ExecutorService executer=Executors.newFixedThreadPool(2);
		
		Boolean isOddEven=true;
		Runnable printOdd=()->{
			for(int i=1;i<20;i=i+2) {
				synchronized (EvenOddByThread.class) {
					while(!isOddEven) {
						try {
							EvenOddByThread.class.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					System.out.println("Odd Number :"+i+"-"+Thread.currentThread().getName());
					EvenOddByThread.class.notify();
				}
			}
		};
		
		Runnable printEven=()->{
			for(int i=2;i<20;i=i+2) {
				synchronized (EvenOddByThread.class) {
					while(!isOddEven) {
						try {
							EvenOddByThread.class.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					System.out.println("Odd Number :"+i+"-"+Thread.currentThread().getName());
					EvenOddByThread.class.notify();
				}
			}
		};
		
		executer.submit(printOdd);
		executer.submit(printEven);
	}

}
