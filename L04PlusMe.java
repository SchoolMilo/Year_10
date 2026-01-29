/**
 *  @author Milo Mitchell-Brooks
 *  @version v1
 *  @aim To do some calculations
 */

import java.util.Scanner;
import java.util.Random;

public class L04PlusMe 
{

	public static void main(String[] args) 
	{
		// Create scanner objects
		Scanner iKeyboard = new Scanner(System.in);
		
		// Declare variables
		Random rand = new Random();
		
		boolean bFailed = false;
		int[] iNum = new int[3];
		int iTotal = 0;
		int iGuess = 0;
		int iCount = 0;
		
		// Calculate three random numbers
		System.out.println("Making 3 random numbers...");
		
		for (int i = 0; i < 3; i++) 
		{
			iNum[i] = rand.nextInt(100);
			iTotal = iNum[i] + iTotal;
		} // End of for
		
		
		
		do 
		{
			iCount = iCount + 1;
			if (bFailed == true) 
			{
				System.out.println("Sorry try again!");
			} // End of if
			StringBuilder Output = new StringBuilder("What is the sum of ");
			for (int i = 0; i < iNum.length; i++) 
			{
				Output.append(iNum[i]);
				if (i < iNum.length -1) 
				{
					Output.append(", ");
				} // End of if
			} // End of for
			System.out.println(Output.toString());
			iGuess = iKeyboard.nextInt();
			
			if (iGuess != iTotal) 
			{
				bFailed = true;
			} // End of if
		} while (iGuess != iTotal); // End of do while
		
		System.out.println("Correct! Well done!");
		System.out.println("Attempts to successfully add the values together: " + iCount);

		// Close scanner objects
		iKeyboard.close();
	} // End of main

} // End of class
