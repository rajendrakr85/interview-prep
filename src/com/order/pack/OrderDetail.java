package com.order.pack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class OrderDetail{
	public static void main(String... ar) {
		Integer count=Order.getOrders().stream().filter(ord->ord.getOrderType().equals("food"))
				.collect(Collectors.summingInt(Order::getQuantity));
		System.out.println(count);
	}
}
