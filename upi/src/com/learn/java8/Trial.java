package com.learn.java8;

@FunctionalInterface
public interface Trial {
	
	 void show();
     
}

class Trial1
{
	public void demo()
	{
	Trial t=()->System.out.println("My hello");
	}
	
	
}

class demo
{
	public static void main(String[]args)
	{
		Trial1 t=new Trial1();
		t.demo();
		
	}
}
