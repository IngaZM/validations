
package myfirstpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Inga
 */
public class Contact {
    public static void main(String[] args) {
        String address = "125 Loop Street";
        String email = "mn@gmail.com";
        String cellnumber = "3456789300";
        
        if (isValid(cellnumber)) {
            System.out.println("Valid number");
        } else {
            System.out.println("Invalid number");
        }
        
        if (validateAddress(address)) {
            System.out.println("Valid Address!");
        } else {
            System.out.println("Invalid Address!");
        }
        
        if (validEmailAddress(email)) {
            System.out.println("Valid Email!");
        } else {
            System.out.println("Invalid Email!");
        }
        
    }
    
    //CellNumber Validation
    public static boolean isValid(String s) {
        Pattern p = Pattern.compile("^\\d{10}$");
        
        Matcher m = p.matcher(s);
        
        return (m.matches());
    }
    
    // Address Validation
    public static boolean validateAddress (String address) {
        return address.matches("\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }
    
    // Email Address Validation
    public static boolean validEmailAddress (String email) {
        return email.matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$");
    }
}
