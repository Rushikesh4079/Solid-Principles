package com.example.sports;

public class SportsScoreApp {
    public static void main(String[] args) {
        ScoreBoard scoreBoard = new ScoreBoard();

        Sport football = new Football();
        Sport cricket = new Cricket();
        Sport tennis = new Tennis(); // New sport added without changing ScoreBoard

        scoreBoard.displayScore(football);
        scoreBoard.displayScore(cricket);
        scoreBoard.displayScore(tennis);
    }
}
