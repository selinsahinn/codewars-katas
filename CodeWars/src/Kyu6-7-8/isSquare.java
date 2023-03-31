package Kyu8;
import static java.lang.Math.*;

public class isSquare {
    public static boolean isSquare(int n) {
        double karekok= Math.sqrt(n);
        double kare=Math.pow(Math.round(karekok),2);

        if((int)kare==n){
            return true;
        }else return false;

    }

}
