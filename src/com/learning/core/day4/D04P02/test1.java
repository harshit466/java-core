package com.learning.core.day4.D04P02;

import java.util.Scanner;

public class test1 {
	
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
	                throw new NotEligibleException("NotEligible");
	            }
	            rating.calculateCoins();
	            rating.display();
	        } catch (NotEligibleException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	}

