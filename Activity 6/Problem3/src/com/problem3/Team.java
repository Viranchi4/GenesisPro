package com.problem3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.naming.NameAlreadyBoundException;

public class Team implements Comparable<Team> {

	private String name;
	private List<Player> playerList = new ArrayList<Player>();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Player> getPlayerList() {
		Collections.sort(playerList);
		return playerList;
	}
	public void setPlayerList(List<Player> playerList) {
		this.playerList = playerList;
	}
	
	public Team(String name) {
		super();
		this.name = name;
	}
	
	public void addPlayer(String playername) {
		this.playerList.add(new Player(playername));
	}
	
	public int compareTo(Team t) {
		// TODO Auto-generated method stub
		return this.name.compareTo(t.name);
	}
	
}
