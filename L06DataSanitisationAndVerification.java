import java.util.Scanner;

public class L06DataSanitisationAndVerification 
{

	public static void main(String[] args) 
	{
	// Create scanner objects
	Scanner szKeyboard = new Scanner(System.in);
	
	// Declare variables
	boolean bCompleted = false;
	boolean bCompleted1 = false;
	boolean bAgain = false;
	boolean bAgain1 = false;
	char cLetter = 's';
	int iSpaces = 0;
	String szFullName = "";
	String szAgain = "";
	
	
	// Main loop
	while (!bCompleted) 
	{
		if (bAgain) 
		{
		 System.out.println("Please enter your full name again:  ");	
		 bAgain = false;
		} else 
		{
			System.out.println("Please enter your full name:  ");
		} // End of else-if statement
		szFullName = szKeyboard.nextLine();
		
		if (szFullName.matches("(^[a-zA-Z]?[a-zA-Z\s]+$)")) 
		{
			szFullName = szFullName.toLowerCase();
			
			String szNames[] = szFullName.split("\\s+");
			
		    StringBuilder FormattedName = new StringBuilder();

		    for (String szWord : szNames) 
		    {
		        if (!szWord.isEmpty()) 
		        {
		            FormattedName.append(Character.toUpperCase(szWord.charAt(0))).append(szWord.substring(1)).append(" ");
		        } // End of if statement
		    } // End of for loop

		    szFullName = FormattedName.toString().trim();
		    
		    System.out.println("You have entered " + szFullName);
			
			while(!bCompleted1) 
			{
				if (bAgain1) 
				{
					System.out.println("Incorrect input try again");
					System.out.println("Enter yes or no:  ");
					bAgain1 = false;
				} else 
				{
					System.out.println("Please verify this is correct (yes or no):  ");
				} // End of else-if statement
				szAgain = szKeyboard.nextLine();
				
				szAgain = szAgain.strip().toLowerCase();
				
				if (szAgain.equals("no")) 
				{
					bAgain = true;
					break;
				} else if (szAgain.equals("yes"))
				{
					System.out.println("Thank you!");
					break;
				} else 
				{
					bAgain1 = true;
					continue;
				} // End of else-if statement
			} // End of secondary while loop
			if (bAgain) 
			{
				continue;
			} else {
				break;// If statement to check if need to restart 
			}
		} else 
		{
			System.out.println("The details you have entered contains invalid characters.");
			bAgain = true;
			continue;
		} // End of else-if statement
	} // End of while main loop
	
		

	} // End of main

} // End of class
