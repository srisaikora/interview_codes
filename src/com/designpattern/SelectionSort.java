package com.designpattern;

public class SelectionSort {

	public static void main(String[] args) {
		long begin = System.currentTimeMillis();
		Integer[] numList = {6,8,9,2,4,5};
		int index;
		for(int i=0;i<numList.length-1;i++) {
			index = i;
			for(int j=i+1;j<numList.length;j++) {
				if(numList[index]>numList[j]) {
					index = j;
				}
			}
			int temp = numList[i];
			numList[i] = numList[index];
			numList[index] = temp;
		}
		
		for(int i=0;i<numList.length;i++) {
			System.out.println(numList[i]);
		}
		System.out.println("Time Complexity: O(n^2)");
		long end = System.currentTimeMillis();
		System.out.println(end-begin);
	}

}
