package com.learn.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class JavaStreamSum {

	public static void main(String[] args) {
		
		//1Find the sum of all the element using stream
		List<Number> num=Arrays.asList(1,20.00,3,43.45,5);
		
		//int data0=num.stream().mapToInt(Integer::intValue).sum();
		
		double data=num.stream().mapToDouble(Number::doubleValue).sum();
		System.out.println(data);
		
		//2Given list of integer, write a program to find the max element using stream
		///int data1=num.stream().max(Comparator.naturalOrder()).get();
		
		OptionalDouble data2=num.stream().mapToDouble(Number::doubleValue).max();
		System.out.println(data2);
		
		//3count the no of string that starts with specific char
		List<String>car=Arrays.asList("Lamborgini","ferrori","ford","BMW","pagani","AstenMrtin","bentley");
		long data3=car.stream().filter(cars->cars.startsWith("b")).map(String::toUpperCase).count();
		System.out.println(data3);
		
		//4convert list string to uppercase
		car.stream().map(String::toUpperCase).forEach(System.out::println);
		
		//5filter the even numbers and count the number of element	ina list
		List<Integer> i=Arrays.asList(1,2,5,98,45,35,32,67,77,87,88);
		long data4=i.stream().filter(nums ->nums %2==0).count();
		System.out.println(data4);
		
		//6find the average of list floating point numbers
		List<Double>float1=Arrays.asList(1.6,2.58,3.1,6.1,5.45,6.78,7.56,7.56,8.67);
		Double data5=float1.stream().mapToDouble(Double::doubleValue).distinct().average().getAsDouble();
		System.out.println(data5);
		
		//7concate all the strings using stream
		List<String>string1=Arrays.asList("Hello","i","am","Karthik","am");
		String data6 =string1.stream().collect(Collectors.joining("*"));
		System.out.println(data6);
		
		//8Remove duplicate element in a list
		float1.stream().distinct().forEach(System.out::println);
		//String data7=string1.stream().distinct().forEach(System.out::println);
		//System.out.println(data7);
		
		//9 Sort the obj based on specific attribute using stream
		List<Person>men=Arrays.asList(
				new Person("karan",23),
				new Person("charan",45),
				new Person("pavan",56),
				new Person("vinay",34),
				new Person("kishan",28));
				
		//Collections.sort(men,Comparator.comparing(Person::getName));
		//System.out.println(men);
		men.stream().sorted(Comparator.comparing(Person::getAge)).forEach(System.out::println);
		
		//to check if all the elements in a list 
		List<Integer> ele=Arrays.asList(2,4,6,22,34,56,78);
		boolean data8=ele.stream().allMatch(element->element%2==0);
		System.out.println(data8);
		
	}

}
