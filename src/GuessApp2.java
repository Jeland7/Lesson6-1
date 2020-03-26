/**
Problem 2
GuessApp2 
	uses the instantiable class GuessNumber
	allows the user to guess the number. User can enter the guess number!
*/

import java.util.Scanner;

public class GuessApp2 {

	public static void main(String[] args) {
		//declare a local variables 
		int guess;
		int tries;
		
		Scanner input = new Scanner(System.in);
		
		GuessNumber checker = new GuessNumber();
		
		//input
		System.out.println("How many times you would like to try: ");
		tries = input.nextInt();
		
		for(int i = 0; i < tries; i++) {
			System.out.println("Please enter a number 1-10: ");
			guess = input.nextInt();
			
			checker.setGuess(guess);
			
			//processing
			checker.compute();
			
			//output
			String m = checker.getMessage();
			System.out.println(m);
			
			if(m.contentEquals("congrats")) {
				break;
			}
		}//end for
		
		int s = checker.getSecret();
		System.out.println("secret: " + s);
		
		}
	}
	
	
