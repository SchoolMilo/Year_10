
/**
 *  @author Milo Mitchell-Brooks
 *  @version v1
 *  @aim To check if a number is odd or even
 */


import java.util.Scanner;

public class L04AlphabetLoopTask2 
{

	public static void main(String[] args) 
	{
			// Create Scanner objects
			Scanner szKeyboard = new Scanner(System.in);
			
			// Declare variables
			int iLength = 0;
			String szSort = "";
			String szVowles = "aeiou";
			String szCharacter = "";
			
			// User input loop
			do 
			{
				System.out.println("How would you like to sort the vowles in the alphabet, Ascending (A) or Descending (D)?");
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

			StringBuilder szOutput = new StringBuilder("The vowles in the alphabet sorted into descending order is ");
					
			if (szSort.equals("a")) 
			{
				System.out.println("The vowles in the alphabet sorted into ascending order is " + szVowles);
			} else 
			{
				iLength = szVowles.length();
				iLength = iLength - 1;
				for (int i = iLength; i >= 0; i--) 
				{
					String szWord = szVowles.substring(i, i+1);
					szOutput.append(szWord);
				}
				
				
				System.out.println(szOutput);
			} // End of else
				
			// Close scanners
			szKeyboard.nextLine();

	} // End of main
} // End of class
