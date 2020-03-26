/*
Problem 3
GuessApp3 
	uses the instantiable class GuessNumber
	allows the user to guess the number, and then ask the user whether would they like to guess again. 
	If they answer yes, the application should run again, if they answer no, 
	the application should end.
*/
import java.util.Scanner;

public class GuessApp3 {

	public static void main(String[] args) {
		//declare a local variables 
				int guess;
				String word = "yes";
				
				Scanner input = new Scanner(System.in);
				
				GuessNumber checker = new GuessNumber();
				
				//input
				while (word.contentEquals("yes")) {
					System.out.println("Please enter a number 1-10: ");
					guess = input.nextInt();
					
					checker.setGuess(guess);
					
					//processing
					checker.compute();
					
					//output
					String m = checker.getMessage();
					System.out.println(m);
				
					int s = checker.getSecret();
					
					if (m.equals("congrats")) {
						
					}
		
					int secr = checker.getSecret();
					System.out.println("secret: " + secr);
			
					System.out.println("Would you like to try again (yes/no)?");
					word = input.next().toLowerCase();
			
					if(word.equals("no")) {
					System.out.println("Bye, bye!");
					}
				
					
				}//end while
				
				
				
				
				

	}//end main

}//end class
