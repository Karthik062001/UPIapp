package com.learn.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Supplierclass{

//	@Override
//	public String get() {
//	
//		return "Hi Good Mornning";
//	}
//	
	public static void main(String[]args)
	{
//		 Supplier<String> su=new Supplierclass();
//		 su.get();
//		 System.out.println(su.get());
		
//		Supplier<String> su=() -> "Hi Good Mornning";
//		System.out.println(su.get());
		
		List<String> list= Arrays.asList();
		System.out.println(list.stream().findAny().orElseGet(() -> "Hi Good Mornning"));
		
	}

}
