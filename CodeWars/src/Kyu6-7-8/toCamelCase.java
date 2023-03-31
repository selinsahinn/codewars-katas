package Kyu8;

public class toCamelCase {
    static String toCamelCase(String s){

        String[] word=s.split("[-_]");
        s=word[0];

        for (int i=1; i<word.length;i++){
            s+=word[i].substring(0,1).toUpperCase() + word[i].substring(1).toLowerCase();
        }
        return s;
    }

    public static void main(String[] args) {

    }

}
