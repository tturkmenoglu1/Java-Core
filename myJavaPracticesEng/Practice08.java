package myJavaPracticesEng;

public class Practice08 {
    public static void main(String[] args) {
        // While using String methods
        // Take “  Learning java123 is fun@  ”  String and
        // Convert to this “Learning java is fun.”

        String str = "  Learning java123 is fun@  ";

        str = str.trim();
        str = str.replaceAll("\\s", "space");
        str = str.replaceAll("\\W", "");
        str = str.replaceAll("\\d", "");
        str = str.replaceAll("space", " ");
        str = str.replaceAll("C", "c");
        System.out.println(str);
    }
}
