package com.learn.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicateclass  {

//	@Override
//	public boolean test(Integer t) {
//		if (t % 2 == 0) {
//			return true;
//		} else {
//			return false;
//		}
	

	public static void main(String[] args) {
//		Predicateclass pc = new Predicateclass();
//		boolean data = pc.test(4);
//		System.out.println(data);

//		Predicate<Integer> pd=( t) ->{
//			if (t % 2 == 0) {
//				return true;
//			} else {
//				return false;
//			}
//	};
//		Predicate<Integer> pd = t -> t % 2 == 0;
//		System.out.println(pd.test(4));
//		
		List<Integer>list=Arrays.asList(1,2,3,4,5);
		 list.stream().filter(t -> t % 2 == 0).forEach(t->System.out.println("Print Even "+t));

	}
}
