package com.learn.java8;

import java.util.Arrays;
import java.util.List;

public class main {

	public static void main(String[] args) {
		
		List<Integer>value=Arrays.asList(4,5,6,7,8);
		value.forEach(i -> System.out.println(i));
	}

}
