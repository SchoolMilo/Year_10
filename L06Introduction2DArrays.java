import java.util.Scanner;

public class L06Introduction2DArrays 
{

	public static void main(String[] args) 
	{
		Scanner szKeyboard = new Scanner(System.in);
		//add space and heading for task
		System.out.println();
		System.out.println();
		System.out.println("===================================");
		System.out.println("A. Creating 2D Arrays - Method 1");
		System.out.println("===================================");

		String[][] szWords = new String[3][3];
		
        String border = "-----------------------------";
        String rowFormat = "| %-12s | %-12s |%n";

        System.out.println(border);


        System.out.printf(rowFormat, "Make", "Colour");


        System.out.println(border);


        for (int i = 0; i < szWords.length; i++) {
            String col1 = (szWords[i][0] == null) ? "null" : szWords[i][0];
            String col2 = (szWords[i][1] == null) ? "null" : szWords[i][1];

            // 5. Inner Logic: Print formatted row
            System.out.printf(rowFormat, col1, col2);
        }

        // 6. Print Bottom Border
        System.out.println(border);

		
		//add space and heading for task
		System.out.println();
		System.out.println();
		System.out.println("===================================");
		System.out.println("B. Creating 2D Arrays - Method 2");
		System.out.println("===================================");
        String[][] carsB = {
            {"Ford", "Silver"},
            {"Jeep", "Blue"},
            {"Vauxhall", "Red"}
        };

        System.out.println(border);
        System.out.printf(rowFormat, "Make", "Colour");
        System.out.println(border);
        for (String[] row : carsB) {
            System.out.printf(rowFormat, row[0], row[1]);
        }
        System.out.println(border);


		
		//add space and heading for task
		System.out.println();
		System.out.println();
		System.out.println("================================================");
		System.out.println("C. Creating 2D Arrays - Method 3 with User Input");
		System.out.println("================================================");
        String[][] carsC = new String[3][2];

        // Loop to get user input
        for (int i = 0; i < carsC.length; i++) {
            System.out.print("Please enter the make of car " + (i + 1) + ": ");
            carsC[i][0] = szKeyboard.nextLine();
            System.out.print("Please enter the colour of the car: ");
            carsC[i][1] = szKeyboard.nextLine();
        }

        // Print the formatted table
        System.out.println(border);
        System.out.printf(rowFormat, "Make", "Colour");
        System.out.println(border);
        for (int i = 0; i < carsC.length; i++) {
            System.out.printf(rowFormat, carsC[i][0], carsC[i][1]);
        }
        System.out.println(border);


		szKeyboard.close();

	}//end main

}//end class