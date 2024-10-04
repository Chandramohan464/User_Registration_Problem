//As a User need to follow pre-defined Password rules. 
//Rule1 – minimum 8 Characters 
//Rule2 – Should have at least 1 Upper Case
//Rule3 – Should have at least 1 numeric number in the password
//Rule4 – Has exactly 1 Special Character
//- NOTE – All rules must be passed
package Assignment.User_Registration_Problem;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC5 {
    static String PASSWORD_REGEX = "^(?=.*[A-Z])(?=.*[0-9])(?=^[^@#$%^&+=]*[@#$%^&+=][^@#$%^&+=]*$).{8,}$\r\n";

    public static boolean isValidPassword(String password) {
        Pattern pattern = Pattern.compile(PASSWORD_REGEX);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Password:");

        String password=sc.nextLine();

        boolean valid=isValidPassword(password);
        if(valid){
            System.out.println("Password is valid");
        }
        else{
            System.out.println("Password is invalid");
        }

        sc.close();
    }
}
