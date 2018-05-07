import java.util.regex.Pattern;

/**
 * Definition of IP Address: IP address is a string in the form "A.B.C.D", where the value of 
 * A, B, C, and D may range from 0 to 255. Leading zeros are allowed. 
 * The length of A, B, C, or D can't be greater than 3.
 */

class MyRegex {
    String zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
    public String pattern = zeroTo255 + "." + zeroTo255 + "." + zeroTo255 + "." + zeroTo255;

    public MyRegex() {
        
    }

}