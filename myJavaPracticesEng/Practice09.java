package myJavaPracticesEng;

import java.util.Scanner;

public class Practice09 {
    public static void main(String[] args) {
        // The task is finding the area and perimeter of indicated side lengths of rectangle
        /* Example: Please enter the side lengths of rectangle
             Short length: 4
             Long length: 5
             Area: 20
             Perimeter: 18
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the side lengths of rectangle \nShort length: ");
        int shortSide=scan.nextInt();
        System.out.print("Long length: ");
        int longSide=scan.nextInt();
        int area=shortSide*longSide;
        int perimeter=2*(shortSide+longSide);
        System.out.println("Area: "+area);
        System.out.println("Perimeter: "+perimeter);

    }
}
