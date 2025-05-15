package com.order.pack;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Order implements Comparable<Order>{
	int orderid;
	String orderType;
	int quantity;
	
	public Order(int orderid, String orderType, int quantity) {
		super();
		this.orderid = orderid;
		this.orderType = orderType;
		this.quantity = quantity;
	}

	public int getOrderid() {
		return orderid;
	}

	public String getOrderType() {
		return orderType;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(orderid,orderType.hashCode(),quantity);
	}
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj.toString());
	}
	
	@Override
	public int compareTo(Order order) {
		return this.orderType.compareTo(order.getOrderType());
	}
	
	public static List<Order>getOrders(){
		Order o1=new Order(101,"food",50);
		Order o2=new Order(102,"soap",40);
		Order o3=new Order(103,"medicin",510);
		Order o4=new Order(104,"cloths",60);
		Order o5=new Order(105,"toy",20);
		Order o6=new Order(106,"electronics",150);
		Order o7=new Order(107,"decor",80);
		Order o8=new Order(108,"food",10);
		Order o9=new Order(109,"health",30);
		Order o10=new Order(110,"assessories",80);
		
		List<Order> orders=new ArrayList<Order>();
		orders.add(o1);orders.add(o2);
		orders.add(o3);orders.add(o4);
		orders.add(o5);orders.add(o5);
		orders.add(o7);orders.add(o8);
		orders.add(o9);orders.add(o10);
		return orders;
	}

	
}