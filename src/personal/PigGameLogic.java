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
				System.out.println("If you would like to roll again enter \"y\"");
				s = scan.nextLine();
			}
		}
 		userSum += tempUserSum;
 		stillPlaying = true;
	}
	
	public static void compTurn() {
		while(tempCompSum < 20 && stillPlaying == true) {
			compRoll();
		}
		compSum += tempCompSum;
		stillPlaying = true;
	}
	
	public static void userRoll() {
		rollDice();
		if (getDie1() == 1 && getDie2() == 1) {
			userSum = 0;
			stillPlaying = false;
			System.out.println("You rolled two ones. Your score will reset and your turn will end.");
		} else if (getDie1() == 1 || getDie2() == 1) {
			tempUserSum = 0;
			stillPlaying = false;
			System.out.println("You rolled a single one. Your rolls for this round will not count and your turn will end.");
		} else {
			System.out.println("You rolled a " + getSum() + ".");
			tempUserSum += getSum();
		}
	}
	
	public static void compRoll() {
		rollDice();
		if (getDie1() == 1 && getDie2() == 1) {
			userSum = 0;
			stillPlaying = false;
			System.out.println("The computer rolled two ones. Its score will reset and its turn will end.");
		} else if (getDie1() == 1 || getDie2() == 1) {
			tempUserSum = 0;
			stillPlaying = false;
			System.out.println("The computer rolled a single one. Its rolls for this round will not count and its turn will end.");
		} else {
			System.out.println("The computer rolled a " + getSum() + ".");
			tempUserSum += getSum();
		}
	}
	
	
}
