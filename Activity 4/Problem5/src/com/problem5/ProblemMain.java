package com.problem5;

import java.util.Scanner;

public class ProblemMain {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the player name");
		String name = input.nextLine();
		System.out.println("Enter the player age");
		int age = input.nextInt();
		try {
			if(age<19) {
				throw new CustomException("CustomException: InvalidAgeRangeException");
			}
			else {
				System.out.println("Player name: "+name);
				System.out.println("Player age: "+age);
			}
			
		}
		catch(CustomException e) {
			System.out.println(e.getMessage());
		}
	}
}
