import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
/**
 * Dev: Nathan Kurz
 * 
 * Check if input is an accepted regex. First line of input is number of test cases.
 * The following lines are a string representing a regex
 */
public class PatternChecker {
    public static void main(String[] args) throws PatternSyntaxException {
        Scanner in = new Scanner(System.in);

        // Read number of test cases
        int testCases = in.nextInt();
        in.nextLine(); // clear in

        while(testCases > 0) { 

            String pattern = in.nextLine(); // scan pattern
            
            try {
                Pattern.compile(pattern); // attempt to compile pattern
                System.out.println("Valid");
            } catch (PatternSyntaxException ex) { // print invalid if exception
                System.out.println("Invalid");
            }
            
            testCases--;
        }
    }
}