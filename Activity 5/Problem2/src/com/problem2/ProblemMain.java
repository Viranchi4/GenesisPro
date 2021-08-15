package com.problem2;

import java.util.Scanner;

public class ProblemMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] arr = new int[n];
		int hundreds=0, fiftys=0;
		for(int i=0;i<n;i++) {
			arr[i] = input.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			if(arr[i]>=100) {
				hundreds++;
			}
			else if(arr[i]>=50) {
				fiftys++;
			}
		}
		
		System.out.println(fiftys);
		System.out.println(hundreds);
	}
}
