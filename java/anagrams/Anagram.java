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

public class Anagram {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        isAnagram(a, b);
    }

}