package myJavaPracticesEng;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question11 {
    public static void main(String[] args) {
        String[] str = {"New York", "Amsterdam", "Istanbul", "Roma", "Munih", "Antalya"};
        List<String> cities = new ArrayList<>();
        for (String each : str
        ) {
            cities.add(each);
        }
        Collections.reverse(cities);
        System.out.println(cities);

    }
}
