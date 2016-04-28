package edu.exeter.cs;

public class PairOfDice {

	private int sum = 0;
	
	Die die1 = new Die();
	Die die2 = new Die();
	
	public int getDie1() {
		return die1.getFaceValue();
	}
	public void setDie1(int n) {
		die1.setFaceValue(n);
	}
	
	public int getDie2() {
		return die2.getFaceValue();
	}
	public void setDie2(int n) {
		die2.setFaceValue(n);
	}
	
	public int rollDice() {
		sum = die1.roll() + die2.roll();
		return sum;
	}
	public int getDiceSum() {
		return sum;
	}
	
	public String toString() {
		String str = Integer.toString(sum);
		return str;
	}
	
}
