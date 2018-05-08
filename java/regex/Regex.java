/**
 * Dev: Nathan Kurz
 * 
 */

 import java.util.*;

 public class Regex {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
            if (IP == -1) {System.exit(0);}
        }
        in.close();
     }
 }