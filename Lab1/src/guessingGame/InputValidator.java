package guessingGame;

public class InputValidator {
	public static Boolean ValidateGuess(String userInput) { 

		if (userInput != null) { 

			try { 
				Integer.parseInt(userInput);
				return true; 
			} 

			catch (NumberFormatException e) { 
				return false; 
			} 

		} else { 
			return false; 
		} 
	} 
	
	

 public static Boolean CheckGuess(int userInput) { 
	 if(userInput > 100|| userInput < 1) {
		 System.out.println("Make sure number is between 1 and 100!");
		 return false;
	 }
		if (userInput == RandomNumGenerator.secret) { 
			System.out.println("You found the secret Number!");
			return true;
		} else if (userInput < RandomNumGenerator.secret){ 
			System.out.println("Your guess is too low..");
			return false;
		} else {
			System.out.println("Your guess is too high!");
			return false;
		}
		
	} 

}
