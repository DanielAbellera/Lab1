package guessingGame;

import java.util.Random;

public class RandomNumGenerator {
	public static int secret;

	public static void generateNum() {
		Random rand = new Random();
		
		int min = 1;
		int max = 100;
		int RandomNum = rand.nextInt(max-min+1)+min;
		
		secret = RandomNum;
	}
	
}
