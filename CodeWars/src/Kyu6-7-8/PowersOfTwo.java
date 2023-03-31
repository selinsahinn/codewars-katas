package Kyu8;

public class PowersOfTwo {
    public static long[] powersOfTwo(int n) {



        long[] longs = new long[n+1];
        for (int i = 0; i < longs.length; i++) {
            longs[i] = (long) (Math.pow(2, i));
        }
        return longs;
    }

}
