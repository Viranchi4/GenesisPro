package com.problem3;

public class T20Match extends Match {

	public T20Match(int currentscore, int currentover, int target) {
		super(currentscore, currentover, target);
		// TODO Auto-generated constructor stub
	}

	float calculateRunRate() {
		return (getTarget() - getCurrentscore())/(20- getCurrentover());
	}
	
	int calculateBalls() {
		return (20 - getCurrentover())*6;
	}
	
	void display() {
		int runs = getTarget() - getCurrentscore();
		//float reqRunRate = (getTarget() - getCurrentscore())/(20 - getCurrentover());
		//int balls = (20 - getCurrentover())*6;
		System.out.println("Need "+runs+" runs in "+calculateBalls()+" balls");
		System.out.println("Required Runrate: "+calculateRunRate());
	}
}
