import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Dev: Nathan Kurz
 * 
 * Lexographical Order: A < B < ... Z < a < b < ... < y < z
 * 
 * Problem: Given a string s, and an integer k, 
 * complete the function so that it finds the lexicographically 
 * smallest and largest substrings of length k.
 * 
 * Input: 
 *  First line contains a String denoting s
 *  Second line contains an integer denoting k
 * 
 * Constraints:
 *  1 <= s <= 1000
 *  s consists of English alphabetical letters (a-z and A-Z).
 * 
 * Output: 
 *  Return the respective lexographically smallest and largest substrings in a new-line separated string.
 */
public class SubStringComparisons {
  
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        for (int i = 0; i <= s.length() - k; i++) {
            String subString = s.substring(i, i + k);

            if (subString.compareTo(smallest) < 0 || smallest.isEmpty()) {
                smallest = subString;
            }
            if (subString.compareTo(largest) > 0 || largest.isEmpty()) {
                largest = subString;
            }
        }
        
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}