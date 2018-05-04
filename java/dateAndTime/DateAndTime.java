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
import java.util.Scanner;

 public class DateAndTime {
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.println("Enter a date between the year 2000 and 3000: ");
         int month = scan.nextInt();
         int day = scan.nextInt();
         int year = scan.nextInt();

         Calendar dateToConvert = Calendar();
         dateToConvert.set(year, month, day);

         // Covert date to day of week
         int numDay = dateToConvert.getFirstDayOfWeek();
         String stringDay = getDay(numDay);
         System.out.println(numDay);
         System.out.println(stringDay);
     }

     public static String getDay(int n) {
         int day = n;
         String returnDay = "";
         switch(n) {
             case 0: returnDay = "SUNDAY";
             break;
             case 1: returnDay = "MONDAY";
             break;
             case 2: returnDay = "TUESDAY";
             break;
             case 3: returnDay = "WEDNESDAY";
             break;
             case 4: returnDay = "THURSDAY";
             break;
             case 5: returnDay = "FRIDAY";
             break;
             case 6: returnDay = "SATURDAY";
             break;
         }
         return returnDay;
     }
 }