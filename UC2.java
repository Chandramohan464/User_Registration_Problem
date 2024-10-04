// As a User need to enter a valid Last 
// Name - Last name starts with Cap and has minimum 3 characters
package Assignment.User_Registration_Problem;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UC2 {
    static String lastNameRegex="^[A-Z][a-z]{2,}$";

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your last name:");

        String lastName=sc.nextLine();

        boolean valid=isValidLastName(lastName);
        if(valid){
            System.out.println("Last Name is valid");
        }
        else{
            System.out.println("Last Name is invalid");
        }

        sc.close();
    }

    public static boolean isValidLastName(String lastName){
        return Pattern.matches(lastNameRegex, lastName);
    }
}
