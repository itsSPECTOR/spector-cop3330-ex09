package org.example;
import java.util.Scanner;

/**
 *
 * UCF COP3330 Fall 2021 Assignment 8 Solution
 * Copyright 2021 Reese Spector
 *
 */

public class App 
{
    static int GAL = 350;

    public static void main( String[] args )
    {
        // scanner
        Scanner input = new Scanner(System.in);
        // get width
        System.out.print("Width? ");
        String strWidth = input.nextLine();

        // get height
        System.out.print("Height? ");
        String strHeight = input.nextLine();

        //convert strings
        int numWidth = Integer.parseInt(strWidth);
        int numHeight = Integer.parseInt(strHeight);
        double totalArea = numWidth * numHeight;

        //print summary
        System.out.print("You will need to purchase " + Math.round((totalArea / GAL)) + " gallons of paint to cover " + Math.round(totalArea) + " square feet.");


    }
}
