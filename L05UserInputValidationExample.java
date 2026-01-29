/**
 * @author Natalie Danaher
 * @version 1 2/10/16
 * @Details Aim to develop validation skills
 */
import java.util.Scanner;

public class L05UserInputValidationExample 
{

	public static void main(String[] args) 
	{

		//declare variables and create scanners
		Scanner iKeyboard = new Scanner(System.in);
		Scanner szKeyboard = new Scanner(System.in);
		Scanner scKeyboard = new Scanner(System.in);	//required when the data type is not known
		int iNumber1, iNumber2, iNumberOrig, iWordLength;
		String szVowel, szConsonant, szChoice, szWord, szLetter, szNumber2;



		// --------------------------------------------------------------------------------------------------------
		// A) Validating user input by data type integer
		//    Add validation to the following code to ensure the user is only permitted to enter any integer
		// =========================================================================================================

		//add heading for task
		System.out.println();
		System.out.println();
		System.out.println("======================================================================================================================");
		System.out.println("A. Validating user input by data type - Entering any whole number");
		System.out.println("======================================================================================================================");
		
		System.out.println("Enter a whole number");
		while (!iKeyboard.hasNextInt()) 
		{
			System.out.println("Thats not a whole number! Please enter a whole number:  ");
			
			iKeyboard.nextLine();
		}
		
		iNumber1 = iKeyboard.nextInt();
		iKeyboard.nextLine();
		System.out.println("Thank you! You entered the number " + iNumber1);

		System.out.println("----------------------------------------------------------------------------------------------------------------------");





		// --------------------------------------------------------------------------------------------------------
		// B) Validating user input by data type integer within a set range
		//    Add validation to the following code to ensure the user is only permitted
		//	  to enter an integer between 1 and 50
		// =========================================================================================================

		//add space and heading for task
		System.out.println();
		System.out.println();
		System.out.println("======================================================================================================================");
		System.out.println("B. Validating user input by data type within a set range");
		System.out.println("======================================================================================================================");
		
		do {
			System.out.println("Enter a whole number");
			while (!iKeyboard.hasNextInt()) 
				{
					System.out.println("Thats not a whole number! Please enter a whole number:  ");
					iKeyboard.next();
				}
			
			iNumber1 = iKeyboard.nextInt();
			

			
			
			if (iNumber1 < 1 || iNumber1 > 50) {
				System.out.println("Not in range");
			}
			
			} while (iNumber1 < 1 && iNumber1 > 50);
		System.out.println("Thank you! You entered the number " + iNumber1);
		
		System.out.println("----------------------------------------------------------------------------------------------------------------------");





		// --------------------------------------------------------------------------------------------------------
		// C) Validating user input by data type integer to ensure the value entered is positive
		//    Add validation to ensure a positive integer is entered
		// =========================================================================================================

		//add space and heading for task
		System.out.println();
		System.out.println();
		System.out.println("======================================================================================================================");
		System.out.println("C. Validating user input by data type ensuring the number is positive");
		System.out.println("======================================================================================================================");
		
		do {
			System.out.println("Enter a whole number");
			while (!iKeyboard.hasNextInt()) 
				{
					System.out.println("Thats not a whole number! Please enter a whole number:  ");
					iKeyboard.next();
				}
			
			iNumber1 = iKeyboard.nextInt();
			

			
			
			if (iNumber1 < 0) {
				System.out.println("Not a positive number");
			}
			
			} while (iNumber1 < 0);
		System.out.println("Thank you! You entered the number " + iNumber1);
		
		System.out.println("----------------------------------------------------------------------------------------------------------------------");





		// --------------------------------------------------------------------------------------------------------
		// D) Validating user input by data type integer to ensure the value entered is an odd number
		//    Add validation to ensure an odd integer is entered
		// =========================================================================================================

		//add space and heading for task
		System.out.println();
		System.out.println();
		System.out.println("======================================================================================================================");
		System.out.println("D. Validating user input by data type ensuring the number is an odd number");
		System.out.println("======================================================================================================================");

		do {
			System.out.println("Enter a whole number");
			while (!iKeyboard.hasNextInt()) 
				{
					System.out.println("Thats not a whole number! Please enter a whole number:  ");
					iKeyboard.next();
				}
			
			iNumber1 = iKeyboard.nextInt();
			iNumber1 = iNumber1 % 2;

			
			
			if (iNumber1 == 0) {
				System.out.println("Not a whole number");
			}
			
			} while (iNumber1 == 0);
		System.out.println("Thank you! You entered the number " + iNumber1);

		System.out.println("----------------------------------------------------------------------------------------------------------------------");




		// --------------------------------------------------------------------------------------------------------
		// E) Validating user input to ensure only lowercase vowels are entered
		//    Add validation to ensure only lowercase vowels are entered
		// =========================================================================================================

		//add space and heading for task
		System.out.println();
		System.out.println();
		System.out.println("======================================================================================================================");
		System.out.println("E. Validating user input to only accept lowercase vowels");
		System.out.println("======================================================================================================================");

		System.out.println("Enter a vowel, in lowercase");
		while (!iKeyboard.hasNext("[aeiou]")) 
		{
			System.out.println("Thats not a vowel! Please enter a vowel :  ");
			
			iKeyboard.nextLine();
		}
		
		iNumber1 = iKeyboard.nextInt();
		iKeyboard.nextLine();
		System.out.println("Thank you! You entered a vowel");
		

		System.out.println("----------------------------------------------------------------------------------------------------------------------");



		// --------------------------------------------------------------------------------------------------------
		// F) Validating user input to ensure only consonants are entered
		//    Add validation to ensure only consonants are entered
		// =========================================================================================================

		//add space and heading for task
		System.out.println();
		System.out.println();
		System.out.println("======================================================================================================================");
		System.out.println("F. Validating user input to only accept consonants");
		System.out.println("======================================================================================================================");

		System.out.println("Enter a consontant, in lowercase");
		while (!iKeyboard.hasNext("[b-df-hj-np-tv-zB-DF-HJ-NP-TV-Z]")) 
		{
			System.out.println("Thats not a consontant! Please enter a consontant :  ");
			
			iKeyboard.nextLine();
		}
		
		iNumber1 = iKeyboard.nextInt();
		iKeyboard.nextLine();
		System.out.println("Thank you! You entered a consontant");
		
		System.out.println("----------------------------------------------------------------------------------------------------------------------");




		// --------------------------------------------------------------------------------------------------------
		// G) Validating user input for a length check
		//    Add validation to ensure a 5 letter string has been entered
		// =========================================================================================================

		//add space and heading for task
		System.out.println();
		System.out.println();
		System.out.println("======================================================================================================================");
		System.out.println("G. Example of a length check validation");
		System.out.println("======================================================================================================================");

		System.out.println("Enter letters a-z");
		while (!iKeyboard.hasNext("[a-zA-Z]{5}")) 
		{
			System.out.println("Thats not lettters a-z! Please enter letters a-7 :  ");
			
			
			iKeyboard.nextLine();
		}
		
		iNumber1 = iKeyboard.nextInt();
		iKeyboard.nextLine();
		System.out.println("Thank you! You entered a consontant");

		System.out.println("----------------------------------------------------------------------------------------------------------------------");


		// --------------------------------------------------------------------------------------------------------
		// H) Validating user input for a length check using regex
		//    Add validation to ensure a 5 letter string has been entered
		// =========================================================================================================

		//add space and heading for task
		System.out.println();
		System.out.println();
		System.out.println("======================================================================================================================");
		System.out.println("H. Example of a length check validation using regex");
		System.out.println("======================================================================================================================");

		System.out.println("Enter letters a-z");
		while (!iKeyboard.hasNext("[a-zA-Z]{5}")) 
		{
			System.out.println("Thats not a! Please enter letters a-7 :  ");
			
			
			iKeyboard.nextLine();
		}
		
		iNumber1 = iKeyboard.nextInt();
		iKeyboard.nextLine();
		System.out.println("Thank you! You entered a letter");


		System.out.println("----------------------------------------------------------------------------------------------------------------------");


		// --------------------------------------------------------------------------------------------------------
		// I) Creating a presence check on a users input method 1
		//    Ensure the user enters something
		// =========================================================================================================

		//add space and heading for task
		System.out.println();
		System.out.println();
		System.out.println("======================================================================================================================");
		System.out.println("I. Creating a presence check on a String input without regex");
		System.out.println("======================================================================================================================");
		szLetter = "";
		
		while (szLetter.equals("")) 
		{
			System.out.println("Please enter your first intital:  ");
			szLetter = szKeyboard.nextLine().toUpperCase();
			
			if (szLetter.equals(""))
			{
				System.out.println("You have not entered anything");
			} // End of if 
		} // End of while

		szLetter = "";
		while (!szLetter.matches("[a-zA-z]{1}")) 
		{
			System.out.println("Please enter your first intital:  ");
			szLetter = szKeyboard.nextLine().toUpperCase();
			
			if (szLetter.equals(""))
			{
				System.out.println("You have not entered anything");
			} // End of if 
		} // End of while
		System.out.println("----------------------------------------------------------------------------------------------------------------------");



		// --------------------------------------------------------------------------------------------------------
		// J) Creating a presence, type and length check on a users input
		// =========================================================================================================

		//add space and heading for task
		System.out.println();
		System.out.println();
		System.out.println("======================================================================================================================");
		System.out.println("J. Creating a presence, type, range and length check on a users input");
		System.out.println("======================================================================================================================");
		szLetter = "";
		
		System.out.println("Please enter your 4 digit number");
		szLetter = szKeyboard.nextLine();
		
		while (!szLetter.matches("[0-9]{4}")) 
		{
			System.out.println("Please enter your 4 digit number:  ");
			szLetter = szKeyboard.nextLine();
			
			if (szLetter.equals(""))
			{
				System.out.println("You have not entered anything");
			} // End of if 
		} // End of while

		System.out.println("----------------------------------------------------------------------------------------------------------------------");

		iKeyboard.close();
		szKeyboard.close();
		scKeyboard.close();

	}//end main

}//end class