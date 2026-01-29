

import java.util.Scanner;
import java.util.Random;
public class L06Magic8Ball 
{

	public static void main(String[] args) 
	{
		// Create scanner objects
		Scanner szKeyboard = new Scanner (System.in);
		Random random = new Random();
		
		// Declare variables
		String szAnswer = "";
		boolean bCompleted = false;
		boolean bCompleted1 = false;
		boolean bAgain = false;
		int iAnswer = 0;
		
		System.out.println("Welcome to Magic 8 Ball");
		
		while (!bCompleted) 
		{
			System.out.println("\n\nAsk the Magic 8 Ball a question.");
			
			System.out.println("Question:");
			szKeyboard.nextLine();
			iAnswer = random.nextInt(6) + 1;
			
			switch (iAnswer) 
			{
				case 1:
					System.out.println("Outcome not so good");
					break;
				case 2:
					System.out.println("All outcomes point to yes");
					break;
				case 3:
					System.out.println("It is certain");
					break;
				case 4:
					System.out.println("Ask again later");
					break;
				case 5:
					System.out.println("Better not tell you now");
					break;
				default:
					System.out.println("Error");
					break;
			} // End of switch case statement
			
			while (!bCompleted1) 
			{
				if (bAgain) 
				{
					System.out.println("Invalid entry. Please enter y or n:");
				} else 
				{
					System.out.println("Would you like to ask the Magic 8 Ball another question? (y or n)");
				} // End of if statement
				bAgain = false;
				
				szAnswer = szKeyboard.nextLine();
				szAnswer = szAnswer.toLowerCase().trim();
				
				if (szAnswer.equals("y") || szAnswer.equals("n")) 
				{
					break;
				} else 
				{
					bAgain = true;
				} // End of else-if statement
			} // End of while loop
			
			if (szAnswer.equals("n")) 
			{
				System.out.println("Ok. Goodbye!");
				break;
			} // End of if statement
		} // End of main while loop
		

	} // End of main

} // End of class
