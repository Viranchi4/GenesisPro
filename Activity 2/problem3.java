import java.io.*;
import java.util.*;

class Innings{
	private String teamname;
	private String inningsname;
	private int runs;
	
	public String getTeamname(){
		return teamname;
	}
	public void setTeamname(String newTeamname){
		this.teamname = newTeamname;
	}
	
	public String getInningsname(){
		return inningsname;
	}
	public void setInningsname(String newInningsname){
		this.inningsname = newInningsname;
	}
	
	public int getRuns(){
		return runs;
	}
	public void setRuns(int newRuns){
		this.runs = newRuns;
	}
	
	public void displayInningsDetails(){
		System.out.println("Name: "+teamname);
		System.out.println("Scored: "+runs);
		System.out.println("Session: "+inningsname);
	}
}

class InningsMain{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the team name:");
		String teamname = input.nextLine();
		System.out.println("Enter session:");
		String session = input.nextLine();
		System.out.println("Enter runs:");
		int runs = input.nextInt();
		
		Innings inn = new Innings();
		inn.setTeamname(teamname);
		inn.setInningsname(session);
		inn.setRuns(runs);
		inn.displayInningsDetails();
	}
}