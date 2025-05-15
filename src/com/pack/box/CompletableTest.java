package com.pack.box;

import java.util.concurrent.CompletableFuture;

public class CompletableTest {

	public static void main(String[] args) {
		CompletableFuture<String>future=CompletableFuture.supplyAsync(()->{return "hello world!";});
		
		future.thenAccept(result->{
			System.out.println("Result :"+result);
		});
		
		CompletableFuture<String>nameFuture=CompletableFuture.supplyAsync(()->{return "Rajendra";});
		CompletableFuture<Integer>ageFuture=CompletableFuture.supplyAsync(()->{return 40;});
		
		CompletableFuture<String>combined=nameFuture.thenCombine(ageFuture,(name,age)->{
			return name +" is "+age+" years old";
		});
		
		combined.thenAccept(result->System.out.print(result));
		
		System.out.println();
		
		CompletableFuture<String>exfuture=CompletableFuture.supplyAsync(()->{
			if(true)
				throw new RuntimeException("Something went wrong!");
			return "Success";
		}).handle((result,ex)->{
			if(ex!=null) {
				System.out.println(ex.getMessage());
				return "Recovered";
			}
			return result;
		}).exceptionally(ex->{
			System.out.println("Exception :"+ex.getMessage());
			return "fallback value";
		});
		
		exfuture.thenAccept(result->{
			System.out.println(result);
		});
	}

}
