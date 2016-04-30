package personal;

public class PigGameMain extends PigGameLogic {

	public static void main(String[] args) {
		
		System.out.println("I hope you enjoy the game. Good luck and have fun!");
		System.out.println();
		try {
			Thread.sleep(1000);
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		while (userSum < 100 && compSum < 100) {
			userTurn();
			if (userSum < 100) {
				compTurn();	
			}
		}
		if (userSum >= 100) {
			System.out.println();
			System.out.println("Congratulations, you won! Your sum is " + userSum + " .");
		} else {
			System.out.println();
			System.out.println("Sorry, the computer won. Its sum is " + compSum + ".");
		}
		System.out.println("Thank you for playing.");
		scan.close();
		
	}
	
}
