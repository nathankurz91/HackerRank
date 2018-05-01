// Dev: Nathan Kurz
// Company: NatCom
// Date: 01May2018
// File: intToString

/**
 * Solution to the HackerRank problem "Java Int to String"
 * 
 * Convert an integer n to a string.
 */

import java.util.Scanner;

public class intToString {
     public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = scan.nextInt();

        // Convert n to string
        String s = Integer.toString(n);

        // Print the string
        System.out.println(s);
     }
 }