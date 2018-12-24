package unicodeCalculator;
import java.util.Scanner;

public class unicodeCalculator {

	public static void main(String[] args) {

		System.out.println("Welcome to the unicode calculator");
		System.out.println("---------------------------------");
		
		Scanner userInput = new Scanner(System.in); // declare scanner variable userInput
		
		System.out.println("Please input 1st string to be converted");
		String string1 = userInput.next(); // declare and assign user input to variable string1
		System.out.println("Please input 2nd string to be converted");
		String string2 = userInput.next(); // declare and assign user input to variable string2
		
		System.out.println();// line for spacing
		
		int i; // declare integer i for iterations in the for loop
		int sum1 = 0; // track the sum of the string of chars within the loop, give it value 0 before loop
		int sum2 = 0; 
		
		for (i = 0; i < string1.length(); ++i) { // the for loop repeats the string length of times
			char c1 = string1.charAt(i); // declare and initialize variable c1 to hold the character at location i (0, 1, 2, ...)
			int uc1 = (int) c1; // convert the character in c1 to an integer number
			System.out.print("Character #" + (i+1) + " \"" + c1 + "\" is converted to: " + uc1); // + 1 since we count from 1 although computer counts from 0
			sum1 = sum1 + uc1; // add the value of uc to the running total
			System.out.println(" (sum is " + sum1 + ")");
		}
		
		System.out.println();// break line for spacing
		
		for (i = 0; i < string2.length(); ++i) { // repeat but with string2
			char c2 = string2.charAt(i); // declare and initialize variable c2 to hold the character at location i (0, 1, 2, ...)
			int uc2 = (int) c2; // convert the character in c2 to an integer number
			System.out.print("Character #" + (i+1) + " \"" + c2 + "\" is converted to: " + uc2); // + 1 since we count from 1 although computer counts from 0
			sum2 = sum2 + uc2; // add the value of uc to the running total
			System.out.println(" (sum is " + sum2 + ")");
		}
		
		System.out.println(); // spacing
		
		int difference = sum1 - sum2; // take the difference of the sums of the loops
		difference = Math.abs(difference); // take absolute value of the difference
		System.out.println("Difference between 1st sentence and 2nd sentence (as absolute value) is: " + difference);
		
		// since we're doing comparisons, we have to declare a winner
		String winner = (sum1 > sum2) ? string1 : string2; // if sum1 is greater than sum2, print string1, else string2
		int winsum = (sum1 > sum2) ? sum1 : sum2; // assign the larger sum to int variable winsum to be printed in the victory sentence
		System.out.println("Clearly, the superior string is \"" + winner + "\"" + " with a sum of " + winsum);
		
		userInput.close(); // close the scanner
	}
}
