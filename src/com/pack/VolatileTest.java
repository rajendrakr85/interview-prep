package com.pack;

class Flag{
	
	volatile Boolean fdata = false;
	
	public void setData(Boolean data) {
		System.out.println("flag is set to true");
		this.fdata = data;
	}
	
	public Boolean  getData() {
		return this.fdata;
	}
}

public class VolatileTest {
	
	public static void main(String[] args) throws InterruptedException {
		Flag flag=new Flag();
		
		Thread thread1=new Thread(()->{
			try {
				Thread.sleep(1000);
				System.out.println("thread 1");
				flag.setData(true);
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		});
		
		Thread thread2=new Thread(()->{
			while(!flag.getData()){
				System.out.println("thread 2");
			}
		});
		
		thread1.start();
		thread2.start();
		
		thread1.join();
		thread2.join();
	}
}
