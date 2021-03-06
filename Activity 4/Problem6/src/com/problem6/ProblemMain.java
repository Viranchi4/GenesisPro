package com.problem6;

import java.util.ArrayList;
import java.util.Scanner;

public class ProblemMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> teams = new ArrayList<String>();
		teams.add("Chennai Super Kings");
		teams.add("Sun Risers Hyderabad");
		teams.add("Delhi Capitals");
		teams.add("Kings XI Punjab");
		teams.add("Kolkata Knight Riders");
		teams.add("Mumbai Indians");
		teams.add("Rajasthan Royals");
		teams.add("Royal Challengers Banglore");
		try {
			System.out.println("Enter expected winner team of IPL Season 13");
			String winteam = input.nextLine();
			if(teams.contains(winteam)==false) {
				throw new CustomException("TeamNotFoundException: Entered team is not a part of IPL Season 13");
			}
			System.out.println("Enter the expected runner team of IPL Season 13");
			String runteam = input.nextLine();
			if(teams.contains(runteam)==false) {
				throw new CustomException("TeamNotFoundException: Entered team is not a part of IPL Season 13");
			}
			System.out.println("Expected IPL Season 13 winner: "+winteam);
			System.out.println("Expected IPL Season 13 runner: "+runteam);
		}
		catch(CustomException e) {
			System.out.println(e.getMessage());
		}
	}
}
