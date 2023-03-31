package Kyu8;

public class Conjecture {
    public static long divide2(long y) {
        Long ans = y / 2 ;
        return ans;
    }

    public static long mult3add1(long z) {
        return z * 3 + 1;
    }

    public static long conjecture(long x) {

        int count = 0;
        while (x != 1) {


            while (x % 2 == 0) {
                x= divide2(x);
                count++;
            }
            while (x % 2 == 1 && x!=1) {
                x= mult3add1(x);
                count++;
            }
        }
        return ++count;
    }

    public static void main(String[] args) {
        System.out.println(conjecture(20));
    }
}
