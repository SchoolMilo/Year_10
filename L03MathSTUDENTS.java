/**
 *  @author 
 *  @version v1
 *  @aim To use maths in java
 */

import java.util.Scanner;
import java.lang.Math;

public class L03MathSTUDENTS 
{

	public static void main(String[] args) 
	{
		// Create scanner objects
		Scanner dbKeyboard = new Scanner(System.in);
		Scanner iKeyboard = new Scanner(System.in);
		
		// Create variables
		double dbNum1 = 0;
		double dbNum2 = 0;
		double dbNum3 = 0;
		double dbNum4 = 0;
		int iNum1 = 0;
		int iNum2 = 0;
		int iNum3 = 0;
		int iNum4 = 0;
		final double dbPI = Math.PI;
		
		/*////////////////////////////////////////////////////////
		 * 1 Ask the user to enter a number with lots of decimal places. 
		 * Multiply this number by two and display the answer.
		 */
		
		// User input
		System.out.println("Enter a decimal number with lots of decimal places:");
		dbNum1 = dbKeyboard.nextDouble();
		
		// Calculation
		dbNum1 = dbNum1 * 2;
		
		// User output
		System.out.printf("The result is:  %.2f%n", dbNum1);
		
		/*////////////////////////////////////////////////////////
		 * 2 Update program 4.1 so that it will display 
		 * the answer to 2 decimal places.
		 */
		
		// User input
		System.out.println("Enter a decimal number with lots of decimal places:");
		dbNum1 = dbKeyboard.nextDouble();
		
		// User output
		System.out.printf("The result is:  %.2f%n", dbNum1);

		/*////////////////////////////////////////////////////////
		 * 3 Ask the user to enter an integer that is over 500. 
		 * Work out the square root of that number and 
		 * display it to two decimal places.
		 */
		
		// User input
		while (iNum1 < 500) 
		{
		System.out.println("Enter a interger over 500:");
		iNum1 = iKeyboard.nextInt();
		} // End of while
		
		// Calculations
		dbNum1 = Math.sqrt(iNum1);
		
		// User output
		System.out.printf("The result is %.2f%n", dbNum1);
	
		/*////////////////////////////////////////////////////////
		 * 4 Display pi to five decimal places.
		 */
		
		System.out.printf("The result is %.5f%n", dbPI);
		

		/*////////////////////////////////////////////////////////
		 * 5 Ask the user to enter the radius of a circle. 
		 * Work out the area of the circle.
		 */
		
		// User input
		System.out.println("Enter the radius of a circle");
		dbNum1 = dbKeyboard.nextDouble();
		
		// Calculations
		dbNum1 = (double) Math.pow(dbNum1, 2);
		dbNum1 = dbNum1 * dbPI;
		
		// User output
		System.out.println("The area of the circle is " + dbNum1);
				
	
		/*////////////////////////////////////////////////////////
		 * 6 Ask for the radius and the depth of a cylinder and 
		 * work out the total volume (circle area * depth) rounded 
		 * to three decimal places.
		 */
		
		// User input
		System.out.println("Enter the radius of the cylinder");
		dbNum1 = dbKeyboard.nextDouble();
		
		System.out.println("Enter the depth of the cylinder");
		dbNum2 = dbKeyboard.nextDouble();		
		// Calculations
		dbNum1 = (double) Math.pow(dbNum1, 2);
		dbNum1 = dbNum1 * dbPI * dbNum2;
		
		// User output
		System.out.printf("The volume of the circle is %.3f%n", dbNum1);
		




		/*////////////////////////////////////////////////////////
		 * 7 Ask the user to enter two numbers. 
		 * Use whole number division to divide the first number 
		 * by the second and also work out the remainder and 
		 * display the answer in a user-friendly way 
		 * e.g. if they enter 7 and 2 display “7 divided by 2 is 3 
		 * with 1 remainder”.
		 */
		
		// User input
		System.out.println("Enter a number");
		dbNum1 = dbKeyboard.nextDouble();
		
		System.out.println("Enter another number");
		dbNum2 = dbKeyboard.nextDouble();
		
		// Calculations
		dbNum3 = dbNum1 / dbNum2;
		dbNum4 = dbNum1 % dbNum2;
		
		// User output 
		System.out.println(dbNum1 + " divided by " + dbNum2 + " is " + dbNum3 + " with a remainder of " + dbNum4);

		
		/*////////////////////////////////////////////////////////
		 * 8 Display the following message:
		 * 1) Square
		 * 2) Triangle
		 * Enter a number:
		 * If the user enters 1, then it should ask them for the 
		 * length of one of its sides and display the area. 
		 * If they select 2, it should ask for the base and height of the 
		 * triangle and display the area. If they type in anything else, 
		 * it should give them a suitable error message.
		 */
		
		// User input
		System.out.println("1) Square");
		System.out.println("2) Triangle");
		iNum1 = iKeyboard.nextInt();
		
		// Calculations and user input
		switch(iNum1) 
		{
			case 1:
					// User input
					System.out.println("Enter the length of the side:");
					dbNum1 = dbKeyboard.nextDouble();
					
					// Calculations
					dbNum1 = (double) Math.pow(dbNum1, 2);
					
					// User output
					System.out.println("The area of the square is " + dbNum1);
			case 2:
					// User input
					System.out.println("Enter the base of the triangle:");
					dbNum1 = dbKeyboard.nextDouble();	
					
					System.out.println("Enter the height of the triangle:");
					dbNum2 = dbKeyboard.nextDouble();
					
					// Calculations
					dbNum1 = dbNum1 * dbNum2 * 0.5;
					
					// User output
					System.out.println("The area of the triangle is " + dbNum1);
			default:
					System.out.println("You didn't enter a number between 1 and 2");					
		} // End of switch
	} // End of main
} // End of class

// everything is good and it all works well and its very efficient with good names for variables 
// a lot of extra white space on question 4