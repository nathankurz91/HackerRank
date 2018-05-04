import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Dev: Nathan Kurz
 * 
 * Given a string s, and two indices "start" and "end", print a substring consisting of all characters in the 
 * inclusive range from start to end - 1. 
 * 
 * Input Format: 
 *  The first line contains a single string denoting s
 *  Second line contains two space separated integers denoting start and end.
 * 
 * Constraints:
 *  1<= s <= 100
 *  0 <= start < end <= n
 *  String s consists of alphabetic letters (a-z && A-Z)
 * 
 * Output:
 *  Print the substring in the inclusive range from start to end -1.
 */

 public class JavaSubString {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        in.close();

        S = S.substring(start, end);
        System.out.println(S);


        
     }
 }