package myJavaPracticesEng;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Please enter a input to check if it is starting with letter: ");
        char harf=scan.next().charAt(0);

        if (!(harf>='a' && harf<='z') || (harf>='A' && harf<='Z')){
            System.out.println("The first character is not a letter");
        } else {
            System.out.println("The first character is a letter");
        }
        /*
        example:
        input: Java
        output: The first character is a letter

        input: 123Java
        output: The first character is not a letter
        */
    }
}
