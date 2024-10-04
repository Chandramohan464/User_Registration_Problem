// As a User need to enter a valid First Name
// - First name starts with Cap and has minimum 3 characters
package Assignment.User_Registration_Problem;

import java.util.Scanner;
import java.util.regex.*;

public class UC1 {
    static String firstNameRegex="^[A-Z][a-z]{2,}$";

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Name");
        String firstName=sc.nextLine();

        boolean valid=isValidFirstName(firstName);
        if(valid){
            System.out.println("First Name is valid");
        }
        else{
            System.out.println("First Name is invalid");
        }

        sc.close();
    }

    public static boolean isValidFirstName(String firstName){
        return Pattern.matches(firstNameRegex, firstName);
    }
}
