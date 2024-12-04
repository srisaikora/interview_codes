package com.designpattern;

public class BinarySearchTree {
	
	public static void main(String args[]) {
		Integer[] numList = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,16,17,18,19,20};
		binarySearch(0,numList.length,numList);
	}
	
	public static void binarySearch(int startNum,int endNum,Integer[] numList) {
		int midNum = (startNum + endNum)/2;
		if(midNum == numList[midNum]) {
			startNum = midNum;
			binarySearch(startNum,endNum,numList);
		} else if(midNum == numList[midNum-1]) {
			endNum = midNum;
			binarySearch(startNum,endNum,numList);
		} else {
			System.out.println(midNum);
		}
	}

}
