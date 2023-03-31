package Kyu8;

public class divisibleBy {
    public static int[] divisibleBy(int[] numbers, int divider) {
        int count=0;
        for(int number : numbers){
            if (number%divider==0){
                count++;
            }
        }
        int[] arr=new int[count];
        int i=0;
        for(int number: numbers){
            if(number%divider==0){
                arr[i]=number;
                i++;
            }
        }         
        return arr;
    }
}
