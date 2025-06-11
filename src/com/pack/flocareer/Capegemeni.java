package com.pack.flocareer;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;


class Product {
    private String name;
    private String category;
    private double price;

    // Constructor, Getters and Setters

    public Product(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() { return name; }
    public String getCategory() { return category; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return name + " - " + price;
    }
}
public class Capegemeni {

	public static void main(String[] args) {
		  List<Product> products = List.of(
	        new Product("A", "Shoes", 100),
	        new Product("B", "Shoes", 200),
	        new Product("C", "Shoes", 150),
	        new Product("D", "Electronics", 400),
	        new Product("E", "Electronics", 350),
	        new Product("F", "Electronics", 300),
	        new Product("G", "Electronics", 400)  // duplicate max for testing
	    );
		  
		  

		  Map<String, Optional<Product>> secondCategory=products.stream()
				  .collect(Collectors.groupingBy(
						  Product::getCategory,
				  Collectors.collectingAndThen(
						  Collectors.toList(), 
						  list->list.stream()
								  .sorted(Comparator.comparingDouble(Product::getPrice).reversed())
								  .distinct()
								  .skip(1)
								  .findFirst()
					)
				  ));
	}

}
