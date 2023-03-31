package Kyu8;

public class doubleChar {
    public static String doubleChar(String s){
        char[] chars=s.toCharArray();
        StringBuilder stringBuilder=new StringBuilder();
        for (int i=0;i<chars.length;i++){
            stringBuilder.append(Character.toString(chars[i])+chars[i]);
        }

        return stringBuilder.toString();
    }
}
