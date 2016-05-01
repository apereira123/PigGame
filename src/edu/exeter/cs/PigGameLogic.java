package edu.exeter.cs;

import java.util.Scanner;

public class PigGameLogic {

	public static Scanner scan = new Scanner(System.in);
	public static int userSum = 0;
	public static int compSum = 0;
	private static int tempUserSum = 0;
	private static int tempCompSum = 0;
	private static PairOfDice dice = new PairOfDice();
	private static boolean stillPlaying = true;
	
	public static void userTurn() {
		String s = "y";
		tempUserSum = 0;
		while(s.equals("y") && stillPlaying == true && userSum < 100) {
			userRoll();
			if (dice.getDie1() != 1 && dice.getDie2() != 1 && userSum < 100) {
				System.out.println("If you would like to roll again enter \"y\".");
				s = scan.nextLine();
			}
		}
 		stillPlaying = true;
 		if (userSum < 100) {
 			System.out.println("Your sum is " + userSum + ".");
 	 		System.out.println();
 	 		try {
 			    Thread.sleep(2000);
 			} catch(InterruptedException ex) {
 			    Thread.currentThread().interrupt();
 			}
 		}
	}
	
	public static void compTurn() {
		tempCompSum = 0;
		while(tempCompSum < 20 && stillPlaying == true && compSum < 100) {
			compRoll();
			if (compSum < 100) {
				try {
				    Thread.sleep(2000);
				} catch(InterruptedException ex) {
				    Thread.currentThread().interrupt();
				}
			}
		}
		stillPlaying = true;
		if (compSum < 100) {
 			System.out.println("The computer's sum is " + compSum + ".");
 	 		System.out.println();
 	 		try {
 			    Thread.sleep(2000);
 			} catch(InterruptedException ex) {
 			    Thread.currentThread().interrupt();
 			}
 		}
	}
	
	public static void userRoll() {
		dice.rollDice();
		if (dice.getDie1() == 1 && dice.getDie2() == 1) {
			userSum = 0;
			stillPlaying = false;
			System.out.println("You rolled two 1s. You lose all point earned thus far and your turn is over.");
		} else if (dice.getDie1() == 1 || dice.getDie2() == 1) {
			userSum -= tempUserSum;
			stillPlaying = false;
			System.out.println("You rolled a 1. You lose all point for this round and your turn is over.");
		} else {
			if (dice.getSum() == 8 || dice.getSum() == 11) {
				System.out.println("You rolled an " + dice + ".");
			} else{
				System.out.println("You rolled a " + dice + ".");
			}
			userSum += dice.getSum();
			tempUserSum += dice.getSum();
		}
	}
	
	public static void compRoll() {
		dice.rollDice();
		if (dice.getDie1() == 1 && dice.getDie2() == 1) {
			compSum = 0;
			stillPlaying = false;
			System.out.println("The computer rolled two 1s. It loses all point earned thus far and its turn is over.");
		} else if (dice.getDie1() == 1 || dice.getDie2() == 1) {
			compSum -= tempCompSum;
			stillPlaying = false;
			System.out.println("The computer rolled a 1. It loses all point for this round and its turn is over.");
		} else {
			if (dice.getSum() == 8 || dice.getSum() == 11) {
				System.out.println("The computer rolled an " + dice + ".");
			} else{
				System.out.println("The computer rolled a " + dice + ".");
			}
			compSum += dice.getSum();
			tempCompSum += dice.getSum();
		}
	}
	
	
}
