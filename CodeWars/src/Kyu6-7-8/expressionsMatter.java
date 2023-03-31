package Kyu8;

public class expressionsMatter {
    public static int expressionsMatter(int a, int b, int c)
    {
        int num1= a*(b+c);
        int num2=a*b*c;
        int num3 = a+b*c;
        int num4=(a+b)*c;
        int num5=a+b+c;

        return Math.max(num5, Math.max(Math.max(num1,num2),Math.max(num3,num4))) ;

    }
}
