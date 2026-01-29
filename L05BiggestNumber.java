/**
 * @author Milo
 * @version 1.1
 */

import java.util.Scanner;

public class L05BiggestNumber
{
    public static void main(String[] args)
    {
        Scanner szKeyboard = new Scanner(System.in);

        int iNum1 = 0;
        int iLength = 0;
        int iMax = 0;
        int[] iNumbers = new int[3];

        boolean bAgain = false;
        boolean bWholeNum;
        boolean bPassed = false;
        boolean bGo = false;
        boolean bCompleted = false;
        boolean bNotDigit = true;

        for (int i = 0; i < 3; i++)
        {
        	bCompleted = false;
        	bPassed = false;
            while (!bCompleted)
            {
                bWholeNum = false;
                bNotDigit = true;


                if (bAgain)
                {
                    System.out.println("Enter another whole number");
                }
                else
                {
                    System.out.println("Enter a whole number");
                } // End of if-else statement
                
                String szNum1 = szKeyboard.nextLine();
                
                if (szNum1.matches("\\d+"))
                {
                    szNum1 = szNum1.strip();
                    iLength = szNum1.length();

                    if (iLength == 4 && szNum1.charAt(0) != '0')
                    {
                    	iNum1 = Integer.parseInt(szNum1);
                        bPassed = true;
                        System.out.println("Good Job!");
                    }
                    else if (szNum1.charAt(0) == '0')
                    {
                    	System.out.println("Can not start with number 0");
                    	if (iLength != 4)
                        {
                            System.out.println(
                                    "Number entered is " + iLength +
                                    " digits long, make sure it is 4 long");
                            System.out.println("");
                            continue;
                        } // End of if-else statement
                    }
                    else if (iLength != 4)
                    {
                        System.out.println(
                                "Number entered is " + iLength +
                                " digits long, make sure it is 4 long");
                        System.out.println("");
                        continue;
                    } // End of if-else statement
                }
                else
                {
                    bWholeNum = true;
                } // End of if-else statement

                if (bWholeNum)
                {
                    System.out.println("Not a whole number");
                    System.out.println("Try again\n");
                    continue;
                }

                bAgain = true;
                
             // Only check duplicates after a valid number has been parsed into iNum1
                if (iLength == 4 && szNum1.charAt(0) != '0') {
                    iNum1 = Integer.parseInt(szNum1);

                    // Duplicate check for second number
                    if (i == 1 && iNum1 == iNumbers[i-1]) {
                        System.out.println("Oops...");
                        System.out.println(iNum1 + " has already been entered");
                        System.out.println("There can be no duplicates");
                        continue; // go back to start of while loop for new input
                    } else if (i == 2 && (iNum1 == iNumbers[i-1] || iNum1 == iNumbers[i-2])) 
                    {
                        System.out.println("Oops...");
                        System.out.println(iNum1 + " has already been entered");
                        System.out.println("There can be no duplicates");
                        continue;
                    }

                    // Everything valid, store number
                    iNumbers[i] = iNum1;
                    bCompleted = true;
                    ;
                }// End of if

               
            } // End of while
        }// End of for i loop
        for (int i = 0; i < iNumbers.length; i++) {
        	if (iNumbers[i] > iMax) {
        		iMax = iNumbers[i];
        	}
        }
        System.out.println("The biggest number is: " + iMax);
        szKeyboard.close();
    } // End of main
} // End of class