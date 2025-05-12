package com.learn.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Foreach {

	public static void main(String[] args) {
		
		List<String>list=new ArrayList();
		list.add("hello");
		list.add("i");
		list.add("am");
		list.add("karthik");
		
//		for(String s:list)
//		{
//			System.out.println(s);
//		}
		list.stream().forEach( s-> System.out.println(s));
		
		
		Map<Integer,String>map=new HashMap();
				map.put(1, "karthik");
				map.put(2, "charan");
				map.put(3, "vikas");
				
//				map.forEach((K,V)->System.out.println(K+" "+V));
				map.entrySet().stream().forEach( s-> System.out.println(s));
				
	}

}
