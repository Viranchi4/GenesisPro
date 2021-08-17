package com.problem3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class DisplayTeamMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.nextLine();
		
		List<Team> team = new ArrayList<Team>();
		List<Player> player = new ArrayList<Player>();
		for(int i=0;i<n;i++) {
			String str = input.nextLine();
			String[] arr = str.split("\\|");
			String team_name = arr[0];
			String player_name = arr[1];
			Team obj = new Team(team_name);
			int flag=0;
			
			if(team.isEmpty()) {
				obj.addPlayer(player_name);
				team.add(obj);
				System.out.println("When empty added!");
			}
			else {
				for(Team t:team) {
					if(t.getName().equals(team_name)) {
						t.addPlayer(player_name);
						int k = team.indexOf(t);
						team.set(k, t);
						System.out.println("Updated at index="+k);
						flag=1;
						break;
					}
				}
				if(flag==0) {
					obj.addPlayer(player_name);
					team.add(obj);
					System.out.println("New Added!");
				}
			}
		}//input done
		
		
		Collections.sort(team);
		System.out.println(team);
		for(Team t:team) {
			System.out.println(t.getName()+"- ");
			for(Player playerName:t.getPlayerList()) {
				System.out.println("--"+playerName.getName());
			}
		}
		
	}
}
