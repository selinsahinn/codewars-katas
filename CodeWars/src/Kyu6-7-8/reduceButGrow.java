package Kyu8;

public class reduceButGrow {
    public static void main(String[] args) {

    }


    public static int grow(int[] x){
        int temp=1;
        for (int i=0; i<x.length;i++) {
            temp *= x[i];

        }
        return temp;
    }

}
