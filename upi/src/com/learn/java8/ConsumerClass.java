package com.learn.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerClass {


	public static void main(String []args)
	{
		Consumer<Integer> con=    (t)->{System.out.println("print "+t);
//		con.accept(45);
	};
	

	List<Integer>list=Arrays.asList(1,2,3,4,5);
	list.stream().forEach(t->System.out.println("print "+t));
}
}
