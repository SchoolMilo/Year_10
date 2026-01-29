/**
 *  @author Milo Mitchell-Brooks
 *  @version v1
 *  @aim To count the amount of letters
 */

import java.util.Scanner;

public class L04NumberOfLetters 
{

	public static void main(String[] args) 
	{
		// Create scanner class
		Scanner szKeyboard = new Scanner(System.in);
		
		// Declare variables
		String szWord1 = "";
		String szWord2 = "";
		int iWord1Length = 0;
		int iWord2Length = 0;
		int iTotal = 0;
		int iDiffrence = 0;
		
		// User input
		do 
		{
			System.out.println("Give me a word: ");
			szWord1 = szKeyboard.nextLine();
			szWord1 = szWord1.trim();
			iWord1Length = szWord1.length();
			
			System.out.println("Give me another word that is longer than the first: ");
			szWord2 = szKeyboard.nextLine();
			szWord2 = szWord2.trim();
			iWord2Length = szWord2.length();
			
			if (iWord2Length <= iWord1Length) 
			{
				System.out.println("The second word entered must be longer than the first. Please enter another word: ");
				szWord2 = szKeyboard.nextLine();
				szWord2 = szWord2.trim();
				iWord2Length = szWord2.length();
			} // End of if 
			
		} while (iWord1Length == 0 && iWord2Length == 0 && iWord2Length <= iWord1Length);
		
		iTotal = iWord1Length + iWord2Length;
		iDiffrence = iWord2Length - iWord1Length;
		
		// Output
		System.out.println("The total number of letters in both words is " + iTotal);
		System.out.println(szWord2 + " has " + iDiffrence + " more letters than " + szWord1 + ".");

	} // End of main

} // End of class
