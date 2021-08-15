package com.problem2;

import java.util.Comparator;

public class TeamComparator implements Comparator<Team> {

	@Override
	public int compare(Team team1, Team team2) {
		// TODO Auto-generated method stub
		int nameCompare = team1.name.compareTo(team2.name);
		//int matchCompare = team1.getNumberOfMatches().compareTo(team2.getNumberOfMatches());
		int matchCompare;
		if(team1.numberOfMatches==team2.numberOfMatches) {
			matchCompare = 0;
		}
		else if(team1.numberOfMatches>team2.numberOfMatches) {
			matchCompare = 1;
		}
		else {
			matchCompare = -1;
		}
		return (matchCompare==0)?nameCompare:matchCompare;
	}

}
