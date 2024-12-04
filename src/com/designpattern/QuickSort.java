package com.designpattern;

public class QuickSort {
	
	public static void main(String args[]) {
		int[] numList = {6,8,9,2,4,5};
		quickSort(numList,0,numList.length-1);
		for(int num:numList) {
			System.out.println(num);
		}
		System.out.println("Time complexity O(nlog(n))");
	}
	
	public static void quickSort(int[] arr,int low,int high) {
		
		if(low<high) {
			int pivot = partition(arr,low,high);
			quickSort(arr,low,pivot-1);
			quickSort(arr,pivot+1,high);
		}
	}
	
	public static int partition(int[] arr, int low,int high) {
		int pivot = arr[high];
		int i = low - 1;
		
		for(int j=low;j<high;j++) {
			if(arr[j]<pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		
		return i+1;
	}

}
