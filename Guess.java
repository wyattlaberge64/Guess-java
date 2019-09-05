import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int roll = 0;
		int guess= 0;
		roll=(int) rollDice();
		System.out.println(roll);
		while(guess!=roll) {
			guess = getGuess();
			System.out.println(guess);
			if(guess==roll) {
				System.out.println("You guessed correctly congradulations");
			}else if(guess>roll) {
				System.out.println("You guessed too high! Try again");
			}else {
				System.out.println("You guessed too low! Try again");
			}
		}
		
	}
	/*
	 * Has the computer randomly choose a number between 1-100
	 * @param
	 * @return double myRoll
	 */
	public static double rollDice() {
		double myRoll=Math.round(Math.random()*100)+1;
		System.out.println(myRoll);
		return myRoll;
	}
	
	/* 
	 * Obtains user input of an integer between 1-100
	 * @param 
	 * @return int guess
	 */
	public static int getGuess() {
		System.out.print("Enter guess (1-100): ");
		Scanner manualInput = new Scanner(System.in);
		int guess = manualInput.nextInt();
		return guess;
	}
	
}
