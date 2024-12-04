package com.designpattern;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class InsertionSort {
	public static void main(String args[]) {
		long begin = System.currentTimeMillis();
		Integer[] numList = {3,6,2,1,5};
		
		for(int i=1;i<numList.length;i++) {
			int tempVal = numList[i];
			for(int j=i-1;j>=0;j--) {
				if(tempVal<numList[j]) {
					numList[j+1] = numList[j];
					numList[j] = tempVal;
				}
			}
		}
		for(int i=0;i<numList.length;i++) {
			System.out.println(numList[i]);
		}
		System.out.println("Time Complexity: O(n^2)");
		long end = System.currentTimeMillis();
		System.out.println(end-begin);
	}
}
