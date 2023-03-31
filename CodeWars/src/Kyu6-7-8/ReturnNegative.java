package Kyu8;

public class ReturnNegative {
    public static int MakeNegative(int number)
    {
       if(number<0){
           return number;
       } else if (number==0) {
           return 0;
       }else {
           return -number;
       }

    }
}

