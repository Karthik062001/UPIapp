package com.learn.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.TreeMap;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeMain {

	public static void main(String[] args) {
		
		List<Employee>list=Arrays.asList(
				new Employee("Karan","WEB",23,45000,true),
				new Employee("vilas","Backend",35,145000,true),
				new Employee("vijay","frontEnd",22,35000,false),
				new Employee("karthik","Testing",36,115000,true),
				new Employee("harry","testing",45,155000,false),
				new Employee("Charan","Web",36,85000,true),
				new Employee("pavan","frontEnd",30,75000,false),
				new Employee("vijay","Backend",27,55000,true));
		
//		Filter only permanent employees who are older than 30.
		List<String>data=list.stream().filter(p->p.getAge()>30 && p.isPermanent).map(Employee::getName).collect(Collectors.toList());
		System.out.println(data);
		
//		Group them by department.
		Map<String, List<Employee>> data2=list.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		System.out.println(data2);
		
//		For each department:Get the number of employees.Get the average salary Get a comma-separated list of employee names in uppercase.
		Map<Object, Long> data3=list.stream().collect(Collectors.groupingBy(p->p.getDepartment().toLowerCase(),Collectors.counting()));
		System.out.println(data3);
		
		//Maximum lenth of the string
		 Optional<String> MaxnameLenth=list.stream().map(Employee::getName).max(Comparator.comparing(String::length));
		 System.out.println(MaxnameLenth);
		 
//		 Group employees by department and collect the names of employees in each department
		 Map<String, List<String>> group = list.stream()
				 .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.mapping(Employee::getName,Collectors.toList())));
		 System.out.println(group);
		 
//		 List the department without duplicate and in sorted order
		List<String> data5 = list.stream().map(Employee::getDepartment).distinct().sorted().limit(3).skip(1).collect(Collectors.toList());
		System.out.println(data5);
		
//		list.stream().parallel().filter(p->p.getSalary()>30000).peek(p->System.out.println(Thread.currentThread())).collect(Collectors.toList());
		
		
		
		

		 

		 
		

		
 
	}

}
