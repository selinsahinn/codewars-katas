package Kyu8;

public class RemoveVavels {

    public class Troll {
        public static String disemvowel(String str) {
            // Code away...

            // Plan 1 : Arrayliste alıp gereksizi sil
            // Plan 2 : string için gerekliyi bul kullan
            //String ans = str.replaceAll("[aeiouAEIOU]", "");

            return str.replaceAll("[aeiouAEIOU]", "");


        }
    }

}
