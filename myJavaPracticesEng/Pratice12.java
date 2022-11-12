package myJavaPracticesEng;

public class Practice12 {
    public static void main(String[] args) {
        int sum = 0;
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum of elements of array: " + sum);
    }
}
