/**
 * Dev: Nathan Kurz
 * HackerRank Problem: Java String Reverse
 * 
 * Given a String A, print yes if it is a palindrome or print no if it is not.
 */

import java.lang.StringBuilder;
import java.util.Scanner;

 public class IsPalindrome {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(isPalindrome(A));
        
    }

    /**
     * isPalindrome() creates a new StringBuilder object using the string s in the params.
     * Use equals method to compare s to the reverse of the new StringBuilder object.
     */
    public static String isPalindrome(String s) {
        if (s.equals(new StringBuilder(s).reverse().toString())) {
            return "Yes";
        } else {
            return "No";
        }
    }
 }