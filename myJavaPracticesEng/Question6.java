package myJavaPracticesEng;

import java.util.Scanner;

public class Question6 {
    /*
            Ask from client to enter a sentence.
            If the sentence contains "upper" word the make whole letter of sentence upper case,
            but if contains "lower" then make whole letter lower case,
            If the sentence doesn't contain any of them, then give "The sentence neither contains "upper" nor "lower" word".
         */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a sentence:");
        String sentence = scan.nextLine();
        sentence = sentence.toLowerCase();
        if (sentence.contains("upper")) {
            System.out.println("sentence contains \"upper\" word" +
                    "\nthe sentence final form: " + sentence.toUpperCase());
        } else if (sentence.contains("lower")) {
            System.out.println("sentence contains \"lower\" word: " +
                    "\nthe sentence final form" + sentence.toLowerCase());
        } else {
            System.out.println("sentence contains neither \"upper\" nor \"lower\"");
        }
    }
}
