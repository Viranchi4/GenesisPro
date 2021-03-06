package com.problem1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProblemMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Player> player = new ArrayList<Player>();
		System.out.println("Please provide the number of players to be registered");
		int n = input.nextInt();
		input.nextLine();
		for(int i=0;i<n;i++) {
			System.out.println("Please enter player name");
			String name = input.nextLine();
			System.out.println("Please select the skill of the player");
			System.out.println("1.All Rounder");
			System.out.println("2.Batsman");
			System.out.println("3.Bowler");
			int s = input.nextInt();
			input.nextLine();
			String skill = "";
			switch(s) {
			case 1:
				skill = "All Rounder";
				break;
			case 2:
				skill = "Batsman";
				break;
			case 3:
				skill = "Bowler";
				break;
			}
			//Player obj = new Player(name,skill);
			player.add(new Player(name, skill));
		}
		
		/*Player obj1 = new Player("MS Dhoni", "Batsman");
		Player obj2 = new Player("Virat Kohli", "Batsman");
		Player obj3 = new Player("Ravindra Jadeja", "All Rounder");
		Player obj4 = new Player("Kapil Dev", "All Rounder");
		
		player.add(obj1);
		player.add(obj2);
		player.add(obj3);
		player.add(obj4);*/
		Collections.sort(player, new PlayerComparator());
		
		for(Player s:player) {
			System.out.println("Player: "+s.name+", Skill: "+s.skill);
		}
	}
}
