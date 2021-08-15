package com.problem3;

import java.util.HashSet;
import java.util.Scanner;

public class ProblemMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HashSet<String> player = new HashSet<String>();
		int n = input.nextInt();
		input.nextLine();
		for(int i=0;i<n;i++) {
			player.add(input.nextLine());
		}
		int count=0;
		for(String s:player) {
			count++;
		}
		System.out.println(count);
	}
}
