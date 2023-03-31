package Kyu8;


public class ReversedString {
    public static String Solution(String str) {
        char[] listChar = new char[str.length()];
        for (int i = 0; i <= str.length() - 1; i++) {
            listChar[i] = str.charAt(str.length() - i - 1);
        }

        StringBuilder ans = new StringBuilder();

        for (char c : listChar) {
            ans.append(c);
        }

        String abc = String.valueOf(ans);
        return abc;

    }


}
