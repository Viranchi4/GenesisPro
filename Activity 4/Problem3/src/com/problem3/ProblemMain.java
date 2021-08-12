package com.problem3;

import java.util.Scanner;

public class ProblemMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("Enter the total runs scored");
			int runs = input.nextInt();
			System.out.println("Enter the total overs faced");
			int overs = input.nextInt();
			int runrate;
			runrate = runs/overs;
			System.out.println("Current Run Rate: "+runrate);
		}
		catch(Exception e) {
			System.out.println(e.getClass().getCanonicalName());
		}
	}
}
