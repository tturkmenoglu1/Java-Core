package myJavaPracticesEng;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        // Ask client to enter a day name.
        // If client's input is valid, take 1st,2nd and 3rd letter of input
        // Make first letter upper case and rest two letter lower case
        // If input is invalid then give "Please enter a valid day" message to client
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a day of a week");

        boolean stat = true;


        while(stat==true) {

            String day = scan.nextLine();
            switch (day) {
                case "1":
                case "monday":
                    System.out.println("Mon");
                    stat=false;
                    break;
                case "2":
                case "tuesday":
                    System.out.println("Tue");
                    stat=false;
                    break;
                case "3":
                case "wednesday":
                    System.out.println("Wed");
                    stat=false;
                    break;
                case "4":
                case "thursday":
                    System.out.println("Thu");
                    stat=false;
                    break;
                case "5":
                case "friday":
                    System.out.println("Fri");
                    stat=false;
                    break;
                case "6":
                case "saturday":
                    System.out.println("Sat");
                    stat=false;
                    break;
                case "7":
                case "sunday":
                    System.out.println("Sun");
                    stat=false;
                    break;
                default:
                    System.out.println("Please enter a valid day");

            }
        }

    }
}
