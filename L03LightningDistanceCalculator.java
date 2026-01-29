/**
 *  @author Milo Mitchell-Brooks
 *  @version v1
 *  @aim To check the distance of lightning
 */

import java.util.Scanner;

public class L03LightningDistanceCalculator {

	public static void main(String[] args) 
	{
		// Create scanner object
		Scanner fKeyboard = new Scanner(System.in);

		
		// Declare variables
		final int iSPEED_OF_SOUND = 343;
		float fltTime = 0;
		float fltKilometres = 0;
		float fltMiles = 0f;

		
		// User input
		System.out.println("How many seconds between the lightning strike and hearing the sound of thunder?");
		fltTime = fKeyboard.nextFloat();

		
		// Calculations
		fltKilometres = iSPEED_OF_SOUND * fltTime / 1000;
		fltMiles = fltKilometres / 1.609f;


		// User output
		System.out.printf("In kilometres the storm is £%.2f kilometres away." , fltKilometres);
		System.out.printf("\nIn miles the storm is £%.2f miles away." , fltMiles);

	} // End of Main

} // End of Class
