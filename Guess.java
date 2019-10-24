import java.util.Scanner;
import java.lang.Integer.*;
public class Guess {
	
	static int totalTurns = 0;
	static int games = 0;
	static boolean quit = false; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean again = true;
		
		while(again == true) {
			games++;
			int roll = 0;
			int guess = 0;
			int turns = 0;
			range = getRange();
			roll=(int) rollDiceInt(range);
			System.out.println(roll);
			while(guess!=roll || guess!=-1) {
				guess = getGuess();
				System.out.println(guess);
				if(guess == -1) {
						break;
					}
				else if(validate(guess) == true) {
					turns++;
					if(guess==roll) {
						System.out.println("You guessed correctly congradulations");
						gameStats(turns);
						again = newGame();
					}else if(guess>roll) {
						System.out.println("You guessed too high! Try again");
					}else {
						System.out.println("You guessed too low! Try again");
					}
				}else {
					System.out.println("Invalid guess, try again!");
				}
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
		String guess = manualInput.nextLine();
		if(guess.equals("q")) {
			return -1;
		}
		else{
			int intGuess = parseInt(guess);
			return intGuess;
		}
	}
	
	private static int parseInt(String guess) {
		// TODO Auto-generated method stub
		int intGuess = Integer.parseInt(guess);
		return intGuess;
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
	
	/*
	 * 
	 * @param 
	 */
	public static void gameStats(int turns) {
		System.out.println("You got it in "+turns+" turns!");
		totalTurns += turns;
		int averageTurns = totalTurns / games;
		System.out.println("You won "+games+" games with an average of "+averageTurns+" turns per game!");
	}
	
	/*
	 * 
	 * @return boolean
	 */
	public static boolean newGame() {
		System.out.print("Play again? Y=yes");
		Scanner manualInput = new Scanner(System.in);
		String again = manualInput.nextLine();
		if(again == "Y") {
			return true;
		}else {
			System.out.println("Sorry to see you go!");
			return false;
		}
	}
	
	/*
	 * 
	 * @param 
	 * @return boolean
	 */
	public static boolean validate(int guess) {
		if(guess > 0 && guess < 100) {
			return true;
		}else {
			return false;
		}
	}
}
