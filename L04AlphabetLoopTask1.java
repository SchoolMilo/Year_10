/**
 *  @author Milo Mitchell-Brooks
 *  @version 1 24/11/2025
 *  @aim To use magic
 */

import java.util.Scanner;

public class L04AlphabetLoopTask1
{

	public static void main(String[] args) 
	{
		// Create Scanner objects
		Scanner szKeyboard = new Scanner(System.in);
		
		// Declare variables
		String szSort = "";
		String szAlphabet = "abcdefghijklmnopqrstuvwxyz";
		
		// User input loop
		do 
		{
			System.out.println("How would you like to sort the alphabet, Ascending (A) or Descending (D)?");
			szSort = szKeyboard.nextLine();
			
			// Simplifying user input
			szSort = szSort.trim();
			szSort = szSort.toLowerCase();
			
			// System output if incorrect input
			if (!szSort.equals("a") && !szSort.equals("d"))
			{
				System.out.println("Incorrect input, try again");
			} // End of if
		} while (!szSort.equals("a") && !szSort.equals("d")); // End of do while

		StringBuilder szOutput = new StringBuilder("The alphabet sorted into descending order is ");
				
		if (szSort.equals("a")) 
		{
			System.out.println("The alphabet sorted into ascending order is " + szAlphabet);
		} else 
		{
			for (int i = 122; i >= 97 ; i--) 
			{
				char Character = (char) i;
				szOutput.append(Character);
			}
			
			System.out.println(szOutput);
			
		} // End of if
		
		// Close scanners
		szKeyboard.nextLine();
		
		
	} // End of main

} // End of class
