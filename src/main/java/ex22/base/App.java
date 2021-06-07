/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 NURIDEAN MUBARAK
 */
package ex22.base;

import java.util.Scanner;

/*
Exercise 22 - Comparing Numbers

Comparing one input to a known value is common enough, but you’ll often need to process a collection of inputs.

Write a program that asks for three numbers. Check first to see that all numbers are different. If they’re not different, then exit the program. Otherwise, display the largest number of the three.
Example Output

Enter the first number: 1
Enter the second number: 51
Enter the third number: 2
The largest number is 51.

Constraint

    Write the algorithm manually. Don’t use a built-in function for finding the largest number in a list.

Challenges

    Modify the program so that all entered values are tracked and the user is prevented from entering a number that’s already been entered.
    Modify the program so that it asks for ten numbers instead of three.
    Modify the program so that it asks for an unlimited number of numbers.
*/
public class App {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        String userNumOne = in.nextLine();
        System.out.print("Enter the second number: ");
        String userNumTwo = in.nextLine();
        System.out.print("Enter the third number: ");
        String userNumThree = in.nextLine();

        double varOne = Double.parseDouble(userNumOne);
        double varTwo = Double.parseDouble(userNumTwo);
        double varThree = Double.parseDouble(userNumThree);
        double MAX = 0;

        if (varOne == varTwo && varTwo == varThree)
        {
            System.exit(0);
        }

        if(varOne > varTwo && varOne > varThree) {
            MAX = varOne;
        }

        if(varTwo > varOne && varTwo > varThree){
            MAX = varTwo;
        }

        if(varThree > varOne && varThree > varTwo) {
            MAX =varThree;
        }

        String output = "The largest number is " + MAX + ".";
        System.out.print(output);

    }
}
