package myJavaPracticesEng;

import java.util.Scanner;

public class Question10 {
    /*
    Ask client to enter how many cup of tea they drink and how much sugar they consume per day.
    Calculate the sugar they consume in a year.

    1 sugar = 1.7 gram

    Example output:

    12.41 kg sugar consuming in a year.
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Please enter how many cup of tea drink every day: ");
        int tea=scan.nextInt();
        System.out.print("Please enter how much sugar you consume every day: ");
        double sugar=scan.nextDouble();
        double annualSugar=(sugar*365);
        annualSugar*=1.7;
        annualSugar/=1000;
        System.out.println(annualSugar+" kg sugar consuming in a year");

    }
}
