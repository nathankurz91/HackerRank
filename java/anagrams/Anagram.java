/**
 * Dev: Nathan Kurz
 * HackerRank Problem: Java Anagrams
 * 
 * Two Strings are anagrams if they contain all the same characters in the same frequencies.
 * 
 * If strings a and b are case insensitive anagrams, print "Anagrams", otherwise print "Not Anagrams".
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Character;
import java.lang.StringBuffer;
import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();

        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
        
    }

    public static boolean isAnagram(String a, String b) {
        /** Sort the strings is alphabetical order and see if they are equal (case insensitive) */
        String s1 = a;
        String s2 = b;
        
        /** Convert the strings to lowercase */
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        // set strings to char array, sort arrays, and set char array back to string
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();

        Arrays.sort(s1Array);
        Arrays.sort(s2Array);

        s1 = new String(s1Array);
        s2 = new String(s2Array);
    
        if(s1.equals(s2)) {
            return true;
        } else { 
            return false;
        }
    }

}

