package com.learn.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CarTaskMain {

	public static void main(String[] args) {
		
		List<CarTask> car=Arrays.asList(
				new CarTask("M5","BMW",21450000) ,
				new CarTask("Huracan","Lamborgini",22250000) ,
				new CarTask("Harrier","Tata",2450000) ,
				new CarTask("M8","BMW",21450000) ,
				new CarTask("Aventador","Lamborgini",22250000) ,
				new CarTask("X5","BMW",21450000),
				new CarTask("Safari","Tata",2450000) ,
				new CarTask("XUV700","Mahidra",2550000) ,
		        new CarTask("Scorpio","Mahidra",2550000) );
		
		
		//Map<String, List<CarTask>> data = car.stream().collect(Collectors.groupingBy(CarTask::getCBrand));
		Set<CarTask> data=car.stream().sorted(Comparator.comparing(CarTask::getCBrand)).collect(Collectors.toSet());
		//List<CarTask> data1 = car.stream().filter(d -> d.getCBrand().equalsIgnoreCase("Tata")).collect(Collectors.toList());		
				//.sorted(Comparator.comparing(CarTask::getCBrand)).
		List<CarTask> data1 = car.stream().filter(d -> d.getPrice()>2440000 && d.getCarname().startsWith("S")).collect(Collectors.toList());
		//System.out.println(data);
		System.out.println(" ");
		System.out.println(data1);
		
		System.out.println(" ");
		
	
		
		
	//	ListByName(data1);  
	}
	
	public static void ListByName(List<CarTask> car)
	{
		System.out.println("List of cars by name ");
		//List<CarTask> data1=car.stream().filter(cars->cars.getCBrand().equalsIgnoreCase(name)).collect(Collectors.toList());
		//System.out.println(data1)
	}
}