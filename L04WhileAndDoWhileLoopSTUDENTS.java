/**
 *  @author Milo Mitchell-Brooks
 *  @version v1
 *  @aim To check the distance of lightning
 */

import java.util.Scanner;

public class L04WhileAndDoWhileLoopSTUDENTS 
{

	public static void main(String[] args) 
	{
		//create scanner objects
		Scanner iKeyboard = new Scanner(System.in);
		Scanner szKeyboard = new Scanner(System.in);

		//declare variables for the mini tasks
		int iNum = 0;
		int iNum1 = 0;
		String szString = "";
		String szString1 = "";
		boolean bContinue = true;





		/*////////////////////////////////////////////////////////
		 * 1. Set the total to 0 to start with. 
		 * While the total is 50 or less, ask the user to input a number. 
		 * Add that number to the total and print the message “The total is…[total]”. 
		 * Stop the loop when the total is over 50.
		 */
		System.out.println("\n Number 1 ____________________________________");
		
		iNum = 0;
		iNum1 = 0;
		
		while (iNum1 <= 50) 
		{
			System.out.println("Enter any number:  ");
			iNum = iKeyboard.nextInt();
			iNum1 = iNum + iNum1;
			System.out.println("The total is " + iNum1);
		} // End of while



		/*////////////////////////////////////////////////////////
		 * 2. Ask the user to enter a number. 
		 * Keep asking until they enter a value over 5 
		 * and then display the message “The last number you entered was a [number]” 
		 * and stop the program. 
		 */
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("\n Number 2 ____________________________________");
		
		iNum = 0;
		
		do 
		{
			System.out.println("Enter a number:  ");
			iNum = iKeyboard.nextInt();
		} while (iNum < 5);
		
		System.out.println("The last number you entered was " + iNum);




		/*////////////////////////////////////////////////////////
		 * 3. Ask the user to enter a number and then enter another number. 
		 * Add these two numbers together and then ask if they want to add another number. 
		 * If they enter “y”, ask them to enter another number and keep adding numbers until they do not answer “y”. 
		 * Once the loop has stopped, display the total. 
		 */
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("\n Number 3 ____________________________________");
		
		szString = "y";
		iNum = 0;
		iNum1 = 0;
		
		System.out.println("Entera number");
		iNum = iKeyboard.nextInt();
		iNum1 = iNum + iNum1;
		
		while (szString.equals("y")) 
		{
			System.out.println("Enter another number:  ");
			iNum = iKeyboard.nextInt();
			iNum1 = iNum + iNum1;
			
			System.out.println("Do you want to add another number?: (answer y) ");
			szString = szKeyboard.nextLine();
		} // End of while
		System.out.println(iNum1);

		




		/*////////////////////////////////////////////////////////
		 * 4. Ask for the name of somebody the user wants to invite to a party. 
		 * After this, display the message “[name] has now been invited” 
		 * and add 1 to the count. Then ask if they want to invite somebody else. 
		 * Keep repeating this until they no longer want to invite anyone else to the party 
		 * and then display how many people they have coming to the party. 
		 */
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("\n Number 4 ____________________________________");
		iNum = 0;
		
		do 
		{
			System.out.println("Enter the name of who you want to invite to your party:  ");
			szString = szKeyboard.nextLine();
			iNum = iNum + 1;
			System.out.println(szString + " has now been invited");
			System.out.println("Do you want to invite somebody else?:  (yes or (type anything = no))");
			szString1 = szKeyboard.nextLine();
			szString1 = szString1.toLowerCase();
			szString1 = szString1.trim();
			if (szString1.equals("yes")) 
			{
				bContinue = true;
			} else
			{
				bContinue = false;
			} // End of if
			
		} while (bContinue != false);
		System.out.println("You inivited " + iNum + " people");






		/*////////////////////////////////////////////////////////
		 * 5. Create a variable called compnum and set the value to 50. 
		 * Ask the user to enter a number. While their guess is not the same as the compnum value, 
		 * tell them if their guess is too low or too high and ask them to have another guess. 
		 * If they enter the same value as compnum, display the message “Well done, you took [count] attempts”. 
		 */
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("\n Number 5 ____________________________________");
		
		int compnum = 50;
		iNum = 0;
		iNum1 = 0;
		
		do 
		{
			iNum1 = iNum1 + 1;
			System.out.println("Enter a number:  ");
			iNum = iKeyboard.nextInt();
			if (iNum < compnum) 
			{
				System.out.println("Too low");
				System.out.println("Try again");
			} else if (iNum > compnum) {
				System.out.println("Too high");
				System.out.println("Try again");
			} // End of if
		} while (iNum != compnum);
		System.out.println("Well done, you took " + iNum1 + " attempts");
		
		

		
		



		/*////////////////////////////////////////////////////////
		 * 6. Ask the user to enter a number between 10 and 20. 
		 * If they enter a value under 10, display the message “Too low” 
		 * and ask them to try again. If they enter a value above 20, 
		 * display “Too high” and ask them to try again. 
		 * Keep repeating this until they enter a value that is between 10 and 20 
		 * and then display the message “Thank you”. 
		 */
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("\n Number 6 ____________________________________");
		
		do {
			System.out.println("Enter a number between 10 and 20");
			iNum = iKeyboard.nextInt();
			if (iNum < 10) 
			{
				System.out.println("Too low");
				System.out.println("Try again");
			} else if (iNum > 20)
			{
				System.out.println("Too high");
				System.out.println("Try again");
			} else {
				System.out.println("Thank you");
			}
		}while (iNum < 10 || iNum > 20);
		System.out.println("Thank you");
		

		
		




		/*////////////////////////////////////////////////////////
		 * 7. Using the song “10 green bottles”, display the lines 
		 * “There are [num] green bottles hanging the wall, [num] green bottles hanging on the wall, and if 1 green bottle should accidently fall”. 
		 * Then ask the question “how many green bottles will be hanging on the wall?” 
		 * If the user answers correctly, display the message “There will be [num] green bottles hanging on the wall”. 
		 * If they answer incorrectly, display the message “No, try again” until they get it right. 
		 * When the number of green bottles gets down to 0, display the message “There are more no green bottles hanging on the wall”. 
		 */
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("\n Number 7 ____________________________________");
			
		iNum = 10;
		iNum1 = 0;
		
		while (iNum > 0) 
		{
			System.out.println("There are " + iNum + " green bottles hanging on the wall " + iNum + " green bottles hanging on the wall, and if 1 green bottle should accidentally fall");
			iNum = iNum-1;
			do { 
				System.out.println("How mnay green bottles will be hanging on the wall?:  ");
				iNum1 = iKeyboard.nextInt();
				if (iNum1 != iNum) {
					System.out.println("Try again");
				} // End of if
			} while (iNum1 != iNum);
			System.out.println("There will be " + iNum1 + " green bottles hanging on the wall");
		} // End of while
		System.out.println("There are no green bottles hanging on the wall");
			
		


		


		//close scanner objects
		iKeyboard.close();
		szKeyboard.close();

	}//end main

}//end class