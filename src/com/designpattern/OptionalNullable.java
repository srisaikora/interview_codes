package com.designpattern;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalNullable {
	
	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(2,4,8,1,3);
		System.out.println(Optional.ofNullable(numList).isPresent());
		List<Integer> numList1 = null;
		System.out.println(Optional.ofNullable(numList1).isPresent());
		List<Integer> numList2 = Arrays.asList(2,4,8,1,3);
		System.out.println(Optional.of(numList2).isPresent());
		//The below will throw null pointer because we are using Optional.of
		//We have a scenario where we will not get null values in that case we will be using Optional.of
		/*
		 * List<Integer> numList3 = null;
		 * System.out.println(Optional.of(numList3).isPresent());
		 */
		
		
		List<Integer> numList4 = Arrays.asList(2,4,8,1,3);
		Optional<List<Integer>> numList8 = Optional.ofNullable(numList4);
		List<Integer> numList9 = Optional.ofNullable(numList4).orElse(null);
		System.out.println(Optional.ofNullable(numList4).orElse(null));
		List<Integer> numList5 = null;
		System.out.println(Optional.ofNullable(numList5).orElse(null));
		List<Integer> numList6 = Arrays.asList(2,4,8,1,3);
		System.out.println(Optional.of(numList6).orElse(null));
		List<Integer> numList7 = null;
		System.out.println(Optional.of(numList7).orElse(null));
		
	}

}
