
/**
 *  @author Milo Mitchell-Brooks
 *  @version v1
 *  @aim To check if a number is odd or even
 */


import java.util.Scanner;

public class L03SelectiveStatementsSTUDENTS 
{

	public static void main(String[] args)
	{
		//create scanner objects and variables
		
		Scanner fltKeyboard = new Scanner(System.in);
		Scanner szKeyboard = new Scanner(System.in);
		Scanner iKeyboard = new Scanner(System.in);



		//declare variables for the mini tasks
		
		float fltNum1 = 0;
		float fltNum2 = 0;
		int iNum1 = 0;
		int iNum2 = 0;
		String szString1 = "";
		String szString2 = "";





		/*////////////////////////////////////////////////////////
		 * 1 Ask for two numbers. If the first one is larger than the second, 
		 * display the second number first and then the first number, 
		 * otherwise show the first number first and then the second. 
		 */
		
		System.out.println("Enter any number:  ");
		fltNum1 = fltKeyboard.nextFloat();
		System.out.println("Enter a second number:  ");
		fltNum2 = fltKeyboard.nextFloat();
		
		if (fltNum1 > fltNum2) 
		{
			System.out.println(fltNum2 + " " + fltNum1);
		} else {
			System.out.println(fltNum1 + " " + fltNum2);
		} // End of if




		/*////////////////////////////////////////////////////////
		 * 2 Ask the user to enter a number that is under 20. 
		 * If they enter a number that is 20 or more, display 
		 * the message “Too high”, otherwise display “Thank you”. 
		 */
		
		System.out.println("Enter a number under 20:  ");
		fltNum1 = fltKeyboard.nextFloat();
		
		if (fltNum1 >= 20) 
		{
			System.out.println("Too high");
		} else {
			System.out.println("Thank you");
		} // End of if
		

	




		/*////////////////////////////////////////////////////////
		 * 3 Ask the user to enter a number between 10 and 20 (inclusive).
		 * If they enter a number within this range, display the message “Thank you”,
		 * otherwise display the message “Incorrect answer”. 
		 */
		
		System.out.println("Enter a number between 10 and 20 (inclusive):  ");
		fltNum1 = fltKeyboard.nextFloat();
		
		if (fltNum1 >= 10 && fltNum1 <= 20) {
			System.out.println("Thank you");
		} else {
			System.out.println("Incorrect answer");
		} // End of if


	




		/*////////////////////////////////////////////////////////
		 * 4 Ask the user to enter their favourite colour. 
		 * If they enter “red”, “RED” or “Red” display the message “I like red too”, 
		 * otherwise display the message “I don’t like [colour], I prefer red”. 
		 */

		System.out.println("Enter your favourite colour:  ");
		szString1 = szKeyboard.nextLine();
		
		if (szString1 == "red" || szString1 == "RED" || szString1 == "Red") 
		{
			System.out.println("I like red too");
		} else {
			System.out.println("I dont like " + szString1 + " I prefer red");
		} // End of if
	





		/*////////////////////////////////////////////////////////
		 * 5 Ask the user if it is raining and convert their answer 
		 * to lowercase so it doesn’t matter what case they type it in. 
		 * If they answer “yes”, ask if it is windy. If they answer “yes” 
		 * to this second question, display the answer “It is too windy for an umbrella”, 
		 * otherwise display the message “Take an umbrella”. 
		 * If they did not answer yes to the first question, 
		 * display the answer “Enjoy your day”. 
		 */
		
		System.out.println("Is it raining (yes or no):  ");
		szString1 = szKeyboard.nextLine();
		
		szString1 = szString1.toLowerCase();
		
		if (szString1 == "yes") 
		{
			System.out.println("Is it windy (yes or no):  ");
			szString2 = szKeyboard.nextLine();
			
			if (szString2 == "yes") {
				System.out.println("Its too windy for an umbrella");
			} else {
				System.out.println("Take a umbrella");
			} // End of if 
		} else {
			System.out.println("Enjoy your day");
		} // End of if 
		



		/*////////////////////////////////////////////////////////
		 * 6 Ask the user’s age. If they are 18 or over, display 
		 * the message “You can vote”, if they are aged 17, display 
		 * the message “You can learn to drive”, if they are 16, 
		 * display the message “You can buy a lottery ticket”, 
		 * if they are under 16, display the message “You can go Trick-or-Treating”. 
		 */
		
		System.out.println("What is your age:  ");
		iNum1 = iKeyboard.nextInt();
		
		if (iNum1 >= 18) 
		{
			System.out.println("You can vote");
		} else {
			switch (iNum1) 
			{
				case 17:
					System.out.println("You can buy a lotterly ticket");
				break;
				case 16:
					System.out.println("You can learn to drive");
				break;
				default:
					System.out.println("You can go Trick-or-Treating");
			} // End of switch
		} // End of if





		/*////////////////////////////////////////////////////////
		 * 7 Ask the user to enter a number. If it is under 10, 
		 * display the message “Too low”, if their number is between 10 and 20, 
		 * display “Correct”, otherwise display “Too high”. 
		 */
		
		System.out.println("Enter a number:  ");
		fltNum1 = fltKeyboard.nextFloat();
		
		if (fltNum1 < 10) 
		{
			System.out.println("Too low");
		} else if (fltNum1 >= 10 && fltNum1 <= 20) 
		{
			System.out.println("Correct");
		} else {
			System.out.println("Too high");
		} // End of if





		/*////////////////////////////////////////////////////////
		 * 8 Ask the user to enter 1, 2 or 3. If they enter a 1, 
		 * display the message “Thank you”, if they enter a 2, 
		 * display “Well Done”, if they enter a 3, display “Correct”. 
		 * If they enter anything else, display “Error message”. 
		 */
		
		System.out.println("Enter 1 2 or 3");
		iNum2 = iKeyboard.nextInt();
		
		switch (iNum2) 
		{
			case 1:
				System.out.println("Thank you");
			case 2:
				System.out.println("Well done");
			case 3:
				System.out.println("Correct");
			default:
				System.out.println("Error message");
		}




		//close scanner objects
	
	}  // End of class

} // End of main
