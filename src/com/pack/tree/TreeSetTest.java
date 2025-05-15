package com.pack.tree;

import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

import com.order.pack.Order;
import com.order.pack.OrderDetail;

public class TreeSetTest {

	public static void main(String[] args) {
			List<Order>ordserSet=Order.getOrders();
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
			
			TreeSet<Integer>treeSet=new TreeSet<Integer>();
			treeSet.add(22);
			treeSet.add(40);
			treeSet.add(28);
			treeSet.add(84);
			treeSet.add(83);
			treeSet.add(29);
			treeSet.add(56);
			treeSet.add(76);
			treeSet.add(23);
			treeSet.add(54);
			
			System.out.println(treeSet);
			
			System.out.println(treeSet.ceiling(70));//return nearest greater then or equal or null
			System.out.println(treeSet.first()+" "+treeSet.getFirst());
			
			TreeSet<Order>orderSet=new TreeSet<Order>();
			orderSet.add(o1);orderSet.add(o2);
			orderSet.add(o3);orderSet.add(o4);
			orderSet.add(o5);orderSet.add(o5);
			orderSet.add(o7);orderSet.add(o8);
			orderSet.add(o9);orderSet.add(o10);
			
			//orderSet.forEach(order->System.out.println(order.getOrderid()+" "+order.getOrderType()));
			//orderSet.stream().sorted().forEach(order->System.out.println(order.getOrderid()+" "+order.getOrderType()));
			orderSet.stream().sorted(Comparator.reverseOrder())
			.forEach(order->System.out.println(order.getOrderid()+" "+order.getOrderType()));
			
			
			
	}

}
