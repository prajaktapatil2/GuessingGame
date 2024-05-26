
package GuessingGame1;
import java.util.Random;
import java.util.Scanner;
public class GuessingGame1 {
	public static void main(String[] arsg) {
		//Initialize variables
		int numToGuess=new Random().nextInt(100)+1;
		int attemptsleft=5;
		Scanner sc=new Scanner(System.in);
		int guess;
		// GameLoop
		System.out.println("Welcome to the number guessing game !");
		while(attemptsleft>0) {
			System.out.println("Enter your guess (1 to 100):");
			guess=sc.nextInt();
			attemptsleft--;
			if(guess<numToGuess) {
				System.out.println("Low number, you have " +attemptsleft+ "Attempts Left" );
			}else if(guess>numToGuess){
				System.out.println("High Number, you have" +attemptsleft+ "Attempts Left");
			}else {
				System.out.println("Bingo ! you guessed the number in " +(5-attemptsleft)+ "Attempts.");
				return;
			}
		}
		//The End
		System.out.println(" The End. The number was" + numToGuess);
		
			}
		
	}


