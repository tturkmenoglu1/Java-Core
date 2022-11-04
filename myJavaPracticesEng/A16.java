package myJavaPractices;

import java.util.ArrayList;
import java.util.List;

public class A16 {
    public static void  main(String[] args) {
        String[] arr={"Python", "JAVA", "PHP", "Perl", "C#", "C++"};
        List<String> arrList=new ArrayList<>();

        for (int i=0;i<arr.length;i++){
            arrList.add(arr[i]);

        }
        System.out.print(arrList);
    }
}

