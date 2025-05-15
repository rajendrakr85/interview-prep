package com.order.pack;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class OrderLinkedList {

	public static void main(String[] args) {
			List<Order>orders=Order.getOrders();
			
			LinkedList<Order> lst=orders.stream().filter(s->s.getOrderType().equals("food")).collect(Collectors.toCollection(LinkedList::new));
			
			System.out.println(lst.getFirst().getQuantity());
	}

}
