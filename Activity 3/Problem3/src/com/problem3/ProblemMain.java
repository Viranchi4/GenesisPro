package com.problem3;

import java.util.Scanner;

public class ProblemMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the match format");
		System.out.println("1. ODI");
		System.out.println("2. T20");
		System.out.println("3. Test");
		int x = input.nextInt();
		switch(x) {
		case 1:
			System.out.println("Enter the current score");
			int score = input.nextInt();
			System.out.println("Enter the current over");
			int over = input.nextInt();
			System.out.println("Enter the target score");
			int target = input.nextInt();
			Match match = new ODIMatch(score, over, target);
			match.display();
			break;
		case 2:
			System.out.println("Enter the current score");
			int score2 = input.nextInt();
			System.out.println("Enter the current over");
			int over2 = input.nextInt();
			System.out.println("Enter the target score");
			int target2 = input.nextInt();
			Match match2 = new T20Match(score2, over2, target2);
			match2.display();
			break;
		case 3:
			System.out.println("Enter the current score");
			int score3 = input.nextInt();
			System.out.println("Enter the current over");
			int over3 = input.nextInt();
			System.out.println("Enter the target score");
			int target3 = input.nextInt();
			Match match3 = new TestMatch(score3, over3, target3);
			match3.display();
			break;
		}
	}
}
