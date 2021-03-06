package com.problem3;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class DisplayTeamMain2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		TreeMap<String, Team> map = new TreeMap<String, Team>();
		int n = input.nextInt();
		input.nextLine();
		for(int i=0;i<n;i++) {
			String str = input.nextLine();
			String[] arr = str.split("\\|");
			String team_name = arr[0];
			String player_name = arr[1];
			if(map.containsKey(team_name)) {
				Team team = map.get(team_name);
				team.addPlayer(player_name);
			}
			else {
				Team team = new Team(team_name);
				team.addPlayer(player_name);
				map.put(team_name, team);
			}
		}
		System.out.println("Team and Players in ascending order");
		for(Entry<String, Team> entry:map.entrySet()) {
			System.out.println(entry.getKey());
			for(Player playerName:entry.getValue().getPlayerList()) {
				System.out.println("--"+playerName.getName());
			}
		}
	}
}
