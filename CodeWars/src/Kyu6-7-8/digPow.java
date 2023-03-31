package Kyu8;

public class digPow {

    public static long digPow(int n, int p) {
        int result = 0;
        char[] chars = String.valueOf(n).toCharArray();
        int res = 0;
        for (int i = 0; i < chars.length; i++) {
            res = result + (chars[i] * chars[i]);
        }
        int k= (int) ((double) n/p);
        if (res == n * k) {
            return k;
        } else return -1;
    }

    public static void main(String[] args) {
        System.out.println(digPow(89, 1));
    }
}


