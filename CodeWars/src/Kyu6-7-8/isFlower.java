package Kyu8;

public class isFlower {
    public static boolean isFlower(final int flower1, final int flower2) {
        if ((flower1 % 2 == 1 && flower2 % 2 == 0) || (flower1 % 2 == 0 && flower2 % 2 == 1)) {
            return true;
        } else return false;
    }}
