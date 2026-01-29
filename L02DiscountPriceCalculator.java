
/**
 *  @author Milo Mitchell-Brooks
 *  @version v1
 *  @aim To check if a number is odd or even
 */


import java.util.Scanner;


public class L02DiscountPriceCalculator {

	public static void main(String[] args) 
	{
			// Declare variables
			String szItem = "";
			float fltPrice = 0;
			float fltNewPrice = 0;
			int iDiscount = 0;
				
			// Create scanner's
			Scanner szKeyboard = new Scanner(System.in);
			Scanner fltKeyboard = new Scanner(System.in);
			Scanner iKeyboard = new Scanner(System.in);
				
			// User input 
			System.out.print("What item are you looking to buy?  ");
			szItem = szKeyboard.nextLine();
			szItem = szItem.replaceAll("\\s+","");
			System.out.print("What is the price of the item?  £");
			fltPrice = fltKeyboard.nextFloat();
			System.out.println("What is the discount percentage available?  ");
			iDiscount = iKeyboard.nextInt();
				
			// Calculations'  250 - (250 *0.5)
			fltNewPrice = fltPrice * (1 - iDiscount / 100);
				
			// User output
			System.out.println(iDiscount);
			System.out.printf("The original price for a " + szItem + " was £%.2f", fltPrice);
			System.out.printf("\nOnce the discount of " + iDiscount + "%% has been applied it will cost you £%.2f" , fltNewPrice);
				

	} // End of Main

} // End of Class
