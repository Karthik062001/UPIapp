package com.learn.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NewEmpMain {

	public static void main(String[] args) {
		
		List<String> emp=Arrays.asList();
		
		
		Stream<String> stream=Stream.of("appale","banana","orenge","chuku");
		List<String> data=Stream.generate(()->"hello").limit(4).collect(Collectors.toList());
		System.out.println(data);
		
		String[] data1 = stream.toArray(String[]::new);
		System.out.println(java.util.Arrays.toString(data1));
		
		List<Integer>list=Arrays.asList(14,35,67,12,45,97,43,56,12,5,34,7,2,6,4,78,90,4);
		
		List<Integer> data2 = list.stream().takeWhile(p->p%2==0).collect(Collectors.toList());
		System.out.println(data2);
		
		List<Integer> data3 = list.stream().dropWhile(p->p%2==0).collect(Collectors.toList());
		System.out.println(data3);
		
		
	

	}

}
