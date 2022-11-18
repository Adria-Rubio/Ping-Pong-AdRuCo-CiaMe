package com.solera.pingpong.adrucociamer.rockpaperscisors;

import java.util.HashMap;
import java.util.Scanner;

public class RockPaperScissorsGame {

    public enum Move {
        ROCK, PAPER, SCISSORS;

        public static Move fromString(String move) {
            Move whichOne = null;
            for (Move mv : Move.values()) {
                whichOne = mv.toString().equals(move) ? mv : whichOne;
            }
            return whichOne;
        }
    }

    private String playerName1;
    private String playerName2;
    private static final String draw = "The game ends in draw";

    public HashMap<Move, Move> loosingMoves;

    public RockPaperScissorsGame(String playerName1, String playerName2) {
        this.loosingMoves = new HashMap<>();
        this.loosingMoves.put(Move.ROCK, Move.PAPER);
        this.loosingMoves.put(Move.PAPER, Move.SCISSORS);
        this.loosingMoves.put(Move.SCISSORS, Move.ROCK);
        this.playerName1 = playerName1;
        this.playerName2 = playerName2;
    }

    public void solveRound(Move move1, Move move2) {
        if (move1.equals(move2)) {
            System.out.println(draw);           
        } else if (move2 == loosingMoves.get(move1)) {
            System.out.println(playerName2 + " wins!");
        } else {
            System.out.println(playerName1 + " wins!");
        }
    }

   public Move askForNextMove(String playerName) {
        var scanner = new Scanner(System.in);
        Move move;

        System.out.println(playerName + "'s next move? (Write \"Rock\", \"Paper\" or \"Scissors\")");
        do {
            System.out.println("If you enter a wrong move, you'll be asked again.");
            move = RockPaperScissorsGame.Move.fromString(scanner.nextLine().toUpperCase());
        } while (move == null);

        return move;
    }
    public void nextRound() {
        var move1 = askForNextMove(playerName1);
        var move2 = askForNextMove(playerName2);
        solveRound(move1, move2);
    }

}
