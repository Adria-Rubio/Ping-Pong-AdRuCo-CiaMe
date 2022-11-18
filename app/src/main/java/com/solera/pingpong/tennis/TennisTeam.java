package com.solera.pingpong.tennis;

public class TennisTeam {
	String teamName, score;
	public TennisTeam(String name) {
		teamName = name;
		score = "0";
	}
	public void updateScore(String gameState) {
		if(score.equals("0")) {
			score = "15";
		}
		else if(score.equals("15")) {
			score = "30";
		}
		else if(score.equals("30")) {
			score = "40";
		}
		if(gameState.equals("advantage") && score.equals("40")) {
			score = "advantage";
		}
	}
	public void setScore(String newScore) {
		score = newScore;
	}
	public String getScore() {
		return score;
	}
}
