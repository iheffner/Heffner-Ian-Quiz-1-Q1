/* Quiz 1 Problem 1
 * @author Ian Heffner
 * 
 * This program calculates a football player's passer rating.
 * 
 * The program takes in five statistics:
 * Touchdowns, total yards, interceptions, completions, and number of
 * passes attempted (ATT).
 * 
 * The program then prints the player's passer rating.
 */

import java.util.Scanner;

public class QBRating {
	public static void main(String[] args) { 
		//Creating a new Scanner
		Scanner input = new Scanner(System.in);
		
		//Prompting the user for the five statistics
		System.out.print("Touchdowns: ");
		double touchdowns = input.nextDouble();
		
		System.out.print("Total yards: ");
		double totalYards = input.nextDouble();
		
		System.out.print("Interceptions: ");
		double interceptions = input.nextDouble();
		
		System.out.print("Completions: ");
		double completions = input.nextDouble();
		
		System.out.print("Attempted Passes: ");
		double attemptedPasses = input.nextDouble();
		
		//Closing the Scanner
		input.close();
		
		//The formula for passer rating was taken from wikipedia
		//The formula uses four variables, a-d
		double a = ((completions/attemptedPasses) - 0.3)*5;
		double b = ((totalYards/attemptedPasses) - 3)*0.25;
		double c = (touchdowns/attemptedPasses) * 20;
		double d = 2.375 - ((interceptions/attemptedPasses)*25);
		
		//The four variables are used to find the final rating
		double passerRating = ((a+b+c+d)/6)*100;
		System.out.println("The passer rating is: " + passerRating);
	}
}

