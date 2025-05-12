package com.learn.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingPeople {

	public static void main(String []args)
	{
		List<Person>people=Arrays.asList(
				new Person("karan",84),
				new Person("vinay",24),
				new Person("chetan",26),	
				new Person("prakash",36));
		
		Collections.sort(people,   ( o1,  o2)-> Integer.compare(o2.getAge(), o1.getAge()));

//			@Override
//			public int compare(Person o1, Person o2) {
//				
//				//return o1.getName().compareTo(o2.getName());
//				return Integer.compare(o1.getAge(), o2.getAge());
//			}
	
		for(Person p:people)
		{
			System.out.println(p);
		}
	}
}
//public int compare(Person o1, Person o2) {
//	
//	return o1.getName().compareTo(o2.getName());
//	return Integer.compare(o1.getAge(), o2.getAge());
