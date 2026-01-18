package guessingGame;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//calling the random number generator to generate a number for the game
		RandomNumGenerator.generateNum();
		
		System.out.println("~~~~~~~~~~~ Welcome to the number guessing game!~~~~~~~~~~~");
		
		boolean found = false;
		
		//new implementation of counter to track number of guesses.
		int counter = 0;
		
		
		//while loop to keep user guessing unless they find the secret number
		while (!found) {
			System.out.println("Guess a number between 1-100:");
			String guess = sc.nextLine();
			if(!InputValidator.ValidateGuess(guess)) {
				System.out.println("\nInvalid guess, make sure guess is a number or not null!");
			}else {
				found = InputValidator.CheckGuess(Integer.parseInt(guess));
			}
			counter++;
		}
	
		//new function displaying how well the user played.
		
		if (counter == 1) {
			System.out.println("WOW! You found the secret number in one try!");
		}else if(counter < 5) {
			System.out.println("Well done! You did it in under 5 tries!");
		}else if (counter < 10) {
			System.out.println("Not bad.. Under 10 tries!");
		}else if(counter < 15) {
			System.out.println("You can do better than that.. 15 tries..");
		}else {
			System.out.println("Seriously.."+" "+counter+" tries..");
		}
		
	}

}
