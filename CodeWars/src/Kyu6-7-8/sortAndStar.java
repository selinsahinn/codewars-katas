package Kyu8;

public class sortAndStar {
    public static String twoSort(String[] s) {
        java.util.Arrays.sort(s);
        return String.join("***",s[0].split(""));
    }
}
