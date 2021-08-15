package com.problem3;

import java.util.Collections;
import java.util.List;

public class Team {

	private String name;
	private List<Player> playerList;
	
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
		this.name = playername;
	}
}
