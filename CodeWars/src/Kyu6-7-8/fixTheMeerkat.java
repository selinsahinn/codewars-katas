package Kyu8;

public class fixTheMeerkat {

    public static String[] fixTheMeerkat(String[] arr) {
        String temp=arr[2];
        arr[2]=arr[0];
        arr[0]=temp;
        return arr;
    }
}
