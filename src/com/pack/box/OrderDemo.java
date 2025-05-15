package com.pack.box;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Order{
	int totalValue;
	LocalDateTime localDateTime;
	List<Product> productList;
	
	public Order(int totalValue, LocalDateTime localDateTime, List<Product> productList) {
		super();
		this.totalValue = totalValue;
		this.localDateTime = localDateTime;
		this.productList = productList;
	}

	public int getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(int totalValue) {
		this.totalValue = totalValue;
	}

	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}

	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
	
}
class Product{
	private String name;
	private String category;
	private Integer quantity;
	private Boolean inStock;
	public Product(String name, String category, Integer quantity, Boolean inStock) {
		super();
		this.name = name;
		this.category = category;
		this.quantity = quantity;
		this.inStock = inStock;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Boolean getInStock() {
		return inStock;
	}
	public void setInStock(Boolean inStock) {
		this.inStock = inStock;
	}
}
public class OrderDemo {

	public static void main(String[] args) {
		List<Order> list=new ArrayList<Order>();
		list.add(new Order(1500, LocalDateTime.now().minusHours(3), Arrays.asList(new Product("IPhone", "Electronics", 20, true),
				new Product("Headphone", "Electronics", 3, true),
				new Product("USB Cable", "Electronics", 10, false))));
		
		list.add(new Order(600, LocalDateTime.now().minusHours(5), Arrays.asList(new Product("Shocks", "Clothing", 1, false),
				new Product("T-shirt", "Clothing", 11, true),
				new Product("Jeans", "Clothing", 5, false))));
		
		list.add(new Order(400, LocalDateTime.now().minusHours(2), Arrays.asList(new Product("Blich", "Cosmetics", 8, true),
				new Product("Perfume", "Cosmetics", 4, false),
				new Product("Sunscreem", "Cosmetics", 6, true))));
		
		list.add(new Order(1000, LocalDateTime.now().minusHours(26), Arrays.asList(new Product("Loafer", "Footwear", 9, true),
				new Product("Sandle", "Footwear", 7, true),
				new Product("Sneaker", "Footwear", 2, true))));
		
		list.add(new Order(700, LocalDateTime.now().minusHours(1), Arrays.asList(new Product("Spoon", "Home & Kitchen", 20, true),
				new Product("Cookware Set", "Home & Kitchen", 3, true),
				new Product("Knife", "Home & Kitchen", 10, false))));
		
		Map<String, IntSummaryStatistics> mapOfCategoryAndQuality=list.stream()
				.filter(order->order.getLocalDateTime().isAfter(LocalDateTime.now().minusHours(24)))
				.filter(order->order.getTotalValue()>500)
				.flatMap(order->order.getProductList().stream())
				.filter(product->product.getInStock())
				.collect(Collectors.groupingBy(Product::getCategory,Collectors.summarizingInt(Product::getQuantity)));
				
		System.out.println(mapOfCategoryAndQuality);
	}

}
