package personal;

import java.util.Scanner;

public class PigGameLogic extends PairOfDice {

	public static Scanner scan = new Scanner(System.in);
	public static boolean stillPlaying = true;
	public static int userSum = 0;
	public static int tempUserSum = 0;
	public static int compSum = 0;
	public static int tempCompSum = 0;
	
	public static void userTurn() {
		String s = "y";
		while(s.equals("y") && stillPlaying == true) {
			userRoll();
			if (getDie1() != 1 && getDie2() != 1) {
				System.out.println("If you would like to roll again enter \"y\".");
				s = scan.nextLine();
			}
		}
 		userSum += tempUserSum;
 		stillPlaying = true;
	}
	
	public static void compTurn() {
		tempCompSum = 0;
		while(tempCompSum < 20 && stillPlaying == true) {
			compRoll();
			try {
			    Thread.sleep(1000);
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}
		}
		compSum += tempCompSum;
		stillPlaying = true;
		
	}
	
	public static void userRoll() {
		rollDice();
		if (getDie1() == 1 && getDie2() == 1) {
			userSum = 0;
			stillPlaying = false;
			System.out.println("You rolled two ones. You lose all point earned thus far and your turn is over.");
		} else if (getDie1() == 1 || getDie2() == 1) {
			tempUserSum = 0;
			stillPlaying = false;
			System.out.println("You rolled a one. You lose all point for this round and your turn is over.");
		} else {
			if (getSum() == 8 || getSum() == 11) {
				System.out.println("You rolled an " + getSum() + ".");
			} else{
				System.out.println("You rolled a " + getSum() + ".");
			}
			tempUserSum += getSum();
		}
	}
	
	public static void compRoll() {
		rollDice();
		if (getDie1() == 1 && getDie2() == 1) {
			compSum = 0;
			stillPlaying = false;
			System.out.println("The computer rolled two ones. It loses all point earned thus far and its turn is over.");
		} else if (getDie1() == 1 || getDie2() == 1) {
			tempCompSum = 0;
			stillPlaying = false;
			System.out.println("The computer rolled a one. It loses all point for this round and its turn is over.");
		} else {
			if (getSum() == 8 || getSum() == 11) {
				System.out.println("The computer rolled an " + getSum() + ".");
			} else{
				System.out.println("The computer rolled a " + getSum() + ".");
			}
			tempCompSum += getSum();
		}
	}
	
	
}
