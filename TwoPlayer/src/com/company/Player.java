package com.company;

public class Player {

    String name;
    boolean gameOver;
    double score;
    int levelCompleted;
    int bonus;

    public Player(String name, boolean gameOver, double score, int levelCompleted, int bonus) {

        this.name = name;
        this.gameOver = gameOver;
        this.score = score;
        this.levelCompleted = levelCompleted;
        this.bonus = bonus;
    }

    public double calculateScore() {

        if (this.gameOver) {

            double finalScore = this.score + (this.levelCompleted * this.bonus);
            finalScore += 100;
            return finalScore;
        }
        return -1;
    }
}

