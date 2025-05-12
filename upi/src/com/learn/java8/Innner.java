package com.learn.java8;

import java.util.Scanner;

public class Innner {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Operation");
		char d=sc.next().charAt(0);
		
		Inter inr;
		inr=(a,b,c)->{
			
			switch(c) {
			case '+': System.out.println(a+b);
			break;
			case '-': System.out.println(a-b);
			break;
			case '*': System.out.println(a*b);
			break;
			case '/': System.out.println(a/b);
			
			}
		
		};
		inr.dispalya();
		inr.calculate(10, 39, d);
	}
}
