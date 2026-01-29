import java.util.Scanner;

public class L05DataSanitisationExampleStudents 
{

	public static void main(String[] args) 
	{
		Scanner szKeyboard = new Scanner(System.in);
		String szDirtyStringTaskA = "  This contains spaces which are not allowed";
		String szDirtyStringTaskB = "this*is#a*&ver\\y_dirty&String";
		String szSanitisedA, szSanitisedB, szSanitisedC, szSanitisedD;
		String szFilenameTaskC = "";
		String szFilenameTaskD = "";
		String szVerify = "N";
		String[] szCombinedFile;
		int i;
		String n = "";



		// --------------------------------------------------------------------------------------------------------
		// A) Removing Spaces Between Characters
		// =========================================================================================================
		System.out.println();
		System.out.println("========================================================================================");
		System.out.println("A. Removing All Spaces Between Characters");
		System.out.println("========================================================================================");
		
 

		
		System.out.println("Removing the spaces...");
		szSanitisedA = szDirtyStringTaskA.replaceAll("\\s", "");
		System.out.println(szDirtyStringTaskA + " with no spaces is " + szSanitisedA);


		System.out.println("-----------------------------------------------------------------------------------------");




																																					
		// --------------------------------------------------------------------------------------------------------
		// B) Removing Unwanted Characters from a String
		// =========================================================================================================
	

		System.out.println("========================================================================================");
		System.out.println("B. Removing Unwanted Characters from a String");
		System.out.println("========================================================================================");
	
		System.out.println("Removing unwanted characters...");
		szSanitisedB = szDirtyStringTaskB.replaceAll("\\W", "");
		System.out.println(szDirtyStringTaskB + " with wanted characters " + szSanitisedB);


		System.out.println("-----------------------------------------------------------------------------------------");





		// --------------------------------------------------------------------------------------------------------
		// C) Replacing Spaces with an Underscore Character for Filenames and Removing Unwanted Characters
		// =========================================================================================================
		System.out.println();
		System.out.println("===============================================================================================");
		System.out.println("C. Replacing Spaces with an Underscore Character for Filenames and Removing Unwanted Characters");
		System.out.println("===============================================================================================");
		do 
		{
			System.out.println("Enter a filename");
			
		} while (!szKeyboard.hasNext("[a-zA-Z"));
		System.out.println("replacing spaces with underscores");
		szSanitisedB = szDirtyStringTaskB.replaceAll("\\s", "_");
		
		


		System.out.println("----------------------------------------------------------------------------------------------");

		

		
		
		
		// --------------------------------------------------------------------------------------------------------
		// D) Changing the first letter of each word to capital letters 
		// using the variable szSanitisedC with verification
		// ========================================================================================================

		//add space and heading for task
		System.out.println();
		System.out.println();
		System.out.println("========================================================================================");
		System.out.println("D) Changing the first letter of each word to capital letters with verification");
		System.out.println("========================================================================================");

		


		System.out.println("-----------------------------------------------------------------------------------------");

			
		szKeyboard.close();

	}//end main

}//end class