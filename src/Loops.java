import java.util.Scanner;


public class Loops {

	public static void main(String[] args) {
		
		
		//for loop example
		int d;
		//starting; cycle till i < 10; adding +1 till < 10
		for(int i = 0; i < 10; i++){
		//System.out.println(i);
			
		}
		
		System.out.println("------------");
		
		for(int i = 100; i > 10; i/=2){
			//System.out.println(i);
		}
		
		int n = 4;
		int m = 3;
		for(int i = 0 ; i <= n ; i++) {
			System.out.println("outer loop " + i);
			
			for(int j = 0 ; j <=m ; j++) {
				System.out.println("inner loop " + j);
			}
			System.out.println();
		}
		
		System.out.println("------------");

		//while loop example
		int number = 0;
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number, or 0 to exit the scanner: ");
		number = sc.nextInt();
		
		while (number != 0) {
			sum = sum + number;
			System.out.println("Enter a number, or 0 to exit the scanner: ");
			number = sc.nextInt();
		}
		
		System.out.println("total sum: " + sum);
		System.out.println("---------");
		
		
		//Do while loop example
		
		int x = 100;
		do {
			System.out.println("DO");
			x/=2;
		} while (x > 10);
		
	}//end main

}//end class
