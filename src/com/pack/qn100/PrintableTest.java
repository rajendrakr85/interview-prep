package com.pack.qn100;

public class PrintableTest {

	public static void main(String[] args) {

		try {
			new Thread(()->{
				new PrintableTest().printTable(2);
			}).start();
			
			new Thread(()->{
				new PrintableTest().printTable(3);
			}).start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void printTable(int n) {
			try {
				for(int i=1;i<=10;i++) {
					System.out.println(n+" * "+i+" = "+(n*i));
					Thread.sleep(1000);
				}
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
	}

}
