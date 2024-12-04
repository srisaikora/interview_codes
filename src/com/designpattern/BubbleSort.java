package com.designpattern;

public class BubbleSort {

	public static void main(String[] args) {
		long begin = System.currentTimeMillis();
		Integer[] numList = {6,8,9,2,4,5};
		for(int i=0;i<numList.length;i++) {
			for (int j=0;j<numList.length-i-1;j++) {
				if(numList[j] > numList[j+1]) {
					int tempVal = numList[j];
					numList[j] = numList[j+1];
					numList[j+1] = tempVal;
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
