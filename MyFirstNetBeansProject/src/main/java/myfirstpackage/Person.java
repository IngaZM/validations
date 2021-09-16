
package myfirstpackage;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author Inga
 */

public class Person {
    public static void main(String[] args) {
        String name = "Ings";
        String height = "5.6";
        
        // Name
        if (isName(name)) {
            System.out.println(name);
            System.out.println("Valid Name");
        } else {
            System.out.println("Invalid Name");
        }
        
        matches();
        
        
    }
    // Name Validation
    public static boolean isName(String in) {
        return Pattern.matches("[a-zA-Z]+", in);
    }
    
    // Age Valiadtion
    public static void matches() {
        Scanner sc = new Scanner(System.in);
        int age;
        do {
            age = sc.nextInt();
if (age >= 0 && age <= 150) {
    System.out.println(age);
    System.out.println("Age is invalid");
} else {
    System.out.println(age);
    System.out.println("Age is Not valid");
}
        }
        while(age >= 0 && age <= 150);
    }
    
    
          
}
