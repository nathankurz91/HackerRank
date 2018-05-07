import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;



/**
 * Dev: Nathan Kurz
 * HackerRank Problem: Java Currency Formatter
 * 
 * Problem Description: Given a double point precision number, convert to the appropriate currency
 * formats for US, Indian, Chinese, and French formats.
 */

public class CurrencyFormatter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double payment = scan.nextDouble();
        scan.close();

        NumberFormat nf = NumberFormat.getCurrencyInstance();
        String us = nf.format(payment);

        nf = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String india = nf.format(payment);

        nf = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = nf.format(payment);

        nf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = nf.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}