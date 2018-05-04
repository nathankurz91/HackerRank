import java.io.*;
import java.util.*;

/**
 * Dev: Nathan Kurz
 * HackerRank Problem
 * 
 * Three lines of output:
 *  1) sum the lengths of A and B
 *  2) Determine if A is lexographically larger (comes first in the alphabet) than B
 *  3) Capitalize the first letter of A and B and display them on a single line separated by a space.
 */
public class javaStringIntro {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        /**
         * Sum the length of the two Strings and print the result
         */
        int sumStrings = A.length() + B.length();
        System.out.println(sumStrings);

        /**
         *  compareTo() returns negative integer if string lexographically precedes string in params. 
         *  Returns a positive integer if String object lexographically follows String in params.
         *  Returns zero if String object is lexographically equal to String in params.
         */
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        /**
         * Capitalize the first letters of the two Strings and display the output on a single line
         * separated by a space.
         */

         A = A.substring(0, 1).toUpperCase() + A.substring(1);
         B = B.substring(0,1).toUpperCase() + B.substring(1);
         System.out.println(A + " " + B);
    }
}