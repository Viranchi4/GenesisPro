package com.problem1;

import java.util.ArrayList;
import java.util.Scanner;

public class ProblemMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> scorers13 = new ArrayList<String>();
		ArrayList<String> scorers12 = new ArrayList<String>();
		System.out.println("Enter the top 5 scorers of IPL Season 13");
		for(int i=0;i<5;i++) {
			scorers13.add(input.nextLine());
		}
		System.out.println("Enter the top 5 scorers of IPL Season 12");
		for(int i=0;i<5;i++) {
			scorers12.add(input.nextLine());
		}
		
		scorers13.retainAll(scorers12);
		System.out.println("Consistent run scorers");
		for(String s:scorers13) {
			System.out.println(s);
		}
	}
}
