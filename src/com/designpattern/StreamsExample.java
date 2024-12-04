package com.designpattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsExample {
	public static void main(String[] args) {
	List<Integer> numList = Arrays.asList(2,4,6,3,1,8); 
	//Average
	Double averageNum = numList.stream().mapToDouble(x->x).average().orElse(0.0);
	System.out.println(averageNum);
	
	List<String> strList = Arrays.asList("sai","kora","test","sai","kora");
	// Convert string to uppercase
	strList.stream().map(x->x.toUpperCase()).forEach(x->System.out.println(x));
	
	//Sum of all even numbers
	Integer sumOfAllEven = numList.stream().filter(x->x%2 == 0).mapToInt(x->x).sum();
	System.out.println(sumOfAllEven);
	
	//Remove duplicate
	List<String> nonDuplicateList = strList.stream().distinct().collect(Collectors.toList());
	//Set<String> nonDuplicateList = strList.stream().collect(Collectors.toSet());
	System.out.println(nonDuplicateList);
	
	//Count number of strings starting with specific number
	Long numberOfStringCount = strList.stream().filter(x->x.startsWith("s")).count();
	System.out.println(numberOfStringCount);
	System.out.println("----------------");
	//Sort list of string using Streams desc
	strList.stream().sorted().forEach(x->System.out.println(x));
	System.out.println("----------------");
	//Sort list of string using Streams asc
	strList.stream().sorted(Comparator.reverseOrder()).forEach(x->System.out.println(x));
	
	//Maximum Number
	Integer maxNumber = numList.stream().max((a,b)->Integer.compare(a, b)).orElse(null);
	System.out.println(maxNumber);
	
	//second largest number
	Integer secondLargestNum = numList.stream().sorted().skip(1).findFirst().orElse(0);
	System.out.println(secondLargestNum);
	}
}
