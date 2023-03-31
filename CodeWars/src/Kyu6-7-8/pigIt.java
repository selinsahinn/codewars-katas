package Kyu8;

public class pigIt {
    public static String solve(final String str) {
        String str2="";
        String str3="ay";
        String str4;
        for(int i=1;i<str.length();i++){
            str2=str2 + str.charAt(i);
        }
        str4=str2+ str.charAt(0)+str3;
        return str2;

    }
}
