package Kyu8;

public class ScoringWord {
    public static String high(String s) {
       int value =0;

        for (char ch: s.toCharArray()) {
            value+=(int) ch-96;
        }
        return String.valueOf(value);
    }

}
