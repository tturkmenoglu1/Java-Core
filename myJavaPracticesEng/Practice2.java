package myJavaPracticesEng;

import java.util.Scanner;

public class Practice2 {

        public static void main(String[] args) {
            // take the input that user will enter, and make capital letter of first character of it
            Scanner scan=new Scanner(System.in);
            System.out.println("Please enter an input: ");
            String name=scan.next();
            char firstChar=name.toUpperCase().charAt(0);
            System.out.println("first character of your input is " + firstChar);

        }
        
}
