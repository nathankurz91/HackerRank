import java.math.BigInteger;
import java.util.Scanner;

/**
 * Dev: Nathan Kurz
 * 
 * Input: two integers a and b
 *          a and b are non-negative and contain a maximum of 200 digits
 *          
 * Output: Two lines, (a + b) and (a * b)
 */

public class BigIntegerSolution {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        BigInteger bigA = new BigInteger(scan.next());
        BigInteger bigB = new BigInteger(scan.next());
        //scan.nextLine(); // clear scan

        BigInteger bigSum = bigA.add(bigB);
        BigInteger bigProduct = bigA.multiply(bigB);

        System.out.println(bigSum.toString());
        System.out.println(bigProduct.toString());
    }
}