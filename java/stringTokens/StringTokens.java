import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.ArrayList;
/**
 * Dev: Nathan Kurz
 * 
 * Program takes a String as input, counts the number of Tokens, and prints each token
 * individually on its own line.
 */
public class StringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        // Trim and split the string using the delimeters
        String[] sArray = s.trim().split("[ !,?\\._'@]+", 0);
        
        if (sArray.length == 1 && sArray[0].equals("")) {
            System.out.println(0);
        } else {
            System.out.println(sArray.length);
        }

        for (int i = 0; i < sArray.length; i++) {
            System.out.println(sArray[i]);
        }

        scan.close();
    }
}