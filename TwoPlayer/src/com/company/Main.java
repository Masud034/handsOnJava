package com.company;

public class Main {

    public static void main(String[] args) {

        Player p1 = new Player("John@!10", true, 500, 5, 100);
        Player p2 = new Player("Kuddus#17", true, 20, 1, 40);

        isWinner(p1, p2);
    }

    public static void isWinner(Player p1, Player p2) {

        double playerOneScore = p1.calculateScore();
        double playerTwoScore = p2.calculateScore();

        if (playerOneScore > playerTwoScore) {
            System.out.println("Player-1 Wins");
        } else {
            System.out.println("Player-2 Wins");
        }
    }
}
