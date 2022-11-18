package com.solera.pingpong.tennis;
public class Tennis {
	public Tennis() {
		
	}
	public String displayScores(TennisTeam t1, TennisTeam t2) {
		if(t1.getScore().equals(t2.getScore())) {
			System.out.println("Score is even");
		}
		return"Score is " +t1.getScore() +":" + t2.getScore();
	}
}

