package com.learn.java8;

@FunctionalInterface
public interface Trial2 {

	void show();
		default void hello()
		{
			System.out.println("d hello");
		}

}



