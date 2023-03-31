package Kyu8;

public class century {
    public static void main(String[] args) {
        System.out.println(century(1705));
    }
    public static int century(int number) {
        int century=number/100;
        if(number%100==0){
            return century;
        }else return ++century;

    }

}
