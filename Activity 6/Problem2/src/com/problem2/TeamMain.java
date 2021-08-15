package com.problem2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TeamMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Team> team = new ArrayList<Team>();
		System.out.println("Enter number of teams:");
		int n = input.nextInt();
		input.nextLine();
		for(int i=0;i<n;i++) {
			System.out.println("Enter team"+(i+1)+" detail");
			System.out.println("Enter Name");
			String name = input.nextLine();
			System.out.println("Enter number of matches");
			long matches = input.nextLong();
			input.nextLine();
			team.add(new Team(name, matches));
		}
		
		Collections.sort(team, new TeamComparator());
		System.out.println("Team list after sort by number of matches");
		for(Team t:team) {
			System.out.println(t.name+" - "+t.numberOfMatches);
		}
	}
}
