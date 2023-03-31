package Kyu8;

import java.util.Arrays;
import java.util.Collections;

public class digitize {
    public static int[] digitize(long n) {
        return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
    }
}
