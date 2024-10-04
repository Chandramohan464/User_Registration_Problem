// As a User need to enter a valid email
// - E.g. abc.xyz@bl.co.in - Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) with precise @ and . positions
package Assignment.User_Registration_Problem;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UC3 {
    
    static String emailIDRegex="^[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)?@[a-zA-Z0-9]+\\.[a-zA-Z]{2,3}(\\.[a-zA-Z]{2})?$";

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Email-id:");

        String email=sc.nextLine();

        boolean valid=isValidEmail(email);
        if(valid){
            System.out.println("Email-id is valid");
        }
        else{
            System.out.println("Email-id is invalid");
        }

        sc.close();
    }

    public static boolean isValidEmail(String email) {
        return Pattern.matches(emailIDRegex, email);
    }
}
