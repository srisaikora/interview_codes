package com.designpattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyUsingStreams {

	public static void main(String[] args) {
		
		ArrayList<String> strList = new ArrayList<>();
		strList.add("Red");
		strList.add("Red");
		strList.add("Black");
		strList.add("Yellow");
		strList.add("Red");
		strList.add("Yellow");
		
		HashMap<String,Long> freqMap = strList.stream().collect(Collectors.groupingBy(e->e,HashMap::new,Collectors.counting()));
		System.out.println(freqMap);
	}

}
