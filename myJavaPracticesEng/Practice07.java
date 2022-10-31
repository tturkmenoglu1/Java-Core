package myJavaPracticesEng;

import java.util.Scanner;

public class Practice07 {
    public static void main(String[] args) {

        /*
        Ask client to enter a password.
        If password provide the following requirements give message as "password created successfully",
        If not give "something went wrong while creating password" message
        - First letter must be captial
        - Last letter must be lowered case
        - The password must not contain space
        - The length of password must be at least 8 character
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a password");
        String password = scan.nextLine();

        if (!(password.charAt(0) >= 'A' && password.charAt(0) <= 'Z')) {
            System.out.println("First letter must be captial");
        } else if (!(password.charAt(password.length() - 1) >= 'a' && (password.charAt(password.length() - 1) <= 'z'))) {
            System.out.println("Last letter must be lowered case");
        } else if (password.contains(" ")) {
            System.out.println("The password must not contain space");
        } else if (!(password.length() >= 8)) {
            System.out.println("The length of password must be at least 8 character");
        } else {
            System.out.println("password created successfully");
        }


    }
}
