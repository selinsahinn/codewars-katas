package Kyu8;

public class abbrevName {
    public static String abbrevName(String name) {
        String[] strings = name.split(" ");
        String abbrev = strings[0].substring(0,1).toUpperCase()
                .concat(".").concat(strings[1].substring(0,1).toUpperCase());
        return abbrev;
    }
}
