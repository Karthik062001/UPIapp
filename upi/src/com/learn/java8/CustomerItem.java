package com.learn.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerItem {

	public static void main(String[] args) {
		
//		List<Item> itm=Arrays.asList(
//				new Item("Samsung",1,34000),
//				new Item("Apple",2,1340000),
//				new Item("Vivo",1,24000),
//				new Item("Nothing",1,30000));
		
		List<Order> ord = Arrays.asList(
				new Order("23JH78900NB", "Vishal", Arrays.asList(new Item("Samsung", 1, 34000),new Item("Apple", 2, 1340000))),
				new Order("34HP7800G34", "Charan", Arrays.asList(new Item("Apple", 2, 1340000),new Item("Vivo", 1, 24000))),
				new Order("34GH780FT345", "Hemanth", Arrays.asList(new Item("Vivo", 1, 24000),new Item("Nothing", 1, 30000))),
				new Order("34HP7800G34", "Charan", Arrays.asList(new Item("Apple", 2, 1340000))),
				new Order("34HP7800G34", "Charan", Arrays.asList(new Item("Apple", 2, 1340000))),
				new Order("34HP7800G34", "Charan", Arrays.asList(new Item("Apple", 2, 1340000))),
				new Order("45LK678NJ23", "Karthik", Arrays.asList(new Item("Nothing", 1, 30000))));

		//finding the total revenue across all orders
		Double data1=ord.stream().flatMap(ordr->ordr.getItems().stream()).mapToDouble(Item::getPricePerUnit).sum();
		System.out.println(data1);
		System.out.println(" ");
                          
		//getting list of item names that have
		Map<Object, List<String>> data3=ord.stream().flatMap(ordr->ordr.getItems().stream().map(Item::getItemName)).collect(Collectors.groupingBy(data->data,Collectors.toList()));
		System.out.println(data3);
		System.out.println(" ");
		
		//getting the item list based on the customer name
		Map<String, List<Object>> data4=ord.stream().collect(Collectors.groupingBy(Order::getCustomerName,Collectors.flatMapping(ordr->ordr.getItems().stream().map(Item::getItemName), Collectors.toList())));
		System.out.println(data4);
		System.out.println(" ");
	
//		ord.stream().collect(Collectors.groupingBy())
		
		Map<String,String>map1=new HashMap();
		map1.put("name", "Karthik");
		map1.put("age", "20");
		map1.put("salary", "23000");
		
		Map<String,String>map2=new HashMap();
		map2.put("name", "Hemanth");
		map2.put("age", "22");
		map2.put("salary", "20000");
		
		ArrayList<Map<String,String>> list=new ArrayList();
		list.add(map1);
		list.add(map2);
		
	   list.stream().map(m -> m.get("name")).forEach(System.out::println);
//		map1.entrySet().stream().filter(p->p.getKey()).collect(Collectors.toList());
	
		
//		List<Object> data5 = list.stream().collect(Collectors.filtering(p->p.equals(map1), Collectors.toList()));
//		System.out.println(data5);
		
		
	}

}
