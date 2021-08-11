package com.problem3;

public class ODIMatch extends Match {

	public ODIMatch(int currentscore, int currentover, int target) {
		super(currentscore, currentover, target);
		// TODO Auto-generated constructor stub
	}

	float calculateRunRate() {
		return (getTarget() - getCurrentscore())/(50- getCurrentover());
	}
	
	int calculateBalls() {
		return (50 - getCurrentover())*6;
	}
	
	void display() {
		int runs = getTarget() - getCurrentscore();
		//float reqRunRate = (getTarget() - getCurrentscore())/(50- getCurrentover());
		//int balls = (50 - getCurrentover())*6;
		System.out.println("Need "+runs+" runs in "+calculateBalls()+" balls");
		System.out.println("Required Runrate: "+calculateRunRate());
	}
}
