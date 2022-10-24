package myJavaPracticesEng;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        /*
          Write a code to calculate age control for retirement
          Take genders as M (Man) or W (Woman)
          if client enters a invalid value, the error message must appear
          retirement age for Women is 60
          65 for Men
          if client's imput is negative or higher than 80, give error message again
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please provide your gender, \"M\" for Man \"W\" for Woman " +
                "\nAnd enter your age \nPress enter after each input");
        char gender = scan.next().toUpperCase().charAt(0);
        int age = scan.nextInt();
        if (gender == 'E') {
            if (age > 80 || age < 0) {
                System.out.println("Please enter valid age \nThe valid age must not be negative number nor higher than 80");
            } else if (age > 65) {
                System.out.println("You are eligible to retire");
            } else {
                System.out.println("You are not eligible to retire yet");
            }
        }else if (gender == 'K') {
            if (age > 80 || age < 0) {
                System.out.println("Please enter valid age \nThe valid age must not be negative number nor higher than 80");
            } else if (age > 65) {
                System.out.println("You are eligible to retire");
            } else {
                System.out.println("You are not eligible to retire yet");
            }
        }else {
            System.out.println("Please enter valid gender");
        }
    }
}
