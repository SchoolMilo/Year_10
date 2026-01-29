/**
 * @author Milo
 * @version 1.1
 */

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class L06LuckyDipLotteryEXT
{
    public static void main(String[] args)
    {
        Scanner szKeyboard = new Scanner(System.in);
        Random rGen = new Random();

        String szInput = "";
        int iLines = 0;
        boolean bValid = false;

        // Ask user how many lines they want
        while (!bValid)
        {
            System.out.println("How many lines would you like?");
            szInput = szKeyboard.nextLine().strip();

            // Validate whole number
            if (!szInput.matches("\\d+"))
            {
                System.out.println("You have not entered a valid number.");
                System.out.println("Please enter a whole number:");
                continue;
            }

            // Convert to integer
            iLines = Integer.parseInt(szInput);

            if (iLines <= 0)
            {
                System.out.println("You have not entered a valid number.");
                System.out.println("Please enter a whole number:");
                continue;
            }

            bValid = true;
        }

        System.out.println("Your lucky dip numbers are...");

        // Generate each lucky dip
        for (int k = 0; k < iLines; k++)
        {
            int[] iNumbers = new int[6];
            int iTemp = 0;
            boolean bDuplicate = false;

            // Generate 6 distinct numbers
            for (int i = 0; i < 6; i++)
            {
                do
                {
                    bDuplicate = false;
                    iTemp = rGen.nextInt(59) + 1;

                    for (int j = 0; j < i; j++)
                    {
                        if (iNumbers[j] == iTemp)
                        {
                            bDuplicate = true;
                            break;
                        }
                    }
                }
                while (bDuplicate);

                iNumbers[i] = iTemp;
            }

            // Bonus ball is last number
            int iBonusBall = iNumbers[5];

            // Sort first 5 numbers
            int[] iMainNumbers = Arrays.copyOf(iNumbers, 5);
            Arrays.sort(iMainNumbers);

            // Output line
            for (int i = 0; i < 5; i++)
            {
                System.out.print(iMainNumbers[i] + " ");
            }

            System.out.println("Bonus ball " + iBonusBall);
        }

        szKeyboard.close();
    } // End of main
} // End of class

// code is very robust and good against letters and wrong inputs
//code could be better by accepting higher numbers just rejecting them
//code has good indentation and white space
//could make the code a bit simpler and shorter
