import java.util.Arrays;
import java.util.Scanner;

public class L06StaticOneDimensionalArrays 
{
	public static void main(String[] args) 
	{
		Scanner iKeyboard = new Scanner(System.in);
		Scanner szKeyboard = new Scanner(System.in);

		// --------------------------------------------------------------------------------------------------------
		// A) Creating a static one dimensional int array and print out all elements - Method 1
		//		
		// =========================================================================================================

		//add space and heading for task
		System.out.println();
		System.out.println();
		System.out.println("======================================================================================================================");
		System.out.println("A. Creating a static one dimensional int array and print out all elements - Method 1");
		System.out.println("======================================================================================================================");
		int[] iArray = new int[5];
		iArray[0] = 97;
		iArray[1] = 63;
		iArray[2] = 35;
		iArray[3] = 40;
		iArray[4] = 76;
		
		for (int i = 0; i < iArray.length; i++) 
		{
			System.out.println(iArray[i]);
		} // End of for loop


		System.out.println("----------------------------------------------------------------------------------------------------------------------");


		// --------------------------------------------------------------------------------------------------------
		// B) Creating a static one dimensional String array and printing out all elements - Method 2
		//		Create an array with the values Ford, Volvo, Vauxhall, Audi and Fiat
		//		Print out each element withint the array
		// =========================================================================================================

		//add space and heading for task
		System.out.println();
		System.out.println();
		System.out.println("======================================================================================================================");
		System.out.println("B. Creating a static one dimensional String array and printing out all elements - Method 2");
		System.out.println("======================================================================================================================");
		String[] szArray = {"Ford", "Volvo", "Vauxhall", "Audi", "Fiat"};
		
		for (int i = 0; i < szArray.length; i++) 
		{
			System.out.println(szArray[i]);
		} // End of for loop



		System.out.println("----------------------------------------------------------------------------------------------------------------------");


		// --------------------------------------------------------------------------------------------------------
		// C) Creating a one dimensional static String array and sorting the elements into alphabetical order
		//		Create an array with the elements for the seven dwarfs
		//		Sort the dwarfs into alphabetical order
		//		Print out the dwarfs
		// =========================================================================================================

		//add space and heading for task
		System.out.println();
		System.out.println();
		System.out.println("======================================================================================================================");
		System.out.println("C. Creating a one dimensional static String array and sorting the elements into alphabetical order");
		System.out.println("======================================================================================================================");
		String[] szArray1 = {"Bashful", "Sneezy", "Grumpy", "Happy", "Doc", "Dopey", "Sleepy"};
		Arrays.sort(szArray1);
	
		for (int i = 0; i < szArray1.length; i++) 
		{
			System.out.println(szArray1[i]);
		} // End of for loop 



		System.out.println("----------------------------------------------------------------------------------------------------------------------");



		// --------------------------------------------------------------------------------------------------------
		// D) Retrieving one piece of data from a one dimensional static array
		//		Create an array with the elements FIFA 17, Destiny, Fallout 4, Grand Theft Auto and NBA 2K17
		//		Print out the element at index 3
		// =========================================================================================================
		String[] szArray2 = {"FIFA 17", "Destiny", "Fallout 4", "Grand Theft Auto", "NBA 2K"};
		
		System.out.println(szArray[3]);


		System.out.println("----------------------------------------------------------------------------------------------------------------------");



		// --------------------------------------------------------------------------------------------------------
		// E) Changing an element within a one dimensional static array
		//		Create an array with the elements Jeremy Corbyn, David Cameron, Tim Farron
		//		Change the element relevant to replace David Cameron with Theresa May
		// =========================================================================================================

		//add space and heading for task
		System.out.println();
		System.out.println();
		System.out.println("======================================================================================================================");
		System.out.println("E. Changing an element within a one dimensional static array");
		System.out.println("======================================================================================================================");

		String[] szArray3 = {"Jeremy Corbyn", "David Cameron", "Tim Farron"};
		
		szArray3[1] = "Theresa May";
		
		for (int i = 0; i < szArray3.length ; i++) 
		{
			System.out.println(szArray3[i]);
		}



		System.out.println("----------------------------------------------------------------------------------------------------------------------");


		// --------------------------------------------------------------------------------------------------------
		// F) Changing all elements within a one dimensional static array
		//		Create an array with the following scores 4 12 32 18 21
		//		Add 3 to each element within the array and print out all the updated elements
		// =========================================================================================================

		//add space and heading for task
		System.out.println();
		System.out.println();
		System.out.println("======================================================================================================================");
		System.out.println("F. Changing all elements within a one dimensional static array");
		System.out.println("======================================================================================================================");

		int[] szArray4 = {4, 12, 32, 18, 21};
		
		for (int i = 0; i < szArray4.length; i++) 
		{
			for (int j = 0; j < szArray.length; j++) 
			{
				szArray4[j] = szArray4[j] + 3;
			}
			System.out.println(szArray4[i]);
		}


		System.out.println("----------------------------------------------------------------------------------------------------------------------");


		// --------------------------------------------------------------------------------------------------------
		// G) Finding duplicated data within a one dimensional static array
		//		Create an array with the following elements 23 32 23 64 34 75 32 85 92
		//		Find any repeated elements within the array and print out which elements have been repeated
		// =========================================================================================================

		//add space and heading for task
		System.out.println();
		System.out.println();
		System.out.println("======================================================================================================================");
		System.out.println("G. Finding duplicated data within a one dimensional static array");
		System.out.println("======================================================================================================================");
		int[] iArray1 = {23, 32, 23, 64, 34, 75, 32, 85, 92};
		

		// 1. Sort the array first
		Arrays.sort(iArray1); 

		// 2. Now your consecutive check will work
		for (int i = 1; i < iArray1.length; i++) {
		    if(iArray1[i-1] == iArray1[i]) {
		        System.out.println("Duplicate found: " + iArray1[i]);
		    }
		}

		System.out.println("----------------------------------------------------------------------------------------------------------------------");


		// --------------------------------------------------------------------------------------------------------
		// H) Finding the biggest numbers in a one dimensional static array using a sort method
		//		Create an array with the following elements 23 32 23 64 34 75 32 85 92
		//		Use sort to find the min and max number in the array
		// =========================================================================================================

		//add space and heading for task
		System.out.println();
		System.out.println();
		System.out.println("======================================================================================================================");
		System.out.println("H. Finding the max and min numbers in a one dimensional static array using a sort method");
		System.out.println("======================================================================================================================");
		int iMax = 0;
		int iMin = 0;
		int[] iNumbers = {23, 32, 23, 64, 34, 75, 32, 85, 92};
		
		for (int i = 0; i < iNumbers.length; i++) 
		{
			if (iMax < iNumbers[i]) 
			{
				
			}
		}


		System.out.println("----------------------------------------------------------------------------------------------------------------------");


		// --------------------------------------------------------------------------------------------------------
		// I) Finding the max and min numbers in a one dimensional static array 
		//    using an if within a for loop to transverse the elements within the array
		//		Create an array with the following elements 23 32 23 64 34 75 32 85 92
		//		Use a for loop and an if statement to find the min and max number in the array
		// =========================================================================================================

		//add space and heading for task
		System.out.println();
		System.out.println();
		System.out.println("======================================================================================================================");
		System.out.println("I. Finding the max and min numbers in a one dimensional static array"
				+ "\n using an if within a for loop to transverse the elements within the array");
		System.out.println("======================================================================================================================");



		System.out.println("----------------------------------------------------------------------------------------------------------------------");


		// --------------------------------------------------------------------------------------------------------
		// J) Finding the biggest numbers in a one dimensional static array
		//		Create an array with the following elements 23 32 23 64 34 75 32 85 92
		//		Add together all of the elements within the array
		//		Then find the average of all the numbers in the array
		// =========================================================================================================

		//add space and heading for task
		System.out.println();
		System.out.println();
		System.out.println("======================================================================================================================");
		System.out.println("J. Finding the average of numbers in a one dimensional static array");
		System.out.println("======================================================================================================================");




		System.out.println("----------------------------------------------------------------------------------------------------------------------");


		// ----------------------------------------------------------------------------------------------------------------
		// K) Splitting a String array into two new String arrays using spaces within an element
		//		Read in each element within the array and slice (split) the element at the space
		//		Store the first name in a new array entitled szFirstNames and the surname in a new array entitled szSurnames
		//		Print out each string array element szFirstNames and szSurnames to look like the full name
		// ================================================================================================================

		//add space and heading for task
		System.out.println();
		System.out.println();
		System.out.println("======================================================================================================================");
		System.out.println("K) Splitting a String array into two new String arrays using spaces within an element");
		System.out.println("======================================================================================================================");



		System.out.println("----------------------------------------------------------------------------------------------------------------------");	


		// --------------------------------------------------------------------------------------------------------
		// L) Splitting of arrays using relational operators
		//		Create a new array with the elements 6 9 2 5 8 3 9 9 10 9 5 7 10
		//		Create a new array iTestsPassed which will store the test results which are 5 or more
		//		You will need to find how many tests were taken and how many were passed
		//		You should then calculate the percentage pass (you will need casting and Math.round()
		// =========================================================================================================

		//add space and heading for task
		System.out.println();
		System.out.println();
		System.out.println("======================================================================================================================");
		System.out.println("L) Splitting of arrays using relational operators");
		System.out.println("======================================================================================================================");



		System.out.println("----------------------------------------------------------------------------------------------------------------------");

		
		// --------------------------------------------------------------------------------------------------------
		// M) Splitting a String variable into a char array
		//		Ask the user to enter a word of their choice, it can be any length
		//		Create a char array and convert the word entered by the user into a char array
		//		Print out the values in the char
		// =========================================================================================================



		System.out.println("----------------------------------------------------------------------------------------------------------------------");

		
		// ------------------------------------------------------------------------------------------------------------
		// N) Using the copyOfRange method to copy elements from one array to another
		//		Create an array with the following elements red, orange, yellow, green, blue, indigo, violet
		//		Create 3 new arrays which will store the elements which have been sliced from the array above
		//		Use the copyOfRange method to slice the ranges shown in the example out into 3 new arrays just created
		// ============================================================================================================

		//add space and heading for task
		System.out.println();
		System.out.println();
		System.out.println("======================================================================================================================");
		System.out.println("N) Using the copyOfRange method to copy elements from one array to another");
		System.out.println("======================================================================================================================");
		

		
		iKeyboard.close();
		szKeyboard.close();
	}//end main
}//end class