package personal;

public class PairOfDice {

	private static int sum = 0;
	private static int die1 = 0;
	private static int die2 = 0;
	
	public static int getDie1() {
		return die1;
	}
	public static void setDie1(int n) {
		die1 = n;
	}
	
	public static int getDie2() {
		return die2;
	}
	public static void setDie2(int n) {
		die2 = n;
	}
	
	public static int rollDice() {
		die1 = (int)(Math.random()*6)+1;
		die2 = (int)(Math.random()*6)+1;
		sum = die1 + die2;
		return sum;
	}
	public static int getSum() {
		return sum;
	}
	
}
