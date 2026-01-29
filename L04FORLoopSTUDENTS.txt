/**
 *  @author 
 *  @version v1
 *  @aim To use for loops in java
 */

import java.util.Scanner;

public class L04FORLoopSTUDENTS 
{

	public static void main(String[] args) 
	{
		//create scanner objects
		Scanner szKeyboard = new Scanner(System.in);
		Scanner iKeyboard = new Scanner(System.in);


		//declare variables for the mini tasks
		int iNum = 0;
		int i = 0;
		int iNum2 = 0;
		String szString = "";
		String szString2 = "";
		char cWord = 'c';



		/*////////////////////////////////////////////////////////
		 * 1. Ask the user to enter their name and then display their name three times
		 * 
		 */
		
		System.out.println("1. What is your name?:  ");
		szString = szKeyboard.nextLine();
		
		for (i = 1 ; i <= 3 ; i++ ) 
		{
			System.out.println(szString);
		} // End of for loop



		/*////////////////////////////////////////////////////////
		 * 2. Alter the program in 5.1 so that it will ask the 
		 * user to enter their name and a number and 
		 * then display their name that number of times.
		 */
		
		System.out.println("2. What is your name?:  ");
		szString = szKeyboard.nextLine();
		System.out.println("Enter a whole number:  ");
		iNum = iKeyboard.nextInt();
		
		for (i = 1 ; i <= iNum ; i++ ) 
		{
			System.out.println(szString);
		} // End of for loop
		

		/*////////////////////////////////////////////////////////
		 * 3. Ask the user to enter their name and display 
		 * each letter in their name on a separate line.
		 */
		System.out.println("3. What is your name?:  ");
		szString = szKeyboard.nextLine();
		iNum = szString.length();
		
		for (i = 1 ; i <= iNum ; i++) 
		{
			szString2 = szString.substring(i-1 ,i);
			System.out.println(szString2);
		
		}




		/*////////////////////////////////////////////////////////
		 * 4. Change the program in 5.3 to also ask for a number. 
		 * Display their name (one letter at a time on each line) 
		 * and repeat this for the number of times they entered.
		 */
		System.out.println("4. What is your name?:  ");
		szString = szKeyboard.nextLine();
		iNum = szString.length();
		System.out.println("Enter a whole number:  ");
		iNum2 = iKeyboard.nextInt();
		
        for (i = 1; i <= iNum2; i++) {
            for (int j = 0; j < iNum; j++) {
                szString2 = szString.substring(j, j + 1);
                System.out.println(szString2);
            }
        }





		/*////////////////////////////////////////////////////////
		 * 5. Ask the user to enter a number between 1 and 12 
		 * and then display the times table for that number. 
		 */
		
		System.out.println("5. Enter a whole number between 1 and 12:  ");
		iNum = iKeyboard.nextInt();
		
		for (i = 1 ; i <= 12 ; i++) 
		{
			int hello = iNum * i;
			System.out.println(hello);
		} // End of for




		/*////////////////////////////////////////////////////////
		 * 6. Ask for a number below 50 and then count down from 50 
		 * to that number with the output all on the same line, 
		 * making sure you show the number they entered in the output. 
		 */
		
		System.out.println("6. Enter a number below 50:  ");
		iNum = iKeyboard.nextInt();
		System.out.println("You have entered " + iNum + ":  ");
		System.out.println("Counting down...");
		
		for (i = 50 ; i >= iNum ; i--) 
		{
			System.out.println(i);
		} // End of for




		/*////////////////////////////////////////////////////////
		 * 7. Ask the user to enter their name and a number. 
		 * If the number is less than 10, then display their name that number of times; 
		 * otherwise display the message “Too high” three times. 
		 */
		
		System.out.println("7. Enter your name:  ");
		szString = szKeyboard.nextLine();
		System.out.println("Enter a whole number:  ");
		iNum = iKeyboard.nextInt();
		
		if (iNum < 10) 
		{
			for (i = 1 ; i <= iNum ; i++) 
			{
				System.out.println(szString);
			} // End of for
		} else {
			for (i = 1 ; i <= 3 ; i++) {
				System.out.println("Too high");
			} // End of for
		} // End of if





		/*////////////////////////////////////////////////////////
		 * 8. Set a variable called total to 0. 
		 * Ask the user to enter five numbers and after each input ask them if they want that number included. 
		 * If they do, then add the number to the total. If they do not want it included, 
		 * don’t add it to the total. After they have entered all five numbers, display that total. 
		 */
		
		int iTotal = 0;
		
		for (i = 1; i <= 5 ; i++) 
		{
			System.out.println("8. Enter a whole number");
			iNum = iKeyboard.nextInt();
			System.out.println("Do you want to add it to the total?: (yes or no)");
			szString = szKeyboard.nextLine();
			szString = szString.toLowerCase();
			szString = szString.trim();
			if (szString.equals("no")) {
				continue;
			} else if (szString.equals("yes")) {
				iTotal = iTotal + iNum;
				System.out.println("Added");
			} // End of if
		} // End of for
		System.out.println("The total is " + iTotal);






		/*////////////////////////////////////////////////////////
		 * 9. Ask which direction the user wants to count (up or down). 
		 * If they select up, then ask them for the top number and then count from 1 to that number. 
		 * If they select down, ask them to enter a number below 20 and then count down from 20 to that number. 
		 * If they entered something other than up or down, display the message “I don’t understand”. 
		 */
		
		System.out.println("9. What direction do you want to count?: (up/down)");
		szString = szKeyboard.nextLine();
		szString = szString.toLowerCase();
		szString = szString.strip();
		if (szString.equals("up")) {
			System.out.println("What is the top number?:  ");
			iNum = iKeyboard.nextInt();
			for (i = 1; i <= iNum ; i++) {
				System.out.println("Counting up");
				System.out.println(i);
			}
		} else if (szString.equals("down")) {
			System.out.println("Enter a number below 20:  ");
			iNum = iKeyboard.nextInt();
			for (i = 20; i >= iNum ; i--) {
				System.out.println("Counting down");
				System.out.println(i);
			}
		} else {
			System.out.println("I dont understand");
		} // End of if




		/*////////////////////////////////////////////////////////
		 * 10. Ask how many people the user wants to invite to a party. 
		 * If they enter a number below 10, ask for the names and after each name display “[name] has been invited.”. 
		 * If they enter a number which is 10 or higher, display the message “Too many people.”. 
		 */
		
		System.out.println("How many people are going to the party?:  ");
		iNum = iKeyboard.nextInt();
		if (iNum < 10) {
			for (i = 1 ; i <= iNum ; i++) {
				System.out.println("Enter name");
				szString = szKeyboard.nextLine();
				System.out.println(szString + " has been invited");
			} // End of for
		} else if (iNum >= 10) {
			System.out.println("Too many people");
		} // End of if




		//close scanner objects


		
		
	}//end main

}//end class
