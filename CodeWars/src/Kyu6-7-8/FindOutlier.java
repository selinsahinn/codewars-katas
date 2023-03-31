package Kyu8;

public class FindOutlier {

    static int find(int[] integers) {
        int count = 0;
        for (int i = 0; i < 3; i++) {
            if (integers[i] % 2 == 0) {
                count++;
            }
            // 10 14 12
        }
        if (count >= 2) {
            for (int a : integers) {
                if (a % 2 == 1) return a;
            }
        } else {
            for (int a : integers) {
                if (a % 2 == 0) {
                    return a;
                }
            }
        }
        return 0;
    }
}
