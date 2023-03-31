package Kyu8;

public class ReservedWords {

    public static void main(String[]args){
        System.out.println(reverseWords("hello world!"));
    }
    public static String reverseWords(String str){
      String[] strings= str.split(" ");
      StringBuilder stringBuilder=new StringBuilder();
      for (int i=strings.length-1;i>=0;i--){
          stringBuilder.append(strings[i]+" ");
      }
      return stringBuilder.toString().trim();

    }


}
