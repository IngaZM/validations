
package myfirstpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import static myfirstpackage.Contact.isValid;
/**
 *
 * @author Inga
 */
public class Employer {
    public static void main(String[] args) {
        String name = "Inga";
        String address = "345 Feza Street";
        String telephone = "2775227776";
        
        // Name
        if (isWord(name)) {
            JOptionPane.showMessageDialog(null, "Valid");
        } else {
            JOptionPane.showMessageDialog(null, "Invalid");
        }
        
        // Telephone
        if (isValid(telephone)) {
            System.out.println("Valid telephone");
        } else{
            System.out.println("Invalid Telephone");
        }
        
        // Address
        if (validateAddress(address)) {
            System.out.println("Valid Address!");
        } else {
            System.out.println("Invalid Address!");
        }
    }
    
    // Name Validation
    public static boolean isWord(String in) {
       /* */
        return Pattern.matches("[a-zA-Z]+", in);  
    }
    
    // Telephone Validation
    public static boolean isValidl(String s) {
        Pattern p = Pattern.compile(
                "^(\\+\\d{1,3}( )?)?((\\(\\d{1,3}\\))|\\d{1,3})[- .]?\\d{3,4}[- .]?\\d{4}$");
        Matcher m = p.matcher(s);
        return (m.matches());
        
    }
    
    // Address Validation
    public static boolean validateAddress(String address) {
        return address.matches("\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }
}
