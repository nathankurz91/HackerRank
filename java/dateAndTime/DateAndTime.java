/**
 * Dev: Nathan Kurz
 * Date: 02May2018
 * File: DateAndTime.java
 * 
 * Solution to the HackerRank problem: "Java Date and Time"
 * 
 * Given a date, write method getDay which returns the day on that date. 
 * 
 * Input: Single line of input: MM DD YYYY
 * Constraints: 2000 < year < 3000
 * 
 * Output the correct day in capital letters
 */

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

 public class DateAndTime {
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.println("Enter a date between the year 2000 and 3000: ");
         int month = scan.nextInt();
         int day = scan.nextInt();
         int year = scan.nextInt();

         getDay(year, month, day);
         
     }

     public static String getDay(int year, int month, int day) {
        Calendar dateToConvert = Calendar.getInstance();
        dateToConvert.set(Calendar.YEAR, year);
        dateToConvert.set(Calendar.MONTH, month - 1);
        dateToConvert.set(Calendar.DAY_OF_MONTH, day);

        int dayOfWeek = dateToConvert.get(Calendar.DAY_OF_WEEK);

         String returnDay = "";
         switch(dayOfWeek) {
             case 1: returnDay = "MONDAY"; System.out.println("MONDAY");
             break;
             case 2: returnDay = "TUESDAY"; System.out.println("TUESDAY");
             break;
             case 3: returnDay = "WEDNESDAY"; System.out.println("WEDNESDAY");
             break;
             case 4: returnDay = "THURSDAY"; System.out.println("THURSDAY");
             break;
             case 5: returnDay = "FRIDAY"; System.out.println("FRIDAY");
             break;
             case 6: returnDay = "SATURDAY"; System.out.println("SATURDAY");
             break;
             case 7: returnDay = "SUNDAY"; System.out.println("SUNDAY");
         }
         return returnDay;
     }
 }