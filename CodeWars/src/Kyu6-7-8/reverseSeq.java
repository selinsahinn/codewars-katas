package Kyu8;

public class reverseSeq {
    public static int[] reverse(int n){
        int[] ints=new int[n];
        int temp=0;
        for (int i=ints.length-1;i>=0;i--){
            ints[i]=++temp;
        }

        return ints;
    }
}
