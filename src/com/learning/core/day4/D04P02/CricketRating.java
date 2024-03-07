package com.learning.core.day4.D04P02;

import java.util.Scanner;

class CricketRating {
    private String playerName;
    private float critic1;
    private float critic2;
    private float critic3;
    private float avgRating;
    private String coins;

    public CricketRating(String playerName, float critic1, float critic2) {
        this.playerName = playerName;
        this.critic1 = critic1;
        this.critic2 = critic2;
        this.critic3 = 0.0f;
        this.avgRating = 0.0f;
        this.coins = "";
    }
    public void calculateAverageRating1(float critic1, float critic2) {
        this.critic2 = critic2;
        this.avgRating = (critic1 + critic2) / 2;
    }
    
    public void calculateAverageRating(float critic1, float critic2, float critic3) {
        this.critic3 = critic3;
        this.avgRating = (critic1 + critic2 + critic3) / 3;
    }

    public String calculateCoins() {
        if (avgRating >= 7.0) {
            coins = "Gold";
        } else if (avgRating >= 5.0 && avgRating < 7.0) {
            coins = "Silver";
        } else if (avgRating >= 2.0 && avgRating < 5.0) {
            coins = "Copper";
        } else {
            coins = "Not Eligible";
        }
        return coins;
    }

    public void display() {
        System.out.println("Player Name: " + playerName);
        System.out.println("Average Rating: " + avgRating);
        System.out.println("Coins: " + coins);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter player name: ");
        String playerName = scanner.next();
        System.out.print("Enter critic 1 rating: ");
        float critic1 = scanner.nextFloat();
        System.out.print("Enter critic 2 rating: ");
        float critic2 = scanner.nextFloat();
        System.out.print("Enter critic 3 rating: ");
        float critic3 = scanner.nextFloat();

        CricketRating rating = new CricketRating(playerName, critic1, critic2);
        rating.calculateAverageRating(critic1, critic2, critic3);

        try {
            if (critic3 == 0.0f) {
                throw new NotEligibleException("Not enough critics' ratings to calculate average.");
            }
            rating.calculateCoins();
            rating.display();
        } catch (NotEligibleException e) {
            System.out.println(e.getMessage());
        }
    }
}

