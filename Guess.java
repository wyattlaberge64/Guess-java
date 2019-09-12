import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int roll = 0;
		int guess= 0;
		range = getRange();
		roll=(int) rollDiceInt(range);
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
	 * @param int upperRange
	 * @return int myRoll
	 */
	public static int rollDiceInt(int upperRange) {
		int myRoll=(int)Math.floor(Math.random()*upperRange)+1;
		System.out.println(myRoll);
		return myRoll;
	}
	
	/* 
	 * Obtains user input of an integer between 1 & the user input range number.
	 * @param 
	 * @return int guess
	 */
	public static int getGuess() {
		System.out.print("Enter guess (1-"+range+"): ");
		Scanner manualInput = new Scanner(System.in);
		int guess = manualInput.nextInt();
		return guess;
	}
	
	/* 
	 * Obtains user input of the range of numbers
	 * @param 
	 * @return int range
	 */
	public static int getRange() {
		System.out.print("Enter upperRange: ");
		Scanner manualInput = new Scanner(System.in);
		int range = manualInput.nextInt();
		return range;
	}
	
	public static int range;
}