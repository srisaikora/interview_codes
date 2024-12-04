package com.designpattern;

public class PascalTriangle {
	public static void main(String[] args) {
		int length = 6; 
		for(int i=length;i>=1;i--) {
			for(int j=i;j<length - i ;j++) {
				System.out.print(" ");
			}
			System.out.print("1");
			for(int j=i;j<length - i ;j++) {
				System.out.print(" ");
			}
			System.out.println("");
		}
	}

}
