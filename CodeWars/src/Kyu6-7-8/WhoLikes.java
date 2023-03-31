package Kyu8;

public class WhoLikes {
    public static String whoLikesIt(String... names) {
        int length = names.length;

        if (names.length == 0) {
            return "no one likes this";
        }
        if (names.length == 1) {
            return names[0] + " likes this";
        }
        if (names.length == 2) {
            return names[0] + "and" + names[1] + " likes this";
        }
        if (names.length == 3) {
            return names[0] + ", " + names[1] + "and" + names[2] + " likes this";
        } else {
            int lentght = names.length;
            return names[0] + ", " + names[1] + "and" + " "+ (lentght-2) + " others likes this";
        }
    }
}
