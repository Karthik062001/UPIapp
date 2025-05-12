package com.learn.java8;

import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.a.TracingPacketReader;

public class ParallelStream {

	public static void main(String[] args) {
	
		List<Integer> numbers = new ArrayList();
		for (int i = 1; i <= 100; i++) {
		    numbers.add(i);
		    
		  Long data=  numbers.stream().parallel().filter(n->n%2==0).map(Integer::intValue).count();
		  System.out.println(data);
		 
		}

	}

}
