
/**
 * Dev: Nathan Kurz
 * 
 * Program validates tags (i.e. HTML tags). If the tags are valid, it prints the content between tags. If tags are nested, 
 * only the content in the inner tags are printed. Content between inner and outer tags is invalid. If no valid content is found,
 * "None" is printed.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TagContentExtractor {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String line = in.nextLine();

            // My code
            boolean match = false; // boolean value to determine if the matcher finds a match from the pattern to the input

            /**
             * regex:
             *      <(.+)> : matches html start tags. Parens save the content b/t tags into group 1
             *      ([^<]+) : matches all text b/t start and end tags. Special restriction "^<" is placed on the text 
             *                  so that it cannot contain the '<' symbol. All contents inside parens are saved into group 2
             *      </\\1> : ensures all closing tags start with '/' character. The "\1" matches all text from group 1.
             */
            Pattern p = Pattern.compile("<(.+)>([^<]+)</\\1>"); // Pattern made from regex to use with Matcher
            Matcher m = p.matcher(line); // Matcher check if the input matches the regex Pattern

            // If the matcher is finding matches, print the matches and set match to true.
            while (m.find()) {
                System.out.println(m.group(2));
                match = true;
            }

            // If no matches were found, match will still be false
            if (!match) {
                System.out.println("None");
            }

            testCases--;
        }
        in.close();
    }
}