// As a User need to follow pre-defined Mobile Format 
// - E.g. 91 9919819801 - Country code follow by space and 10 digit number
package Assignment.User_Registration_Problem;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UC4 {
    static String phoneNumberRegex="^(\\d{2})\\s(\\d{10})$";

    public static boolean isValidPhoneNo(String phoneNumber) {
        return Pattern.matches(phoneNumberRegex, phoneNumber);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Phone-Number:");

        String phoneNumber=sc.nextLine();

        boolean valid=isValidPhoneNo(phoneNumber);
        if(valid){
            System.out.println("Phone number is valid");
        }
        else{
            System.out.println("Phone number is invalid");
        }

        sc.close();
    }
}
