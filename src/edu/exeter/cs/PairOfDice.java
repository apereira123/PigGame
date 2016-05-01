package edu.exeter.cs;

public class PairOfDice {

	private int sum;
	
	Die die1 = new Die();
	Die die2 = new Die();
	
	public PairOfDice() {
		sum = 0;
	}
	
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
	
	public void rollDice() {
		sum = die1.roll() + die2.roll();
	}
	public int getSum() {
		return sum;
	}
	
	public String toString() {
		String str = Integer.toString(sum);
		return str;
	}
	
}
