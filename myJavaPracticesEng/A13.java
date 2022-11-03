package myJavaPractices;

public class A13 {
    public static void main(String[] args) {
        int ortalama=0;
        int [] sayilar={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i <sayilar.length ; i++) {
            ortalama+=sayilar[i];
        }
        ortalama/= sayilar.length;
        System.out.println("Array toplamı: "+ortalama);
    }
}
