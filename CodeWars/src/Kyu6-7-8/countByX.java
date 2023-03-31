package Kyu8;

public class countByX {
    public static void main(String[] args) {


    }
    public static int[] countBy(int x, int n){
        int[] ints=new int[n];
        int temp=1;
        for (int i=0;i< ints.length;i++){
            ints[i]=x*(temp+i);
        }

        return ints;
    }

}
