package com.designpattern;

class SortingContext {
	private SortingStrategy sortingStratergy;

	public SortingStrategy getSortingStratergy() {
		return sortingStratergy;
	}

	public void setSortingStratergy(SortingStrategy sortingStratergy) {
		this.sortingStratergy = sortingStratergy;
	}
	
	public void sorting() {
		this.sortingStratergy.sort();
	}
}

interface SortingStrategy {
	public void sort();
}

class BubbleSorting implements SortingStrategy {

	@Override
	public void sort() {
		System.out.println("Bubble sort");
	}
	
}

class MergeSorting implements SortingStrategy {

	@Override
	public void sort() {
		System.out.println("Merge sort");
		
	}
	
}

public class StratergyDesignPattern {

	public static void main(String[] args) {
		SortingContext sortingContext = new SortingContext();
		sortingContext.setSortingStratergy(new BubbleSorting());
		sortingContext.sorting();
	}
}
