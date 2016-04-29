package personal;

public class PigGameMain extends PigGameLogic {

	public static void main(String[] args) {
		
		System.out.println("I hope you enjoy the game. Good luck and have fun!");
		while (userSum < 100 && compSum < 100) {
			userTurn();
			compTurn();
		}
		if (userSum >= 100) {
			System.out.println("Congratulations, you won!");
		} else {
			System.out.println("Sorry, the computer won.");
		}
		System.out.println("Thank you for playing.");
		scan.close();
	}
	

}
