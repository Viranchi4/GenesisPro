package com.problem4;

import java.util.Scanner;

public class ProblemMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("Enter the number of overs");
			int overs = input.nextInt();
			int[] arr = new int[overs];
			System.out.println("Enter the number of runs for each over");
			for(int i=0;i<overs;i++) {
				arr[i] = input.nextInt();
			}
			System.out.println("Enter the over number");
			int index = input.nextInt();
			System.out.println("Runs scored in this over: "+arr[index-1]);
		}
		catch(Exception e) {
			System.out.println(e.getClass().getCanonicalName());
		}
	}
}
