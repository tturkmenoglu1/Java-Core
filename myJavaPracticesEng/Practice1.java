package myJavaPracticesEng;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {

        /*
        ask user to enter his/her name, lastname and age
         */

        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter your name, lastname and age. \nPress enter after each input");
        String name=scan.next();
        String lastName=scan.next();
        int age=scan.nextInt();
        System.out.println("name : "+ name + "\nlastName : " + lastName + "\nage : " + age);















    }
}
