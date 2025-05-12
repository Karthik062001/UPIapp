package com.learn.java8;

public interface Inter {

	void calculate(int a,int b,char c);
	default void dispalya()
	{
		System.out.println("result");
	}
}
