package com.problem3;

public class TestMatch extends Match {

	public TestMatch(int currentscore, int currentover, int target) {
		super(currentscore, currentover, target);
		// TODO Auto-generated constructor stub
	}

	float calculateRunRate() {
		return (getTarget() - getCurrentscore())/(90- getCurrentover());
	}
	
	int calculateBalls() {
		return (90 - getCurrentover())*6;
	}
	
	void display() {
		int runs = getTarget() - getCurrentscore();
		//float reqRunRate = (getTarget() - getCurrentscore())/(90- getCurrentover());
		//int balls = (90 - getCurrentover())*6;
		System.out.println("Need "+runs+" runs in "+calculateBalls()+" balls");
		System.out.println("Required Runrate: "+calculateRunRate());
	}
}
