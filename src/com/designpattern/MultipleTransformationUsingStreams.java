package com.designpattern;

import java.util.Arrays;
import java.util.List;

public class MultipleTransformationUsingStreams {
	public static void main(String[] args) {		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		
		double average = numbers.stream().filter(x->x%2 == 0).mapToDouble(x->x*2.0).average().orElse(0);
		
		System.out.println(average);
	}

}
